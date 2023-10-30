/**
 */
package org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.AssemblyAssignee;
import org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.NodeCharacteristicsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Assignee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyAssigneeTest extends AbstractAssigneeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyAssigneeTest.class);
	}

	/**
	 * Constructs a new Assembly Assignee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyAssigneeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assembly Assignee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssemblyAssignee getFixture() {
		return (AssemblyAssignee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeCharacteristicsFactory.eINSTANCE.createAssemblyAssignee());
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

} //AssemblyAssigneeTest
