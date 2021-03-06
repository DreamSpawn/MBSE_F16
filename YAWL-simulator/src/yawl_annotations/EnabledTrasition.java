/**
 */
package yawl_annotations;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Trasition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl_annotations.EnabledTrasition#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link yawl_annotations.EnabledTrasition#getInArcs <em>In Arcs</em>}</li>
 * </ul>
 *
 * @see yawl_annotations.YAWLAnnotationsPackage#getEnabledTrasition()
 * @model
 * @generated
 */
public interface EnabledTrasition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link yawl_annotations.SelectArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see yawl_annotations.YAWLAnnotationsPackage#getEnabledTrasition_OutArcs()
	 * @model
	 * @generated
	 */
	EList<SelectArc> getOutArcs();

	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link yawl_annotations.SelectArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see yawl_annotations.YAWLAnnotationsPackage#getEnabledTrasition_InArcs()
	 * @model
	 * @generated
	 */
	EList<SelectArc> getInArcs();

} // EnabledTrasition
