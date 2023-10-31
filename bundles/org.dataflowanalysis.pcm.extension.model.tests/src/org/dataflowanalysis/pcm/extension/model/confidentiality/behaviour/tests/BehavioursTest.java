/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.behaviour.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.dataflowanalysis.pcm.extension.model.confidentiality.behaviour.BehaviourFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.behaviour.Behaviours;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behaviours</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehavioursTest extends TestCase {

	/**
	 * The fixture for this Behaviours test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Behaviours fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehavioursTest.class);
	}

	/**
	 * Constructs a new Behaviours test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioursTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Behaviours test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Behaviours fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Behaviours test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Behaviours getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createBehaviours());
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

} //BehavioursTest
