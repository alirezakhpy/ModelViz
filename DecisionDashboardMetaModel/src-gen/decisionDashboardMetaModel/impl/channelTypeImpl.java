/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.AggregateTypeList;
import decisionDashboardMetaModel.ChannelTypeList;
import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.FilterTypeList;
import decisionDashboardMetaModel.VariableTypeList;
import decisionDashboardMetaModel.channelType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getVaribleName <em>Varible Name</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getAggregateType <em>Aggregate Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.channelTypeImpl#getFilterValue <em>Filter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class channelTypeImpl extends EncodingImpl implements channelType {
	/**
	 * The default value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected static final ChannelTypeList CHANNEL_TYPE_EDEFAULT = ChannelTypeList.X;

	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected ChannelTypeList channelType = CHANNEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVaribleName() <em>Varible Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaribleName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIBLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVaribleName() <em>Varible Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaribleName()
	 * @generated
	 * @ordered
	 */
	protected String varibleName = VARIBLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected static final VariableTypeList VARIABLE_TYPE_EDEFAULT = VariableTypeList.DEFAULT;

	/**
	 * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected VariableTypeList variableType = VARIABLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregateType() <em>Aggregate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregateTypeList AGGREGATE_TYPE_EDEFAULT = AggregateTypeList.NONE;

	/**
	 * The cached value of the '{@link #getAggregateType() <em>Aggregate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateType()
	 * @generated
	 * @ordered
	 */
	protected AggregateTypeList aggregateType = AGGREGATE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected String timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterTypeList FILTER_TYPE_EDEFAULT = FilterTypeList.NONE;

	/**
	 * The cached value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected FilterTypeList filterType = FILTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterValue() <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterValue() <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterValue()
	 * @generated
	 * @ordered
	 */
	protected String filterValue = FILTER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected channelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelTypeList getChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(ChannelTypeList newChannelType) {
		ChannelTypeList oldChannelType = channelType;
		channelType = newChannelType == null ? CHANNEL_TYPE_EDEFAULT : newChannelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__CHANNEL_TYPE, oldChannelType, channelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVaribleName() {
		return varibleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaribleName(String newVaribleName) {
		String oldVaribleName = varibleName;
		varibleName = newVaribleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIBLE_NAME, oldVaribleName, varibleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeList getVariableType() {
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableType(VariableTypeList newVariableType) {
		VariableTypeList oldVariableType = variableType;
		variableType = newVariableType == null ? VARIABLE_TYPE_EDEFAULT : newVariableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIABLE_TYPE, oldVariableType, variableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateTypeList getAggregateType() {
		return aggregateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateType(AggregateTypeList newAggregateType) {
		AggregateTypeList oldAggregateType = aggregateType;
		aggregateType = newAggregateType == null ? AGGREGATE_TYPE_EDEFAULT : newAggregateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__AGGREGATE_TYPE, oldAggregateType, aggregateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(String newTimeUnit) {
		String oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypeList getFilterType() {
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterType(FilterTypeList newFilterType) {
		FilterTypeList oldFilterType = filterType;
		filterType = newFilterType == null ? FILTER_TYPE_EDEFAULT : newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_TYPE, oldFilterType, filterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterValue() {
		return filterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterValue(String newFilterValue) {
		String oldFilterValue = filterValue;
		filterValue = newFilterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_VALUE, oldFilterValue, filterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__CHANNEL_TYPE:
			return getChannelType();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIBLE_NAME:
			return getVaribleName();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIABLE_TYPE:
			return getVariableType();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__AGGREGATE_TYPE:
			return getAggregateType();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__TIME_UNIT:
			return getTimeUnit();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_TYPE:
			return getFilterType();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_VALUE:
			return getFilterValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__CHANNEL_TYPE:
			setChannelType((ChannelTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIBLE_NAME:
			setVaribleName((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIABLE_TYPE:
			setVariableType((VariableTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__AGGREGATE_TYPE:
			setAggregateType((AggregateTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__TIME_UNIT:
			setTimeUnit((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_TYPE:
			setFilterType((FilterTypeList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_VALUE:
			setFilterValue((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__CHANNEL_TYPE:
			setChannelType(CHANNEL_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIBLE_NAME:
			setVaribleName(VARIBLE_NAME_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIABLE_TYPE:
			setVariableType(VARIABLE_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__AGGREGATE_TYPE:
			setAggregateType(AGGREGATE_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__TIME_UNIT:
			setTimeUnit(TIME_UNIT_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_TYPE:
			setFilterType(FILTER_TYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_VALUE:
			setFilterValue(FILTER_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__CHANNEL_TYPE:
			return channelType != CHANNEL_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIBLE_NAME:
			return VARIBLE_NAME_EDEFAULT == null ? varibleName != null : !VARIBLE_NAME_EDEFAULT.equals(varibleName);
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__VARIABLE_TYPE:
			return variableType != VARIABLE_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__AGGREGATE_TYPE:
			return aggregateType != AGGREGATE_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__TIME_UNIT:
			return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_TYPE:
			return filterType != FILTER_TYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE__FILTER_VALUE:
			return FILTER_VALUE_EDEFAULT == null ? filterValue != null : !FILTER_VALUE_EDEFAULT.equals(filterValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (channelType: ");
		result.append(channelType);
		result.append(", varibleName: ");
		result.append(varibleName);
		result.append(", variableType: ");
		result.append(variableType);
		result.append(", aggregateType: ");
		result.append(aggregateType);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", filterType: ");
		result.append(filterType);
		result.append(", filterValue: ");
		result.append(filterValue);
		result.append(')');
		return result.toString();
	}

} //channelTypeImpl
