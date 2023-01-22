/**
 */
package nodeCharacteristics.impl;

import nodeCharacteristics.NodeCharacteristicsPackage;
import nodeCharacteristics.UsageAsignee;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Asignee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.impl.UsageAsigneeImpl#getUsagescenario <em>Usagescenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageAsigneeImpl extends AbstractAssigneeImpl implements UsageAsignee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageAsigneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeCharacteristicsPackage.Literals.USAGE_ASIGNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario getUsagescenario() {
		return (UsageScenario)eGet(NodeCharacteristicsPackage.Literals.USAGE_ASIGNEE__USAGESCENARIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsagescenario(UsageScenario newUsagescenario) {
		eSet(NodeCharacteristicsPackage.Literals.USAGE_ASIGNEE__USAGESCENARIO, newUsagescenario);
	}

} //UsageAsigneeImpl
