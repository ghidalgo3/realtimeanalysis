/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getConnection <em>Connection</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getTransmissionDelay <em>Transmission Delay</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getOrder <em>Order</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Connection#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Connection()
	 * @see fr.ensma.realtimescheduling.Connection#getPorts
	 * @model opposite="ports" required="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Transmission Delay</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Delay</em>' attribute.
	 * @see #setTransmissionDelay(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_TransmissionDelay()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getTransmissionDelay();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getTransmissionDelay <em>Transmission Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Delay</em>' attribute.
	 * @see #getTransmissionDelay()
	 * @generated
	 */
	void setTransmissionDelay(double value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Order()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Bandwidth()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getBandwidth();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Output"</code>.
	 * The literals are from the enumeration {@link fr.ensma.realtimescheduling.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.ensma.realtimescheduling.PortType
	 * @see #setType(PortType)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Type()
	 * @model default="Output" required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.ensma.realtimescheduling.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

} // Port
