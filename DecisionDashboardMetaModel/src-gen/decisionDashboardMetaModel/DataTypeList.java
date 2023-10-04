/**
 */
package decisionDashboardMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getDataTypeList()
 * @model
 * @generated
 */
public enum DataTypeList implements Enumerator {
	/**
	 * The '<em><b>Point Of Sales</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #POINT_OF_SALES_VALUE
	 * @generated
	 * @ordered
	 */
	POINT_OF_SALES(0, "Point_Of_Sales", "Point_Of_Sales"),

	/**
	 * The '<em><b>Retail Transaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIL_TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	RETAIL_TRANSACTION(1, "Retail_Transaction", "Retail_Transaction"),

	/**
	 * The '<em><b>Monthly Demand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY_DEMAND_VALUE
	 * @generated
	 * @ordered
	 */
	MONTHLY_DEMAND(2, "Monthly_Demand", "Monthly_Demand"),

	/**
	 * The '<em><b>Warehouse Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAREHOUSE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	WAREHOUSE_DATA(3, "Warehouse_Data", "Warehouse_Data");

	/**
	 * The '<em><b>Point Of Sales</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #POINT_OF_SALES
	 * @model name="Point_Of_Sales"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALES_VALUE = 0;

	/**
	 * The '<em><b>Retail Transaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIL_TRANSACTION
	 * @model name="Retail_Transaction"
	 * @generated
	 * @ordered
	 */
	public static final int RETAIL_TRANSACTION_VALUE = 1;

	/**
	 * The '<em><b>Monthly Demand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY_DEMAND
	 * @model name="Monthly_Demand"
	 * @generated
	 * @ordered
	 */
	public static final int MONTHLY_DEMAND_VALUE = 2;

	/**
	 * The '<em><b>Warehouse Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAREHOUSE_DATA
	 * @model name="Warehouse_Data"
	 * @generated
	 * @ordered
	 */
	public static final int WAREHOUSE_DATA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTypeList[] VALUES_ARRAY = new DataTypeList[] { POINT_OF_SALES, RETAIL_TRANSACTION,
			MONTHLY_DEMAND, WAREHOUSE_DATA, };

	/**
	 * A public read-only list of all the '<em><b>Data Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeList get(int value) {
		switch (value) {
		case POINT_OF_SALES_VALUE:
			return POINT_OF_SALES;
		case RETAIL_TRANSACTION_VALUE:
			return RETAIL_TRANSACTION;
		case MONTHLY_DEMAND_VALUE:
			return MONTHLY_DEMAND;
		case WAREHOUSE_DATA_VALUE:
			return WAREHOUSE_DATA;
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
	private DataTypeList(int value, String name, String literal) {
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

} //DataTypeList
