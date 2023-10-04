/**
 */
package decisionDashboardMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getModelTypeList()
 * @model
 * @generated
 */
public enum ModelTypeList implements Enumerator {
	/**
	 * The '<em><b>XG Boost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XG_BOOST_VALUE
	 * @generated
	 * @ordered
	 */
	XG_BOOST(0, "XGBoost", "XGBoost"),

	/**
	 * The '<em><b>Random Forest Next Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_FOREST_NEXT_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_FOREST_NEXT_VERSION(1, "Random_Forest_NextVersion", "Random_Forest_NextVersion"),

	/**
	 * The '<em><b>Neural Network Next Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEURAL_NETWORK_NEXT_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	NEURAL_NETWORK_NEXT_VERSION(2, "Neural_Network_NextVersion", "Neural_Network_NextVersion"),

	/**
	 * The '<em><b>Support Vecor Next Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_VECOR_NEXT_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT_VECOR_NEXT_VERSION(3, "Support_Vecor_NextVersion", "Support_Vecor_NextVersion");

	/**
	 * The '<em><b>XG Boost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XG_BOOST
	 * @model name="XGBoost"
	 * @generated
	 * @ordered
	 */
	public static final int XG_BOOST_VALUE = 0;

	/**
	 * The '<em><b>Random Forest Next Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_FOREST_NEXT_VERSION
	 * @model name="Random_Forest_NextVersion"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_FOREST_NEXT_VERSION_VALUE = 1;

	/**
	 * The '<em><b>Neural Network Next Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEURAL_NETWORK_NEXT_VERSION
	 * @model name="Neural_Network_NextVersion"
	 * @generated
	 * @ordered
	 */
	public static final int NEURAL_NETWORK_NEXT_VERSION_VALUE = 2;

	/**
	 * The '<em><b>Support Vecor Next Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_VECOR_NEXT_VERSION
	 * @model name="Support_Vecor_NextVersion"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_VECOR_NEXT_VERSION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Model Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelTypeList[] VALUES_ARRAY = new ModelTypeList[] { XG_BOOST, RANDOM_FOREST_NEXT_VERSION,
			NEURAL_NETWORK_NEXT_VERSION, SUPPORT_VECOR_NEXT_VERSION, };

	/**
	 * A public read-only list of all the '<em><b>Model Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelTypeList get(int value) {
		switch (value) {
		case XG_BOOST_VALUE:
			return XG_BOOST;
		case RANDOM_FOREST_NEXT_VERSION_VALUE:
			return RANDOM_FOREST_NEXT_VERSION;
		case NEURAL_NETWORK_NEXT_VERSION_VALUE:
			return NEURAL_NETWORK_NEXT_VERSION;
		case SUPPORT_VECOR_NEXT_VERSION_VALUE:
			return SUPPORT_VECOR_NEXT_VERSION;
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
	private ModelTypeList(int value, String name, String literal) {
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

} //ModelTypeList
