/**
 */
package org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.expression.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>expression</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionTests extends TestSuite {

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
		TestSuite suite = new ExpressionTests("expression Tests");
		suite.addTestSuite(NamedDataTypeCharacteristicReferenceTest.class);
		suite.addTestSuite(NamedEnumCharacteristicReferenceTest.class);
		suite.addTestSuite(LhsEnumCharacteristicReferenceTest.class);
		suite.addTestSuite(LhsDataTypeCharacteristicReferenceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionTests(String name) {
		super(name);
	}

} //ExpressionTests
