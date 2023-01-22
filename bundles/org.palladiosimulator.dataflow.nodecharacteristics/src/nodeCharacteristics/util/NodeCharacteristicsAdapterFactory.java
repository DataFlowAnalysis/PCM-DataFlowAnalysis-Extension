/**
 */
package nodeCharacteristics.util;

import nodeCharacteristics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nodeCharacteristics.NodeCharacteristicsPackage
 * @generated
 */
public class NodeCharacteristicsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NodeCharacteristicsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCharacteristicsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NodeCharacteristicsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeCharacteristicsSwitch<Adapter> modelSwitch =
		new NodeCharacteristicsSwitch<Adapter>() {
			@Override
			public Adapter caseUsageAsignee(UsageAsignee object) {
				return createUsageAsigneeAdapter();
			}
			@Override
			public Adapter caseRessourceAssignee(RessourceAssignee object) {
				return createRessourceAssigneeAdapter();
			}
			@Override
			public Adapter caseAssemblyAssignee(AssemblyAssignee object) {
				return createAssemblyAssigneeAdapter();
			}
			@Override
			public Adapter caseAbstractAssignee(AbstractAssignee object) {
				return createAbstractAssigneeAdapter();
			}
			@Override
			public Adapter caseAbstractAssignment(AbstractAssignment object) {
				return createAbstractAssignmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nodeCharacteristics.UsageAsignee <em>Usage Asignee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodeCharacteristics.UsageAsignee
	 * @generated
	 */
	public Adapter createUsageAsigneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodeCharacteristics.RessourceAssignee <em>Ressource Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodeCharacteristics.RessourceAssignee
	 * @generated
	 */
	public Adapter createRessourceAssigneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodeCharacteristics.AssemblyAssignee <em>Assembly Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodeCharacteristics.AssemblyAssignee
	 * @generated
	 */
	public Adapter createAssemblyAssigneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodeCharacteristics.AbstractAssignee <em>Abstract Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodeCharacteristics.AbstractAssignee
	 * @generated
	 */
	public Adapter createAbstractAssigneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodeCharacteristics.AbstractAssignment <em>Abstract Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodeCharacteristics.AbstractAssignment
	 * @generated
	 */
	public Adapter createAbstractAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NodeCharacteristicsAdapterFactory
