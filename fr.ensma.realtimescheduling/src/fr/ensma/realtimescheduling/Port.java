/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Port</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getOrder <em>Order</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Port#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveBandwidth UtilizationSumLessThanOne'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositiveBandwidth='Bandwidth > 0'"
 * @generated
 */
public interface Port extends EObject {

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Order()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * If the meaning of the '<em>Bandwidth</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Bandwidth()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getBandwidth();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(double value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Id()
	 * @model
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
	 * Returns the value of the '<em><b>Connection</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPort_Connection()
	 * @model required="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Port#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

} // Port
