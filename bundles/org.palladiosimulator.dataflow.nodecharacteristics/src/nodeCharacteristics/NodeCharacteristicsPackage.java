/**
 */
package nodeCharacteristics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nodeCharacteristics.NodeCharacteristicsFactory
 * @model kind="package"
 * @generated
 */
public interface NodeCharacteristicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nodeCharacteristics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/nodeCharacteristics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nodeCharacteristics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeCharacteristicsPackage eINSTANCE = nodeCharacteristics.impl.NodeCharacteristicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link nodeCharacteristics.impl.AbstractAssigneeImpl <em>Abstract Assignee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodeCharacteristics.impl.AbstractAssigneeImpl
	 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getAbstractAssignee()
	 * @generated
	 */
	int ABSTRACT_ASSIGNEE = 3;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSIGNEE__ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSIGNEE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSIGNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nodeCharacteristics.impl.UsageAsigneeImpl <em>Usage Asignee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodeCharacteristics.impl.UsageAsigneeImpl
	 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getUsageAsignee()
	 * @generated
	 */
	int USAGE_ASIGNEE = 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASIGNEE__ASSIGNMENT = ABSTRACT_ASSIGNEE__ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Usagescenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASIGNEE__USAGESCENARIO = ABSTRACT_ASSIGNEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usage Asignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASIGNEE_FEATURE_COUNT = ABSTRACT_ASSIGNEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Usage Asignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ASIGNEE_OPERATION_COUNT = ABSTRACT_ASSIGNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nodeCharacteristics.impl.RessourceAssigneeImpl <em>Ressource Assignee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodeCharacteristics.impl.RessourceAssigneeImpl
	 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getRessourceAssignee()
	 * @generated
	 */
	int RESSOURCE_ASSIGNEE = 1;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ASSIGNEE__ASSIGNMENT = ABSTRACT_ASSIGNEE__ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Resourceenvironment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ASSIGNEE__RESOURCEENVIRONMENT = ABSTRACT_ASSIGNEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ressource Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ASSIGNEE_FEATURE_COUNT = ABSTRACT_ASSIGNEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ressource Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ASSIGNEE_OPERATION_COUNT = ABSTRACT_ASSIGNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nodeCharacteristics.impl.AssemblyAssigneeImpl <em>Assembly Assignee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodeCharacteristics.impl.AssemblyAssigneeImpl
	 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getAssemblyAssignee()
	 * @generated
	 */
	int ASSEMBLY_ASSIGNEE = 2;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNEE__ASSIGNMENT = ABSTRACT_ASSIGNEE__ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNEE__ASSEMBLYCONTEXT = ABSTRACT_ASSIGNEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNEE_FEATURE_COUNT = ABSTRACT_ASSIGNEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assembly Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNEE_OPERATION_COUNT = ABSTRACT_ASSIGNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nodeCharacteristics.impl.AbstractAssignmentImpl <em>Abstract Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodeCharacteristics.impl.AbstractAssignmentImpl
	 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getAbstractAssignment()
	 * @generated
	 */
	int ABSTRACT_ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSIGNMENT__CHARACTERISTICS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSIGNMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSIGNMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link nodeCharacteristics.UsageAsignee <em>Usage Asignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Asignee</em>'.
	 * @see nodeCharacteristics.UsageAsignee
	 * @generated
	 */
	EClass getUsageAsignee();

	/**
	 * Returns the meta object for the reference '{@link nodeCharacteristics.UsageAsignee#getUsagescenario <em>Usagescenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usagescenario</em>'.
	 * @see nodeCharacteristics.UsageAsignee#getUsagescenario()
	 * @see #getUsageAsignee()
	 * @generated
	 */
	EReference getUsageAsignee_Usagescenario();

	/**
	 * Returns the meta object for class '{@link nodeCharacteristics.RessourceAssignee <em>Ressource Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Assignee</em>'.
	 * @see nodeCharacteristics.RessourceAssignee
	 * @generated
	 */
	EClass getRessourceAssignee();

	/**
	 * Returns the meta object for the reference '{@link nodeCharacteristics.RessourceAssignee#getResourceenvironment <em>Resourceenvironment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resourceenvironment</em>'.
	 * @see nodeCharacteristics.RessourceAssignee#getResourceenvironment()
	 * @see #getRessourceAssignee()
	 * @generated
	 */
	EReference getRessourceAssignee_Resourceenvironment();

	/**
	 * Returns the meta object for class '{@link nodeCharacteristics.AssemblyAssignee <em>Assembly Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Assignee</em>'.
	 * @see nodeCharacteristics.AssemblyAssignee
	 * @generated
	 */
	EClass getAssemblyAssignee();

	/**
	 * Returns the meta object for the reference '{@link nodeCharacteristics.AssemblyAssignee#getAssemblycontext <em>Assemblycontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assemblycontext</em>'.
	 * @see nodeCharacteristics.AssemblyAssignee#getAssemblycontext()
	 * @see #getAssemblyAssignee()
	 * @generated
	 */
	EReference getAssemblyAssignee_Assemblycontext();

	/**
	 * Returns the meta object for class '{@link nodeCharacteristics.AbstractAssignee <em>Abstract Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Assignee</em>'.
	 * @see nodeCharacteristics.AbstractAssignee
	 * @generated
	 */
	EClass getAbstractAssignee();

	/**
	 * Returns the meta object for the containment reference '{@link nodeCharacteristics.AbstractAssignee#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see nodeCharacteristics.AbstractAssignee#getAssignment()
	 * @see #getAbstractAssignee()
	 * @generated
	 */
	EReference getAbstractAssignee_Assignment();

	/**
	 * Returns the meta object for class '{@link nodeCharacteristics.AbstractAssignment <em>Abstract Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Assignment</em>'.
	 * @see nodeCharacteristics.AbstractAssignment
	 * @generated
	 */
	EClass getAbstractAssignment();

	/**
	 * Returns the meta object for the reference list '{@link nodeCharacteristics.AbstractAssignment#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Characteristics</em>'.
	 * @see nodeCharacteristics.AbstractAssignment#getCharacteristics()
	 * @see #getAbstractAssignment()
	 * @generated
	 */
	EReference getAbstractAssignment_Characteristics();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodeCharacteristicsFactory getNodeCharacteristicsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nodeCharacteristics.impl.UsageAsigneeImpl <em>Usage Asignee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodeCharacteristics.impl.UsageAsigneeImpl
		 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getUsageAsignee()
		 * @generated
		 */
		EClass USAGE_ASIGNEE = eINSTANCE.getUsageAsignee();

		/**
		 * The meta object literal for the '<em><b>Usagescenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_ASIGNEE__USAGESCENARIO = eINSTANCE.getUsageAsignee_Usagescenario();

		/**
		 * The meta object literal for the '{@link nodeCharacteristics.impl.RessourceAssigneeImpl <em>Ressource Assignee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodeCharacteristics.impl.RessourceAssigneeImpl
		 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getRessourceAssignee()
		 * @generated
		 */
		EClass RESSOURCE_ASSIGNEE = eINSTANCE.getRessourceAssignee();

		/**
		 * The meta object literal for the '<em><b>Resourceenvironment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE_ASSIGNEE__RESOURCEENVIRONMENT = eINSTANCE.getRessourceAssignee_Resourceenvironment();

		/**
		 * The meta object literal for the '{@link nodeCharacteristics.impl.AssemblyAssigneeImpl <em>Assembly Assignee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodeCharacteristics.impl.AssemblyAssigneeImpl
		 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getAssemblyAssignee()
		 * @generated
		 */
		EClass ASSEMBLY_ASSIGNEE = eINSTANCE.getAssemblyAssignee();

		/**
		 * The meta object literal for the '<em><b>Assemblycontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_ASSIGNEE__ASSEMBLYCONTEXT = eINSTANCE.getAssemblyAssignee_Assemblycontext();

		/**
		 * The meta object literal for the '{@link nodeCharacteristics.impl.AbstractAssigneeImpl <em>Abstract Assignee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodeCharacteristics.impl.AbstractAssigneeImpl
		 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getAbstractAssignee()
		 * @generated
		 */
		EClass ABSTRACT_ASSIGNEE = eINSTANCE.getAbstractAssignee();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ASSIGNEE__ASSIGNMENT = eINSTANCE.getAbstractAssignee_Assignment();

		/**
		 * The meta object literal for the '{@link nodeCharacteristics.impl.AbstractAssignmentImpl <em>Abstract Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodeCharacteristics.impl.AbstractAssignmentImpl
		 * @see nodeCharacteristics.impl.NodeCharacteristicsPackageImpl#getAbstractAssignment()
		 * @generated
		 */
		EClass ABSTRACT_ASSIGNMENT = eINSTANCE.getAbstractAssignment();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ASSIGNMENT__CHARACTERISTICS = eINSTANCE.getAbstractAssignment_Characteristics();

	}

} //NodeCharacteristicsPackage
