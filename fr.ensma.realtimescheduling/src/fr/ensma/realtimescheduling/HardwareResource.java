/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.HardwareResource#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.HardwareResource#getScheduledOn <em>Scheduled On</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.HardwareResource#getCommunicatesOver <em>Communicates Over</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getHardwareResource()
 * @model
 * @generated
 */
public interface HardwareResource extends EObject {
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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getHardwareResource_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.HardwareResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled On</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled On</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getHardwareResource_ScheduledOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getScheduledOn();

	/**
	 * Returns the value of the '<em><b>Communicates Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicates Over</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates Over</em>' containment reference.
	 * @see #setCommunicatesOver(Network)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getHardwareResource_CommunicatesOver()
	 * @model containment="true"
	 * @generated
	 */
	Network getCommunicatesOver();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.HardwareResource#getCommunicatesOver <em>Communicates Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communicates Over</em>' containment reference.
	 * @see #getCommunicatesOver()
	 * @generated
	 */
	void setCommunicatesOver(Network value);

} // HardwareResource
