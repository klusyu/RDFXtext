/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.rDFTurtle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.rDFTurtle.PredicateObject;
import org.xtext.example.mydsl.rDFTurtle.PredicateObjectList;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Object List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.PredicateObjectListImpl#getPredicateObjects <em>Predicate Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateObjectListImpl extends MinimalEObjectImpl.Container implements PredicateObjectList
{
  /**
   * The cached value of the '{@link #getPredicateObjects() <em>Predicate Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicateObjects()
   * @generated
   * @ordered
   */
  protected EList<PredicateObject> predicateObjects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateObjectListImpl()
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
    return RDFTurtlePackage.Literals.PREDICATE_OBJECT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PredicateObject> getPredicateObjects()
  {
    if (predicateObjects == null)
    {
      predicateObjects = new EObjectContainmentEList<PredicateObject>(PredicateObject.class, this, RDFTurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE_OBJECTS);
    }
    return predicateObjects;
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
      case RDFTurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE_OBJECTS:
        return ((InternalEList<?>)getPredicateObjects()).basicRemove(otherEnd, msgs);
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
      case RDFTurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE_OBJECTS:
        return getPredicateObjects();
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
      case RDFTurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE_OBJECTS:
        getPredicateObjects().clear();
        getPredicateObjects().addAll((Collection<? extends PredicateObject>)newValue);
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
      case RDFTurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE_OBJECTS:
        getPredicateObjects().clear();
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
      case RDFTurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE_OBJECTS:
        return predicateObjects != null && !predicateObjects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PredicateObjectListImpl
