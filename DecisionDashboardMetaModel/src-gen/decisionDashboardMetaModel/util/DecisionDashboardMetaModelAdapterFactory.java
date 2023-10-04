/**
 */
package decisionDashboardMetaModel.util;

import decisionDashboardMetaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage
 * @generated
 */
public class DecisionDashboardMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DecisionDashboardMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionDashboardMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DecisionDashboardMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionDashboardMetaModelSwitch<Adapter> modelSwitch = new DecisionDashboardMetaModelSwitch<Adapter>() {
		@Override
		public Adapter caseDashboard(Dashboard object) {
			return createDashboardAdapter();
		}

		@Override
		public Adapter caseVisualization(Visualization object) {
			return createVisualizationAdapter();
		}

		@Override
		public Adapter caseDecisionArea(DecisionArea object) {
			return createDecisionAreaAdapter();
		}

		@Override
		public Adapter caseMark(Mark object) {
			return createMarkAdapter();
		}

		@Override
		public Adapter caseBar(Bar object) {
			return createBarAdapter();
		}

		@Override
		public Adapter caseLine(Line object) {
			return createLineAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseValues(Values object) {
			return createValuesAdapter();
		}

		@Override
		public Adapter caseVisualizationGoal(VisualizationGoal object) {
			return createVisualizationGoalAdapter();
		}

		@Override
		public Adapter caseVATask(VATask object) {
			return createVATaskAdapter();
		}

		@Override
		public Adapter caseEncoding(Encoding object) {
			return createEncodingAdapter();
		}

		@Override
		public Adapter casechannelType(channelType object) {
			return createchannelTypeAdapter();
		}

		@Override
		public Adapter caseMLModel(MLModel object) {
			return createMLModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Dashboard
	 * @generated
	 */
	public Adapter createDashboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Visualization
	 * @generated
	 */
	public Adapter createVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.DecisionArea <em>Decision Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.DecisionArea
	 * @generated
	 */
	public Adapter createDecisionAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Mark
	 * @generated
	 */
	public Adapter createMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Bar
	 * @generated
	 */
	public Adapter createBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Values
	 * @generated
	 */
	public Adapter createValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.VisualizationGoal <em>Visualization Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.VisualizationGoal
	 * @generated
	 */
	public Adapter createVisualizationGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.VATask <em>VA Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.VATask
	 * @generated
	 */
	public Adapter createVATaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.Encoding
	 * @generated
	 */
	public Adapter createEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.channelType <em>channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.channelType
	 * @generated
	 */
	public Adapter createchannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link decisionDashboardMetaModel.MLModel <em>ML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see decisionDashboardMetaModel.MLModel
	 * @generated
	 */
	public Adapter createMLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DecisionDashboardMetaModelAdapterFactory
