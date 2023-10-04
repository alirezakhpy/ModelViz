/**
 */
package decisionDashboardMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * class documentation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.y#getY_field <em>Yfield</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.y#getY_type <em>Ytype</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.y#getY_aggregate <em>Yaggregate</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.y#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#gety()
 * @model
 * @generated
 */
public interface y extends Encoding {
	/**
	 * Returns the value of the '<em><b>Yfield</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yfield</em>' attribute.
	 * @see #setY_field(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#gety_Y_field()
	 * @model
	 * @generated
	 */
	String getY_field();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.y#getY_field <em>Yfield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yfield</em>' attribute.
	 * @see #getY_field()
	 * @generated
	 */
	void setY_field(String value);

	/**
	 * Returns the value of the '<em><b>Ytype</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ytype</em>' attribute.
	 * @see decisionDashboardMetaModel.VariableType
	 * @see #setY_type(VariableType)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#gety_Y_type()
	 * @model
	 * @generated
	 */
	VariableType getY_type();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.y#getY_type <em>Ytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ytype</em>' attribute.
	 * @see decisionDashboardMetaModel.VariableType
	 * @see #getY_type()
	 * @generated
	 */
	void setY_type(VariableType value);

	/**
	 * Returns the value of the '<em><b>Yaggregate</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.AggregateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaggregate</em>' attribute.
	 * @see decisionDashboardMetaModel.AggregateType
	 * @see #setY_aggregate(AggregateType)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#gety_Y_aggregate()
	 * @model
	 * @generated
	 */
	AggregateType getY_aggregate();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.y#getY_aggregate <em>Yaggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaggregate</em>' attribute.
	 * @see decisionDashboardMetaModel.AggregateType
	 * @see #getY_aggregate()
	 * @generated
	 */
	void setY_aggregate(AggregateType value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * documentation from generation documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#gety_TimeUnit()
	 * @model
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.y#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

} // y
