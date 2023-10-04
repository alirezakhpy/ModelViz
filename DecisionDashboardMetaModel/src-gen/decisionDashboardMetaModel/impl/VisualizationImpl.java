/**
 */
package decisionDashboardMetaModel.impl;

import decisionDashboardMetaModel.Data;
import decisionDashboardMetaModel.DecisionArea;
import decisionDashboardMetaModel.DecisionDashboardMetaModelPackage;
import decisionDashboardMetaModel.MLModel;
import decisionDashboardMetaModel.Mark;
import decisionDashboardMetaModel.VATask;
import decisionDashboardMetaModel.Visualization;

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
 * An implementation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getMark <em>Mark</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getData <em>Data</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getVatask <em>Vatask</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getDecisionarea <em>Decisionarea</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link decisionDashboardMetaModel.impl.VisualizationImpl#getMlmodel <em>Mlmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationImpl extends MinimalEObjectImpl.Container implements Visualization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMark() <em>Mark</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected EList<Mark> mark;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getVatask() <em>Vatask</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatask()
	 * @generated
	 * @ordered
	 */
	protected EList<VATask> vatask;

	/**
	 * The cached value of the '{@link #getDecisionarea() <em>Decisionarea</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionarea()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionArea> decisionarea;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMlmodel() <em>Mlmodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<MLModel> mlmodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionDashboardMetaModelPackage.Literals.VISUALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecisionDashboardMetaModelPackage.VISUALIZATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark> getMark() {
		if (mark == null) {
			mark = new EObjectContainmentEList<Mark>(Mark.class, this,
					DecisionDashboardMetaModelPackage.VISUALIZATION__MARK);
		}
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this,
					DecisionDashboardMetaModelPackage.VISUALIZATION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VATask> getVatask() {
		if (vatask == null) {
			vatask = new EObjectWithInverseResolvingEList.ManyInverse<VATask>(VATask.class, this,
					DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK,
					DecisionDashboardMetaModelPackage.VA_TASK__VISUALIZATION);
		}
		return vatask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionArea> getDecisionarea() {
		if (decisionarea == null) {
			decisionarea = new EObjectWithInverseResolvingEList.ManyInverse<DecisionArea>(DecisionArea.class, this,
					DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA,
					DecisionDashboardMetaModelPackage.DECISION_AREA__VISUALIZATION);
		}
		return decisionarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DecisionDashboardMetaModelPackage.VISUALIZATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLModel> getMlmodel() {
		if (mlmodel == null) {
			mlmodel = new EObjectContainmentEList<MLModel>(MLModel.class, this,
					DecisionDashboardMetaModelPackage.VISUALIZATION__MLMODEL);
		}
		return mlmodel;
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVatask()).basicAdd(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDecisionarea()).basicAdd(otherEnd, msgs);
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MARK:
			return ((InternalEList<?>) getMark()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK:
			return ((InternalEList<?>) getVatask()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA:
			return ((InternalEList<?>) getDecisionarea()).basicRemove(otherEnd, msgs);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MLMODEL:
			return ((InternalEList<?>) getMlmodel()).basicRemove(otherEnd, msgs);
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION__NAME:
			return getName();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MARK:
			return getMark();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DATA:
			return getData();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK:
			return getVatask();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA:
			return getDecisionarea();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__TITLE:
			return getTitle();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MLMODEL:
			return getMlmodel();
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION__NAME:
			setName((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MARK:
			getMark().clear();
			getMark().addAll((Collection<? extends Mark>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK:
			getVatask().clear();
			getVatask().addAll((Collection<? extends VATask>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA:
			getDecisionarea().clear();
			getDecisionarea().addAll((Collection<? extends DecisionArea>) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__TITLE:
			setTitle((String) newValue);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MLMODEL:
			getMlmodel().clear();
			getMlmodel().addAll((Collection<? extends MLModel>) newValue);
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MARK:
			getMark().clear();
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DATA:
			getData().clear();
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK:
			getVatask().clear();
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA:
			getDecisionarea().clear();
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MLMODEL:
			getMlmodel().clear();
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
		case DecisionDashboardMetaModelPackage.VISUALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MARK:
			return mark != null && !mark.isEmpty();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DATA:
			return data != null && !data.isEmpty();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__VATASK:
			return vatask != null && !vatask.isEmpty();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__DECISIONAREA:
			return decisionarea != null && !decisionarea.isEmpty();
		case DecisionDashboardMetaModelPackage.VISUALIZATION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case DecisionDashboardMetaModelPackage.VISUALIZATION__MLMODEL:
			return mlmodel != null && !mlmodel.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //VisualizationImpl
