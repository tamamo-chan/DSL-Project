/**
 * generated by Xtext 2.24.0
 */
package sdu.mmmi.tamamo.decisionTree.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sdu.mmmi.tamamo.decisionTree.Conclusion;
import sdu.mmmi.tamamo.decisionTree.ConclusionNested;
import sdu.mmmi.tamamo.decisionTree.DecisionTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conclusion Nested</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sdu.mmmi.tamamo.decisionTree.impl.ConclusionNestedImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link sdu.mmmi.tamamo.decisionTree.impl.ConclusionNestedImpl#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConclusionNestedImpl extends ConclusionImpl implements ConclusionNested
{
  /**
   * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected static final String PARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected String parent = PARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNested()
   * @generated
   * @ordered
   */
  protected Conclusion nested;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConclusionNestedImpl()
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
    return DecisionTreePackage.Literals.CONCLUSION_NESTED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParent(String newParent)
  {
    String oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecisionTreePackage.CONCLUSION_NESTED__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conclusion getNested()
  {
    return nested;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNested(Conclusion newNested, NotificationChain msgs)
  {
    Conclusion oldNested = nested;
    nested = newNested;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecisionTreePackage.CONCLUSION_NESTED__NESTED, oldNested, newNested);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNested(Conclusion newNested)
  {
    if (newNested != nested)
    {
      NotificationChain msgs = null;
      if (nested != null)
        msgs = ((InternalEObject)nested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecisionTreePackage.CONCLUSION_NESTED__NESTED, null, msgs);
      if (newNested != null)
        msgs = ((InternalEObject)newNested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecisionTreePackage.CONCLUSION_NESTED__NESTED, null, msgs);
      msgs = basicSetNested(newNested, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecisionTreePackage.CONCLUSION_NESTED__NESTED, newNested, newNested));
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
      case DecisionTreePackage.CONCLUSION_NESTED__NESTED:
        return basicSetNested(null, msgs);
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
      case DecisionTreePackage.CONCLUSION_NESTED__PARENT:
        return getParent();
      case DecisionTreePackage.CONCLUSION_NESTED__NESTED:
        return getNested();
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
      case DecisionTreePackage.CONCLUSION_NESTED__PARENT:
        setParent((String)newValue);
        return;
      case DecisionTreePackage.CONCLUSION_NESTED__NESTED:
        setNested((Conclusion)newValue);
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
      case DecisionTreePackage.CONCLUSION_NESTED__PARENT:
        setParent(PARENT_EDEFAULT);
        return;
      case DecisionTreePackage.CONCLUSION_NESTED__NESTED:
        setNested((Conclusion)null);
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
      case DecisionTreePackage.CONCLUSION_NESTED__PARENT:
        return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
      case DecisionTreePackage.CONCLUSION_NESTED__NESTED:
        return nested != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (parent: ");
    result.append(parent);
    result.append(')');
    return result.toString();
  }

} //ConclusionNestedImpl