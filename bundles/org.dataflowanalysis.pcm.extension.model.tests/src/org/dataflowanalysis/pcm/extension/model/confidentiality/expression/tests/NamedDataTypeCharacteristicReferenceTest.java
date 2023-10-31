/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.expression.tests;

import junit.textui.TestRunner;

import org.dataflowanalysis.pcm.extension.model.confidentiality.expression.ExpressionFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.expression.NamedDataTypeCharacteristicReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Data Type Characteristic Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedDataTypeCharacteristicReferenceTest extends DataTypeCharacteristicReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamedDataTypeCharacteristicReferenceTest.class);
	}

	/**
	 * Constructs a new Named Data Type Characteristic Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedDataTypeCharacteristicReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Named Data Type Characteristic Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NamedDataTypeCharacteristicReference getFixture() {
		return (NamedDataTypeCharacteristicReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExpressionFactory.eINSTANCE.createNamedDataTypeCharacteristicReference());
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

} //NamedDataTypeCharacteristicReferenceTest
