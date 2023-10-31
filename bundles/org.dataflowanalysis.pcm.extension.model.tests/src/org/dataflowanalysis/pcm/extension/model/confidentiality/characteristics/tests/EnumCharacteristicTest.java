/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.characteristics.tests;

import junit.textui.TestRunner;

import org.dataflowanalysis.pcm.extension.model.confidentiality.characteristics.CharacteristicsFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.characteristics.EnumCharacteristic;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumCharacteristicTest extends CharacteristicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumCharacteristicTest.class);
	}

	/**
	 * Constructs a new Enum Characteristic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacteristicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Characteristic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumCharacteristic getFixture() {
		return (EnumCharacteristic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CharacteristicsFactory.eINSTANCE.createEnumCharacteristic());
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

} //EnumCharacteristicTest
