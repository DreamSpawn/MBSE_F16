/**
 */
package YAWLAnnotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

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
 * @see YAWLAnnotations.YAWLsimFactory
 * @model kind="package"
 * @generated
 */
public interface YAWLsimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "YAWLAnnotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "westh.it/YAWLsim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "YAWLsim_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YAWLsimPackage eINSTANCE = YAWLAnnotations.impl.YAWLsimPackageImpl.init();

	/**
	 * The meta object id for the '{@link YAWLAnnotations.impl.EnabledTrasitionImpl <em>Enabled Trasition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWLAnnotations.impl.EnabledTrasitionImpl
	 * @see YAWLAnnotations.impl.YAWLsimPackageImpl#getEnabledTrasition()
	 * @generated
	 */
	int ENABLED_TRASITION = 0;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRASITION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRASITION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRASITION__OUT_ARCS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRASITION__IN_ARCS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enabled Trasition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRASITION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link YAWLAnnotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWLAnnotations.impl.SelectArcImpl
	 * @see YAWLAnnotations.impl.YAWLsimPackageImpl#getSelectArc()
	 * @generated
	 */
	int SELECT_ARC = 1;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__SOURCE_TRANSITION = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__TARGET_TRANSITION = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__SELECTED = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link YAWLAnnotations.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see YAWLAnnotations.impl.MarkingImpl
	 * @see YAWLAnnotations.impl.YAWLsimPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 2;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__VALUE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link YAWLAnnotations.EnabledTrasition <em>Enabled Trasition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabled Trasition</em>'.
	 * @see YAWLAnnotations.EnabledTrasition
	 * @generated
	 */
	EClass getEnabledTrasition();

	/**
	 * Returns the meta object for the reference list '{@link YAWLAnnotations.EnabledTrasition#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see YAWLAnnotations.EnabledTrasition#getOutArcs()
	 * @see #getEnabledTrasition()
	 * @generated
	 */
	EReference getEnabledTrasition_OutArcs();

	/**
	 * Returns the meta object for the reference list '{@link YAWLAnnotations.EnabledTrasition#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see YAWLAnnotations.EnabledTrasition#getInArcs()
	 * @see #getEnabledTrasition()
	 * @generated
	 */
	EReference getEnabledTrasition_InArcs();

	/**
	 * Returns the meta object for class '{@link YAWLAnnotations.SelectArc <em>Select Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Arc</em>'.
	 * @see YAWLAnnotations.SelectArc
	 * @generated
	 */
	EClass getSelectArc();

	/**
	 * Returns the meta object for the reference '{@link YAWLAnnotations.SelectArc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Transition</em>'.
	 * @see YAWLAnnotations.SelectArc#getSourceTransition()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_SourceTransition();

	/**
	 * Returns the meta object for the reference '{@link YAWLAnnotations.SelectArc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Transition</em>'.
	 * @see YAWLAnnotations.SelectArc#getTargetTransition()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_TargetTransition();

	/**
	 * Returns the meta object for the attribute '{@link YAWLAnnotations.SelectArc#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see YAWLAnnotations.SelectArc#isSelected()
	 * @see #getSelectArc()
	 * @generated
	 */
	EAttribute getSelectArc_Selected();

	/**
	 * Returns the meta object for class '{@link YAWLAnnotations.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see YAWLAnnotations.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the attribute '{@link YAWLAnnotations.Marking#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see YAWLAnnotations.Marking#getValue()
	 * @see #getMarking()
	 * @generated
	 */
	EAttribute getMarking_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YAWLsimFactory getYAWLsimFactory();

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
		 * The meta object literal for the '{@link YAWLAnnotations.impl.EnabledTrasitionImpl <em>Enabled Trasition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWLAnnotations.impl.EnabledTrasitionImpl
		 * @see YAWLAnnotations.impl.YAWLsimPackageImpl#getEnabledTrasition()
		 * @generated
		 */
		EClass ENABLED_TRASITION = eINSTANCE.getEnabledTrasition();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRASITION__OUT_ARCS = eINSTANCE.getEnabledTrasition_OutArcs();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRASITION__IN_ARCS = eINSTANCE.getEnabledTrasition_InArcs();

		/**
		 * The meta object literal for the '{@link YAWLAnnotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWLAnnotations.impl.SelectArcImpl
		 * @see YAWLAnnotations.impl.YAWLsimPackageImpl#getSelectArc()
		 * @generated
		 */
		EClass SELECT_ARC = eINSTANCE.getSelectArc();

		/**
		 * The meta object literal for the '<em><b>Source Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ARC__SOURCE_TRANSITION = eINSTANCE.getSelectArc_SourceTransition();

		/**
		 * The meta object literal for the '<em><b>Target Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ARC__TARGET_TRANSITION = eINSTANCE.getSelectArc_TargetTransition();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_ARC__SELECTED = eINSTANCE.getSelectArc_Selected();

		/**
		 * The meta object literal for the '{@link YAWLAnnotations.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see YAWLAnnotations.impl.MarkingImpl
		 * @see YAWLAnnotations.impl.YAWLsimPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING__VALUE = eINSTANCE.getMarking_Value();

	}

} //YAWLsimPackage
