/**
 */
package nodeCharacteristics.impl;

import nodeCharacteristics.AbstractAssignee;
import nodeCharacteristics.AbstractAssignment;
import nodeCharacteristics.NodeCharacteristicsPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Assignee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.impl.AbstractAssigneeImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractAssigneeImpl extends CDOObjectImpl implements AbstractAssignee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAssigneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeCharacteristicsPackage.Literals.ABSTRACT_ASSIGNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAssignment getAssignment() {
		return (AbstractAssignment)eGet(NodeCharacteristicsPackage.Literals.ABSTRACT_ASSIGNEE__ASSIGNMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(AbstractAssignment newAssignment) {
		eSet(NodeCharacteristicsPackage.Literals.ABSTRACT_ASSIGNEE__ASSIGNMENT, newAssignment);
	}

} //AbstractAssigneeImpl
