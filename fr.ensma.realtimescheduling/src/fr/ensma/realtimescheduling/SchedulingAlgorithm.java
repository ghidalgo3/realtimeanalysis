/**
 */
package fr.ensma.realtimescheduling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Scheduling Algorithm</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * @see fr.ensma.realtimescheduling.RealtimeschedulingPackage#getSchedulingAlgorithm()
 * @model
 * @generated
 */
public enum SchedulingAlgorithm implements Enumerator {
	/**
	 * The '<em><b>Fixed Priority</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_PRIORITY(0, "FixedPriority", "FixedPriority"),

	/**
	 * The '<em><b>Rate Monotonic</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #RATE_MONOTONIC_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_MONOTONIC(1, "RateMonotonic", "RateMonotonic"),

	/**
	 * The '<em><b>Deadline Monotonic</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DEADLINE_MONOTONIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEADLINE_MONOTONIC(2, "DeadlineMonotonic", "DeadlineMonotonic");

	/**
	 * The '<em><b>Fixed Priority</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Fixed Priority</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY
	 * @model name="FixedPriority"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_PRIORITY_VALUE = 0;

	/**
	 * The '<em><b>Rate Monotonic</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Rate Monotonic</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_MONOTONIC
	 * @model name="RateMonotonic"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_MONOTONIC_VALUE = 1;

	/**
	 * The '<em><b>Deadline Monotonic</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deadline Monotonic</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DEADLINE_MONOTONIC
	 * @model name="DeadlineMonotonic"
	 * @generated
	 * @ordered
	 */
	public static final int DEADLINE_MONOTONIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scheduling Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedulingAlgorithm[] VALUES_ARRAY = new SchedulingAlgorithm[] {
			FIXED_PRIORITY,
			RATE_MONOTONIC,
			DEADLINE_MONOTONIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduling Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchedulingAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduling Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingAlgorithm get(int value) {
		switch (value) {
			case FIXED_PRIORITY_VALUE: return FIXED_PRIORITY;
			case RATE_MONOTONIC_VALUE: return RATE_MONOTONIC;
			case DEADLINE_MONOTONIC_VALUE: return DEADLINE_MONOTONIC;
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
	private SchedulingAlgorithm(int value, String name, String literal) {
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

} // SchedulingAlgorithm
