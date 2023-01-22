/**
 */
package nodeCharacteristics;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.expressions.EnumCharacteristicReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.AbstractAssignment#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see nodeCharacteristics.NodeCharacteristicsPackage#getAbstractAssignment()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AbstractAssignment extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.expressions.EnumCharacteristicReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' reference list.
	 * @see nodeCharacteristics.NodeCharacteristicsPackage#getAbstractAssignment_Characteristics()
	 * @model
	 * @generated
	 */
	EList<EnumCharacteristicReference> getCharacteristics();

} // AbstractAssignment
