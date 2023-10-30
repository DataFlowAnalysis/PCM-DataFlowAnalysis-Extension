/**
 */
package org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.NodeCharacteristicsFactory;
import org.palladiosimulator.dataflow.nodecharacteristics.nodecharacteristics.UsageAsignee;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Asignee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageAsigneeTest extends AbstractAssigneeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageAsigneeTest.class);
	}

	/**
	 * Constructs a new Usage Asignee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageAsigneeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage Asignee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsageAsignee getFixture() {
		return (UsageAsignee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeCharacteristicsFactory.eINSTANCE.createUsageAsignee());
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

} //UsageAsigneeTest
