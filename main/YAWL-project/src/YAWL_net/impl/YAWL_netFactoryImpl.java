/**
 */
package YAWL_net.impl;

import YAWL_net.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class YAWL_netFactoryImpl extends EFactoryImpl implements YAWL_netFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YAWL_netFactory init() {
		try {
			YAWL_netFactory theYAWL_netFactory = (YAWL_netFactory)EPackage.Registry.INSTANCE.getEFactory(YAWL_netPackage.eNS_URI);
			if (theYAWL_netFactory != null) {
				return theYAWL_netFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YAWL_netFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWL_netFactoryImpl() {
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
			case YAWL_netPackage.PLACE: return createPlace();
			case YAWL_netPackage.YAWL_NET_TYPE: return createYAWL_NetType();
			case YAWL_netPackage.TRANSITION: return createTransition();
			case YAWL_netPackage.ARC: return createArc();
			case YAWL_netPackage.ARC_TYPE: return createArcType();
			case YAWL_netPackage.PLACE_TYPE: return createPlaceType();
			case YAWL_netPackage.TRANSITION_TYPE: return createTransitionType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case YAWL_netPackage.PLACE_TYPES:
				return createPlaceTypesFromString(eDataType, initialValue);
			case YAWL_netPackage.TRASITION_TYPES:
				return createTrasitionTypesFromString(eDataType, initialValue);
			case YAWL_netPackage.ARC_TYPES:
				return createArcTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case YAWL_netPackage.PLACE_TYPES:
				return convertPlaceTypesToString(eDataType, instanceValue);
			case YAWL_netPackage.TRASITION_TYPES:
				return convertTrasitionTypesToString(eDataType, instanceValue);
			case YAWL_netPackage.ARC_TYPES:
				return convertArcTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWL_NetType createYAWL_NetType() {
		YAWL_NetTypeImpl yawL_NetType = new YAWL_NetTypeImpl();
		return yawL_NetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType createPlaceType() {
		PlaceTypeImpl placeType = new PlaceTypeImpl();
		return placeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTypes createPlaceTypesFromString(EDataType eDataType, String initialValue) {
		PlaceTypes result = PlaceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrasitionTypes createTrasitionTypesFromString(EDataType eDataType, String initialValue) {
		TrasitionTypes result = TrasitionTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrasitionTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcTypes createArcTypesFromString(EDataType eDataType, String initialValue) {
		ArcTypes result = ArcTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArcTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWL_netPackage getYAWL_netPackage() {
		return (YAWL_netPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YAWL_netPackage getPackage() {
		return YAWL_netPackage.eINSTANCE;
	}

} //YAWL_netFactoryImpl
