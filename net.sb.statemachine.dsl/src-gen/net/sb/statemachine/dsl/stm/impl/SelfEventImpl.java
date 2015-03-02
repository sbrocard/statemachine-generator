/**
 */
package net.sb.statemachine.dsl.stm.impl;

import net.sb.statemachine.dsl.stm.Command;
import net.sb.statemachine.dsl.stm.Event;
import net.sb.statemachine.dsl.stm.GuardCall;
import net.sb.statemachine.dsl.stm.SelfEvent;
import net.sb.statemachine.dsl.stm.StmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.SelfEventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.SelfEventImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.impl.SelfEventImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfEventImpl extends MinimalEObjectImpl.Container implements SelfEvent
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected GuardCall guard;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Command action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfEventImpl()
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
    return StmPackage.Literals.SELF_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Event)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StmPackage.SELF_EVENT__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StmPackage.SELF_EVENT__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardCall getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(GuardCall newGuard, NotificationChain msgs)
  {
    GuardCall oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StmPackage.SELF_EVENT__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(GuardCall newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StmPackage.SELF_EVENT__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StmPackage.SELF_EVENT__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StmPackage.SELF_EVENT__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Command)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StmPackage.SELF_EVENT__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Command newAction)
  {
    Command oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StmPackage.SELF_EVENT__ACTION, oldAction, action));
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
      case StmPackage.SELF_EVENT__GUARD:
        return basicSetGuard(null, msgs);
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
      case StmPackage.SELF_EVENT__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
      case StmPackage.SELF_EVENT__GUARD:
        return getGuard();
      case StmPackage.SELF_EVENT__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StmPackage.SELF_EVENT__EVENT:
        setEvent((Event)newValue);
        return;
      case StmPackage.SELF_EVENT__GUARD:
        setGuard((GuardCall)newValue);
        return;
      case StmPackage.SELF_EVENT__ACTION:
        setAction((Command)newValue);
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
      case StmPackage.SELF_EVENT__EVENT:
        setEvent((Event)null);
        return;
      case StmPackage.SELF_EVENT__GUARD:
        setGuard((GuardCall)null);
        return;
      case StmPackage.SELF_EVENT__ACTION:
        setAction((Command)null);
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
      case StmPackage.SELF_EVENT__EVENT:
        return event != null;
      case StmPackage.SELF_EVENT__GUARD:
        return guard != null;
      case StmPackage.SELF_EVENT__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

} //SelfEventImpl
