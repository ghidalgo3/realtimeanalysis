/**
 */
package fr.ensma.realtimescheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getId <em>Id</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getPartition <em>Partition</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getProcessors <em>Processors</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getConnection <em>Connection</em>}</li>
 *   <li>{@link fr.ensma.realtimescheduling.Module#getVirtuallink <em>Virtuallink</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonZeroPeriod NonOverlappingPartitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NonZeroPeriod='\n\t\t\tperiod > 0' NonOverlappingPartitions='\n\t\t\tlet allIntervals : Sequence(Interval) = partition.executionIntervals->flatten()->sortedBy(i : Interval | i.start) in\n\t\t\tif (allIntervals->size() <= 1) then true\n\t\t\telse \n\t\t\t\tallIntervals->subSequence(1, allIntervals->size() - 1)->forAll(i : Interval | i.end <= allIntervals->at(1 + allIntervals->indexOf(i)).start)\n\t\t\tendif'"
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(double)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Utilization()
	 * @model default="0" required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\tif(partition->size() > 0) then\n\t\t\t\tpartition->collect(p | p.availabilityFactor)->sum()\n\t\t\telse \n\t\t\t\t0.0\n\t\t\tendif'"
	 * @generated
	 */
	double getUtilization();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Module#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(double value);

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
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Module#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Period()
	 * @model required="true"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Module#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Partition}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Partition#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Partition()
	 * @see fr.ensma.realtimescheduling.Partition#getModule
	 * @model opposite="module"
	 * @generated
	 */
	EList<Partition> getPartition();

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.realtimescheduling.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Processors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.Connection#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Connection()
	 * @see fr.ensma.realtimescheduling.Connection#getModule
	 * @model opposite="module" required="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Module#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Virtuallink</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.ensma.realtimescheduling.VirtualLink#getEndSystems <em>End Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtuallink</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtuallink</em>' reference.
	 * @see #setVirtuallink(VirtualLink)
	 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getModule_Virtuallink()
	 * @see fr.ensma.realtimescheduling.VirtualLink#getEndSystems
	 * @model opposite="endSystems"
	 * @generated
	 */
	VirtualLink getVirtuallink();

	/**
	 * Sets the value of the '{@link fr.ensma.realtimescheduling.Module#getVirtuallink <em>Virtuallink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtuallink</em>' reference.
	 * @see #getVirtuallink()
	 * @generated
	 */
	void setVirtuallink(VirtualLink value);

} // Module
