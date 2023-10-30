/**
 */
package org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>confidentiality</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfidentialityTests extends TestSuite {

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
		TestSuite suite = new ConfidentialityTests("confidentiality Tests");
		suite.addTestSuite(ConfidentialityVariableCharacterisationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityTests(String name) {
		super(name);
	}

} //ConfidentialityTests
