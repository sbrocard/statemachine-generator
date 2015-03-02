/**
 */
package net.sb.statemachine.dsl.stm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sb.statemachine.dsl.stm.GuardCall#getGuard <em>Guard</em>}</li>
 *   <li>{@link net.sb.statemachine.dsl.stm.GuardCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sb.statemachine.dsl.stm.StmPackage#getGuardCall()
 * @model
 * @generated
 */
public interface GuardCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' reference.
   * @see #setGuard(Guard)
   * @see net.sb.statemachine.dsl.stm.StmPackage#getGuardCall_Guard()
   * @model
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link net.sb.statemachine.dsl.stm.GuardCall#getGuard <em>Guard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see net.sb.statemachine.dsl.stm.StmPackage#getGuardCall_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

} // GuardCall
