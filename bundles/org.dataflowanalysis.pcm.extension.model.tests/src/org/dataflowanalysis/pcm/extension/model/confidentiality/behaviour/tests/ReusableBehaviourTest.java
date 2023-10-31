/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.behaviour.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.dataflowanalysis.pcm.extension.model.confidentiality.behaviour.BehaviourFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.behaviour.ReusableBehaviour;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reusable Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReusableBehaviourTest extends TestCase {

	/**
	 * The fixture for this Reusable Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableBehaviour fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReusableBehaviourTest.class);
	}

	/**
	 * Constructs a new Reusable Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReusableBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reusable Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReusableBehaviour fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reusable Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableBehaviour getFixture() {
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
		setFixture(BehaviourFactory.eINSTANCE.createReusableBehaviour());
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

} //ReusableBehaviourTest
