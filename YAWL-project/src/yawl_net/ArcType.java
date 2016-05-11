/**
 */
package yawl_net;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl_net.ArcType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawl_net.YAWL_netPackage#getArcType()
 * @model
 * @generated
 */
public interface ArcType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link yawl_net.ArcTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see yawl_net.ArcTypes
	 * @see #setText(ArcTypes)
	 * @see yawl_net.YAWL_netPackage#getArcType_Text()
	 * @model required="true"
	 * @generated
	 */
	ArcTypes getText();

	/**
	 * Sets the value of the '{@link yawl_net.ArcType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see yawl_net.ArcTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(ArcTypes value);

} // ArcType
