/**
 */
package yawl_net;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl_net.TransitionType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawl_net.YAWL_netPackage#getTransitionType()
 * @model
 * @generated
 */
public interface TransitionType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawl_net.TransitionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawl_net.TransitionTypes
	 * @see #setText(TransitionTypes)
	 * @see yawl_net.YAWL_netPackage#getTransitionType_Text()
	 * @model required="true"
	 * @generated
	 */
	TransitionTypes getText();

	/**
	 * Sets the value of the '{@link yawl_net.TransitionType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawl_net.TransitionTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(TransitionTypes value);

} // TransitionType
