/*
 * generated by Xtext 2.24.0
 */
package org.dataflowanalysis.pcm.^extension.dddsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.dataflowanalysis.pcm.^extension.dddsl.services.DDDslGrammarAccess
import org.dataflowanalysis.pcm.^extension.model.confidentiality.ConfidentialityVariableCharacterisation
import org.dataflowanalysis.pcm.^extension.model.confidentiality.behaviour.ReusableBehaviour
import org.dataflowanalysis.pcm.^extension.model.confidentiality.characteristics.EnumCharacteristic
import org.dataflowanalysis.pcm.^extension.model.confidentiality.dictionary.PCMDataDictionary
import org.dataflowanalysis.pcm.^extension.model.confidentiality.expression.LhsEnumCharacteristicReference
import org.dataflowanalysis.pcm.^extension.model.confidentiality.expression.NamedEnumCharacteristicReference
import org.dataflowanalysis.pcm.^extension.dictionary.characterized.dsl.formatting2.CharacterizedDataDictionaryFormatter
import org.palladiosimulator.pcm.parameter.VariableUsage
import org.dataflowanalysis.pcm.^extension.dictionary.characterized.DataDictionaryCharacterized.expressions.Term

class DDDslFormatter extends CharacterizedDataDictionaryFormatter {

	@Inject extension DDDslGrammarAccess

	def dispatch void format(PCMDataDictionary dd, extension IFormattableDocument document) {
		dd.regionFor.keyword(PCMDataDictionaryAccess.dictionaryKeyword_0).prepend[noSpace].append[oneSpace]
		dd.regionFor.keyword(PCMDataDictionaryAccess.idKeyword_1).append[oneSpace]
		dd.regionFor.assignment(PCMDataDictionaryAccess.idAssignment_2).append[noSpace; newLines = 2; priority = 2]

		dd.characteristicEnumerations.forEach[format]
		dd.characteristicTypes.forEach[format]
		dd.characteristics.forEach[format]
	}
	
	def dispatch void format(EnumCharacteristic characteristic, extension IFormattableDocument document) {
		characteristic.prepend[newLine]
		characteristic.regionFor.keyword(PCMEnumCharacteristicAccess.enumCharacteristicKeyword_0).prepend[noSpace].append[oneSpace]
		characteristic.regionFor.keyword(PCMEnumCharacteristicAccess.usingKeyword_2).prepend[oneSpace].append[oneSpace]
		interior(
			characteristic.regionFor.keyword(PCMEnumCharacteristicAccess.leftCurlyBracketKeyword_4).prepend[oneSpace].append[newLine],
			characteristic.regionFor.keyword(PCMEnumCharacteristicAccess.rightCurlyBracketKeyword_6).append[noSpace],
			[indent]
		)
		characteristic.allRegionsFor.assignments(PCMEnumCharacteristicAccess.valuesAssignment_5).forEach[append[newLine]]
	}
	
	def dispatch void format(ReusableBehaviour behaviour, extension IFormattableDocument document) {
		behaviour.prepend[newLines = 2]
		behaviour.regionFor.keyword(reusableBehaviourAccess.behaviorKeyword_0).prepend[noSpace].append[oneSpace]
		interior(
			behaviour.regionFor.keyword(reusableBehaviourAccess.leftCurlyBracketKeyword_2).prepend[oneSpace].append[newLine],
			behaviour.regionFor.keyword(reusableBehaviourAccess.rightCurlyBracketKeyword_6).append[noSpace],
			[indent]
		)

		behaviour.allRegionsFor.keywords(reusableBehaviourAccess.inputKeyword_3_0, reusableBehaviourAccess.outputKeyword_4_0).forEach[append[oneSpace]]
		(behaviour.inputVariables + behaviour.outputVariables).forEach[append[noSpace;newLine]]
		
		behaviour.variableUsages.findFirst[true]?.prepend[newLines=2;priority=2] // conflict with newLine of output variables
		behaviour.variableUsages.forEach[append[newLine]]
		behaviour.variableUsages.forEach[format]
	}

	def dispatch void format(VariableUsage variableUsage, extension IFormattableDocument document) {
		variableUsage.regionFor.keyword(variableUsageAccess.fullStopKeyword_1).prepend[noSpace].append[noSpace]
		interior(
			variableUsage.regionFor.keyword(variableUsageAccess.leftCurlyBracketKeyword_2_1_0).prepend[oneSpace; priority=2].append[noSpace;newLine], // conflict with oneSpace of fullStopKeyword
			variableUsage.regionFor.keyword(variableUsageAccess.rightCurlyBracketKeyword_2_1_2).prepend[noSpace].append[noSpace],
			[indent]
		)
		variableUsage.variableCharacterisation_VariableUsage.forEach[append[newLine]]
		variableUsage.variableCharacterisation_VariableUsage.forEach[format]
	}
	
	def dispatch void format(ConfidentialityVariableCharacterisation characterisation, extension IFormattableDocument document) {
		characterisation.regionFor.keyword(confidentialityVariableCharacterisationAccess.colonEqualsSignKeyword_1).prepend[oneSpace].append[oneSpace]
		characterisation.lhs.format
		characterisation.rhs.format
	}
	
	def dispatch void format(LhsEnumCharacteristicReference reference, extension IFormattableDocument document) {
		reference.formatDefault(document)
		reference.allRegionsFor.keywords(lhsEnumCharacteristicReferenceAccess.fullStopKeyword_1_0_1, lhsEnumCharacteristicReferenceAccess.fullStopKeyword_1_1_1).forEach[prepend[noSpace].append[noSpace]]
	}
	
	def dispatch void format(NamedEnumCharacteristicReference reference, extension IFormattableDocument document) {
		reference.formatDefault(document)
		reference.allRegionsFor.keywords(namedEnumCharacteristicReferenceAccess.fullStopKeyword_1, namedEnumCharacteristicReferenceAccess.fullStopKeyword_2_0_1, namedEnumCharacteristicReferenceAccess.fullStopKeyword_2_1_1).forEach[prepend[noSpace].append[noSpace]]
	}

	override dispatch void format(Term term, extension IFormattableDocument document) {
		term.regionFor.keyword(primaryTermAccess.leftParenthesisKeyword_0_0).append[noSpace]
		term.regionFor.keyword(primaryTermAccess.rightParenthesisKeyword_0_2).prepend[noSpace]
	}

}
