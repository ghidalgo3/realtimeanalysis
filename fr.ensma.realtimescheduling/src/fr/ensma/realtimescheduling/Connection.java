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
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getRoute <em>Route</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Connection#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
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
	 * @model
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
	 * @model opposite="connection" required="true"
	 * @generated
	 */
	EList<Route> getRoute();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Port)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getConnection_Destination()
	 * @model required="true"
	 * @generated
	 */
	Port getDestination();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Connection#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Port value);

} // Connection
