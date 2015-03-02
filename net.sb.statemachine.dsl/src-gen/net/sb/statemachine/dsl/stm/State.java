/**
 */
package net.sb.statemachine.dsl.stm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getName <em>Name</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getStopAction <em>Stop Action</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getStates <em>States</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getSelfEvents <em>Self Events</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.State#getExitActions <em>Exit Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sb.statemachine.dsl.stm.StmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entry Actions</b></em>' reference list.
   * The list contents are of type {@link net.sb.statemachine.dsl.stm.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Actions</em>' reference list.
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_EntryActions()
   * @model
   * @generated
   */
  EList<Command> getEntryActions();

  /**
   * Returns the value of the '<em><b>Do Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Action</em>' reference.
   * @see #setDoAction(Command)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_DoAction()
   * @model
   * @generated
   */
  Command getDoAction();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.State#getDoAction <em>Do Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Action</em>' reference.
   * @see #getDoAction()
   * @generated
   */
  void setDoAction(Command value);

  /**
   * Returns the value of the '<em><b>Stop Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Action</em>' reference.
   * @see #setStopAction(Command)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_StopAction()
   * @model
   * @generated
   */
  Command getStopAction();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.State#getStopAction <em>Stop Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop Action</em>' reference.
   * @see #getStopAction()
   * @generated
   */
  void setStopAction(Command value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link net.sb.statemachine.dsl.stm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Self Events</b></em>' containment reference list.
   * The list contents are of type {@link net.sb.statemachine.dsl.stm.SelfEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self Events</em>' containment reference list.
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_SelfEvents()
   * @model containment="true"
   * @generated
   */
  EList<SelfEvent> getSelfEvents();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link net.sb.statemachine.dsl.stm.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

  /**
   * Returns the value of the '<em><b>Exit Actions</b></em>' reference list.
   * The list contents are of type {@link net.sb.statemachine.dsl.stm.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Actions</em>' reference list.
   * @see net.sb.statemachine.dsl.stm.StmPackage#getState_ExitActions()
   * @model
   * @generated
   */
  EList<Command> getExitActions();

} // State
