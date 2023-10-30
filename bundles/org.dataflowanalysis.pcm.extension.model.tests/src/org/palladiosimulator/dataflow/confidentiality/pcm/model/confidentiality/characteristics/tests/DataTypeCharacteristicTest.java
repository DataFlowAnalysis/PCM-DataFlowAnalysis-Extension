/**
 */
package org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.CharacteristicsFactory;
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.characteristics.DataTypeCharacteristic;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Type Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeCharacteristicTest extends CharacteristicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataTypeCharacteristicTest.class);
	}

	/**
	 * Constructs a new Data Type Characteristic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeCharacteristicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Type Characteristic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataTypeCharacteristic getFixture() {
		return (DataTypeCharacteristic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CharacteristicsFactory.eINSTANCE.createDataTypeCharacteristic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DataTypeCharacteristicTest
