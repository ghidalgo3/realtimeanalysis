/**
 */
package fr.ensma.realtimescheduling.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>realtimescheduling</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeschedulingTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RealtimeschedulingTests("realtimescheduling Tests");
		suite.addTestSuite(ModuleTest.class);
		suite.addTestSuite(PartitionTest.class);
		suite.addTestSuite(SwitchPortTest.class);
		suite.addTestSuite(EndSystemPortTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeschedulingTests(String name) {
		super(name);
	}

} //RealtimeschedulingTests
