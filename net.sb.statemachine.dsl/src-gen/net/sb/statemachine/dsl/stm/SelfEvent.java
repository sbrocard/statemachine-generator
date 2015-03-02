/**
 */
package net.sb.statemachine.dsl.stm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sb.statemachine.dsl.stm.SelfEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.SelfEvent#getGuard <em>Guard</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.SelfEvent#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sb.statemachine.dsl.stm.StmPackage#getSelfEvent()
 * @model
 * @generated
 */
public interface SelfEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getSelfEvent_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.SelfEvent#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(GuardCall)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getSelfEvent_Guard()
   * @model containment="true"
   * @generated
   */
  GuardCall getGuard();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.SelfEvent#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(GuardCall value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Command)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getSelfEvent_Action()
   * @model
   * @generated
   */
  Command getAction();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.SelfEvent#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Command value);

} // SelfEvent
