/**
 */
package nodeCharacteristics;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Assignee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.RessourceAssignee#getResourceenvironment <em>Resourceenvironment</em>}</li>
 * </ul>
 *
 * @see nodeCharacteristics.NodeCharacteristicsPackage#getRessourceAssignee()
 * @model
 * @generated
 */
public interface RessourceAssignee extends AbstractAssignee {
	/**
	 * Returns the value of the '<em><b>Resourceenvironment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceenvironment</em>' reference.
	 * @see #setResourceenvironment(ResourceEnvironment)
	 * @see nodeCharacteristics.NodeCharacteristicsPackage#getRessourceAssignee_Resourceenvironment()
	 * @model required="true"
	 * @generated
	 */
	ResourceEnvironment getResourceenvironment();

	/**
	 * Sets the value of the '{@link nodeCharacteristics.RessourceAssignee#getResourceenvironment <em>Resourceenvironment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resourceenvironment</em>' reference.
	 * @see #getResourceenvironment()
	 * @generated
	 */
	void setResourceenvironment(ResourceEnvironment value);

} // RessourceAssignee
