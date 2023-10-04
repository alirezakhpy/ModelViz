/**
 */
package decisionDashboardMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.channelType#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.channelType#getVaribleName <em>Varible Name</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.channelType#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.channelType#getAggregateType <em>Aggregate Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.channelType#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.channelType#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.channelType#getFilterValue <em>Filter Value</em>}</li>
 * </ul>
 *
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType()
 * @model
 * @generated
 */
public interface channelType extends Encoding {
	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.ChannelTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Type</em>' attribute.
	 * @see decisionDashboardMetaModel.ChannelTypeList
	 * @see #setChannelType(ChannelTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_ChannelType()
	 * @model
	 * @generated
	 */
	ChannelTypeList getChannelType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getChannelType <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' attribute.
	 * @see decisionDashboardMetaModel.ChannelTypeList
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(ChannelTypeList value);

	/**
	 * Returns the value of the '<em><b>Varible Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varible Name</em>' attribute.
	 * @see #setVaribleName(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_VaribleName()
	 * @model
	 * @generated
	 */
	String getVaribleName();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getVaribleName <em>Varible Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varible Name</em>' attribute.
	 * @see #getVaribleName()
	 * @generated
	 */
	void setVaribleName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.VariableTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VariableTypeList
	 * @see #setVariableType(VariableTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_VariableType()
	 * @model
	 * @generated
	 */
	VariableTypeList getVariableType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getVariableType <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' attribute.
	 * @see decisionDashboardMetaModel.VariableTypeList
	 * @see #getVariableType()
	 * @generated
	 */
	void setVariableType(VariableTypeList value);

	/**
	 * Returns the value of the '<em><b>Aggregate Type</b></em>' attribute.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.AggregateTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Type</em>' attribute.
	 * @see decisionDashboardMetaModel.AggregateTypeList
	 * @see #setAggregateType(AggregateTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_AggregateType()
	 * @model
	 * @generated
	 */
	AggregateTypeList getAggregateType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getAggregateType <em>Aggregate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Type</em>' attribute.
	 * @see decisionDashboardMetaModel.AggregateTypeList
	 * @see #getAggregateType()
	 * @generated
	 */
	void setAggregateType(AggregateTypeList value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_TimeUnit()
	 * @model
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link decisionDashboardMetaModel.FilterTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see decisionDashboardMetaModel.FilterTypeList
	 * @see #setFilterType(FilterTypeList)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_FilterType()
	 * @model default="none"
	 * @generated
	 */
	FilterTypeList getFilterType();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see decisionDashboardMetaModel.FilterTypeList
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(FilterTypeList value);

	/**
	 * Returns the value of the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Value</em>' attribute.
	 * @see #setFilterValue(String)
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#getchannelType_FilterValue()
	 * @model
	 * @generated
	 */
	String getFilterValue();

	/**
	 * Sets the value of the '{@link decisionDashboardMetaModel.channelType#getFilterValue <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Value</em>' attribute.
	 * @see #getFilterValue()
	 * @generated
	 */
	void setFilterValue(String value);

} // channelType
