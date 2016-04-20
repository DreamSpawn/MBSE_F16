/**
 */
package YAWLsim.impl;

import YAWLsim.EnabledTrasition;
import YAWLsim.Marking;
import YAWLsim.SelectArc;
import YAWLsim.YAWLsimFactory;
import YAWLsim.YAWLsimPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YAWLsimPackageImpl extends EPackageImpl implements YAWLsimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledTrasitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see YAWLsim.YAWLsimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YAWLsimPackageImpl() {
		super(eNS_URI, YAWLsimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link YAWLsimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YAWLsimPackage init() {
		if (isInited) return (YAWLsimPackage)EPackage.Registry.INSTANCE.getEPackage(YAWLsimPackage.eNS_URI);

		// Obtain or create and register package
		YAWLsimPackageImpl theYAWLsimPackage = (YAWLsimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YAWLsimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YAWLsimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NetannotationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYAWLsimPackage.createPackageContents();

		// Initialize created meta-data
		theYAWLsimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYAWLsimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YAWLsimPackage.eNS_URI, theYAWLsimPackage);
		return theYAWLsimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledTrasition() {
		return enabledTrasitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTrasition_OutArcs() {
		return (EReference)enabledTrasitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTrasition_InArcs() {
		return (EReference)enabledTrasitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectArc() {
		return selectArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_SourceTransition() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_TargetTransition() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectArc_Selected() {
		return (EAttribute)selectArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarking() {
		return markingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarking_Value() {
		return (EAttribute)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLsimFactory getYAWLsimFactory() {
		return (YAWLsimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enabledTrasitionEClass = createEClass(ENABLED_TRASITION);
		createEReference(enabledTrasitionEClass, ENABLED_TRASITION__OUT_ARCS);
		createEReference(enabledTrasitionEClass, ENABLED_TRASITION__IN_ARCS);

		selectArcEClass = createEClass(SELECT_ARC);
		createEReference(selectArcEClass, SELECT_ARC__SOURCE_TRANSITION);
		createEReference(selectArcEClass, SELECT_ARC__TARGET_TRANSITION);
		createEAttribute(selectArcEClass, SELECT_ARC__SELECTED);

		markingEClass = createEClass(MARKING);
		createEAttribute(markingEClass, MARKING__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NetannotationsPackage theNetannotationsPackage = (NetannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(NetannotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enabledTrasitionEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		selectArcEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		markingEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		markingEClass.getESuperTypes().add(theNetannotationsPackage.getTextualAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(enabledTrasitionEClass, EnabledTrasition.class, "EnabledTrasition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnabledTrasition_OutArcs(), this.getSelectArc(), null, "outArcs", null, 0, -1, EnabledTrasition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnabledTrasition_InArcs(), this.getSelectArc(), null, "inArcs", null, 0, -1, EnabledTrasition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectArcEClass, SelectArc.class, "SelectArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectArc_SourceTransition(), this.getEnabledTrasition(), null, "sourceTransition", null, 0, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectArc_TargetTransition(), this.getEnabledTrasition(), null, "targetTransition", null, 0, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectArc_Selected(), ecorePackage.getEBoolean(), "selected", "false", 1, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarking_Value(), ecorePackage.getEInt(), "value", "1", 0, 1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //YAWLsimPackageImpl
