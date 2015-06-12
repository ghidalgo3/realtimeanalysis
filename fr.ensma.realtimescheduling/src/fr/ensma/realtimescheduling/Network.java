/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getName <em>Name</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getSwitches <em>Switches</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getNetworkBandwidth <em>Network Bandwidth</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getMaxFrameSize <em>Max Frame Size</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {

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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Switches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Switch> getSwitches();

	/**
	 * Returns the value of the '<em><b>Network Bandwidth</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Bandwidth</em>' attribute.
	 * @see #setNetworkBandwidth(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_NetworkBandwidth()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getNetworkBandwidth();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Network#getNetworkBandwidth <em>Network Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Bandwidth</em>' attribute.
	 * @see #getNetworkBandwidth()
	 * @generated
	 */
	void setNetworkBandwidth(double value);

	/**
	 * Returns the value of the '<em><b>Max Frame Size</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Frame Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Frame Size</em>' attribute.
	 * @see #setMaxFrameSize(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_MaxFrameSize()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getMaxFrameSize();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Network#getMaxFrameSize <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Frame Size</em>' attribute.
	 * @see #getMaxFrameSize()
	 * @generated
	 */
	void setMaxFrameSize(double value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();
} // Network
