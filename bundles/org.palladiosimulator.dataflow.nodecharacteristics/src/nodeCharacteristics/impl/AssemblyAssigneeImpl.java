/**
 */
package nodeCharacteristics.impl;

import nodeCharacteristics.AssemblyAssignee;
import nodeCharacteristics.NodeCharacteristicsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Assignee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nodeCharacteristics.impl.AssemblyAssigneeImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyAssigneeImpl extends AbstractAssigneeImpl implements AssemblyAssignee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyAssigneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeCharacteristicsPackage.Literals.ASSEMBLY_ASSIGNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblycontext() {
		return (AssemblyContext)eGet(NodeCharacteristicsPackage.Literals.ASSEMBLY_ASSIGNEE__ASSEMBLYCONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblycontext(AssemblyContext newAssemblycontext) {
		eSet(NodeCharacteristicsPackage.Literals.ASSEMBLY_ASSIGNEE__ASSEMBLYCONTEXT, newAssemblycontext);
	}

} //AssemblyAssigneeImpl
