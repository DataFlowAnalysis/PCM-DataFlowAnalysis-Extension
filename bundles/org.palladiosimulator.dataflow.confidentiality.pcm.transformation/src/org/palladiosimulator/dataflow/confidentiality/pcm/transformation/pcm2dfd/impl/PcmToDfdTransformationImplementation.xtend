package org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl

import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Stack
import org.apache.commons.lang3.Validate
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.ConfidentialityVariableCharacterisation
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.Characteristic
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.DataTypeCharacteristic
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.EnumCharacteristic
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.expression.AbstractNamedReferenceReference
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.repository.OperationalDataStoreComponent
import org.palladiosimulator.dataflow.confidentiality.pcm.model.profile.ProfileConstants
import org.palladiosimulator.dataflow.confidentiality.pcm.queryutils.ModelQueryUtils
import org.palladiosimulator.dataflow.confidentiality.pcm.queryutils.PcmQueryUtils
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.PcmToDfdTransformation
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided.DDEntityCreator
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided.DFDEntityCreator
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided.DataFlowTransformation
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided.TermTransformation
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.queries.AllocationLookup
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.trace.impl.PCM2DFDTransformationTraceImpl
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedActorProcess
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedNode
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedProcess
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.CharacteristicType
import org.palladiosimulator.indirections.actions.ConsumeDataAction
import org.palladiosimulator.indirections.actions.CreateDateAction
import org.palladiosimulator.indirections.actions.EmitDataAction
import org.palladiosimulator.indirections.repository.DataChannel
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI
import org.palladiosimulator.pcm.allocation.Allocation
import org.palladiosimulator.pcm.core.composition.AssemblyContext
import org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity
import org.palladiosimulator.pcm.parameter.VariableUsage
import org.palladiosimulator.pcm.repository.BasicComponent
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.OperationSignature
import org.palladiosimulator.pcm.seff.AbstractAction
import org.palladiosimulator.pcm.seff.ExternalCallAction
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification
import org.palladiosimulator.pcm.seff.SetVariableAction
import org.palladiosimulator.pcm.system.System
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour
import org.palladiosimulator.pcm.usagemodel.UsageModel
import org.palladiosimulator.pcm.usagemodel.UsageScenario

import static org.apache.commons.lang3.Validate.*
import static org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided.TransformationConstants.EMPTY_STACK
import static org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided.TransformationConstants.RESULT_PIN_NAME

class PcmToDfdTransformationImplementation implements PcmToDfdTransformation {

	static val LOGGER = Logger.getLogger(PcmToDfdTransformationImplementation)
	val extension ModelQueryUtils queryUtils = new ModelQueryUtils
	val extension PcmQueryUtils pcmQueryUtils = new PcmQueryUtils
	val extension DFDFactoryUtilities dfdFactoryUtils = new DFDFactoryUtilities
	val extension PCM2DFDTransformationTraceImpl traceRecorder = new PCM2DFDTransformationTraceImpl
	val dfd = createDataFlowDiagram
	val dd = createDataDictionary
	val extension DFDEntityCreator entityCreator
	val extension TermTransformation termTransformation
	val extension DDEntityCreator characteristicTransformation
	val extension DataFlowTransformation dataFlowTransformation
	var extension AllocationLookup allocationLookup

	new() {
		entityCreator = new DFDEntityCreator(dfd, traceRecorder)
		characteristicTransformation = new DDEntityCreator(dd, traceRecorder)
		termTransformation = new TermTransformation(characteristicTransformation, entityCreator)
		dataFlowTransformation = new DataFlowTransformation(entityCreator)
	}

	override transform(Collection<UsageModel> usageModels, Allocation allocationModel) {
		allocationLookup = new AllocationLookup(allocationModel)
		
		// transform all scenario behaviours, i.e. the user behaviour
		var scenarioBehaviours = usageModels.flatMap[usageScenario_UsageModel].map[scenarioBehaviour_UsageScenario]
		for (scenarioBehaviour : scenarioBehaviours) {
			LOGGER.info("Transforming " + ScenarioBehaviour.simpleName + " " + scenarioBehaviour.entityName)
			transform(scenarioBehaviour)
		}

		// transform the system (identify by following all entry level system calls)
		val assemblyContexts = scenarioBehaviours.flatMap[findAllChildrenIncludingSelfOfType(EntryLevelSystemCall)].map [
			providedRole_EntryLevelSystemCall.providingEntity_ProvidedRole
		].filter(System).toSet.sortBy[id].flatMap[assemblyContexts__ComposedStructure]
		assemblyContexts.forEach[ac|ac.transform(EMPTY_STACK)]

		// return transformation result
		new TransformationResultImpl(dfd, dd, traceRecorder)
	}
	
	

	// ==================== System ====================
	
	protected def void transform(AssemblyContext ac, Stack<AssemblyContext> context) {
		isTrue(context.isEmpty() || context.peek !== ac)
		val component = ac.encapsulatedComponent__AssemblyContext
		component.transformComponent(context.newStack(ac))
	}



	// ==================== RD-SEFF ====================
	
	protected def dispatch transformComponent(BasicComponent bc, Stack<AssemblyContext> context) {
		isTrue(context.peek.encapsulatedComponent__AssemblyContext === bc)
		bc.serviceEffectSpecifications__BasicComponent.forEach[transformSEFF(context)]
	}
	
	protected def dispatch transformSEFF(ResourceDemandingSEFF seff, Stack<AssemblyContext> context) {
		if (seff.basicComponent_ServiceEffectSpecification instanceof OperationalDataStoreComponent) {
			seff.transformToDataStore(context)			
		} else {
			seff.transformToSeffProcesses(context)			
		}
	}
	
	protected def void transformToSeffProcesses(ResourceDemandingSEFF seff, Stack<AssemblyContext> context) {
		isInstanceOf(OperationSignature, seff.describedService__SEFF)
		val operationSignature = seff.describedService__SEFF as OperationSignature
		
		//TODO clarify if data sinks can also be inputs for the SEFF entry process
		val requiresEntryProcess = !operationSignature.parameters__OperationSignature.isEmpty
		if (requiresEntryProcess) {
			seff.transformToEntryProcess(context)
		}
		
		val requiresExitProcess = operationSignature.returnType__OperationSignature !== null
		if (requiresExitProcess) {
			seff.transformToExitProcess(context, true)
		}
		
		seff.findAllChildrenIncludingSelfOfType(AbstractAction).forEach[action | action.transformAction(context)]			
	}
	
	protected def void transformToDataStore(ResourceDemandingSEFF seff, Stack<AssemblyContext> context) {
		Validate.isInstanceOf(OperationalDataStoreComponent, seff.basicComponent_ServiceEffectSpecification)
		val component = seff.basicComponent_ServiceEffectSpecification as OperationalDataStoreComponent
		val store = component.getStore(context)
		store.createCharacteristics(context, seff)	
		val storeInputPin = store.inputPin
		val storeOutputPin = store.outputPin
		
		val signature = seff.describedService__SEFF as OperationSignature
		if (!signature.parameters__OperationSignature.isEmpty) {
			val parameters = component.providedRoles_InterfaceProvidingEntity.filter(OperationProvidedRole).map[providedInterface__OperationProvidedRole].flatMap[signatures__OperationInterface].flatMap[parameters__OperationSignature]
			if (parameters.size != 1) {
				throw new IllegalStateException(OperationalDataStoreComponent.simpleName + "s must only provide one signature with a parameter.")
			}
			val parameter = parameters.findFirst[true]	
			val entryProcess = seff.transformToEntryProcess(context)
			val entryProcessOutputPin = entryProcess.getOutputPin(parameter.parameterName)
			getDataFlow(entryProcess, entryProcessOutputPin, store, storeInputPin)
		} else {
			val exitProcess = seff.transformToExitProcess(context, false)
			val exitProcessInputPin = exitProcess.getInputPin(RESULT_PIN_NAME)
			exitProcess.createCharacteristics(context, seff)		
			getDataFlow(store, storeOutputPin, exitProcess, exitProcessInputPin)
		}
	}
	
	
	protected def transformToEntryProcess(ServiceEffectSpecification seff, Stack<AssemblyContext> context) {
		isInstanceOf(OperationSignature, seff.describedService__SEFF)
		val signature = seff.describedService__SEFF as OperationSignature
		notNull(signature.parameters__OperationSignature)
		isTrue(signature.parameters__OperationSignature.size > 0)
		
		val process = getEntryProcess(seff, context)
		val parameterNames = signature.parameters__OperationSignature.map[parameterName]

		for (parameter : parameterNames) {
			val inputPin = process.getInputPin(parameter)
			val outputPin = process.getOutputPin(parameter)
			process.createCopyAssignment(outputPin, inputPin)
		}
		
		process.createCharacteristics(context, seff)
		
		// the callers have to create the incoming data flows
		// the users of parameters have to create outgoing data flows

		process
	}
	
	protected def transformToExitProcess(ResourceDemandingSEFF seff, Stack<AssemblyContext> context, boolean createProvidingDataFlows) {
		isInstanceOf(OperationSignature, seff.describedService__SEFF)
		notNull((seff.describedService__SEFF as OperationSignature).returnType__OperationSignature)
		val process = getExitProcess(seff, context)
		val inputPin = process.getInputPin(RESULT_PIN_NAME)
		val outputPin = process.getOutputPin(RESULT_PIN_NAME)
		process.createCopyAssignment(outputPin, inputPin)
		
		process.createCharacteristics(context, seff)
		
		if (createProvidingDataFlows) {
			process.createDataFlowsToSeffExitProcess(seff, context)			
		}
		
		process
	}
	
	protected def dispatch transformSEFF(ServiceEffectSpecification seff, Stack<AssemblyContext> context) {
		// only in preparation for future new SEFF types
		throw new UnsupportedOperationException("No handler has been defined for SEFF type " + seff.class.simpleName)
	}
	
	protected def dispatch transformAction(ExternalCallAction action, Stack<AssemblyContext> context) {
		val requiresEntryProcess = !action.calledService_ExternalService.parameters__OperationSignature.isEmpty
		if (requiresEntryProcess) {
			action.transformToEntryProcess(context)
		}
		
		val requiresExitProcess = action.calledService_ExternalService.returnType__OperationSignature !== null
		if (requiresExitProcess) {
			action.transformToExitProcess(context)
		}
	}
	
	protected def dispatch transformAction(CreateDateAction action, Stack<AssemblyContext> context) {
		Validate.isTrue(action.variableUsages.map[namedReference__VariableUsage.referenceName].forall [
			equals(action.variableReference.referenceName)
		],
			"Limitation: all variable characterisations in a create date action have to refer to the same variable as the action.")
		
		val process = action.getProcess(context)
		process.addPinsAndBehavior(action.variableUsages, context, true)
		process.createCharacteristics(context, action)
		process
	}
	
	protected def dispatch transformAction(EmitDataAction action, Stack<AssemblyContext> context) {
		val process = action.getProcess(context)
		val inputPin = process.getInputPin(action.variableReference.referenceName)
		val outputPin = process.getOutputPin(action.dataSourceRole)
		process.createCopyAssignment(outputPin, inputPin)
		process.createOutgoingDataFlows(action.dataSourceRole, context)
		process.createCharacteristics(context, action)
		process.createDataFlows(action.variableReference, context)
		process
	}
	
	protected def dispatch transformAction(ConsumeDataAction action, Stack<AssemblyContext> context) {
		val process = action.getProcess(context)
		val inputPin = process.getInputPin(action.dataSinkRole)
		val outputPin = process.getOutputPin(action.variableReference.referenceName)
		process.createCopyAssignment(outputPin, inputPin)
		process.createCharacteristics(context, action)
		// emit actions and data channels already provide data flows to these actions
		process
	}
	
	protected def dispatch transformAction(SetVariableAction action, Stack<AssemblyContext> context) {
		val process = action.getProcess(context)
		process.addPinsAndBehavior(action.localVariableUsages_SetVariableAction, context, true)
		process.createCharacteristics(context, action)
		process
	}
	
	protected def dispatch transformAction(AbstractAction action, Stack<AssemblyContext> context) {
		// action not relevant, discarding
	}
	
	protected def transformToEntryProcess(ExternalCallAction eca, Stack<AssemblyContext> context) {
		val process = eca.getEntryProcess(context)
		process.addPinsAndBehavior(eca.inputVariableUsages__CallAction, context, true)
		process.createCharacteristics(context, eca)
		process.createOutgoingDataFlows(eca.calledService_ExternalService, eca.role_ExternalService, context)
		process
	}
	
	protected def transformToExitProcess(ExternalCallAction eca, Stack<AssemblyContext> context) {
		val process = eca.getExitProcess(context)
		process.addPinsAndBehavior(eca.returnVariableUsage__CallReturnAction, context, true)
		process.createCharacteristics(context, eca)
		process
	}
	
	
	
	// ==================== Data Channel ====================
	
	protected def dispatch transformComponent(DataChannel dc, Stack<AssemblyContext> context) {
		val process = dc.getProcess(context)

		// create pins
		dc.dataSinkRoles.forEach[role | process.getInputPin(role)]
		dc.dataSourceRoles.forEach[role | process.getOutputPin(role)]
		
		// create behaviour
		if (process instanceof CharacterizedProcess) {
			val behaviour = dc.confidentialityBehavior.orElseThrow
			val collectedVariableUsages = new ArrayList
			collectedVariableUsages += behaviour.reusedBehaviours.flatMap[variableUsages]
			collectedVariableUsages += behaviour.variableUsages
			process.addPinsAndBehavior(collectedVariableUsages, context, false)		
		}
		
		// create characteristics
		process.createCharacteristics(context, dc)
		
		// create data flows
		dc.dataSourceRoles.forEach[role | process.createOutgoingDataFlows(role, context)]
		
		process
	}

	protected def dispatch transformComponent(ComposedProvidingRequiringEntity cc, Stack<AssemblyContext> context) {
		isTrue(context.peek.encapsulatedComponent__AssemblyContext === cc)
		cc.assemblyContexts__ComposedStructure.forEach[transform(context)]
	}


	
	// ==================== User Behaviour ====================

	protected def transform(ScenarioBehaviour scenarioBehaviour) {
		val elscs = scenarioBehaviour.findAllChildrenIncludingSelfOfType(EntryLevelSystemCall)
		for (elsc : elscs) {
			transform(elsc)
		}
	}
	
	protected def transform(EntryLevelSystemCall elsc) {
		val correspondingActor = elsc.correspondingActorName.actor
		
		val requiresEntryProcess = !elsc.operationSignature__EntryLevelSystemCall.parameters__OperationSignature.isEmpty
		if (requiresEntryProcess) {
			elsc.transformToEntryProcess(correspondingActor)
		}
		
		val requiresExitProcess = elsc.operationSignature__EntryLevelSystemCall.returnType__OperationSignature !== null
		if (requiresExitProcess) {
			elsc.transformToExitProcess(correspondingActor)
		}
	}
	
	protected def transformToEntryProcess(EntryLevelSystemCall elsc, ExternalActor actor) {
		val process = elsc.getEntryProcess(actor)
		process.addPinsAndBehavior(elsc.inputParameterUsages_EntryLevelSystemCall)
		process.createCharacteristics(EMPTY_STACK, elsc)
		process.createDataFlows(elsc.inputParameterUsages_EntryLevelSystemCall, EMPTY_STACK)
		
		val calledSeff = elsc.providedRole_EntryLevelSystemCall.findCalledSeff(elsc.operationSignature__EntryLevelSystemCall, EMPTY_STACK)
		val dstProcess = calledSeff.seff.getEntryProcess(calledSeff.context)
		val targetParameters = elsc.operationSignature__EntryLevelSystemCall.parameters__OperationSignature.map[parameterName]
		for (targetParameter : targetParameters) {
			val dstPin = dstProcess.getInputPin(targetParameter)
			val srcPin = process.getOutputPin(targetParameter)
			getDataFlow(process, srcPin, dstProcess, dstPin)
		}
		
		process
	}
	
	protected def transformToExitProcess(EntryLevelSystemCall elsc, ExternalActor actor) {
		val process = elsc.getExitProcess(actor)
		process.addPinsAndBehavior(elsc.outputParameterUsages_EntryLevelSystemCall)
		process.createCharacteristics(EMPTY_STACK, elsc)
		process.createDataFlows(elsc.outputParameterUsages_EntryLevelSystemCall, EMPTY_STACK)
		process
	}
	
	protected def addPinsAndBehavior(CharacterizedActorProcess process, Iterable<VariableUsage> variableUsages) {
		process.addPinsAndBehavior(variableUsages, EMPTY_STACK, true)
	}
	
	
	
	// ==================== Behaviour / Data Flow Helpers ====================

	protected def addPinsAndBehavior(CharacterizedProcess process, Iterable<VariableUsage> variableUsages, Stack<AssemblyContext> context, boolean createDataFlows) {
		// create input pins
		val requiredVariableNames = variableUsages.flatMap [
			findAllChildrenIncludingSelfOfType(AbstractNamedReferenceReference)
		].map[namedReference.referenceName].toSet.sort
		requiredVariableNames.forEach[name|process.getInputPin(name)]

		// create output pins
		for (variableUsage : variableUsages) {
			val variableName = variableUsage.namedReference__VariableUsage.referenceName
			val outputPin = process.getOutputPin(variableName);

			// create behaviour
			val confidentialityCharacterisations = variableUsage.variableCharacterisation_VariableUsage.filter(
				ConfidentialityVariableCharacterisation)
			for (characterisation : confidentialityCharacterisations) {
				val lhs = characterisation.lhs.transformLhsTerm(outputPin)
				val rhs = characterisation.rhs.transformRhsTerm(process, context)
				createAssignment(process, lhs, rhs)
			}
		}
		
		if (createDataFlows) {
			process.createDataFlows(variableUsages, context)			
		}

		process
	}

	protected def <T> newStack(Stack<T> stack, T newTop) {
		val newStack = new Stack()
		newStack.addAll(stack)
		newStack.push(newTop)
		newStack
	}
			
	
	
	/* =========== Characteristics Transformations =========== */
	
	protected def createCharacteristics(CharacterizedNode node, Stack<AssemblyContext> context, EObject... pcmElements) {
		val characterisedElements = new ArrayList<EObject>
		characterisedElements += context
		if (!context.isEmpty) {
			characterisedElements += context.findResourceContainer
		}
		characterisedElements += pcmElements
		
		for (characteristic : characterisedElements.applicableCharacteristics) {
			val ct = characteristic.type.characteristicType
			val values = characteristic.determineLiterals
			node.ownedCharacteristics += createCharacteristic(ct, values)
		}
	}
	
	protected def dispatch determineLiterals(EnumCharacteristic characteristic) {
		characteristic.values.map[getLiteral]
	}
	
	protected def dispatch determineLiterals(DataTypeCharacteristic characteristic) {
		characteristic.values.map[getLiteral]
	}
	
	
	
	/* =========== Query Utils =========== */
	
	protected def getCorrespondingActorName(EObject eobject) {
		val usageScenario = eobject.findParentOfType(UsageScenario, true)
		if (usageScenario === null) {
			return null
		}
		eobject.applicableCharacteristics.correspondingActorName ?:
			'''Actor_«usageScenario.entityName»_«usageScenario.id»'''
	}
	
	protected def getCorrespondingActorName(Collection<Characteristic<? extends CharacteristicType>> characteristics) {
		characteristics.filter(EnumCharacteristic).filter [
			type.name == "CorrespondingActor"
		].flatMap[values].map[name].findFirst[true]
	}

	/* =========== Profiles Handling =========== */
	
	protected def getApplicableCharacteristics(List<EObject> eobjects) {
		eobjects.map[getApplicableCharacteristics].effectiveCharacteristics
	}
	
	protected def getApplicableCharacteristics(EObject eobject) {
		val collectedCharacteristics = new ArrayList<List<Characteristic<? extends CharacteristicType>>>
		for(var current = eobject; current !== null; current = current.eContainer) {
			collectedCharacteristics += current.characteristics
		}
		val characteristicStack = collectedCharacteristics.reverseView
		characteristicStack.effectiveCharacteristics
	}
	
	protected def effectiveCharacteristics(List<List<Characteristic<? extends CharacteristicType>>> characteristics) {
		val calculatedCharacteristics = new HashMap<CharacteristicType, Characteristic<? extends CharacteristicType>>
		for (characteristicLevel : characteristics) {
			for (characteristic : characteristicLevel) {
				calculatedCharacteristics.putIfAbsent(characteristic.type, characteristic)
			}
		}
		calculatedCharacteristics.values.sortBy[id]
	}
	
	protected def getCharacteristics(EObject eobject) {
		StereotypeAPI.<List<Characteristic<? extends CharacteristicType>>>getTaggedValueSafe(eobject,
			ProfileConstants.characterisable.value, ProfileConstants.characterisable.stereotype).orElse(#[])
	}

}
