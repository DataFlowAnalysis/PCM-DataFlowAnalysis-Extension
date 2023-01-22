/**
 */
package nodeCharacteristics;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Assignee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.AbstractAssignee#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see nodeCharacteristics.NodeCharacteristicsPackage#getAbstractAssignee()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AbstractAssignee extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference.
	 * @see #setAssignment(AbstractAssignment)
	 * @see nodeCharacteristics.NodeCharacteristicsPackage#getAbstractAssignee_Assignment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractAssignment getAssignment();

	/**
	 * Sets the value of the '{@link nodeCharacteristics.AbstractAssignee#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(AbstractAssignment value);

} // AbstractAssignee
