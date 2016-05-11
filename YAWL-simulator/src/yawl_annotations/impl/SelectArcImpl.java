/**
 */
package yawl_annotations.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

import yawl_annotations.EnabledTrasition;
import yawl_annotations.SelectArc;
import yawl_annotations.YAWLAnnotationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawl_annotations.impl.SelectArcImpl#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link yawl_annotations.impl.SelectArcImpl#getTargetTransition <em>Target Transition</em>}</li>
 *   <li>{@link yawl_annotations.impl.SelectArcImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectArcImpl extends ObjectAnnotationImpl implements SelectArc {
	/**
	 * The cached value of the '{@link #getSourceTransition() <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTransition()
	 * @generated
	 * @ordered
	 */
	protected EnabledTrasition sourceTransition;

	/**
	 * The cached value of the '{@link #getTargetTransition() <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTransition()
	 * @generated
	 * @ordered
	 */
	protected EnabledTrasition targetTransition;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YAWLAnnotationsPackage.Literals.SELECT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTrasition getSourceTransition() {
		if (sourceTransition != null && sourceTransition.eIsProxy()) {
			InternalEObject oldSourceTransition = (InternalEObject)sourceTransition;
			sourceTransition = (EnabledTrasition)eResolveProxy(oldSourceTransition);
			if (sourceTransition != oldSourceTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YAWLAnnotationsPackage.SELECT_ARC__SOURCE_TRANSITION, oldSourceTransition, sourceTransition));
			}
		}
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTrasition basicGetSourceTransition() {
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTransition(EnabledTrasition newSourceTransition) {
		EnabledTrasition oldSourceTransition = sourceTransition;
		sourceTransition = newSourceTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLAnnotationsPackage.SELECT_ARC__SOURCE_TRANSITION, oldSourceTransition, sourceTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTrasition getTargetTransition() {
		if (targetTransition != null && targetTransition.eIsProxy()) {
			InternalEObject oldTargetTransition = (InternalEObject)targetTransition;
			targetTransition = (EnabledTrasition)eResolveProxy(oldTargetTransition);
			if (targetTransition != oldTargetTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YAWLAnnotationsPackage.SELECT_ARC__TARGET_TRANSITION, oldTargetTransition, targetTransition));
			}
		}
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTrasition basicGetTargetTransition() {
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTransition(EnabledTrasition newTargetTransition) {
		EnabledTrasition oldTargetTransition = targetTransition;
		targetTransition = newTargetTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLAnnotationsPackage.SELECT_ARC__TARGET_TRANSITION, oldTargetTransition, targetTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLAnnotationsPackage.SELECT_ARC__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YAWLAnnotationsPackage.SELECT_ARC__SOURCE_TRANSITION:
				if (resolve) return getSourceTransition();
				return basicGetSourceTransition();
			case YAWLAnnotationsPackage.SELECT_ARC__TARGET_TRANSITION:
				if (resolve) return getTargetTransition();
				return basicGetTargetTransition();
			case YAWLAnnotationsPackage.SELECT_ARC__SELECTED:
				return isSelected();
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
			case YAWLAnnotationsPackage.SELECT_ARC__SOURCE_TRANSITION:
				setSourceTransition((EnabledTrasition)newValue);
				return;
			case YAWLAnnotationsPackage.SELECT_ARC__TARGET_TRANSITION:
				setTargetTransition((EnabledTrasition)newValue);
				return;
			case YAWLAnnotationsPackage.SELECT_ARC__SELECTED:
				setSelected((Boolean)newValue);
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
			case YAWLAnnotationsPackage.SELECT_ARC__SOURCE_TRANSITION:
				setSourceTransition((EnabledTrasition)null);
				return;
			case YAWLAnnotationsPackage.SELECT_ARC__TARGET_TRANSITION:
				setTargetTransition((EnabledTrasition)null);
				return;
			case YAWLAnnotationsPackage.SELECT_ARC__SELECTED:
				setSelected(SELECTED_EDEFAULT);
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
			case YAWLAnnotationsPackage.SELECT_ARC__SOURCE_TRANSITION:
				return sourceTransition != null;
			case YAWLAnnotationsPackage.SELECT_ARC__TARGET_TRANSITION:
				return targetTransition != null;
			case YAWLAnnotationsPackage.SELECT_ARC__SELECTED:
				return selected != SELECTED_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SelectArcImpl
