/**
 */
package nodeCharacteristics;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Assignee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.AssemblyAssignee#getAssemblycontext <em>Assemblycontext</em>}</li>
 * </ul>
 *
 * @see nodeCharacteristics.NodeCharacteristicsPackage#getAssemblyAssignee()
 * @model
 * @generated
 */
public interface AssemblyAssignee extends AbstractAssignee {
	/**
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' reference.
	 * @see #setAssemblycontext(AssemblyContext)
	 * @see nodeCharacteristics.NodeCharacteristicsPackage#getAssemblyAssignee_Assemblycontext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblycontext();

	/**
	 * Sets the value of the '{@link nodeCharacteristics.AssemblyAssignee#getAssemblycontext <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblycontext</em>' reference.
	 * @see #getAssemblycontext()
	 * @generated
	 */
	void setAssemblycontext(AssemblyContext value);

} // AssemblyAssignee
