/**
 */
package YAWLAnnotations.impl;

import YAWLAnnotations.*;

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
public class YAWLAnnotationsFactoryImpl extends EFactoryImpl implements YAWLAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YAWLAnnotationsFactory init() {
		try {
			YAWLAnnotationsFactory theYAWLAnnotationsFactory = (YAWLAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(YAWLAnnotationsPackage.eNS_URI);
			if (theYAWLAnnotationsFactory != null) {
				return theYAWLAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YAWLAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLAnnotationsFactoryImpl() {
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
			case YAWLAnnotationsPackage.ENABLED_TRASITION: return createEnabledTrasition();
			case YAWLAnnotationsPackage.SELECT_ARC: return createSelectArc();
			case YAWLAnnotationsPackage.MARKING: return createMarking();
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
	public YAWLAnnotationsPackage getYAWLAnnotationsPackage() {
		return (YAWLAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YAWLAnnotationsPackage getPackage() {
		return YAWLAnnotationsPackage.eINSTANCE;
	}

} //YAWLAnnotationsFactoryImpl
