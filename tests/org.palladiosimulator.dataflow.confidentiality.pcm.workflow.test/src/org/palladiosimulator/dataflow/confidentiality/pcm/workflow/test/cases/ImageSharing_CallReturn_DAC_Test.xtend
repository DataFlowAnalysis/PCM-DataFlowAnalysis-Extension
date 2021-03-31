package org.palladiosimulator.dataflow.confidentiality.pcm.workflow.test.cases

import de.uka.ipd.sdq.stoex.StoexFactory
import org.junit.jupiter.api.Test
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.ConfidentialityFactory
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.expression.ExpressionFactory
import org.palladiosimulator.dataflow.confidentiality.pcm.workflow.test.cases.impl.ImageSharing_DAC_TestBase
import org.palladiosimulator.pcm.parameter.ParameterFactory
import org.palladiosimulator.pcm.repository.OperationProvidedRole
import org.palladiosimulator.pcm.repository.OperationSignature
import org.palladiosimulator.pcm.repository.Repository
import org.palladiosimulator.pcm.system.System
import org.palladiosimulator.pcm.usagemodel.Start
import org.palladiosimulator.pcm.usagemodel.Stop
import org.palladiosimulator.pcm.usagemodel.UsageScenario
import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory

class ImageSharing_CallReturn_DAC_Test extends ImageSharing_DAC_TestBase {
	
	new() {
		super("ImageSharing_CallReturn_DAC")
	}
	
	@Test
	def void testNoIssueFound() {
		runTest(0)
	}
	
	@Test
	def void testIssueFound() {
		runTest(1, [ um |
			val repository = um.eResource.resourceSet.resources.findFirst[URI.fileExtension == "repository"].contents.get(0) as Repository
			val system = um.eResource.resourceSet.resources.findFirst[URI.fileExtension == "system"].contents.get(0) as System
			val behavior = um.eAllContents.filter(UsageScenario).findFirst[entityName == "IndexingBot"].scenarioBehaviour_UsageScenario
			behavior.actions_ScenarioBehaviour += UsagemodelFactory.eINSTANCE.createEntryLevelSystemCall => [
				entityName = "IndexingBot.getImage"
				operationSignature__EntryLevelSystemCall = repository.eAllContents.filter(OperationSignature).findFirst[entityName == "getImage"]
				providedRole_EntryLevelSystemCall = system.providedRoles_InterfaceProvidingEntity.filter(OperationProvidedRole).findFirst[true]
				predecessor = behavior.actions_ScenarioBehaviour.filter(Start).findFirst[true]
				successor = behavior.actions_ScenarioBehaviour.filter(Stop).findFirst[true]
				outputParameterUsages_EntryLevelSystemCall += ParameterFactory.eINSTANCE.createVariableUsage => [
					namedReference__VariableUsage = StoexFactory.eINSTANCE.createVariableReference => [
						referenceName = "image"
					]
					variableCharacterisation_VariableUsage += ConfidentialityFactory.eINSTANCE.createConfidentialityVariableCharacterisation => [
						lhs = ExpressionFactory.eINSTANCE.createLhsEnumCharacteristicReference
						rhs = ExpressionFactory.eINSTANCE.createNamedEnumCharacteristicReference => [
							namedReference = StoexFactory.eINSTANCE.createVariableReference => [
								referenceName = "RETURN"
							]
						]						
					]
				]
			]
		])
	}
	
}