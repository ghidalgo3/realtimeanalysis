/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.SoftwareResource#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.SoftwareResource#getExecutedTasks <em>Executed Tasks</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.SoftwareResource#getContainedPartitions <em>Contained Partitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource()
 * @model
 * @generated
 */
public interface SoftwareResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.SoftwareResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Executed Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
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
	 * If the meaning of the '<em>Contained Partitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Partitions</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSoftwareResource_ContainedPartitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Partition> getContainedPartitions();

} // SoftwareResource
