/**
 */
package nodeCharacteristics;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Asignee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.UsageAsignee#getUsagescenario <em>Usagescenario</em>}</li>
 * </ul>
 *
 * @see nodeCharacteristics.NodeCharacteristicsPackage#getUsageAsignee()
 * @model
 * @generated
 */
public interface UsageAsignee extends AbstractAssignee {
	/**
	 * Returns the value of the '<em><b>Usagescenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usagescenario</em>' reference.
	 * @see #setUsagescenario(UsageScenario)
	 * @see nodeCharacteristics.NodeCharacteristicsPackage#getUsageAsignee_Usagescenario()
	 * @model required="true"
	 * @generated
	 */
	UsageScenario getUsagescenario();

	/**
	 * Sets the value of the '{@link nodeCharacteristics.UsageAsignee#getUsagescenario <em>Usagescenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usagescenario</em>' reference.
	 * @see #getUsagescenario()
	 * @generated
	 */
	void setUsagescenario(UsageScenario value);

} // UsageAsignee
