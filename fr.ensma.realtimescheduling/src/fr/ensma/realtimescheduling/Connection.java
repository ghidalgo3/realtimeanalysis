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
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getRoute <em>Route</em>}</li>
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
	 * Returns the value of the '<em><b>Route</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Route}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Route#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Route()
	 * @see fr.ensma.realtimescheduling.Route#getConnection
	 * @model opposite="connection"
	 * @generated
	 */
	EList<Route> getRoute();

} // Connection
