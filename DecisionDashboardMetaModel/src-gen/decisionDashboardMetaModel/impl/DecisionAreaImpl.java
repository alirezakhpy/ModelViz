/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.DecisionArea;
import decisionDashboardMetaModel.DecisionAreaList;
import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.Visualization;
import decisionDashboardMetaModel.VisualizationGoal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.DecisionAreaImpl#getDtype <em>Dtype</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.DecisionAreaImpl#getVisualizationgoal <em>Visualizationgoal</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.DecisionAreaImpl#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionAreaImpl extends MinimalEObjectImpl.Container implements DecisionArea {
	/**
	 * The default value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionAreaList DTYPE_EDEFAULT = DecisionAreaList.SALES_MANAGEMENT;

	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected DecisionAreaList dtype = DTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualizationgoal() <em>Visualizationgoal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationgoal()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualizationGoal> visualizationgoal;

	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualization> visualization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.DECISION_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionAreaList getDtype() {
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtype(DecisionAreaList newDtype) {
		DecisionAreaList oldDtype = dtype;
		dtype = newDtype == null ? DTYPE_EDEFAULT : newDtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.DECISION_AREA__DTYPE, oldDtype, dtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualizationGoal> getVisualizationgoal() {
		if (visualizationgoal == null) {
			visualizationgoal = new EObjectContainmentEList<VisualizationGoal>(VisualizationGoal.class, this,
					DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATIONGOAL);
		}
		return visualizationgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visualization> getVisualization() {
		if (visualization == null) {
			visualization = new EObjectWithInverseResolvingEList.ManyInverse<Visualization>(Visualization.class, this,
					DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION,
					DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA);
		}
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVisualization()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATIONGOAL:
			return ((InternalEList<?>) getVisualizationgoal()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION:
			return ((InternalEList<?>) getVisualization()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.DECISION_AREA__DTYPE:
			return getDtype();
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATIONGOAL:
			return getVisualizationgoal();
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION:
			return getVisualization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DecisionDashboardMetaModelPackage.DECISION_AREA__DTYPE:
			setDtype((DecisionAreaList) newValue);
			return;
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATIONGOAL:
			getVisualizationgoal().clear();
			getVisualizationgoal().addAll((Collection<? extends VisualizationGoal>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION:
			getVisualization().clear();
			getVisualization().addAll((Collection<? extends Visualization>) newValue);
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
		case DecisionDashboardMetaModelPackage.DECISION_AREA__DTYPE:
			setDtype(DTYPE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATIONGOAL:
			getVisualizationgoal().clear();
			return;
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION:
			getVisualization().clear();
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
		case DecisionDashboardMetaModelPackage.DECISION_AREA__DTYPE:
			return dtype != DTYPE_EDEFAULT;
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATIONGOAL:
			return visualizationgoal != null && !visualizationgoal.isEmpty();
		case DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION:
			return visualization != null && !visualization.isEmpty();
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
		result.append(" (Dtype: ");
		result.append(dtype);
		result.append(')');
		return result.toString();
	}

} //DecisionAreaImpl
