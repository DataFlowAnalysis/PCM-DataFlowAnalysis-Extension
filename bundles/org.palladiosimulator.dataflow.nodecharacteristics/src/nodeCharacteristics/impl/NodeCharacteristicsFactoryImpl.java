/**
 */
package nodeCharacteristics.impl;

import nodeCharacteristics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeCharacteristicsFactoryImpl extends EFactoryImpl implements NodeCharacteristicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeCharacteristicsFactory init() {
		try {
			NodeCharacteristicsFactory theNodeCharacteristicsFactory = (NodeCharacteristicsFactory)EPackage.Registry.INSTANCE.getEFactory(NodeCharacteristicsPackage.eNS_URI);
			if (theNodeCharacteristicsFactory != null) {
				return theNodeCharacteristicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NodeCharacteristicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCharacteristicsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NodeCharacteristicsPackage.USAGE_ASIGNEE: return (EObject)createUsageAsignee();
			case NodeCharacteristicsPackage.RESSOURCE_ASSIGNEE: return (EObject)createRessourceAssignee();
			case NodeCharacteristicsPackage.ASSEMBLY_ASSIGNEE: return (EObject)createAssemblyAssignee();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageAsignee createUsageAsignee() {
		UsageAsigneeImpl usageAsignee = new UsageAsigneeImpl();
		return usageAsignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceAssignee createRessourceAssignee() {
		RessourceAssigneeImpl ressourceAssignee = new RessourceAssigneeImpl();
		return ressourceAssignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyAssignee createAssemblyAssignee() {
		AssemblyAssigneeImpl assemblyAssignee = new AssemblyAssigneeImpl();
		return assemblyAssignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCharacteristicsPackage getNodeCharacteristicsPackage() {
		return (NodeCharacteristicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NodeCharacteristicsPackage getPackage() {
		return NodeCharacteristicsPackage.eINSTANCE;
	}

} //NodeCharacteristicsFactoryImpl
