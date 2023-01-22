/**
 */
package nodeCharacteristics.impl;

import nodeCharacteristics.NodeCharacteristicsPackage;
import nodeCharacteristics.RessourceAssignee;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Assignee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.impl.RessourceAssigneeImpl#getResourceenvironment <em>Resourceenvironment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceAssigneeImpl extends AbstractAssigneeImpl implements RessourceAssignee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceAssigneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeCharacteristicsPackage.Literals.RESSOURCE_ASSIGNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment getResourceenvironment() {
		return (ResourceEnvironment)eGet(NodeCharacteristicsPackage.Literals.RESSOURCE_ASSIGNEE__RESOURCEENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceenvironment(ResourceEnvironment newResourceenvironment) {
		eSet(NodeCharacteristicsPackage.Literals.RESSOURCE_ASSIGNEE__RESOURCEENVIRONMENT, newResourceenvironment);
	}

} //RessourceAssigneeImpl
