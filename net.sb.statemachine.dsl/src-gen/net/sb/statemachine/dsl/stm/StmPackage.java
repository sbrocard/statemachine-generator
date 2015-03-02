/**
 */
package net.sb.statemachine.dsl.stm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see net.sb.statemachine.dsl.stm.StmFactory
 * @model kind="package"
 * @generated
 */
public interface StmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sb.net/statemachine/dsl/Stm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StmPackage eINSTANCE = net.sb.statemachine.dsl.stm.impl.StmPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.StatemachineImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__EVENTS = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__COMMANDS = 1;

  /**
   * The feature id for the '<em><b>Guards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__GUARDS = 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATES = 3;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.EventImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.CommandImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.StateImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Entry Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY_ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Do Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DO_ACTION = 2;

  /**
   * The feature id for the '<em><b>Stop Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STOP_ACTION = 3;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATES = 4;

  /**
   * The feature id for the '<em><b>Self Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SELF_EVENTS = 5;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 6;

  /**
   * The feature id for the '<em><b>Exit Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT_ACTIONS = 7;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.TransitionImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.SelfEventImpl <em>Self Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.SelfEventImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getSelfEvent()
   * @generated
   */
  int SELF_EVENT = 5;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_EVENT__EVENT = 0;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_EVENT__GUARD = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_EVENT__ACTION = 2;

  /**
   * The number of structural features of the '<em>Self Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.GuardCallImpl <em>Guard Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.GuardCallImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getGuardCall()
   * @generated
   */
  int GUARD_CALL = 6;

  /**
   * The feature id for the '<em><b>Guard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CALL__GUARD = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CALL__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Guard Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.GuardImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sb.statemachine.dsl.stm.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sb.statemachine.dsl.stm.impl.ParameterImpl
   * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see net.sb.statemachine.dsl.stm.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see net.sb.statemachine.dsl.stm.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.Statemachine#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see net.sb.statemachine.dsl.stm.Statemachine#getCommands()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.Statemachine#getGuards <em>Guards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guards</em>'.
   * @see net.sb.statemachine.dsl.stm.Statemachine#getGuards()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Guards();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see net.sb.statemachine.dsl.stm.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see net.sb.statemachine.dsl.stm.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link net.sb.statemachine.dsl.stm.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sb.statemachine.dsl.stm.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see net.sb.statemachine.dsl.stm.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link net.sb.statemachine.dsl.stm.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sb.statemachine.dsl.stm.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see net.sb.statemachine.dsl.stm.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link net.sb.statemachine.dsl.stm.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the reference list '{@link net.sb.statemachine.dsl.stm.State#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Entry Actions</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getEntryActions()
   * @see #getState()
   * @generated
   */
  EReference getState_EntryActions();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.State#getDoAction <em>Do Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Do Action</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getDoAction()
   * @see #getState()
   * @generated
   */
  EReference getState_DoAction();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.State#getStopAction <em>Stop Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stop Action</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getStopAction()
   * @see #getState()
   * @generated
   */
  EReference getState_StopAction();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.State#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getStates()
   * @see #getState()
   * @generated
   */
  EReference getState_States();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.State#getSelfEvents <em>Self Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Self Events</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getSelfEvents()
   * @see #getState()
   * @generated
   */
  EReference getState_SelfEvents();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for the reference list '{@link net.sb.statemachine.dsl.stm.State#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Exit Actions</em>'.
   * @see net.sb.statemachine.dsl.stm.State#getExitActions()
   * @see #getState()
   * @generated
   */
  EReference getState_ExitActions();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see net.sb.statemachine.dsl.stm.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see net.sb.statemachine.dsl.stm.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the containment reference '{@link net.sb.statemachine.dsl.stm.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see net.sb.statemachine.dsl.stm.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see net.sb.statemachine.dsl.stm.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.Transition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see net.sb.statemachine.dsl.stm.Transition#getAction()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Action();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.SelfEvent <em>Self Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Event</em>'.
   * @see net.sb.statemachine.dsl.stm.SelfEvent
   * @generated
   */
  EClass getSelfEvent();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.SelfEvent#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see net.sb.statemachine.dsl.stm.SelfEvent#getEvent()
   * @see #getSelfEvent()
   * @generated
   */
  EReference getSelfEvent_Event();

  /**
   * Returns the meta object for the containment reference '{@link net.sb.statemachine.dsl.stm.SelfEvent#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see net.sb.statemachine.dsl.stm.SelfEvent#getGuard()
   * @see #getSelfEvent()
   * @generated
   */
  EReference getSelfEvent_Guard();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.SelfEvent#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see net.sb.statemachine.dsl.stm.SelfEvent#getAction()
   * @see #getSelfEvent()
   * @generated
   */
  EReference getSelfEvent_Action();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.GuardCall <em>Guard Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard Call</em>'.
   * @see net.sb.statemachine.dsl.stm.GuardCall
   * @generated
   */
  EClass getGuardCall();

  /**
   * Returns the meta object for the reference '{@link net.sb.statemachine.dsl.stm.GuardCall#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Guard</em>'.
   * @see net.sb.statemachine.dsl.stm.GuardCall#getGuard()
   * @see #getGuardCall()
   * @generated
   */
  EReference getGuardCall_Guard();

  /**
   * Returns the meta object for the attribute list '{@link net.sb.statemachine.dsl.stm.GuardCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see net.sb.statemachine.dsl.stm.GuardCall#getParameters()
   * @see #getGuardCall()
   * @generated
   */
  EAttribute getGuardCall_Parameters();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see net.sb.statemachine.dsl.stm.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the attribute '{@link net.sb.statemachine.dsl.stm.Guard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sb.statemachine.dsl.stm.Guard#getName()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sb.statemachine.dsl.stm.Guard#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.sb.statemachine.dsl.stm.Guard#getParameters()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Parameters();

  /**
   * Returns the meta object for class '{@link net.sb.statemachine.dsl.stm.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see net.sb.statemachine.dsl.stm.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sb.statemachine.dsl.stm.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sb.statemachine.dsl.stm.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sb.statemachine.dsl.stm.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sb.statemachine.dsl.stm.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StmFactory getStmFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.StatemachineImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__EVENTS = eINSTANCE.getStatemachine_Events();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__COMMANDS = eINSTANCE.getStatemachine_Commands();

    /**
     * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__GUARDS = eINSTANCE.getStatemachine_Guards();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATES = eINSTANCE.getStatemachine_States();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.EventImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.CommandImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.StateImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Entry Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ENTRY_ACTIONS = eINSTANCE.getState_EntryActions();

    /**
     * The meta object literal for the '<em><b>Do Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__DO_ACTION = eINSTANCE.getState_DoAction();

    /**
     * The meta object literal for the '<em><b>Stop Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STOP_ACTION = eINSTANCE.getState_StopAction();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATES = eINSTANCE.getState_States();

    /**
     * The meta object literal for the '<em><b>Self Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SELF_EVENTS = eINSTANCE.getState_SelfEvents();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '<em><b>Exit Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__EXIT_ACTIONS = eINSTANCE.getState_ExitActions();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.TransitionImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.SelfEventImpl <em>Self Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.SelfEventImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getSelfEvent()
     * @generated
     */
    EClass SELF_EVENT = eINSTANCE.getSelfEvent();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_EVENT__EVENT = eINSTANCE.getSelfEvent_Event();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_EVENT__GUARD = eINSTANCE.getSelfEvent_Guard();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_EVENT__ACTION = eINSTANCE.getSelfEvent_Action();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.GuardCallImpl <em>Guard Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.GuardCallImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getGuardCall()
     * @generated
     */
    EClass GUARD_CALL = eINSTANCE.getGuardCall();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD_CALL__GUARD = eINSTANCE.getGuardCall_Guard();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD_CALL__PARAMETERS = eINSTANCE.getGuardCall_Parameters();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.GuardImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__NAME = eINSTANCE.getGuard_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__PARAMETERS = eINSTANCE.getGuard_Parameters();

    /**
     * The meta object literal for the '{@link net.sb.statemachine.dsl.stm.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sb.statemachine.dsl.stm.impl.ParameterImpl
     * @see net.sb.statemachine.dsl.stm.impl.StmPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

  }

} //StmPackage
