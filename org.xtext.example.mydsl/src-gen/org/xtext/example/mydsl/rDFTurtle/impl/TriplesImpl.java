/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.rDFTurtle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDFTurtle.PredicateObjectList;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;
import org.xtext.example.mydsl.rDFTurtle.Subject;
import org.xtext.example.mydsl.rDFTurtle.Triples;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triples</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.TriplesImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.TriplesImpl#getPredicateObjectList <em>Predicate Object List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriplesImpl extends MinimalEObjectImpl.Container implements Triples
{
  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected Subject subject;

  /**
   * The cached value of the '{@link #getPredicateObjectList() <em>Predicate Object List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicateObjectList()
   * @generated
   * @ordered
   */
  protected PredicateObjectList predicateObjectList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriplesImpl()
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
    return RDFTurtlePackage.Literals.TRIPLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Subject getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubject(Subject newSubject, NotificationChain msgs)
  {
    Subject oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.TRIPLES__SUBJECT, oldSubject, newSubject);
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
  public void setSubject(Subject newSubject)
  {
    if (newSubject != subject)
    {
      NotificationChain msgs = null;
      if (subject != null)
        msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.TRIPLES__SUBJECT, null, msgs);
      if (newSubject != null)
        msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.TRIPLES__SUBJECT, null, msgs);
      msgs = basicSetSubject(newSubject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.TRIPLES__SUBJECT, newSubject, newSubject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PredicateObjectList getPredicateObjectList()
  {
    return predicateObjectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicateObjectList(PredicateObjectList newPredicateObjectList, NotificationChain msgs)
  {
    PredicateObjectList oldPredicateObjectList = predicateObjectList;
    predicateObjectList = newPredicateObjectList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST, oldPredicateObjectList, newPredicateObjectList);
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
  public void setPredicateObjectList(PredicateObjectList newPredicateObjectList)
  {
    if (newPredicateObjectList != predicateObjectList)
    {
      NotificationChain msgs = null;
      if (predicateObjectList != null)
        msgs = ((InternalEObject)predicateObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST, null, msgs);
      if (newPredicateObjectList != null)
        msgs = ((InternalEObject)newPredicateObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST, null, msgs);
      msgs = basicSetPredicateObjectList(newPredicateObjectList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST, newPredicateObjectList, newPredicateObjectList));
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
      case RDFTurtlePackage.TRIPLES__SUBJECT:
        return basicSetSubject(null, msgs);
      case RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST:
        return basicSetPredicateObjectList(null, msgs);
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
      case RDFTurtlePackage.TRIPLES__SUBJECT:
        return getSubject();
      case RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST:
        return getPredicateObjectList();
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
      case RDFTurtlePackage.TRIPLES__SUBJECT:
        setSubject((Subject)newValue);
        return;
      case RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST:
        setPredicateObjectList((PredicateObjectList)newValue);
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
      case RDFTurtlePackage.TRIPLES__SUBJECT:
        setSubject((Subject)null);
        return;
      case RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST:
        setPredicateObjectList((PredicateObjectList)null);
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
      case RDFTurtlePackage.TRIPLES__SUBJECT:
        return subject != null;
      case RDFTurtlePackage.TRIPLES__PREDICATE_OBJECT_LIST:
        return predicateObjectList != null;
    }
    return super.eIsSet(featureID);
  }

} //TriplesImpl
