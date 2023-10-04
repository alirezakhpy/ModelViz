/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionDashboardMetaModelFactoryImpl extends EFactoryImpl implements DecisionDashboardMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecisionDashboardMetaModelFactory init() {
		try {
			DecisionDashboardMetaModelFactory theDecisionDashboardMetaModelFactory = (DecisionDashboardMetaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(DecisionDashboardMetaModelPackage.eNS_URI);
			if (theDecisionDashboardMetaModelFactory != null) {
				return theDecisionDashboardMetaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DecisionDashboardMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionDashboardMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DecisionDashboardMetaModelPackage.DASHBOARD:
			return createDashboard();
		case DecisionDashboardMetaModelPackage.VISUALIZATION:
			return createVisualization();
		case DecisionDashboardMetaModelPackage.DECISION_AREA:
			return createDecisionArea();
		case DecisionDashboardMetaModelPackage.MARK:
			return createMark();
		case DecisionDashboardMetaModelPackage.BAR:
			return createBar();
		case DecisionDashboardMetaModelPackage.LINE:
			return createLine();
		case DecisionDashboardMetaModelPackage.DATA:
			return createData();
		case DecisionDashboardMetaModelPackage.VALUES:
			return createValues();
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL:
			return createVisualizationGoal();
		case DecisionDashboardMetaModelPackage.VA_TASK:
			return createVATask();
		case DecisionDashboardMetaModelPackage.ENCODING:
			return createEncoding();
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE:
			return createchannelType();
		case DecisionDashboardMetaModelPackage.ML_MODEL:
			return createMLModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DecisionDashboardMetaModelPackage.DECISION_AREA_LIST:
			return createDecisionAreaListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.VA_GOAL_TYPE_LIST:
			return createVAGoalTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.VA_TASK_TYPE_LIST:
			return createVATaskTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.DATA_TYPE_LIST:
			return createDataTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.VISUAL_FORMAT_LIST:
			return createVisualFormatListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.VARIABLE_TYPE_LIST:
			return createVariableTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.AGGREGATE_TYPE_LIST:
			return createAggregateTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE_LIST:
			return createChannelTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.MODEL_TYPE_LIST:
			return createModelTypeListFromString(eDataType, initialValue);
		case DecisionDashboardMetaModelPackage.FILTER_TYPE_LIST:
			return createFilterTypeListFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DecisionDashboardMetaModelPackage.DECISION_AREA_LIST:
			return convertDecisionAreaListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.VA_GOAL_TYPE_LIST:
			return convertVAGoalTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.VA_TASK_TYPE_LIST:
			return convertVATaskTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.DATA_TYPE_LIST:
			return convertDataTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.VISUAL_FORMAT_LIST:
			return convertVisualFormatListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.VARIABLE_TYPE_LIST:
			return convertVariableTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.AGGREGATE_TYPE_LIST:
			return convertAggregateTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE_LIST:
			return convertChannelTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.MODEL_TYPE_LIST:
			return convertModelTypeListToString(eDataType, instanceValue);
		case DecisionDashboardMetaModelPackage.FILTER_TYPE_LIST:
			return convertFilterTypeListToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dashboard createDashboard() {
		DashboardImpl dashboard = new DashboardImpl();
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionArea createDecisionArea() {
		DecisionAreaImpl decisionArea = new DecisionAreaImpl();
		return decisionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark createMark() {
		MarkImpl mark = new MarkImpl();
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Values createValues() {
		ValuesImpl values = new ValuesImpl();
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationGoal createVisualizationGoal() {
		VisualizationGoalImpl visualizationGoal = new VisualizationGoalImpl();
		return visualizationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VATask createVATask() {
		VATaskImpl vaTask = new VATaskImpl();
		return vaTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding createEncoding() {
		EncodingImpl encoding = new EncodingImpl();
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public channelType createchannelType() {
		channelTypeImpl channelType = new channelTypeImpl();
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLModel createMLModel() {
		MLModelImpl mlModel = new MLModelImpl();
		return mlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionAreaList createDecisionAreaListFromString(EDataType eDataType, String initialValue) {
		DecisionAreaList result = DecisionAreaList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionAreaListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAGoalTypeList createVAGoalTypeListFromString(EDataType eDataType, String initialValue) {
		VAGoalTypeList result = VAGoalTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVAGoalTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VATaskTypeList createVATaskTypeListFromString(EDataType eDataType, String initialValue) {
		VATaskTypeList result = VATaskTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVATaskTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeList createDataTypeListFromString(EDataType eDataType, String initialValue) {
		DataTypeList result = DataTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualFormatList createVisualFormatListFromString(EDataType eDataType, String initialValue) {
		VisualFormatList result = VisualFormatList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualFormatListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeList createVariableTypeListFromString(EDataType eDataType, String initialValue) {
		VariableTypeList result = VariableTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateTypeList createAggregateTypeListFromString(EDataType eDataType, String initialValue) {
		AggregateTypeList result = AggregateTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelTypeList createChannelTypeListFromString(EDataType eDataType, String initialValue) {
		ChannelTypeList result = ChannelTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeList createModelTypeListFromString(EDataType eDataType, String initialValue) {
		ModelTypeList result = ModelTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTypeList createFilterTypeListFromString(EDataType eDataType, String initialValue) {
		FilterTypeList result = FilterTypeList.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionDashboardMetaModelPackage getDecisionDashboardMetaModelPackage() {
		return (DecisionDashboardMetaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DecisionDashboardMetaModelPackage getPackage() {
		return DecisionDashboardMetaModelPackage.eINSTANCE;
	}

} //DecisionDashboardMetaModelFactoryImpl
