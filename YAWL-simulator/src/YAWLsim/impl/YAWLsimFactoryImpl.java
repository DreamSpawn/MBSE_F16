/**
 */
package YAWLsim.impl;

import YAWLsim.*;

import org.eclipse.emf.ecore.EClass;
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
public class YAWLsimFactoryImpl extends EFactoryImpl implements YAWLsimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YAWLsimFactory init() {
		try {
			YAWLsimFactory theYAWLsimFactory = (YAWLsimFactory)EPackage.Registry.INSTANCE.getEFactory(YAWLsimPackage.eNS_URI);
			if (theYAWLsimFactory != null) {
				return theYAWLsimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YAWLsimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLsimFactoryImpl() {
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
			case YAWLsimPackage.ENABLED_TRASITION: return createEnabledTrasition();
			case YAWLsimPackage.SELECT_ARC: return createSelectArc();
			case YAWLsimPackage.MARKING: return createMarking();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTrasition createEnabledTrasition() {
		EnabledTrasitionImpl enabledTrasition = new EnabledTrasitionImpl();
		return enabledTrasition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc createSelectArc() {
		SelectArcImpl selectArc = new SelectArcImpl();
		return selectArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking() {
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLsimPackage getYAWLsimPackage() {
		return (YAWLsimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YAWLsimPackage getPackage() {
		return YAWLsimPackage.eINSTANCE;
	}

} //YAWLsimFactoryImpl
