/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getPorts <em>Ports</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getModule <em>Module</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getVirtuallink <em>Virtuallink</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Port}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Port#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Ports()
	 * @see fr.ensma.realtimescheduling.Port#getConnection
	 * @model opposite="connection" lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Connection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Module#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(Module)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Module()
	 * @see fr.ensma.realtimescheduling.Module#getConnection
	 * @model opposite="connection" required="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Connection#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Virtuallink</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.VirtualLink}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.VirtualLink#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtuallink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtuallink</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Virtuallink()
	 * @see fr.ensma.realtimescheduling.VirtualLink#getConnection
	 * @model opposite="connection"
	 * @generated
	 */
	EList<VirtualLink> getVirtuallink();

} // Connection
