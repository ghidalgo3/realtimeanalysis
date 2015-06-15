/**
 */
package fr.ensma.realtimescheduling.tests;

import fr.ensma.realtimescheduling.EndSystemPort;
import fr.ensma.realtimescheduling.RealtimeschedulingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>End System Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndSystemPortTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EndSystemPortTest.class);
	}

	/**
	 * Constructs a new End System Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSystemPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this End System Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EndSystemPort getFixture() {
		return (EndSystemPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimeschedulingFactory.eINSTANCE.createEndSystemPort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EndSystemPortTest
