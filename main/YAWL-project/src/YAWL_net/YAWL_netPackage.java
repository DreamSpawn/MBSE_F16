/**
 */
package YAWL_net;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see YAWL_net.YAWL_netFactory
 * @model kind="package"
 * @generated
 */
public interface YAWL_netPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "YAWL_net";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "westh.it/YAWL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "YAWL_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YAWL_netPackage eINSTANCE = YAWL_net.impl.YAWL_netPackageImpl.init();

	/**
	 * The meta object id for the '{@link YAWL_net.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.PlaceImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link YAWL_net.impl.YAWL_NetTypeImpl <em>YAWL Net Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.YAWL_NetTypeImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getYAWL_NetType()
	 * @generated
	 */
	int YAWL_NET_TYPE = 1;

	/**
	 * The number of structural features of the '<em>YAWL Net Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAWL_NET_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link YAWL_net.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.TransitionImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__JOIN = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SPLIT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link YAWL_net.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.ArcImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TYPE = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link YAWL_net.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.ArcTypeImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link YAWL_net.impl.PlaceTypeImpl <em>Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.PlaceTypeImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getPlaceType()
	 * @generated
	 */
	int PLACE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link YAWL_net.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.impl.TransitionTypeImpl
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link YAWL_net.PlaceTypes <em>Place Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.PlaceTypes
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getPlaceTypes()
	 * @generated
	 */
	int PLACE_TYPES = 7;

	/**
	 * The meta object id for the '{@link YAWL_net.TrasitionTypes <em>Trasition Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.TrasitionTypes
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getTrasitionTypes()
	 * @generated
	 */
	int TRASITION_TYPES = 8;

	/**
	 * The meta object id for the '{@link YAWL_net.ArcTypes <em>Arc Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWL_net.ArcTypes
	 * @see YAWL_net.impl.YAWL_netPackageImpl#getArcTypes()
	 * @generated
	 */
	int ARC_TYPES = 9;


	/**
	 * Returns the meta object for class '{@link YAWL_net.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see YAWL_net.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link YAWL_net.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see YAWL_net.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for class '{@link YAWL_net.YAWL_NetType <em>YAWL Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YAWL Net Type</em>'.
	 * @see YAWL_net.YAWL_NetType
	 * @generated
	 */
	EClass getYAWL_NetType();

	/**
	 * Returns the meta object for class '{@link YAWL_net.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see YAWL_net.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link YAWL_net.Transition#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join</em>'.
	 * @see YAWL_net.Transition#getJoin()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Join();

	/**
	 * Returns the meta object for the containment reference '{@link YAWL_net.Transition#getSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Split</em>'.
	 * @see YAWL_net.Transition#getSplit()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Split();

	/**
	 * Returns the meta object for class '{@link YAWL_net.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see YAWL_net.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link YAWL_net.Arc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see YAWL_net.Arc#getType()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Type();

	/**
	 * Returns the meta object for class '{@link YAWL_net.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see YAWL_net.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the attribute '{@link YAWL_net.ArcType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see YAWL_net.ArcType#getText()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Text();

	/**
	 * Returns the meta object for class '{@link YAWL_net.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Type</em>'.
	 * @see YAWL_net.PlaceType
	 * @generated
	 */
	EClass getPlaceType();

	/**
	 * Returns the meta object for the attribute '{@link YAWL_net.PlaceType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see YAWL_net.PlaceType#getText()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Text();

	/**
	 * Returns the meta object for class '{@link YAWL_net.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see YAWL_net.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link YAWL_net.TransitionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see YAWL_net.TransitionType#getText()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Text();

	/**
	 * Returns the meta object for enum '{@link YAWL_net.PlaceTypes <em>Place Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Place Types</em>'.
	 * @see YAWL_net.PlaceTypes
	 * @generated
	 */
	EEnum getPlaceTypes();

	/**
	 * Returns the meta object for enum '{@link YAWL_net.TrasitionTypes <em>Trasition Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trasition Types</em>'.
	 * @see YAWL_net.TrasitionTypes
	 * @generated
	 */
	EEnum getTrasitionTypes();

	/**
	 * Returns the meta object for enum '{@link YAWL_net.ArcTypes <em>Arc Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Types</em>'.
	 * @see YAWL_net.ArcTypes
	 * @generated
	 */
	EEnum getArcTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YAWL_netFactory getYAWL_netFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link YAWL_net.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.PlaceImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '{@link YAWL_net.impl.YAWL_NetTypeImpl <em>YAWL Net Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.YAWL_NetTypeImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getYAWL_NetType()
		 * @generated
		 */
		EClass YAWL_NET_TYPE = eINSTANCE.getYAWL_NetType();

		/**
		 * The meta object literal for the '{@link YAWL_net.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.TransitionImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__JOIN = eINSTANCE.getTransition_Join();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SPLIT = eINSTANCE.getTransition_Split();

		/**
		 * The meta object literal for the '{@link YAWL_net.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.ArcImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TYPE = eINSTANCE.getArc_Type();

		/**
		 * The meta object literal for the '{@link YAWL_net.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.ArcTypeImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TEXT = eINSTANCE.getArcType_Text();

		/**
		 * The meta object literal for the '{@link YAWL_net.impl.PlaceTypeImpl <em>Place Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.PlaceTypeImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getPlaceType()
		 * @generated
		 */
		EClass PLACE_TYPE = eINSTANCE.getPlaceType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__TEXT = eINSTANCE.getPlaceType_Text();

		/**
		 * The meta object literal for the '{@link YAWL_net.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.impl.TransitionTypeImpl
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TEXT = eINSTANCE.getTransitionType_Text();

		/**
		 * The meta object literal for the '{@link YAWL_net.PlaceTypes <em>Place Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.PlaceTypes
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getPlaceTypes()
		 * @generated
		 */
		EEnum PLACE_TYPES = eINSTANCE.getPlaceTypes();

		/**
		 * The meta object literal for the '{@link YAWL_net.TrasitionTypes <em>Trasition Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.TrasitionTypes
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getTrasitionTypes()
		 * @generated
		 */
		EEnum TRASITION_TYPES = eINSTANCE.getTrasitionTypes();

		/**
		 * The meta object literal for the '{@link YAWL_net.ArcTypes <em>Arc Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWL_net.ArcTypes
		 * @see YAWL_net.impl.YAWL_netPackageImpl#getArcTypes()
		 * @generated
		 */
		EEnum ARC_TYPES = eINSTANCE.getArcTypes();

	}

} //YAWL_netPackage
