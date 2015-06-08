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
 *   <li>{@link fr.ensma.realtimescheduling.Network#getNodes <em>Nodes</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getLatency <em>Latency</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getNetworkBandwidth <em>Network Bandwidth</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Network#getMaxFrameSize <em>Max Frame Size</em>}</li>
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
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_VirtualLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualLink> getVirtualLinks();

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getNetwork_Latency()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Network#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(double value);

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
} // Network
