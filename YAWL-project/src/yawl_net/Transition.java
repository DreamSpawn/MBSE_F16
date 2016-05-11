/**
 */
package yawl_net;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawl_net.Transition#getJoin <em>Join</em>}</li>
 *   <li>{@link yawl_net.Transition#getSplit <em>Split</em>}</li>
 * </ul>
 *
 * @see yawl_net.YAWL_netPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference.
	 * @see #setJoin(TransitionType)
	 * @see yawl_net.YAWL_netPackage#getTransition_Join()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransitionType getJoin();

	/**
	 * Sets the value of the '{@link yawl_net.Transition#getJoin <em>Join</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' containment reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' containment reference.
	 * @see #setSplit(TransitionType)
	 * @see yawl_net.YAWL_netPackage#getTransition_Split()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransitionType getSplit();

	/**
	 * Sets the value of the '{@link yawl_net.Transition#getSplit <em>Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split</em>' containment reference.
	 * @see #getSplit()
	 * @generated
	 */
	void setSplit(TransitionType value);

} // Transition
