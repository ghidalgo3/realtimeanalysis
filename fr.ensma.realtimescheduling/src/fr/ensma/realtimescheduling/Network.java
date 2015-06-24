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
 *   <li>{@link fr.ensma.realtimescheduling.Network#getConnections <em>Connections</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getLatency <em>Latency</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveNetworkLatency PositiveNetworkBandwith'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositiveNetworkLatency='latency > 0' PositiveNetworkBandwith='networkBandwidth > 0'"
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
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Bandwidth</em>' attribute.
	 * @see #setNetworkBandwidth(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_NetworkBandwidth()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNetworkBandwidth();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Network#getNetworkBandwidth <em>Network Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Bandwidth</em>' attribute.
	 * @see #getNetworkBandwidth()
	 * @generated
	 */
	void setNetworkBandwidth(int value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Latency()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLatency();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Network#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(int value);
} // Network
