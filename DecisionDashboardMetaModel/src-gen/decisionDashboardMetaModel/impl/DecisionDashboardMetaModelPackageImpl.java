/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.AggregateTypeList;
import decisionDashboardMetaModel.Bar;
import decisionDashboardMetaModel.ChannelTypeList;
import decisionDashboardMetaModel.Dashboard;
import decisionDashboardMetaModel.Data;
import decisionDashboardMetaModel.DataTypeList;
import decisionDashboardMetaModel.DecisionArea;
import decisionDashboardMetaModel.DecisionAreaList;
import decisionDashboardMetaModel.DecisionDashboardMetaModelFactory;
import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.Encoding;
import decisionDashboardMetaModel.FilterTypeList;
import decisionDashboardMetaModel.Line;
import decisionDashboardMetaModel.MLModel;
import decisionDashboardMetaModel.Mark;
import decisionDashboardMetaModel.ModelTypeList;
import decisionDashboardMetaModel.VAGoalTypeList;
import decisionDashboardMetaModel.VATask;
import decisionDashboardMetaModel.VATaskTypeList;
import decisionDashboardMetaModel.Values;
import decisionDashboardMetaModel.VariableTypeList;
import decisionDashboardMetaModel.VisualFormatList;
import decisionDashboardMetaModel.Visualization;
import decisionDashboardMetaModel.VisualizationGoal;

import decisionDashboardMetaModel.channelType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionDashboardMetaModelPackageImpl extends EPackageImpl implements DecisionDashboardMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionAreaListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaGoalTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaTaskTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualFormatListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregateTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeListEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DecisionDashboardMetaModelPackageImpl() {
		super(eNS_URI, DecisionDashboardMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DecisionDashboardMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DecisionDashboardMetaModelPackage init() {
		if (isInited)
			return (DecisionDashboardMetaModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(DecisionDashboardMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDecisionDashboardMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DecisionDashboardMetaModelPackageImpl theDecisionDashboardMetaModelPackage = registeredDecisionDashboardMetaModelPackage instanceof DecisionDashboardMetaModelPackageImpl
				? (DecisionDashboardMetaModelPackageImpl) registeredDecisionDashboardMetaModelPackage
				: new DecisionDashboardMetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDecisionDashboardMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theDecisionDashboardMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDecisionDashboardMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DecisionDashboardMetaModelPackage.eNS_URI, theDecisionDashboardMetaModelPackage);
		return theDecisionDashboardMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDashboard() {
		return dashboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDashboard_Title() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Visualization() {
		return (EReference) dashboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Decisionarea() {
		return (EReference) dashboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDashboard_Description() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualization() {
		return visualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualization_Name() {
		return (EAttribute) visualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Mark() {
		return (EReference) visualizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Data() {
		return (EReference) visualizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Vatask() {
		return (EReference) visualizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Decisionarea() {
		return (EReference) visualizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualization_Title() {
		return (EAttribute) visualizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Mlmodel() {
		return (EReference) visualizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionArea() {
		return decisionAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionArea_Dtype() {
		return (EAttribute) decisionAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionArea_Visualizationgoal() {
		return (EReference) decisionAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionArea_Visualization() {
		return (EReference) decisionAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMark() {
		return markEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMark_VisualType() {
		return (EAttribute) markEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMark_Vatask() {
		return (EReference) markEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMark_Encoding() {
		return (EReference) markEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMark_Data() {
		return (EReference) markEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMark_Title() {
		return (EAttribute) markEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBar_ID() {
		return (EAttribute) barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_ID() {
		return (EAttribute) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Source() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Type() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Values() {
		return (EReference) dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Mark() {
		return (EReference) dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValues() {
		return valuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_StoreName() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_KommuneNo() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_CountyNo() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_WeekDay() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_ProductID() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_ProductUnitPrice() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Day() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Month() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Year() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_DayOfYear() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_WeekOfYear() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_QuarterOfYear() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_WeekEnd() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_PostNo() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Avgturnover() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_ShopProfileName() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Profile() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Expanding_mean() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValues_Lag_1() {
		return (EAttribute) valuesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationGoal() {
		return visualizationGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationGoal_GoalType() {
		return (EAttribute) visualizationGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualizationGoal_Vatask() {
		return (EReference) visualizationGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVATask() {
		return vaTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATask_TaskType() {
		return (EAttribute) vaTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVATask_Visualization() {
		return (EReference) vaTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVATask_Mark() {
		return (EReference) vaTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncoding() {
		return encodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncoding_Id() {
		return (EAttribute) encodingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchannelType() {
		return channelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_ChannelType() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_VaribleName() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_VariableType() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_AggregateType() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_TimeUnit() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_FilterType() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchannelType_FilterValue() {
		return (EAttribute) channelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLModel() {
		return mlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLModel_ModelType() {
		return (EAttribute) mlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionAreaList() {
		return decisionAreaListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVAGoalTypeList() {
		return vaGoalTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVATaskTypeList() {
		return vaTaskTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypeList() {
		return dataTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisualFormatList() {
		return visualFormatListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableTypeList() {
		return variableTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregateTypeList() {
		return aggregateTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelTypeList() {
		return channelTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelTypeList() {
		return modelTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterTypeList() {
		return filterTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionDashboardMetaModelFactory getDecisionDashboardMetaModelFactory() {
		return (DecisionDashboardMetaModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dashboardEClass = createEClass(DASHBOARD);
		createEAttribute(dashboardEClass, DASHBOARD__TITLE);
		createEReference(dashboardEClass, DASHBOARD__VISUALIZATION);
		createEReference(dashboardEClass, DASHBOARD__DECISIONAREA);
		createEAttribute(dashboardEClass, DASHBOARD__DESCRIPTION);

		visualizationEClass = createEClass(VISUALIZATION);
		createEAttribute(visualizationEClass, VISUALIZATION__NAME);
		createEReference(visualizationEClass, VISUALIZATION__MARK);
		createEReference(visualizationEClass, VISUALIZATION__DATA);
		createEReference(visualizationEClass, VISUALIZATION__VATASK);
		createEReference(visualizationEClass, VISUALIZATION__DECISIONAREA);
		createEAttribute(visualizationEClass, VISUALIZATION__TITLE);
		createEReference(visualizationEClass, VISUALIZATION__MLMODEL);

		decisionAreaEClass = createEClass(DECISION_AREA);
		createEAttribute(decisionAreaEClass, DECISION_AREA__DTYPE);
		createEReference(decisionAreaEClass, DECISION_AREA__VISUALIZATIONGOAL);
		createEReference(decisionAreaEClass, DECISION_AREA__VISUALIZATION);

		markEClass = createEClass(MARK);
		createEReference(markEClass, MARK__ENCODING);
		createEReference(markEClass, MARK__DATA);
		createEAttribute(markEClass, MARK__TITLE);
		createEAttribute(markEClass, MARK__VISUAL_TYPE);
		createEReference(markEClass, MARK__VATASK);

		barEClass = createEClass(BAR);
		createEAttribute(barEClass, BAR__ID);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__ID);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__SOURCE);
		createEAttribute(dataEClass, DATA__TYPE);
		createEReference(dataEClass, DATA__VALUES);
		createEReference(dataEClass, DATA__MARK);

		valuesEClass = createEClass(VALUES);
		createEAttribute(valuesEClass, VALUES__STORE_NAME);
		createEAttribute(valuesEClass, VALUES__KOMMUNE_NO);
		createEAttribute(valuesEClass, VALUES__COUNTY_NO);
		createEAttribute(valuesEClass, VALUES__WEEK_DAY);
		createEAttribute(valuesEClass, VALUES__PRODUCT_ID);
		createEAttribute(valuesEClass, VALUES__PRODUCT_UNIT_PRICE);
		createEAttribute(valuesEClass, VALUES__DAY);
		createEAttribute(valuesEClass, VALUES__MONTH);
		createEAttribute(valuesEClass, VALUES__YEAR);
		createEAttribute(valuesEClass, VALUES__DAY_OF_YEAR);
		createEAttribute(valuesEClass, VALUES__WEEK_OF_YEAR);
		createEAttribute(valuesEClass, VALUES__QUARTER_OF_YEAR);
		createEAttribute(valuesEClass, VALUES__WEEK_END);
		createEAttribute(valuesEClass, VALUES__POST_NO);
		createEAttribute(valuesEClass, VALUES__AVGTURNOVER);
		createEAttribute(valuesEClass, VALUES__SHOP_PROFILE_NAME);
		createEAttribute(valuesEClass, VALUES__PROFILE);
		createEAttribute(valuesEClass, VALUES__EXPANDING_MEAN);
		createEAttribute(valuesEClass, VALUES__LAG_1);

		visualizationGoalEClass = createEClass(VISUALIZATION_GOAL);
		createEAttribute(visualizationGoalEClass, VISUALIZATION_GOAL__GOAL_TYPE);
		createEReference(visualizationGoalEClass, VISUALIZATION_GOAL__VATASK);

		vaTaskEClass = createEClass(VA_TASK);
		createEAttribute(vaTaskEClass, VA_TASK__TASK_TYPE);
		createEReference(vaTaskEClass, VA_TASK__VISUALIZATION);
		createEReference(vaTaskEClass, VA_TASK__MARK);

		encodingEClass = createEClass(ENCODING);
		createEAttribute(encodingEClass, ENCODING__ID);

		channelTypeEClass = createEClass(CHANNEL_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__CHANNEL_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__VARIBLE_NAME);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__VARIABLE_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__AGGREGATE_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__TIME_UNIT);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__FILTER_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__FILTER_VALUE);

		mlModelEClass = createEClass(ML_MODEL);
		createEAttribute(mlModelEClass, ML_MODEL__MODEL_TYPE);

		// Create enums
		decisionAreaListEEnum = createEEnum(DECISION_AREA_LIST);
		vaGoalTypeListEEnum = createEEnum(VA_GOAL_TYPE_LIST);
		vaTaskTypeListEEnum = createEEnum(VA_TASK_TYPE_LIST);
		dataTypeListEEnum = createEEnum(DATA_TYPE_LIST);
		visualFormatListEEnum = createEEnum(VISUAL_FORMAT_LIST);
		variableTypeListEEnum = createEEnum(VARIABLE_TYPE_LIST);
		aggregateTypeListEEnum = createEEnum(AGGREGATE_TYPE_LIST);
		channelTypeListEEnum = createEEnum(CHANNEL_TYPE_LIST);
		modelTypeListEEnum = createEEnum(MODEL_TYPE_LIST);
		filterTypeListEEnum = createEEnum(FILTER_TYPE_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		barEClass.getESuperTypes().add(this.getMark());
		lineEClass.getESuperTypes().add(this.getMark());
		channelTypeEClass.getESuperTypes().add(this.getEncoding());

		// Initialize classes, features, and operations; add parameters
		initEClass(dashboardEClass, Dashboard.class, "Dashboard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDashboard_Title(), ecorePackage.getEString(), "title", null, 0, 1, Dashboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Visualization(), this.getVisualization(), null, "visualization", null, 1, -1,
				Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Decisionarea(), this.getDecisionArea(), null, "decisionarea", null, 1, -1,
				Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Visualization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Mark(), this.getMark(), null, "mark", null, 1, -1, Visualization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Data(), this.getData(), null, "data", null, 1, -1, Visualization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Vatask(), this.getVATask(), this.getVATask_Visualization(), "vatask", null, 1,
				-1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Decisionarea(), this.getDecisionArea(), this.getDecisionArea_Visualization(),
				"decisionarea", null, 1, -1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualization_Title(), ecorePackage.getEString(), "title", null, 0, 1, Visualization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Mlmodel(), this.getMLModel(), null, "mlmodel", null, 0, -1, Visualization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionAreaEClass, DecisionArea.class, "DecisionArea", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionArea_Dtype(), this.getDecisionAreaList(), "Dtype", null, 0, 1, DecisionArea.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionArea_Visualizationgoal(), this.getVisualizationGoal(), null, "visualizationgoal",
				null, 1, -1, DecisionArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionArea_Visualization(), this.getVisualization(), this.getVisualization_Decisionarea(),
				"visualization", null, 1, -1, DecisionArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markEClass, Mark.class, "Mark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMark_Encoding(), this.getEncoding(), null, "encoding", null, 2, 4, Mark.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMark_Data(), this.getData(), this.getData_Mark(), "data", null, 1, -1, Mark.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMark_Title(), ecorePackage.getEString(), "title", null, 0, 1, Mark.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMark_VisualType(), this.getVisualFormatList(), "visualType", null, 0, 1, Mark.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMark_Vatask(), this.getVATask(), this.getVATask_Mark(), "vatask", null, 1, -1, Mark.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBar_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Source(), ecorePackage.getEString(), "Source", null, 0, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Type(), this.getDataTypeList(), "type", null, 0, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Values(), this.getValues(), null, "values", null, 0, -1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getData_Mark(), this.getMark(), this.getMark_Data(), "mark", null, 1, -1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuesEClass, Values.class, "Values", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValues_StoreName(), ecorePackage.getEString(), "StoreName", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_KommuneNo(), ecorePackage.getEString(), "kommuneNo", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_CountyNo(), ecorePackage.getEString(), "CountyNo", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_WeekDay(), ecorePackage.getEString(), "WeekDay", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_ProductID(), ecorePackage.getEString(), "ProductID", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_ProductUnitPrice(), ecorePackage.getEString(), "ProductUnitPrice", null, 0, 1,
				Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Day(), ecorePackage.getEString(), "Day", null, 0, 1, Values.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Month(), ecorePackage.getEString(), "Month", null, 0, 1, Values.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Year(), ecorePackage.getEString(), "Year", null, 0, 1, Values.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_DayOfYear(), ecorePackage.getEString(), "DayOfYear", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_WeekOfYear(), ecorePackage.getEString(), "WeekOfYear", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_QuarterOfYear(), ecorePackage.getEString(), "QuarterOfYear", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_WeekEnd(), ecorePackage.getEString(), "WeekEnd", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_PostNo(), ecorePackage.getEString(), "PostNo", null, 0, 1, Values.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Avgturnover(), ecorePackage.getEString(), "Avgturnover", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_ShopProfileName(), ecorePackage.getEString(), "ShopProfileName", null, 0, 1,
				Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Profile(), ecorePackage.getEString(), "Profile", null, 0, 1, Values.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Expanding_mean(), ecorePackage.getEString(), "expanding_mean", null, 0, 1,
				Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getValues_Lag_1(), ecorePackage.getEString(), "lag_1", null, 0, 1, Values.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationGoalEClass, VisualizationGoal.class, "VisualizationGoal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualizationGoal_GoalType(), this.getVAGoalTypeList(), "goalType", null, 0, 1,
				VisualizationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVisualizationGoal_Vatask(), this.getVATask(), null, "vatask", null, 1, -1,
				VisualizationGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vaTaskEClass, VATask.class, "VATask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVATask_TaskType(), this.getVATaskTypeList(), "taskType", null, 0, 1, VATask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVATask_Visualization(), this.getVisualization(), this.getVisualization_Vatask(),
				"visualization", null, 1, -1, VATask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVATask_Mark(), this.getMark(), this.getMark_Vatask(), "mark", null, 1, -1, VATask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodingEClass, Encoding.class, "Encoding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncoding_Id(), ecorePackage.getEString(), "id", null, 0, 1, Encoding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelTypeEClass, channelType.class, "channelType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getchannelType_ChannelType(), this.getChannelTypeList(), "channelType", null, 0, 1,
				channelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getchannelType_VaribleName(), ecorePackage.getEString(), "varibleName", null, 0, 1,
				channelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getchannelType_VariableType(), this.getVariableTypeList(), "variableType", null, 0, 1,
				channelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getchannelType_AggregateType(), this.getAggregateTypeList(), "aggregateType", null, 0, 1,
				channelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getchannelType_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 0, 1, channelType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchannelType_FilterType(), this.getFilterTypeList(), "filterType", "none", 0, 1,
				channelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getchannelType_FilterValue(), ecorePackage.getEString(), "filterValue", null, 0, 1,
				channelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mlModelEClass, MLModel.class, "MLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLModel_ModelType(), this.getModelTypeList(), "ModelType", null, 0, 1, MLModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(decisionAreaListEEnum, DecisionAreaList.class, "DecisionAreaList");
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.SALES_MANAGEMENT);
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.DEMAND_MANAGAMENT);
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.NETWORK_INTEGRATION_AND_VISIBILITY);
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.PRODUCTION_AND_DISTRIBUTION_PLANNING);
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.TRANSPORTATION_MANAGEMENT_NEXT_VERSION);
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.OPERATION_MANAGAMENET_NEXT_VERSION);
		addEEnumLiteral(decisionAreaListEEnum, DecisionAreaList.BUSINESS_CIRCLE_PROCESSES_NEXT_VERSION);

		initEEnum(vaGoalTypeListEEnum, VAGoalTypeList.class, "VAGoalTypeList");
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.IDENTIFYING_UNDERLYING_PATTERN_BY_PARTITIONING);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.VIEWING_DATA_FROM_SINGLE_VARIABLE_POINT_OF_VIEW);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.EXPLORING_DIMENSION_BY_DIVIDING_TO_INTERVALS);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.FINDING_RELATIONS_BETWEEN_DATA_RECORDS);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.EXPLORING_TIME_DEPENDANT_MULTIVARIATE_DATA);
		addEEnumLiteral(vaGoalTypeListEEnum,
				VAGoalTypeList.FINDING_RELATIONSHIP_BETWEEN_VARIABLES_BY_CORRELATION_ANALYSIS_AND_STEPWISE_REGRESSION_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.GEOGRAPHIC_INFORMATION_VISUALIZATION_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum,
				VAGoalTypeList.WHAT_IF_ANALYSIS_BASED_ON_SCENARIO_BASED_TECHNIQUES_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.DEMONSTRATE_RISK_DISTRIBUTION_IN_THE_NETWORK_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum,
				VAGoalTypeList.DETECTING_INCONSISTENCIES_BY_ASSOCIATION_RULE_MINING_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum,
				VAGoalTypeList.ANALYZING_SOCIAL_MEDIA_DATA_FOR_PRODUCT_RECALL_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum,
				VAGoalTypeList.VISUALIZING_MULTI_DIMENSIONALITY_BY_CLUSTERING_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.DIMENSIONALITY_REDUCTION_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.CORRELATION_ANALYSIS_NEXT_VERSION);
		addEEnumLiteral(vaGoalTypeListEEnum, VAGoalTypeList.EXPLORING_SPATIO_TEMPORALITY_NEXT_VERSION);

		initEEnum(vaTaskTypeListEEnum, VATaskTypeList.class, "VATaskTypeList");
		addEEnumLiteral(vaTaskTypeListEEnum,
				VATaskTypeList.DISTRIBUTION_OVER_TEMPORAL_DIMENSION_BY_EMPHASIZING_ON_INDIVIDUAL_VALUES_FOR_TREND_DETECTION);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.SIMILARITY_VIEW_SHOWING_SIMILAR_HISTORICAL_DATA);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.PROVIDING_DETAIL_VIEW_OF_INDIVIDUAL_VARIABLES);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.PROVIDING_AN_OVERALL_INSIGHT_ABOUT_THE_DATA);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.EXPLORING_FILTER_COORDINATION);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.VISUALIZING_SINGLE_DIMENSIONS);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.VISUALIZING_ACATEGORICAL_DIMENSION_AGAINST_ANUMERICAL);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.VISUALIZING_TWO_NUMERICAL_DIMENSIONS);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.SHOW_DEPENDENCY_OF_AN_ATTRIBUTE_TO_TIME);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.SHOW_DENSITY_OF_THE_DATA);
		addEEnumLiteral(vaTaskTypeListEEnum, VATaskTypeList.COMPARING_PATTERN_ACCROSS_DIFFERENT_SUBSETS_NEXT_VERSION);
		addEEnumLiteral(vaTaskTypeListEEnum,
				VATaskTypeList.PRODUCT_FLOW_AGGREGATION_AND_VISUALIZING_PROBLEMATIC_AREAS_BY_IDENTIFYING_POTENTIAL_ISSUES_NEXT_VERSION);
		addEEnumLiteral(vaTaskTypeListEEnum,
				VATaskTypeList.PRESENTING_ADIMENSION_UPPON_DIFFERENT_DEGREES_OF_TARGET_VARIABLE_NEXT_VERSION);

		initEEnum(dataTypeListEEnum, DataTypeList.class, "DataTypeList");
		addEEnumLiteral(dataTypeListEEnum, DataTypeList.POINT_OF_SALES);
		addEEnumLiteral(dataTypeListEEnum, DataTypeList.RETAIL_TRANSACTION);
		addEEnumLiteral(dataTypeListEEnum, DataTypeList.MONTHLY_DEMAND);
		addEEnumLiteral(dataTypeListEEnum, DataTypeList.WAREHOUSE_DATA);

		initEEnum(visualFormatListEEnum, VisualFormatList.class, "VisualFormatList");
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.BAR);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.LINE);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.HISTOGRAM);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.CIRCLE);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.SQUARE);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.POINT_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.TREE_VIEW_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.BUBBLE_MAP_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.RING_DIAGRAM_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.THEME_RIVERS_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.FORCE_DIRECTED_GRAPH_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.HEAT_MAP_NEXT_VERSION);
		addEEnumLiteral(visualFormatListEEnum, VisualFormatList.AREA);

		initEEnum(variableTypeListEEnum, VariableTypeList.class, "VariableTypeList");
		addEEnumLiteral(variableTypeListEEnum, VariableTypeList.DEFAULT);
		addEEnumLiteral(variableTypeListEEnum, VariableTypeList.ORDINAL);
		addEEnumLiteral(variableTypeListEEnum, VariableTypeList.NOMINAL);
		addEEnumLiteral(variableTypeListEEnum, VariableTypeList.QUANTITATIVE);
		addEEnumLiteral(variableTypeListEEnum, VariableTypeList.TEMPORAL);

		initEEnum(aggregateTypeListEEnum, AggregateTypeList.class, "AggregateTypeList");
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.NONE);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.SUM);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.MEAN);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.MIN);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.MAX);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.MEDIAN);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.DISTINCT);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.VARIANCE);
		addEEnumLiteral(aggregateTypeListEEnum, AggregateTypeList.COUNT);

		initEEnum(channelTypeListEEnum, ChannelTypeList.class, "ChannelTypeList");
		addEEnumLiteral(channelTypeListEEnum, ChannelTypeList.X);
		addEEnumLiteral(channelTypeListEEnum, ChannelTypeList.Y);
		addEEnumLiteral(channelTypeListEEnum, ChannelTypeList.COLOR);
		addEEnumLiteral(channelTypeListEEnum, ChannelTypeList.SIZE);
		addEEnumLiteral(channelTypeListEEnum, ChannelTypeList.XOFFSET);

		initEEnum(modelTypeListEEnum, ModelTypeList.class, "ModelTypeList");
		addEEnumLiteral(modelTypeListEEnum, ModelTypeList.XG_BOOST);
		addEEnumLiteral(modelTypeListEEnum, ModelTypeList.RANDOM_FOREST_NEXT_VERSION);
		addEEnumLiteral(modelTypeListEEnum, ModelTypeList.NEURAL_NETWORK_NEXT_VERSION);
		addEEnumLiteral(modelTypeListEEnum, ModelTypeList.SUPPORT_VECOR_NEXT_VERSION);

		initEEnum(filterTypeListEEnum, FilterTypeList.class, "FilterTypeList");
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.EQUAL);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.LT);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.LTE);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.GT);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.GTE);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.RANGE);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.ONE_OF);
		addEEnumLiteral(filterTypeListEEnum, FilterTypeList.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //DecisionDashboardMetaModelPackageImpl
