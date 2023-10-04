/**
 */
package decisionDashboardMetaModel.util;

import decisionDashboardMetaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see decisionDashboardMetaModel.DecisionDashboardMetaModelPackage
 * @generated
 */
public class DecisionDashboardMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DecisionDashboardMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionDashboardMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = DecisionDashboardMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DecisionDashboardMetaModelPackage.DASHBOARD: {
			Dashboard dashboard = (Dashboard) theEObject;
			T result = caseDashboard(dashboard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.VISUALIZATION: {
			Visualization visualization = (Visualization) theEObject;
			T result = caseVisualization(visualization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.DECISION_AREA: {
			DecisionArea decisionArea = (DecisionArea) theEObject;
			T result = caseDecisionArea(decisionArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.MARK: {
			Mark mark = (Mark) theEObject;
			T result = caseMark(mark);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.BAR: {
			Bar bar = (Bar) theEObject;
			T result = caseBar(bar);
			if (result == null)
				result = caseMark(bar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = caseMark(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.VALUES: {
			Values values = (Values) theEObject;
			T result = caseValues(values);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.VISUALIZATION_GOAL: {
			VisualizationGoal visualizationGoal = (VisualizationGoal) theEObject;
			T result = caseVisualizationGoal(visualizationGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.VA_TASK: {
			VATask vaTask = (VATask) theEObject;
			T result = caseVATask(vaTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.ENCODING: {
			Encoding encoding = (Encoding) theEObject;
			T result = caseEncoding(encoding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.CHANNEL_TYPE: {
			channelType channelType = (channelType) theEObject;
			T result = casechannelType(channelType);
			if (result == null)
				result = caseEncoding(channelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DecisionDashboardMetaModelPackage.ML_MODEL: {
			MLModel mlModel = (MLModel) theEObject;
			T result = caseMLModel(mlModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashboard(Dashboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualization(Visualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionArea(DecisionArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMark(Mark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBar(Bar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValues(Values object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationGoal(VisualizationGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VA Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VA Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVATask(VATask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoding(Encoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechannelType(channelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLModel(MLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DecisionDashboardMetaModelSwitch
