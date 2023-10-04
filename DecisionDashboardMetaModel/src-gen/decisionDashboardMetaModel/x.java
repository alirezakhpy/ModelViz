/**
 */
package decisionDashboardMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>x</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.x#getX_field <em>Xfield</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.x#getX_type <em>Xtype</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.x#getX_aggregate <em>Xaggregate</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.x#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getx()
 * @model
 * @generated
 */
public interface x extends Encoding {
	/**
	 * Returns the value of the '<em><b>Xfield</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xfield</em>' attribute.
	 * @see #setX_field(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getx_X_field()
	 * @model
	 * @generated
	 */
	String getX_field();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.x#getX_field <em>Xfield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xfield</em>' attribute.
	 * @see #getX_field()
	 * @generated
	 */
	void setX_field(String value);

	/**
	 * Returns the value of the '<em><b>Xtype</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xtype</em>' attribute.
	 * @see decisionDashboardMetaModel.VariableType
	 * @see #setX_type(VariableType)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getx_X_type()
	 * @model
	 * @generated
	 */
	VariableType getX_type();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.x#getX_type <em>Xtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtype</em>' attribute.
	 * @see decisionDashboardMetaModel.VariableType
	 * @see #getX_type()
	 * @generated
	 */
	void setX_type(VariableType value);

	/**
	 * Returns the value of the '<em><b>Xaggregate</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.AggregateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xaggregate</em>' attribute.
	 * @see decisionDashboardMetaModel.AggregateType
	 * @see #setX_aggregate(AggregateType)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getx_X_aggregate()
	 * @model
	 * @generated
	 */
	AggregateType getX_aggregate();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.x#getX_aggregate <em>Xaggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xaggregate</em>' attribute.
	 * @see decisionDashboardMetaModel.AggregateType
	 * @see #getX_aggregate()
	 * @generated
	 */
	void setX_aggregate(AggregateType value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getx_TimeUnit()
	 * @model
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.x#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

} // x
