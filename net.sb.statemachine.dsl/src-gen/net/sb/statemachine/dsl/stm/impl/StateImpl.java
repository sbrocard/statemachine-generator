/**
 */
package net.sb.statemachine.dsl.stm.impl;

import java.util.Collection;

import net.sb.statemachine.dsl.stm.Command;
import net.sb.statemachine.dsl.stm.SelfEvent;
import net.sb.statemachine.dsl.stm.State;
import net.sb.statemachine.dsl.stm.StmPackage;
import net.sb.statemachine.dsl.stm.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getStopAction <em>Stop Action</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getStates <em>States</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getSelfEvents <em>Self Events</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.StateImpl#getExitActions <em>Exit Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryActions()
   * @generated
   * @ordered
   */
  protected EList<Command> entryActions;

  /**
   * The cached value of the '{@link #getDoAction() <em>Do Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoAction()
   * @generated
   * @ordered
   */
  protected Command doAction;

  /**
   * The cached value of the '{@link #getStopAction() <em>Stop Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopAction()
   * @generated
   * @ordered
   */
  protected Command stopAction;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * The cached value of the '{@link #getSelfEvents() <em>Self Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfEvents()
   * @generated
   * @ordered
   */
  protected EList<SelfEvent> selfEvents;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * The cached value of the '{@link #getExitActions() <em>Exit Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitActions()
   * @generated
   * @ordered
   */
  protected EList<Command> exitActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StmPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StmPackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getEntryActions()
  {
    if (entryActions == null)
    {
      entryActions = new EObjectResolvingEList<Command>(Command.class, this, StmPackage.STATE__ENTRY_ACTIONS);
    }
    return entryActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command getDoAction()
  {
    if (doAction != null && doAction.eIsProxy())
    {
      InternalEObject oldDoAction = (InternalEObject)doAction;
      doAction = (Command)eResolveProxy(oldDoAction);
      if (doAction != oldDoAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StmPackage.STATE__DO_ACTION, oldDoAction, doAction));
      }
    }
    return doAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command basicGetDoAction()
  {
    return doAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoAction(Command newDoAction)
  {
    Command oldDoAction = doAction;
    doAction = newDoAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StmPackage.STATE__DO_ACTION, oldDoAction, doAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command getStopAction()
  {
    if (stopAction != null && stopAction.eIsProxy())
    {
      InternalEObject oldStopAction = (InternalEObject)stopAction;
      stopAction = (Command)eResolveProxy(oldStopAction);
      if (stopAction != oldStopAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StmPackage.STATE__STOP_ACTION, oldStopAction, stopAction));
      }
    }
    return stopAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command basicGetStopAction()
  {
    return stopAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStopAction(Command newStopAction)
  {
    Command oldStopAction = stopAction;
    stopAction = newStopAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StmPackage.STATE__STOP_ACTION, oldStopAction, stopAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, StmPackage.STATE__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SelfEvent> getSelfEvents()
  {
    if (selfEvents == null)
    {
      selfEvents = new EObjectContainmentEList<SelfEvent>(SelfEvent.class, this, StmPackage.STATE__SELF_EVENTS);
    }
    return selfEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, StmPackage.STATE__TRANSITIONS);
    }
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getExitActions()
  {
    if (exitActions == null)
    {
      exitActions = new EObjectResolvingEList<Command>(Command.class, this, StmPackage.STATE__EXIT_ACTIONS);
    }
    return exitActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StmPackage.STATE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case StmPackage.STATE__SELF_EVENTS:
        return ((InternalEList<?>)getSelfEvents()).basicRemove(otherEnd, msgs);
      case StmPackage.STATE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StmPackage.STATE__NAME:
        return getName();
      case StmPackage.STATE__ENTRY_ACTIONS:
        return getEntryActions();
      case StmPackage.STATE__DO_ACTION:
        if (resolve) return getDoAction();
        return basicGetDoAction();
      case StmPackage.STATE__STOP_ACTION:
        if (resolve) return getStopAction();
        return basicGetStopAction();
      case StmPackage.STATE__STATES:
        return getStates();
      case StmPackage.STATE__SELF_EVENTS:
        return getSelfEvents();
      case StmPackage.STATE__TRANSITIONS:
        return getTransitions();
      case StmPackage.STATE__EXIT_ACTIONS:
        return getExitActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StmPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case StmPackage.STATE__ENTRY_ACTIONS:
        getEntryActions().clear();
        getEntryActions().addAll((Collection<? extends Command>)newValue);
        return;
      case StmPackage.STATE__DO_ACTION:
        setDoAction((Command)newValue);
        return;
      case StmPackage.STATE__STOP_ACTION:
        setStopAction((Command)newValue);
        return;
      case StmPackage.STATE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
      case StmPackage.STATE__SELF_EVENTS:
        getSelfEvents().clear();
        getSelfEvents().addAll((Collection<? extends SelfEvent>)newValue);
        return;
      case StmPackage.STATE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case StmPackage.STATE__EXIT_ACTIONS:
        getExitActions().clear();
        getExitActions().addAll((Collection<? extends Command>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StmPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StmPackage.STATE__ENTRY_ACTIONS:
        getEntryActions().clear();
        return;
      case StmPackage.STATE__DO_ACTION:
        setDoAction((Command)null);
        return;
      case StmPackage.STATE__STOP_ACTION:
        setStopAction((Command)null);
        return;
      case StmPackage.STATE__STATES:
        getStates().clear();
        return;
      case StmPackage.STATE__SELF_EVENTS:
        getSelfEvents().clear();
        return;
      case StmPackage.STATE__TRANSITIONS:
        getTransitions().clear();
        return;
      case StmPackage.STATE__EXIT_ACTIONS:
        getExitActions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StmPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StmPackage.STATE__ENTRY_ACTIONS:
        return entryActions != null && !entryActions.isEmpty();
      case StmPackage.STATE__DO_ACTION:
        return doAction != null;
      case StmPackage.STATE__STOP_ACTION:
        return stopAction != null;
      case StmPackage.STATE__STATES:
        return states != null && !states.isEmpty();
      case StmPackage.STATE__SELF_EVENTS:
        return selfEvents != null && !selfEvents.isEmpty();
      case StmPackage.STATE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case StmPackage.STATE__EXIT_ACTIONS:
        return exitActions != null && !exitActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StateImpl
