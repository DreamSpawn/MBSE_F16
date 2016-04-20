/**
 */
package YAWLAnnotations;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link YAWLAnnotations.SelectArc#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link YAWLAnnotations.SelectArc#getTargetTransition <em>Target Transition</em>}</li>
 *   <li>{@link YAWLAnnotations.SelectArc#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see YAWLAnnotations.YAWLAnnotationsPackage#getSelectArc()
 * @model
 * @generated
 */
public interface SelectArc extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Transition</em>' reference.
	 * @see #setSourceTransition(EnabledTrasition)
	 * @see YAWLAnnotations.YAWLAnnotationsPackage#getSelectArc_SourceTransition()
	 * @model
	 * @generated
	 */
	EnabledTrasition getSourceTransition();

	/**
	 * Sets the value of the '{@link YAWLAnnotations.SelectArc#getSourceTransition <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Transition</em>' reference.
	 * @see #getSourceTransition()
	 * @generated
	 */
	void setSourceTransition(EnabledTrasition value);

	/**
	 * Returns the value of the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Transition</em>' reference.
	 * @see #setTargetTransition(EnabledTrasition)
	 * @see YAWLAnnotations.YAWLAnnotationsPackage#getSelectArc_TargetTransition()
	 * @model
	 * @generated
	 */
	EnabledTrasition getTargetTransition();

	/**
	 * Sets the value of the '{@link YAWLAnnotations.SelectArc#getTargetTransition <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Transition</em>' reference.
	 * @see #getTargetTransition()
	 * @generated
	 */
	void setTargetTransition(EnabledTrasition value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see YAWLAnnotations.YAWLAnnotationsPackage#getSelectArc_Selected()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link YAWLAnnotations.SelectArc#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // SelectArc
