/**
 */
package org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.NodeCharacteristicsFactory;
import org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.RessourceAssignee;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ressource Assignee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourceAssigneeTest extends AbstractAssigneeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RessourceAssigneeTest.class);
	}

	/**
	 * Constructs a new Ressource Assignee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceAssigneeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ressource Assignee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RessourceAssignee getFixture() {
		return (RessourceAssignee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeCharacteristicsFactory.eINSTANCE.createRessourceAssignee());
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

} //RessourceAssigneeTest
