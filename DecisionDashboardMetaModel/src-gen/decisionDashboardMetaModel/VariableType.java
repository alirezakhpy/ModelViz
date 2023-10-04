/**
 */
package decisionDashboardMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variable Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getVariableType()
 * @model
 * @generated
 */
public enum VariableType implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(4, "default", "default"),
	/**
	* The '<em><b>Ordinal</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #ORDINAL_VALUE
	* @generated
	* @ordered
	*/
	ORDINAL(5, "ordinal", "ordinal"),

	/**
	 * The '<em><b>Nominal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMINAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOMINAL(5, "nominal", "nominal"),
	/**
	* The '<em><b>Quantitative</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #QUANTITATIVE_VALUE
	* @generated
	* @ordered
	*/
	QUANTITATIVE(6, "quantitative", "quantitative"),

	/**
	 * The '<em><b>Temporal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORAL(4, "temporal", "temporal");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 4;

	/**
	 * The '<em><b>Ordinal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDINAL
	 * @model name="ordinal"
	 * @generated
	 * @ordered
	 */
	public static final int ORDINAL_VALUE = 5;

	/**
	 * The '<em><b>Nominal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMINAL
	 * @model name="nominal"
	 * @generated
	 * @ordered
	 */
	public static final int NOMINAL_VALUE = 5;

	/**
	 * The '<em><b>Quantitative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITATIVE
	 * @model name="quantitative"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITATIVE_VALUE = 6;

	/**
	 * The '<em><b>Temporal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL
	 * @model name="temporal"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Variable Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VariableType[] VALUES_ARRAY = new VariableType[] { DEFAULT, ORDINAL, NOMINAL, QUANTITATIVE,
			TEMPORAL, };

	/**
	 * A public read-only list of all the '<em><b>Variable Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VariableType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Variable Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableType get(int value) {
		switch (value) {
		case DEFAULT_VALUE:
			return DEFAULT;
		case ORDINAL_VALUE:
			return ORDINAL;
		case QUANTITATIVE_VALUE:
			return QUANTITATIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VariableType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //VariableType
