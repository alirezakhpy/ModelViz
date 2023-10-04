/**
 */
package decisionDashboardMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface DecisionDashboardMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decisionDashboardMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/sample/decisionDashboardMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "decisionDashboardMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecisionDashboardMetaModelPackage eINSTANCE = decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.DashboardImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Decisionarea</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__DECISIONAREA = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.VisualizationImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__MARK = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__DATA = 2;

	/**
	 * The feature id for the '<em><b>Vatask</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__VATASK = 3;

	/**
	 * The feature id for the '<em><b>Decisionarea</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__DECISIONAREA = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Mlmodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__MLMODEL = 6;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.DecisionAreaImpl <em>Decision Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.DecisionAreaImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDecisionArea()
	 * @generated
	 */
	int DECISION_AREA = 2;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_AREA__DTYPE = 0;

	/**
	 * The feature id for the '<em><b>Visualizationgoal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_AREA__VISUALIZATIONGOAL = 1;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_AREA__VISUALIZATION = 2;

	/**
	 * The number of structural features of the '<em>Decision Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_AREA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Decision Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.MarkImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 3;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__DATA = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__VISUAL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Vatask</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__VATASK = 4;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.BarImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 4;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__ENCODING = MARK__ENCODING;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__DATA = MARK__DATA;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__TITLE = MARK__TITLE;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__VISUAL_TYPE = MARK__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Vatask</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__VATASK = MARK__VATASK;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__ID = MARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = MARK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.LineImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 5;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ENCODING = MARK__ENCODING;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DATA = MARK__DATA;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TITLE = MARK__TITLE;

	/**
	 * The feature id for the '<em><b>Visual Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__VISUAL_TYPE = MARK__VISUAL_TYPE;

	/**
	 * The feature id for the '<em><b>Vatask</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__VATASK = MARK__VATASK;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = MARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = MARK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.DataImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MARK = 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.ValuesImpl <em>Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.ValuesImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getValues()
	 * @generated
	 */
	int VALUES = 7;

	/**
	 * The feature id for the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__STORE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Kommune No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__KOMMUNE_NO = 1;

	/**
	 * The feature id for the '<em><b>County No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__COUNTY_NO = 2;

	/**
	 * The feature id for the '<em><b>Week Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__WEEK_DAY = 3;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__PRODUCT_ID = 4;

	/**
	 * The feature id for the '<em><b>Product Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__PRODUCT_UNIT_PRICE = 5;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__DAY = 6;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__MONTH = 7;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__YEAR = 8;

	/**
	 * The feature id for the '<em><b>Day Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__DAY_OF_YEAR = 9;

	/**
	 * The feature id for the '<em><b>Week Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__WEEK_OF_YEAR = 10;

	/**
	 * The feature id for the '<em><b>Quarter Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__QUARTER_OF_YEAR = 11;

	/**
	 * The feature id for the '<em><b>Week End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__WEEK_END = 12;

	/**
	 * The feature id for the '<em><b>Post No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__POST_NO = 13;

	/**
	 * The feature id for the '<em><b>Avgturnover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__AVGTURNOVER = 14;

	/**
	 * The feature id for the '<em><b>Shop Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__SHOP_PROFILE_NAME = 15;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__PROFILE = 16;

	/**
	 * The feature id for the '<em><b>Expanding mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__EXPANDING_MEAN = 17;

	/**
	 * The feature id for the '<em><b>Lag 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__LAG_1 = 18;

	/**
	 * The number of structural features of the '<em>Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.VisualizationGoalImpl <em>Visualization Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.VisualizationGoalImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVisualizationGoal()
	 * @generated
	 */
	int VISUALIZATION_GOAL = 8;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_GOAL__GOAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Vatask</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_GOAL__VATASK = 1;

	/**
	 * The number of structural features of the '<em>Visualization Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_GOAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visualization Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.VATaskImpl <em>VA Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.VATaskImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVATask()
	 * @generated
	 */
	int VA_TASK = 9;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_TASK__TASK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_TASK__VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_TASK__MARK = 2;

	/**
	 * The number of structural features of the '<em>VA Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VA Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.EncodingImpl <em>Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.EncodingImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__ID = 0;

	/**
	 * The number of structural features of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.channelTypeImpl <em>channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.channelTypeImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getchannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ID = ENCODING__ID;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__CHANNEL_TYPE = ENCODING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varible Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__VARIBLE_NAME = ENCODING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__VARIABLE_TYPE = ENCODING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__AGGREGATE_TYPE = ENCODING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__TIME_UNIT = ENCODING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__FILTER_TYPE = ENCODING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__FILTER_VALUE = ENCODING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = ENCODING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_OPERATION_COUNT = ENCODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.impl.MLModelImpl <em>ML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.impl.MLModelImpl
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getMLModel()
	 * @generated
	 */
	int ML_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__MODEL_TYPE = 0;

	/**
	 * The number of structural features of the '<em>ML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.DecisionAreaList <em>Decision Area List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.DecisionAreaList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDecisionAreaList()
	 * @generated
	 */
	int DECISION_AREA_LIST = 13;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.VAGoalTypeList <em>VA Goal Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.VAGoalTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVAGoalTypeList()
	 * @generated
	 */
	int VA_GOAL_TYPE_LIST = 14;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.VATaskTypeList <em>VA Task Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.VATaskTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVATaskTypeList()
	 * @generated
	 */
	int VA_TASK_TYPE_LIST = 15;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.DataTypeList <em>Data Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.DataTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDataTypeList()
	 * @generated
	 */
	int DATA_TYPE_LIST = 16;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.VisualFormatList <em>Visual Format List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.VisualFormatList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVisualFormatList()
	 * @generated
	 */
	int VISUAL_FORMAT_LIST = 17;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.VariableTypeList <em>Variable Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.VariableTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVariableTypeList()
	 * @generated
	 */
	int VARIABLE_TYPE_LIST = 18;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.AggregateTypeList <em>Aggregate Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.AggregateTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getAggregateTypeList()
	 * @generated
	 */
	int AGGREGATE_TYPE_LIST = 19;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.ChannelTypeList <em>Channel Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.ChannelTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getChannelTypeList()
	 * @generated
	 */
	int CHANNEL_TYPE_LIST = 20;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.ModelTypeList <em>Model Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.ModelTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getModelTypeList()
	 * @generated
	 */
	int MODEL_TYPE_LIST = 21;

	/**
	 * The meta object id for the '{@link decisionDashboardMetaModel.FilterTypeList <em>Filter Type List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decisionDashboardMetaModel.FilterTypeList
	 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getFilterTypeList()
	 * @generated
	 */
	int FILTER_TYPE_LIST = 22;

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see decisionDashboardMetaModel.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Dashboard#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see decisionDashboardMetaModel.Dashboard#getTitle()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Dashboard#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualization</em>'.
	 * @see decisionDashboardMetaModel.Dashboard#getVisualization()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Visualization();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Dashboard#getDecisionarea <em>Decisionarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisionarea</em>'.
	 * @see decisionDashboardMetaModel.Dashboard#getDecisionarea()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Decisionarea();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Dashboard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see decisionDashboardMetaModel.Dashboard#getDescription()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Description();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see decisionDashboardMetaModel.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Visualization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getName()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Visualization#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mark</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getMark()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Mark();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Visualization#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getData()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Data();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.Visualization#getVatask <em>Vatask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vatask</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getVatask()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Vatask();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.Visualization#getDecisionarea <em>Decisionarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decisionarea</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getDecisionarea()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Decisionarea();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Visualization#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getTitle()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Visualization#getMlmodel <em>Mlmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mlmodel</em>'.
	 * @see decisionDashboardMetaModel.Visualization#getMlmodel()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Mlmodel();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.DecisionArea <em>Decision Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Area</em>'.
	 * @see decisionDashboardMetaModel.DecisionArea
	 * @generated
	 */
	EClass getDecisionArea();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.DecisionArea#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see decisionDashboardMetaModel.DecisionArea#getDtype()
	 * @see #getDecisionArea()
	 * @generated
	 */
	EAttribute getDecisionArea_Dtype();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.DecisionArea#getVisualizationgoal <em>Visualizationgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualizationgoal</em>'.
	 * @see decisionDashboardMetaModel.DecisionArea#getVisualizationgoal()
	 * @see #getDecisionArea()
	 * @generated
	 */
	EReference getDecisionArea_Visualizationgoal();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.DecisionArea#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visualization</em>'.
	 * @see decisionDashboardMetaModel.DecisionArea#getVisualization()
	 * @see #getDecisionArea()
	 * @generated
	 */
	EReference getDecisionArea_Visualization();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see decisionDashboardMetaModel.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Mark#getVisualType <em>Visual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Type</em>'.
	 * @see decisionDashboardMetaModel.Mark#getVisualType()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_VisualType();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.Mark#getVatask <em>Vatask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vatask</em>'.
	 * @see decisionDashboardMetaModel.Mark#getVatask()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Vatask();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Mark#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encoding</em>'.
	 * @see decisionDashboardMetaModel.Mark#getEncoding()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Encoding();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.Mark#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see decisionDashboardMetaModel.Mark#getData()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Data();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Mark#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see decisionDashboardMetaModel.Mark#getTitle()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Title();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see decisionDashboardMetaModel.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Bar#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see decisionDashboardMetaModel.Bar#getID()
	 * @see #getBar()
	 * @generated
	 */
	EAttribute getBar_ID();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see decisionDashboardMetaModel.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Line#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see decisionDashboardMetaModel.Line#getID()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_ID();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see decisionDashboardMetaModel.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Data#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see decisionDashboardMetaModel.Data#getSource()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Source();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see decisionDashboardMetaModel.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.Data#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see decisionDashboardMetaModel.Data#getValues()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Values();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.Data#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mark</em>'.
	 * @see decisionDashboardMetaModel.Data#getMark()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Mark();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values</em>'.
	 * @see decisionDashboardMetaModel.Values
	 * @generated
	 */
	EClass getValues();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getStoreName <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Name</em>'.
	 * @see decisionDashboardMetaModel.Values#getStoreName()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_StoreName();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getKommuneNo <em>Kommune No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommune No</em>'.
	 * @see decisionDashboardMetaModel.Values#getKommuneNo()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_KommuneNo();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getCountyNo <em>County No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County No</em>'.
	 * @see decisionDashboardMetaModel.Values#getCountyNo()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_CountyNo();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getWeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Day</em>'.
	 * @see decisionDashboardMetaModel.Values#getWeekDay()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_WeekDay();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see decisionDashboardMetaModel.Values#getProductID()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getProductUnitPrice <em>Product Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Unit Price</em>'.
	 * @see decisionDashboardMetaModel.Values#getProductUnitPrice()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_ProductUnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see decisionDashboardMetaModel.Values#getDay()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Day();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see decisionDashboardMetaModel.Values#getMonth()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Month();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see decisionDashboardMetaModel.Values#getYear()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Year();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getDayOfYear <em>Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Year</em>'.
	 * @see decisionDashboardMetaModel.Values#getDayOfYear()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_DayOfYear();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getWeekOfYear <em>Week Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Of Year</em>'.
	 * @see decisionDashboardMetaModel.Values#getWeekOfYear()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_WeekOfYear();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getQuarterOfYear <em>Quarter Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quarter Of Year</em>'.
	 * @see decisionDashboardMetaModel.Values#getQuarterOfYear()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_QuarterOfYear();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getWeekEnd <em>Week End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week End</em>'.
	 * @see decisionDashboardMetaModel.Values#getWeekEnd()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_WeekEnd();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getPostNo <em>Post No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post No</em>'.
	 * @see decisionDashboardMetaModel.Values#getPostNo()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_PostNo();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getAvgturnover <em>Avgturnover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avgturnover</em>'.
	 * @see decisionDashboardMetaModel.Values#getAvgturnover()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Avgturnover();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getShopProfileName <em>Shop Profile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shop Profile Name</em>'.
	 * @see decisionDashboardMetaModel.Values#getShopProfileName()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_ShopProfileName();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see decisionDashboardMetaModel.Values#getProfile()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Profile();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getExpanding_mean <em>Expanding mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanding mean</em>'.
	 * @see decisionDashboardMetaModel.Values#getExpanding_mean()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Expanding_mean();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Values#getLag_1 <em>Lag 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lag 1</em>'.
	 * @see decisionDashboardMetaModel.Values#getLag_1()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Lag_1();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.VisualizationGoal <em>Visualization Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Goal</em>'.
	 * @see decisionDashboardMetaModel.VisualizationGoal
	 * @generated
	 */
	EClass getVisualizationGoal();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.VisualizationGoal#getGoalType <em>Goal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Type</em>'.
	 * @see decisionDashboardMetaModel.VisualizationGoal#getGoalType()
	 * @see #getVisualizationGoal()
	 * @generated
	 */
	EAttribute getVisualizationGoal_GoalType();

	/**
	 * Returns the meta object for the containment reference list '{@link decisionDashboardMetaModel.VisualizationGoal#getVatask <em>Vatask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vatask</em>'.
	 * @see decisionDashboardMetaModel.VisualizationGoal#getVatask()
	 * @see #getVisualizationGoal()
	 * @generated
	 */
	EReference getVisualizationGoal_Vatask();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.VATask <em>VA Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VA Task</em>'.
	 * @see decisionDashboardMetaModel.VATask
	 * @generated
	 */
	EClass getVATask();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.VATask#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Type</em>'.
	 * @see decisionDashboardMetaModel.VATask#getTaskType()
	 * @see #getVATask()
	 * @generated
	 */
	EAttribute getVATask_TaskType();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.VATask#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visualization</em>'.
	 * @see decisionDashboardMetaModel.VATask#getVisualization()
	 * @see #getVATask()
	 * @generated
	 */
	EReference getVATask_Visualization();

	/**
	 * Returns the meta object for the reference list '{@link decisionDashboardMetaModel.VATask#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mark</em>'.
	 * @see decisionDashboardMetaModel.VATask#getMark()
	 * @see #getVATask()
	 * @generated
	 */
	EReference getVATask_Mark();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding</em>'.
	 * @see decisionDashboardMetaModel.Encoding
	 * @generated
	 */
	EClass getEncoding();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.Encoding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see decisionDashboardMetaModel.Encoding#getId()
	 * @see #getEncoding()
	 * @generated
	 */
	EAttribute getEncoding_Id();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.channelType <em>channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>channel Type</em>'.
	 * @see decisionDashboardMetaModel.channelType
	 * @generated
	 */
	EClass getchannelType();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Type</em>'.
	 * @see decisionDashboardMetaModel.channelType#getChannelType()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_ChannelType();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getVaribleName <em>Varible Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varible Name</em>'.
	 * @see decisionDashboardMetaModel.channelType#getVaribleName()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_VaribleName();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see decisionDashboardMetaModel.channelType#getVariableType()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_VariableType();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getAggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Type</em>'.
	 * @see decisionDashboardMetaModel.channelType#getAggregateType()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_AggregateType();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see decisionDashboardMetaModel.channelType#getTimeUnit()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getFilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Type</em>'.
	 * @see decisionDashboardMetaModel.channelType#getFilterType()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_FilterType();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.channelType#getFilterValue <em>Filter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Value</em>'.
	 * @see decisionDashboardMetaModel.channelType#getFilterValue()
	 * @see #getchannelType()
	 * @generated
	 */
	EAttribute getchannelType_FilterValue();

	/**
	 * Returns the meta object for class '{@link decisionDashboardMetaModel.MLModel <em>ML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Model</em>'.
	 * @see decisionDashboardMetaModel.MLModel
	 * @generated
	 */
	EClass getMLModel();

	/**
	 * Returns the meta object for the attribute '{@link decisionDashboardMetaModel.MLModel#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see decisionDashboardMetaModel.MLModel#getModelType()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_ModelType();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.DecisionAreaList <em>Decision Area List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Area List</em>'.
	 * @see decisionDashboardMetaModel.DecisionAreaList
	 * @generated
	 */
	EEnum getDecisionAreaList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.VAGoalTypeList <em>VA Goal Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VA Goal Type List</em>'.
	 * @see decisionDashboardMetaModel.VAGoalTypeList
	 * @generated
	 */
	EEnum getVAGoalTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.VATaskTypeList <em>VA Task Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VA Task Type List</em>'.
	 * @see decisionDashboardMetaModel.VATaskTypeList
	 * @generated
	 */
	EEnum getVATaskTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.DataTypeList <em>Data Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type List</em>'.
	 * @see decisionDashboardMetaModel.DataTypeList
	 * @generated
	 */
	EEnum getDataTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.VisualFormatList <em>Visual Format List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visual Format List</em>'.
	 * @see decisionDashboardMetaModel.VisualFormatList
	 * @generated
	 */
	EEnum getVisualFormatList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.VariableTypeList <em>Variable Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type List</em>'.
	 * @see decisionDashboardMetaModel.VariableTypeList
	 * @generated
	 */
	EEnum getVariableTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.AggregateTypeList <em>Aggregate Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregate Type List</em>'.
	 * @see decisionDashboardMetaModel.AggregateTypeList
	 * @generated
	 */
	EEnum getAggregateTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.ChannelTypeList <em>Channel Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channel Type List</em>'.
	 * @see decisionDashboardMetaModel.ChannelTypeList
	 * @generated
	 */
	EEnum getChannelTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.ModelTypeList <em>Model Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type List</em>'.
	 * @see decisionDashboardMetaModel.ModelTypeList
	 * @generated
	 */
	EEnum getModelTypeList();

	/**
	 * Returns the meta object for enum '{@link decisionDashboardMetaModel.FilterTypeList <em>Filter Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type List</em>'.
	 * @see decisionDashboardMetaModel.FilterTypeList
	 * @generated
	 */
	EEnum getFilterTypeList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecisionDashboardMetaModelFactory getDecisionDashboardMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.DashboardImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__TITLE = eINSTANCE.getDashboard_Title();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__VISUALIZATION = eINSTANCE.getDashboard_Visualization();

		/**
		 * The meta object literal for the '<em><b>Decisionarea</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__DECISIONAREA = eINSTANCE.getDashboard_Decisionarea();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__DESCRIPTION = eINSTANCE.getDashboard_Description();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.VisualizationImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__NAME = eINSTANCE.getVisualization_Name();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__MARK = eINSTANCE.getVisualization_Mark();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__DATA = eINSTANCE.getVisualization_Data();

		/**
		 * The meta object literal for the '<em><b>Vatask</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__VATASK = eINSTANCE.getVisualization_Vatask();

		/**
		 * The meta object literal for the '<em><b>Decisionarea</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__DECISIONAREA = eINSTANCE.getVisualization_Decisionarea();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__TITLE = eINSTANCE.getVisualization_Title();

		/**
		 * The meta object literal for the '<em><b>Mlmodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__MLMODEL = eINSTANCE.getVisualization_Mlmodel();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.DecisionAreaImpl <em>Decision Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.DecisionAreaImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDecisionArea()
		 * @generated
		 */
		EClass DECISION_AREA = eINSTANCE.getDecisionArea();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_AREA__DTYPE = eINSTANCE.getDecisionArea_Dtype();

		/**
		 * The meta object literal for the '<em><b>Visualizationgoal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_AREA__VISUALIZATIONGOAL = eINSTANCE.getDecisionArea_Visualizationgoal();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_AREA__VISUALIZATION = eINSTANCE.getDecisionArea_Visualization();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.MarkImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Visual Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__VISUAL_TYPE = eINSTANCE.getMark_VisualType();

		/**
		 * The meta object literal for the '<em><b>Vatask</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__VATASK = eINSTANCE.getMark_Vatask();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__ENCODING = eINSTANCE.getMark_Encoding();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__DATA = eINSTANCE.getMark_Data();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__TITLE = eINSTANCE.getMark_Title();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.BarImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR__ID = eINSTANCE.getBar_ID();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.LineImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__ID = eINSTANCE.getLine_ID();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.DataImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SOURCE = eINSTANCE.getData_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__VALUES = eINSTANCE.getData_Values();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__MARK = eINSTANCE.getData_Mark();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.ValuesImpl <em>Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.ValuesImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getValues()
		 * @generated
		 */
		EClass VALUES = eINSTANCE.getValues();

		/**
		 * The meta object literal for the '<em><b>Store Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__STORE_NAME = eINSTANCE.getValues_StoreName();

		/**
		 * The meta object literal for the '<em><b>Kommune No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__KOMMUNE_NO = eINSTANCE.getValues_KommuneNo();

		/**
		 * The meta object literal for the '<em><b>County No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__COUNTY_NO = eINSTANCE.getValues_CountyNo();

		/**
		 * The meta object literal for the '<em><b>Week Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__WEEK_DAY = eINSTANCE.getValues_WeekDay();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__PRODUCT_ID = eINSTANCE.getValues_ProductID();

		/**
		 * The meta object literal for the '<em><b>Product Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__PRODUCT_UNIT_PRICE = eINSTANCE.getValues_ProductUnitPrice();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__DAY = eINSTANCE.getValues_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__MONTH = eINSTANCE.getValues_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__YEAR = eINSTANCE.getValues_Year();

		/**
		 * The meta object literal for the '<em><b>Day Of Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__DAY_OF_YEAR = eINSTANCE.getValues_DayOfYear();

		/**
		 * The meta object literal for the '<em><b>Week Of Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__WEEK_OF_YEAR = eINSTANCE.getValues_WeekOfYear();

		/**
		 * The meta object literal for the '<em><b>Quarter Of Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__QUARTER_OF_YEAR = eINSTANCE.getValues_QuarterOfYear();

		/**
		 * The meta object literal for the '<em><b>Week End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__WEEK_END = eINSTANCE.getValues_WeekEnd();

		/**
		 * The meta object literal for the '<em><b>Post No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__POST_NO = eINSTANCE.getValues_PostNo();

		/**
		 * The meta object literal for the '<em><b>Avgturnover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__AVGTURNOVER = eINSTANCE.getValues_Avgturnover();

		/**
		 * The meta object literal for the '<em><b>Shop Profile Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__SHOP_PROFILE_NAME = eINSTANCE.getValues_ShopProfileName();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__PROFILE = eINSTANCE.getValues_Profile();

		/**
		 * The meta object literal for the '<em><b>Expanding mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__EXPANDING_MEAN = eINSTANCE.getValues_Expanding_mean();

		/**
		 * The meta object literal for the '<em><b>Lag 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__LAG_1 = eINSTANCE.getValues_Lag_1();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.VisualizationGoalImpl <em>Visualization Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.VisualizationGoalImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVisualizationGoal()
		 * @generated
		 */
		EClass VISUALIZATION_GOAL = eINSTANCE.getVisualizationGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_GOAL__GOAL_TYPE = eINSTANCE.getVisualizationGoal_GoalType();

		/**
		 * The meta object literal for the '<em><b>Vatask</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_GOAL__VATASK = eINSTANCE.getVisualizationGoal_Vatask();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.VATaskImpl <em>VA Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.VATaskImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVATask()
		 * @generated
		 */
		EClass VA_TASK = eINSTANCE.getVATask();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VA_TASK__TASK_TYPE = eINSTANCE.getVATask_TaskType();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA_TASK__VISUALIZATION = eINSTANCE.getVATask_Visualization();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA_TASK__MARK = eINSTANCE.getVATask_Mark();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.EncodingImpl <em>Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.EncodingImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getEncoding()
		 * @generated
		 */
		EClass ENCODING = eINSTANCE.getEncoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING__ID = eINSTANCE.getEncoding_Id();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.channelTypeImpl <em>channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.channelTypeImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getchannelType()
		 * @generated
		 */
		EClass CHANNEL_TYPE = eINSTANCE.getchannelType();

		/**
		 * The meta object literal for the '<em><b>Channel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__CHANNEL_TYPE = eINSTANCE.getchannelType_ChannelType();

		/**
		 * The meta object literal for the '<em><b>Varible Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__VARIBLE_NAME = eINSTANCE.getchannelType_VaribleName();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__VARIABLE_TYPE = eINSTANCE.getchannelType_VariableType();

		/**
		 * The meta object literal for the '<em><b>Aggregate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__AGGREGATE_TYPE = eINSTANCE.getchannelType_AggregateType();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__TIME_UNIT = eINSTANCE.getchannelType_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__FILTER_TYPE = eINSTANCE.getchannelType_FilterType();

		/**
		 * The meta object literal for the '<em><b>Filter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__FILTER_VALUE = eINSTANCE.getchannelType_FilterValue();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.impl.MLModelImpl <em>ML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.impl.MLModelImpl
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getMLModel()
		 * @generated
		 */
		EClass ML_MODEL = eINSTANCE.getMLModel();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__MODEL_TYPE = eINSTANCE.getMLModel_ModelType();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.DecisionAreaList <em>Decision Area List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.DecisionAreaList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDecisionAreaList()
		 * @generated
		 */
		EEnum DECISION_AREA_LIST = eINSTANCE.getDecisionAreaList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.VAGoalTypeList <em>VA Goal Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.VAGoalTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVAGoalTypeList()
		 * @generated
		 */
		EEnum VA_GOAL_TYPE_LIST = eINSTANCE.getVAGoalTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.VATaskTypeList <em>VA Task Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.VATaskTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVATaskTypeList()
		 * @generated
		 */
		EEnum VA_TASK_TYPE_LIST = eINSTANCE.getVATaskTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.DataTypeList <em>Data Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.DataTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getDataTypeList()
		 * @generated
		 */
		EEnum DATA_TYPE_LIST = eINSTANCE.getDataTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.VisualFormatList <em>Visual Format List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.VisualFormatList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVisualFormatList()
		 * @generated
		 */
		EEnum VISUAL_FORMAT_LIST = eINSTANCE.getVisualFormatList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.VariableTypeList <em>Variable Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.VariableTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getVariableTypeList()
		 * @generated
		 */
		EEnum VARIABLE_TYPE_LIST = eINSTANCE.getVariableTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.AggregateTypeList <em>Aggregate Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.AggregateTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getAggregateTypeList()
		 * @generated
		 */
		EEnum AGGREGATE_TYPE_LIST = eINSTANCE.getAggregateTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.ChannelTypeList <em>Channel Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.ChannelTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getChannelTypeList()
		 * @generated
		 */
		EEnum CHANNEL_TYPE_LIST = eINSTANCE.getChannelTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.ModelTypeList <em>Model Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.ModelTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getModelTypeList()
		 * @generated
		 */
		EEnum MODEL_TYPE_LIST = eINSTANCE.getModelTypeList();

		/**
		 * The meta object literal for the '{@link decisionDashboardMetaModel.FilterTypeList <em>Filter Type List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decisionDashboardMetaModel.FilterTypeList
		 * @see decisionDashboardMetaModel.impl.DecisionDashboardMetaModelPackageImpl#getFilterTypeList()
		 * @generated
		 */
		EEnum FILTER_TYPE_LIST = eINSTANCE.getFilterTypeList();

	}

} //DecisionDashboardMetaModelPackage
