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

import org.xtext.example.mydsl.rDFTurtle.ObjectList;
import org.xtext.example.mydsl.rDFTurtle.PredicateObject;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;
import org.xtext.example.mydsl.rDFTurtle.Verb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.PredicateObjectImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.PredicateObjectImpl#getObjectList <em>Object List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateObjectImpl extends MinimalEObjectImpl.Container implements PredicateObject
{
  /**
   * The cached value of the '{@link #getVerb() <em>Verb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected Verb verb;

  /**
   * The cached value of the '{@link #getObjectList() <em>Object List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectList()
   * @generated
   * @ordered
   */
  protected ObjectList objectList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateObjectImpl()
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
    return RDFTurtlePackage.Literals.PREDICATE_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Verb getVerb()
  {
    return verb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerb(Verb newVerb, NotificationChain msgs)
  {
    Verb oldVerb = verb;
    verb = newVerb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.PREDICATE_OBJECT__VERB, oldVerb, newVerb);
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
  public void setVerb(Verb newVerb)
  {
    if (newVerb != verb)
    {
      NotificationChain msgs = null;
      if (verb != null)
        msgs = ((InternalEObject)verb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.PREDICATE_OBJECT__VERB, null, msgs);
      if (newVerb != null)
        msgs = ((InternalEObject)newVerb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.PREDICATE_OBJECT__VERB, null, msgs);
      msgs = basicSetVerb(newVerb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.PREDICATE_OBJECT__VERB, newVerb, newVerb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectList getObjectList()
  {
    return objectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectList(ObjectList newObjectList, NotificationChain msgs)
  {
    ObjectList oldObjectList = objectList;
    objectList = newObjectList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST, oldObjectList, newObjectList);
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
  public void setObjectList(ObjectList newObjectList)
  {
    if (newObjectList != objectList)
    {
      NotificationChain msgs = null;
      if (objectList != null)
        msgs = ((InternalEObject)objectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST, null, msgs);
      if (newObjectList != null)
        msgs = ((InternalEObject)newObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST, null, msgs);
      msgs = basicSetObjectList(newObjectList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST, newObjectList, newObjectList));
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
      case RDFTurtlePackage.PREDICATE_OBJECT__VERB:
        return basicSetVerb(null, msgs);
      case RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST:
        return basicSetObjectList(null, msgs);
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
      case RDFTurtlePackage.PREDICATE_OBJECT__VERB:
        return getVerb();
      case RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST:
        return getObjectList();
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
      case RDFTurtlePackage.PREDICATE_OBJECT__VERB:
        setVerb((Verb)newValue);
        return;
      case RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST:
        setObjectList((ObjectList)newValue);
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
      case RDFTurtlePackage.PREDICATE_OBJECT__VERB:
        setVerb((Verb)null);
        return;
      case RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST:
        setObjectList((ObjectList)null);
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
      case RDFTurtlePackage.PREDICATE_OBJECT__VERB:
        return verb != null;
      case RDFTurtlePackage.PREDICATE_OBJECT__OBJECT_LIST:
        return objectList != null;
    }
    return super.eIsSet(featureID);
  }

} //PredicateObjectImpl
