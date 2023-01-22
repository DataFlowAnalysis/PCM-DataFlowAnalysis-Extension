/**
 */
package nodeCharacteristics.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import nodeCharacteristics.AbstractAssignee;
import nodeCharacteristics.AbstractAssignment;
import nodeCharacteristics.AssemblyAssignee;
import nodeCharacteristics.NodeCharacteristicsFactory;
import nodeCharacteristics.NodeCharacteristicsPackage;
import nodeCharacteristics.RessourceAssignee;
import nodeCharacteristics.UsageAsignee;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterizedPackage;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.expressions.ExpressionsPackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeCharacteristicsPackageImpl extends EPackageImpl implements NodeCharacteristicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageAsigneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceAssigneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyAssigneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAssigneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAssignmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nodeCharacteristics.NodeCharacteristicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NodeCharacteristicsPackageImpl() {
		super(eNS_URI, NodeCharacteristicsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NodeCharacteristicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NodeCharacteristicsPackage init() {
		if (isInited) return (NodeCharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(NodeCharacteristicsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNodeCharacteristicsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NodeCharacteristicsPackageImpl theNodeCharacteristicsPackage = registeredNodeCharacteristicsPackage instanceof NodeCharacteristicsPackageImpl ? (NodeCharacteristicsPackageImpl)registeredNodeCharacteristicsPackage : new NodeCharacteristicsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DataDictionaryPackage.eINSTANCE.eClass();
		DataDictionaryCharacterizedPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNodeCharacteristicsPackage.createPackageContents();

		// Initialize created meta-data
		theNodeCharacteristicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNodeCharacteristicsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NodeCharacteristicsPackage.eNS_URI, theNodeCharacteristicsPackage);
		return theNodeCharacteristicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageAsignee() {
		return usageAsigneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageAsignee_Usagescenario() {
		return (EReference)usageAsigneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourceAssignee() {
		return ressourceAssigneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessourceAssignee_Resourceenvironment() {
		return (EReference)ressourceAssigneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyAssignee() {
		return assemblyAssigneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyAssignee_Assemblycontext() {
		return (EReference)assemblyAssigneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAssignee() {
		return abstractAssigneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAssignee_Assignment() {
		return (EReference)abstractAssigneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAssignment() {
		return abstractAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAssignment_Characteristics() {
		return (EReference)abstractAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCharacteristicsFactory getNodeCharacteristicsFactory() {
		return (NodeCharacteristicsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		usageAsigneeEClass = createEClass(USAGE_ASIGNEE);
		createEReference(usageAsigneeEClass, USAGE_ASIGNEE__USAGESCENARIO);

		ressourceAssigneeEClass = createEClass(RESSOURCE_ASSIGNEE);
		createEReference(ressourceAssigneeEClass, RESSOURCE_ASSIGNEE__RESOURCEENVIRONMENT);

		assemblyAssigneeEClass = createEClass(ASSEMBLY_ASSIGNEE);
		createEReference(assemblyAssigneeEClass, ASSEMBLY_ASSIGNEE__ASSEMBLYCONTEXT);

		abstractAssigneeEClass = createEClass(ABSTRACT_ASSIGNEE);
		createEReference(abstractAssigneeEClass, ABSTRACT_ASSIGNEE__ASSIGNMENT);

		abstractAssignmentEClass = createEClass(ABSTRACT_ASSIGNMENT);
		createEReference(abstractAssignmentEClass, ABSTRACT_ASSIGNMENT__CHARACTERISTICS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		usageAsigneeEClass.getESuperTypes().add(this.getAbstractAssignee());
		ressourceAssigneeEClass.getESuperTypes().add(this.getAbstractAssignee());
		assemblyAssigneeEClass.getESuperTypes().add(this.getAbstractAssignee());

		// Initialize classes, features, and operations; add parameters
		initEClass(usageAsigneeEClass, UsageAsignee.class, "UsageAsignee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageAsignee_Usagescenario(), theUsagemodelPackage.getUsageScenario(), null, "usagescenario", null, 1, 1, UsageAsignee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceAssigneeEClass, RessourceAssignee.class, "RessourceAssignee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRessourceAssignee_Resourceenvironment(), theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceenvironment", null, 1, 1, RessourceAssignee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyAssigneeEClass, AssemblyAssignee.class, "AssemblyAssignee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyAssignee_Assemblycontext(), theCompositionPackage.getAssemblyContext(), null, "assemblycontext", null, 1, 1, AssemblyAssignee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAssigneeEClass, AbstractAssignee.class, "AbstractAssignee", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAssignee_Assignment(), this.getAbstractAssignment(), null, "assignment", null, 1, 1, AbstractAssignee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAssignmentEClass, AbstractAssignment.class, "AbstractAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAssignment_Characteristics(), theExpressionsPackage.getEnumCharacteristicReference(), null, "characteristics", null, 0, -1, AbstractAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NodeCharacteristicsPackageImpl
