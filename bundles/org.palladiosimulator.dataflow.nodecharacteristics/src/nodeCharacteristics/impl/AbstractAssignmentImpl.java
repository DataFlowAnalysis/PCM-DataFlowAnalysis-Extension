/**
 */
package nodeCharacteristics.impl;

import nodeCharacteristics.AbstractAssignment;
import nodeCharacteristics.NodeCharacteristicsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.expressions.EnumCharacteristicReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.impl.AbstractAssignmentImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractAssignmentImpl extends CDOObjectImpl implements AbstractAssignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeCharacteristicsPackage.Literals.ABSTRACT_ASSIGNMENT;
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
	@SuppressWarnings("unchecked")
	public EList<EnumCharacteristicReference> getCharacteristics() {
		return (EList<EnumCharacteristicReference>)eGet(NodeCharacteristicsPackage.Literals.ABSTRACT_ASSIGNMENT__CHARACTERISTICS, true);
	}

} //AbstractAssignmentImpl
