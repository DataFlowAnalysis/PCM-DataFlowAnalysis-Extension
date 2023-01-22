/**
 */
package nodeCharacteristics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nodeCharacteristics.NodeCharacteristicsPackage
 * @generated
 */
public interface NodeCharacteristicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeCharacteristicsFactory eINSTANCE = nodeCharacteristics.impl.NodeCharacteristicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Usage Asignee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Asignee</em>'.
	 * @generated
	 */
	UsageAsignee createUsageAsignee();

	/**
	 * Returns a new object of class '<em>Ressource Assignee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource Assignee</em>'.
	 * @generated
	 */
	RessourceAssignee createRessourceAssignee();

	/**
	 * Returns a new object of class '<em>Assembly Assignee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Assignee</em>'.
	 * @generated
	 */
	AssemblyAssignee createAssemblyAssignee();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodeCharacteristicsPackage getNodeCharacteristicsPackage();

} //NodeCharacteristicsFactory
