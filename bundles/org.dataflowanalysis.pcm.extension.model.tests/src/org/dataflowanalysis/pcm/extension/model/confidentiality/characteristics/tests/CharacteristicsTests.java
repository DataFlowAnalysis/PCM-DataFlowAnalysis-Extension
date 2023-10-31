/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.characteristics.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>characteristics</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacteristicsTests extends TestSuite {

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
		TestSuite suite = new CharacteristicsTests("characteristics Tests");
		suite.addTestSuite(EnumCharacteristicTest.class);
		suite.addTestSuite(DataTypeCharacteristicTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsTests(String name) {
		super(name);
	}

} //CharacteristicsTests
