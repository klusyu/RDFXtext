/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.rDFTurtle.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDFTurtle.PrefixID;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.PrefixIDImpl#getPrefixName <em>Prefix Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.PrefixIDImpl#getIriref <em>Iriref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrefixIDImpl extends MinimalEObjectImpl.Container implements PrefixID
{
  /**
   * The default value of the '{@link #getPrefixName() <em>Prefix Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixName()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefixName() <em>Prefix Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixName()
   * @generated
   * @ordered
   */
  protected String prefixName = PREFIX_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIriref() <em>Iriref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIriref()
   * @generated
   * @ordered
   */
  protected static final String IRIREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIriref() <em>Iriref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIriref()
   * @generated
   * @ordered
   */
  protected String iriref = IRIREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixIDImpl()
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
    return RDFTurtlePackage.Literals.PREFIX_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPrefixName()
  {
    return prefixName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrefixName(String newPrefixName)
  {
    String oldPrefixName = prefixName;
    prefixName = newPrefixName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.PREFIX_ID__PREFIX_NAME, oldPrefixName, prefixName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIriref()
  {
    return iriref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIriref(String newIriref)
  {
    String oldIriref = iriref;
    iriref = newIriref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.PREFIX_ID__IRIREF, oldIriref, iriref));
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
      case RDFTurtlePackage.PREFIX_ID__PREFIX_NAME:
        return getPrefixName();
      case RDFTurtlePackage.PREFIX_ID__IRIREF:
        return getIriref();
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
      case RDFTurtlePackage.PREFIX_ID__PREFIX_NAME:
        setPrefixName((String)newValue);
        return;
      case RDFTurtlePackage.PREFIX_ID__IRIREF:
        setIriref((String)newValue);
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
      case RDFTurtlePackage.PREFIX_ID__PREFIX_NAME:
        setPrefixName(PREFIX_NAME_EDEFAULT);
        return;
      case RDFTurtlePackage.PREFIX_ID__IRIREF:
        setIriref(IRIREF_EDEFAULT);
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
      case RDFTurtlePackage.PREFIX_ID__PREFIX_NAME:
        return PREFIX_NAME_EDEFAULT == null ? prefixName != null : !PREFIX_NAME_EDEFAULT.equals(prefixName);
      case RDFTurtlePackage.PREFIX_ID__IRIREF:
        return IRIREF_EDEFAULT == null ? iriref != null : !IRIREF_EDEFAULT.equals(iriref);
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
    result.append(" (prefixName: ");
    result.append(prefixName);
    result.append(", iriref: ");
    result.append(iriref);
    result.append(')');
    return result.toString();
  }

} //PrefixIDImpl
