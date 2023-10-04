/**
 */
package decisionDashboardMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Area List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDecisionAreaList()
 * @model
 * @generated
 */
public enum DecisionAreaList implements Enumerator {
	/**
	 * The '<em><b>Sales Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALES_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SALES_MANAGEMENT(0, "Sales_Management", "Sales_Management"),

	/**
	 * The '<em><b>Demand Managament</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_MANAGAMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEMAND_MANAGAMENT(1, "Demand_Managament", "Demand_Managament"),

	/**
	 * The '<em><b>Network Integration And Visibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_INTEGRATION_AND_VISIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_INTEGRATION_AND_VISIBILITY(2, "Network_Integration_And_Visibility", "Network_Integration_And_Visibility"),

	/**
	 * The '<em><b>Production And Distribution Planning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION_AND_DISTRIBUTION_PLANNING_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTION_AND_DISTRIBUTION_PLANNING(3, "Production_And_Distribution_Planning",
			"Production_And_Distribution_Planning"),

	/**
	 * The '<em><b>Transportation Management Next Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORTATION_MANAGEMENT_NEXT_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPORTATION_MANAGEMENT_NEXT_VERSION(4, "Transportation_Management_NextVersion",
			"Transportation_Management_NextVersion"),
	/**
	 * The '<em><b>Operation Managamenet Next Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #OPERATION_MANAGAMENET_NEXT_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_MANAGAMENET_NEXT_VERSION(5, "Operation_Managamenet_NextVersion", "Operation_Managamenet_NextVersion"),
	/**
	 * The '<em><b>Business Circle Processes Next Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION(6, "Business_Circle_Processes_NextVersion",
			"Business_Circle_Processes_NextVersion");

	/**
	 * The '<em><b>Sales Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALES_MANAGEMENT
	 * @model name="Sales_Management"
	 * @generated
	 * @ordered
	 */
	public static final int SALES_MANAGEMENT_VALUE = 0;

	/**
	 * The '<em><b>Demand Managament</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_MANAGAMENT
	 * @model name="Demand_Managament"
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_MANAGAMENT_VALUE = 1;

	/**
	 * The '<em><b>Network Integration And Visibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_INTEGRATION_AND_VISIBILITY
	 * @model name="Network_Integration_And_Visibility"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_INTEGRATION_AND_VISIBILITY_VALUE = 2;

	/**
	 * The '<em><b>Production And Distribution Planning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION_AND_DISTRIBUTION_PLANNING
	 * @model name="Production_And_Distribution_Planning"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTION_AND_DISTRIBUTION_PLANNING_VALUE = 3;

	/**
	 * The '<em><b>Transportation Management Next Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORTATION_MANAGEMENT_NEXT_VERSION
	 * @model name="Transportation_Management_NextVersion"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPORTATION_MANAGEMENT_NEXT_VERSION_VALUE = 4;

	/**
	 * The '<em><b>Operation Managamenet Next Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_MANAGAMENET_NEXT_VERSION
	 * @model name="Operation_Managamenet_NextVersion"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_MANAGAMENET_NEXT_VERSION_VALUE = 5;

	/**
	 * The '<em><b>Business Circle Processes Next Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION
	 * @model name="Business_Circle_Processes_NextVersion"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Decision Area List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionAreaList[] VALUES_ARRAY = new DecisionAreaList[] { SALES_MANAGEMENT, DEMAND_MANAGAMENT,
			NETWORK_INTEGRATION_AND_VISIBILITY, PRODUCTION_AND_DISTRIBUTION_PLANNING,
			TRANSPORTATION_MANAGEMENT_NEXT_VERSION, OPERATION_MANAGAMENET_NEXT_VERSION,
			BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION, };

	/**
	 * A public read-only list of all the '<em><b>Decision Area List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionAreaList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Area List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionAreaList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionAreaList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Area List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionAreaList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionAreaList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Area List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionAreaList get(int value) {
		switch (value) {
		case SALES_MANAGEMENT_VALUE:
			return SALES_MANAGEMENT;
		case DEMAND_MANAGAMENT_VALUE:
			return DEMAND_MANAGAMENT;
		case NETWORK_INTEGRATION_AND_VISIBILITY_VALUE:
			return NETWORK_INTEGRATION_AND_VISIBILITY;
		case PRODUCTION_AND_DISTRIBUTION_PLANNING_VALUE:
			return PRODUCTION_AND_DISTRIBUTION_PLANNING;
		case TRANSPORTATION_MANAGEMENT_NEXT_VERSION_VALUE:
			return TRANSPORTATION_MANAGEMENT_NEXT_VERSION;
		case OPERATION_MANAGAMENET_NEXT_VERSION_VALUE:
			return OPERATION_MANAGAMENET_NEXT_VERSION;
		case BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION_VALUE:
			return BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION;
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
	private DecisionAreaList(int value, String name, String literal) {
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

} //DecisionAreaList
