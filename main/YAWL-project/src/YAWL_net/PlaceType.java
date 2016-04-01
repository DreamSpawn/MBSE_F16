/**
 */
package YAWL_net;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link YAWL_net.PlaceType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see YAWL_net.YAWL_netPackage#getPlaceType()
 * @model
 * @generated
 */
public interface PlaceType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link YAWL_net.PlaceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see YAWL_net.PlaceTypes
	 * @see #setText(PlaceTypes)
	 * @see YAWL_net.YAWL_netPackage#getPlaceType_Text()
	 * @model required="true"
	 * @generated
	 */
	PlaceTypes getText();

	/**
	 * Sets the value of the '{@link YAWL_net.PlaceType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see YAWL_net.PlaceTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(PlaceTypes value);

} // PlaceType
