package org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.devided

import java.util.Stack
import org.palladiosimulator.dataflow.confidentiality.pcm.transformation.pcm2dfd.impl.DFDFactoryUtilities
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedProcess
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Pin
import org.palladiosimulator.indirections.repository.DataChannel
import org.palladiosimulator.indirections.repository.DataSinkRole
import org.palladiosimulator.indirections.repository.DataSourceRole
import org.palladiosimulator.pcm.core.composition.AssemblyContext
import org.palladiosimulator.pcm.seff.AbstractAction
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction

class DFDEntityCreator implements TransformationResultGetter {
	
	val extension DFDFactoryUtilities dfdFactoryUtils = new DFDFactoryUtilities
	val DataFlowDiagram dfd
	
	new(DataFlowDiagram dfd) {
		this.dfd = dfd
	}
	
	def create actor: createActor getActor(String actorName) {
//		addTraceEntry(behavior, actor)
		actor.name = actorName
		actor.createBehavior
		dfd.nodes += actor
	}
	
	def getExitProcess(AbstractUserAction action, ExternalActor actor) {
		val process = action.getExitProcess()
		process.actor = actor
		process
	}
	
	override create process : createActorProcess getExitProcess(AbstractUserAction action) {
		// requirement: at some point in time, the exit process creation method that takes an actor has to be called
		process.name = '''UserAction Exit «action.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	def getEntryProcess(AbstractUserAction action, ExternalActor actor) {
		val process = action.getEntryProcess
		process.actor = actor
		process
	}
	
	override create process : createActorProcess getEntryProcess(AbstractUserAction action) {
		process.name = '''UserAction Entry «action.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create process : createProcess getExitProcess(AbstractAction action, Stack<AssemblyContext> context) {
		process.name = '''Action Exit «action.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create process : createProcess getEntryProcess(AbstractAction action, Stack<AssemblyContext> context) {
		process.name = '''Action Entry «action.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create process : createProcess getProcess(AbstractAction action, Stack<AssemblyContext> context) {
		process.name = '''Action «action.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create process : createProcess getExitProcess(ServiceEffectSpecification seff, Stack<AssemblyContext> context) {
		process.name = '''SEFF Exit «seff.describedService__SEFF.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create process : createProcess getEntryProcess(ServiceEffectSpecification seff, Stack<AssemblyContext> context) {
		process.name = '''SEFF Entry «seff.describedService__SEFF.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create process : createProcess getProcess(DataChannel dc, Stack<AssemblyContext> context) {
		process.name = '''DC «dc.entityName»'''
		process.createBehavior
		dfd.nodes += process
	}
	
	override create pin: createPin getOutputPin(CharacterizedProcess process, String pinName) {
		pin.name = pinName
		process.behavior.outputs += pin
	}
	
	override create pin: createPin getInputPin(CharacterizedProcess process, String pinName) {
		pin.name = pinName
		process.behavior.inputs += pin
	}
	
	override getOutputPin(CharacterizedProcess process, DataSourceRole role) {
		val roleName = role.entityName
		val parameterName = role.dataInterface.dataSignature.parameter.parameterName
		val pinName = '''«roleName».«parameterName»''' 
		process.getOutputPin(pinName);
	}
	
	override getInputPin(CharacterizedProcess process, DataSinkRole role) {
		val pinName = '''«role.entityName».«role.dataInterface.dataSignature.parameter.parameterName»'''
		process.getInputPin(pinName);
	}
	
	override create flow : createDataFlow getDataFlow(Node source, Pin sourcePin, Node destination, Pin destinationPin) {
		//TODO calculate and set name
		flow.name = "data"
		flow.source = source
		flow.sourcePin = sourcePin
		flow.target = destination
		flow.targetPin = destinationPin
		dfd.edges += flow
	}
}