/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Software Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.SoftwareResource#getExecutedTasks <em>Executed Tasks</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.SoftwareResource#getContainedPartitions <em>Contained Partitions</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.SoftwareResource#getVirtualLinks <em>Virtual Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource()
 * @model
 * @generated
 */
public interface SoftwareResource extends EObject {

	/**
	 * Returns the value of the '<em><b>Executed Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Tasks</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Tasks</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource_ExecutedTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getExecutedTasks();

	/**
	 * Returns the value of the '<em><b>Contained Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Partition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Partitions</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Partitions</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource_ContainedPartitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Partition> getContainedPartitions();

	/**
	 * Returns the value of the '<em><b>Virtual Links</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.VirtualLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Links</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource_VirtualLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualLink> getVirtualLinks();

} // SoftwareResource
