/**
 */
package fr.ensma.realtimescheduling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Periodicity</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getPeriodicity()
 * @model
 * @generated
 */
public enum Periodicity implements Enumerator {
	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	PERIODIC(0, "Periodic", "Periodic"),

	/**
	 * The '<em><b>Sporadic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORADIC_VALUE
	 * @generated
	 * @ordered
	 */
	SPORADIC(1, "Sporadic", "Sporadic"),

	/**
	 * The '<em><b>Aperiodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	APERIODIC(2, "Aperiodic", "Aperiodic");

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Periodic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIODIC
	 * @model name="Periodic"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_VALUE = 0;

	/**
	 * The '<em><b>Sporadic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sporadic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPORADIC
	 * @model name="Sporadic"
	 * @generated
	 * @ordered
	 */
	public static final int SPORADIC_VALUE = 1;

	/**
	 * The '<em><b>Aperiodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aperiodic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APERIODIC
	 * @model name="Aperiodic"
	 * @generated
	 * @ordered
	 */
	public static final int APERIODIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Periodicity</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Periodicity[] VALUES_ARRAY = new Periodicity[] {
			PERIODIC,
			SPORADIC,
			APERIODIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Periodicity</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Periodicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Periodicity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Periodicity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Periodicity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Periodicity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Periodicity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Periodicity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Periodicity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Periodicity get(int value) {
		switch (value) {
			case PERIODIC_VALUE: return PERIODIC;
			case SPORADIC_VALUE: return SPORADIC;
			case APERIODIC_VALUE: return APERIODIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private Periodicity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // Periodicity
