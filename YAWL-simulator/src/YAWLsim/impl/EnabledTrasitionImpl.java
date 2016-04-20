/**
 */
package YAWLsim.impl;

import YAWLsim.EnabledTrasition;
import YAWLsim.SelectArc;
import YAWLsim.YAWLsimPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabled Trasition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link YAWLsim.impl.EnabledTrasitionImpl#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link YAWLsim.impl.EnabledTrasitionImpl#getInArcs <em>In Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnabledTrasitionImpl extends ObjectAnnotationImpl implements EnabledTrasition {
	/**
	 * The cached value of the '{@link #getOutArcs() <em>Out Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectArc> outArcs;

	/**
	 * The cached value of the '{@link #getInArcs() <em>In Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectArc> inArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnabledTrasitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YAWLsimPackage.Literals.ENABLED_TRASITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectArc> getOutArcs() {
		if (outArcs == null) {
			outArcs = new EObjectResolvingEList<SelectArc>(SelectArc.class, this, YAWLsimPackage.ENABLED_TRASITION__OUT_ARCS);
		}
		return outArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectArc> getInArcs() {
		if (inArcs == null) {
			inArcs = new EObjectResolvingEList<SelectArc>(SelectArc.class, this, YAWLsimPackage.ENABLED_TRASITION__IN_ARCS);
		}
		return inArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YAWLsimPackage.ENABLED_TRASITION__OUT_ARCS:
				return getOutArcs();
			case YAWLsimPackage.ENABLED_TRASITION__IN_ARCS:
				return getInArcs();
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
			case YAWLsimPackage.ENABLED_TRASITION__OUT_ARCS:
				getOutArcs().clear();
				getOutArcs().addAll((Collection<? extends SelectArc>)newValue);
				return;
			case YAWLsimPackage.ENABLED_TRASITION__IN_ARCS:
				getInArcs().clear();
				getInArcs().addAll((Collection<? extends SelectArc>)newValue);
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
			case YAWLsimPackage.ENABLED_TRASITION__OUT_ARCS:
				getOutArcs().clear();
				return;
			case YAWLsimPackage.ENABLED_TRASITION__IN_ARCS:
				getInArcs().clear();
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
			case YAWLsimPackage.ENABLED_TRASITION__OUT_ARCS:
				return outArcs != null && !outArcs.isEmpty();
			case YAWLsimPackage.ENABLED_TRASITION__IN_ARCS:
				return inArcs != null && !inArcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnabledTrasitionImpl
