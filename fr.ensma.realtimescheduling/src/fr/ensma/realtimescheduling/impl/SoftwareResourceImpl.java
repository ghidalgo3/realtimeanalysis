/**
 */
package fr.ensma.realtimescheduling.impl;

import fr.ensma.realtimescheduling.Partition;
import fr.ensma.realtimescheduling.RealtimeschedulingPackage;
import fr.ensma.realtimescheduling.SoftwareResource;
import fr.ensma.realtimescheduling.Task;
import fr.ensma.realtimescheduling.VirtualLink;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.impl.SoftwareResourceImpl#getExecutedTasks <em>Executed Tasks</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.SoftwareResourceImpl#getContainedPartitions <em>Contained Partitions</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.impl.SoftwareResourceImpl#getVirtualLInks <em>Virtual LInks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareResourceImpl extends MinimalEObjectImpl.Container implements SoftwareResource {
	/**
	 * The cached value of the '{@link #getExecutedTasks() <em>Executed Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> executedTasks;

	/**
	 * The cached value of the '{@link #getContainedPartitions() <em>Contained Partitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> containedPartitions;

	/**
	 * The cached value of the '{@link #getVirtualLInks() <em>Virtual LInks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLInks()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualLink> virtualLInks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeschedulingPackage.Literals.SOFTWARE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getExecutedTasks() {
		if (executedTasks == null) {
			executedTasks = new EObjectContainmentEList<Task>(Task.class, this, RealtimeschedulingPackage.SOFTWARE_RESOURCE__EXECUTED_TASKS);
		}
		return executedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getContainedPartitions() {
		if (containedPartitions == null) {
			containedPartitions = new EObjectContainmentEList<Partition>(Partition.class, this, RealtimeschedulingPackage.SOFTWARE_RESOURCE__CONTAINED_PARTITIONS);
		}
		return containedPartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualLink> getVirtualLInks() {
		if (virtualLInks == null) {
			virtualLInks = new EObjectContainmentEList<VirtualLink>(VirtualLink.class, this, RealtimeschedulingPackage.SOFTWARE_RESOURCE__VIRTUAL_LINKS);
		}
		return virtualLInks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__EXECUTED_TASKS:
				return ((InternalEList<?>)getExecutedTasks()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__CONTAINED_PARTITIONS:
				return ((InternalEList<?>)getContainedPartitions()).basicRemove(otherEnd, msgs);
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__VIRTUAL_LINKS:
				return ((InternalEList<?>)getVirtualLInks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__EXECUTED_TASKS:
				return getExecutedTasks();
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__CONTAINED_PARTITIONS:
				return getContainedPartitions();
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__VIRTUAL_LINKS:
				return getVirtualLInks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__EXECUTED_TASKS:
				getExecutedTasks().clear();
				getExecutedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__CONTAINED_PARTITIONS:
				getContainedPartitions().clear();
				getContainedPartitions().addAll((Collection<? extends Partition>)newValue);
				return;
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__VIRTUAL_LINKS:
				getVirtualLInks().clear();
				getVirtualLInks().addAll((Collection<? extends VirtualLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__EXECUTED_TASKS:
				getExecutedTasks().clear();
				return;
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__CONTAINED_PARTITIONS:
				getContainedPartitions().clear();
				return;
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__VIRTUAL_LINKS:
				getVirtualLInks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__EXECUTED_TASKS:
				return executedTasks != null && !executedTasks.isEmpty();
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__CONTAINED_PARTITIONS:
				return containedPartitions != null && !containedPartitions.isEmpty();
			case RealtimeschedulingPackage.SOFTWARE_RESOURCE__VIRTUAL_LINKS:
				return virtualLInks != null && !virtualLInks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareResourceImpl
