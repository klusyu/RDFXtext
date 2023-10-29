/**
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.rDFTurtle.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;
import org.xtext.example.mydsl.rDFTurtle.SparqlBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sparql Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.SparqlBaseImpl#getIriref <em>Iriref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparqlBaseImpl extends MinimalEObjectImpl.Container implements SparqlBase
{
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
  protected SparqlBaseImpl()
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
    return RDFTurtlePackage.Literals.SPARQL_BASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.SPARQL_BASE__IRIREF, oldIriref, iriref));
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
      case RDFTurtlePackage.SPARQL_BASE__IRIREF:
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
      case RDFTurtlePackage.SPARQL_BASE__IRIREF:
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
      case RDFTurtlePackage.SPARQL_BASE__IRIREF:
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
      case RDFTurtlePackage.SPARQL_BASE__IRIREF:
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
    result.append(" (iriref: ");
    result.append(iriref);
    result.append(')');
    return result.toString();
  }

} //SparqlBaseImpl
