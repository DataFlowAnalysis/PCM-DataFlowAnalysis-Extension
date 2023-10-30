/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.behaviour.tests.BehaviourTests;

import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.tests.CharacteristicsTests;

import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.expression.tests.ExpressionTests;

import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.repository.tests.RepositoryTests;

import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.tests.ConfidentialityTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataFlowConfidentiality</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFlowConfidentialityAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DataFlowConfidentialityAllTests("DataFlowConfidentiality Tests");
		suite.addTest(ConfidentialityTests.suite());
		suite.addTest(CharacteristicsTests.suite());
		suite.addTest(ExpressionTests.suite());
		suite.addTest(BehaviourTests.suite());
		suite.addTest(RepositoryTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowConfidentialityAllTests(String name) {
		super(name);
	}

} //DataFlowConfidentialityAllTests
