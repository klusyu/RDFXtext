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

import org.xtext.example.mydsl.rDFTurtle.Blank;
import org.xtext.example.mydsl.rDFTurtle.Collection;
import org.xtext.example.mydsl.rDFTurtle.NodeID;
import org.xtext.example.mydsl.rDFTurtle.PredicateObjectList;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.BlankImpl#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.BlankImpl#isIsSquare <em>Is Square</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.BlankImpl#getPredicateObjectList <em>Predicate Object List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.BlankImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlankImpl extends MinimalEObjectImpl.Container implements Blank
{
  /**
   * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeID()
   * @generated
   * @ordered
   */
  protected NodeID nodeID;

  /**
   * The default value of the '{@link #isIsSquare() <em>Is Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSquare()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SQUARE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSquare() <em>Is Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSquare()
   * @generated
   * @ordered
   */
  protected boolean isSquare = IS_SQUARE_EDEFAULT;

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
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected Collection collection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlankImpl()
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
    return RDFTurtlePackage.Literals.BLANK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeID getNodeID()
  {
    return nodeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeID(NodeID newNodeID, NotificationChain msgs)
  {
    NodeID oldNodeID = nodeID;
    nodeID = newNodeID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__NODE_ID, oldNodeID, newNodeID);
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
  public void setNodeID(NodeID newNodeID)
  {
    if (newNodeID != nodeID)
    {
      NotificationChain msgs = null;
      if (nodeID != null)
        msgs = ((InternalEObject)nodeID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.BLANK__NODE_ID, null, msgs);
      if (newNodeID != null)
        msgs = ((InternalEObject)newNodeID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.BLANK__NODE_ID, null, msgs);
      msgs = basicSetNodeID(newNodeID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__NODE_ID, newNodeID, newNodeID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsSquare()
  {
    return isSquare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsSquare(boolean newIsSquare)
  {
    boolean oldIsSquare = isSquare;
    isSquare = newIsSquare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__IS_SQUARE, oldIsSquare, isSquare));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST, oldPredicateObjectList, newPredicateObjectList);
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
        msgs = ((InternalEObject)predicateObjectList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST, null, msgs);
      if (newPredicateObjectList != null)
        msgs = ((InternalEObject)newPredicateObjectList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST, null, msgs);
      msgs = basicSetPredicateObjectList(newPredicateObjectList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST, newPredicateObjectList, newPredicateObjectList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollection(Collection newCollection, NotificationChain msgs)
  {
    Collection oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__COLLECTION, oldCollection, newCollection);
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
  public void setCollection(Collection newCollection)
  {
    if (newCollection != collection)
    {
      NotificationChain msgs = null;
      if (collection != null)
        msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.BLANK__COLLECTION, null, msgs);
      if (newCollection != null)
        msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.BLANK__COLLECTION, null, msgs);
      msgs = basicSetCollection(newCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.BLANK__COLLECTION, newCollection, newCollection));
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
      case RDFTurtlePackage.BLANK__NODE_ID:
        return basicSetNodeID(null, msgs);
      case RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST:
        return basicSetPredicateObjectList(null, msgs);
      case RDFTurtlePackage.BLANK__COLLECTION:
        return basicSetCollection(null, msgs);
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
      case RDFTurtlePackage.BLANK__NODE_ID:
        return getNodeID();
      case RDFTurtlePackage.BLANK__IS_SQUARE:
        return isIsSquare();
      case RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST:
        return getPredicateObjectList();
      case RDFTurtlePackage.BLANK__COLLECTION:
        return getCollection();
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
      case RDFTurtlePackage.BLANK__NODE_ID:
        setNodeID((NodeID)newValue);
        return;
      case RDFTurtlePackage.BLANK__IS_SQUARE:
        setIsSquare((Boolean)newValue);
        return;
      case RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST:
        setPredicateObjectList((PredicateObjectList)newValue);
        return;
      case RDFTurtlePackage.BLANK__COLLECTION:
        setCollection((Collection)newValue);
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
      case RDFTurtlePackage.BLANK__NODE_ID:
        setNodeID((NodeID)null);
        return;
      case RDFTurtlePackage.BLANK__IS_SQUARE:
        setIsSquare(IS_SQUARE_EDEFAULT);
        return;
      case RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST:
        setPredicateObjectList((PredicateObjectList)null);
        return;
      case RDFTurtlePackage.BLANK__COLLECTION:
        setCollection((Collection)null);
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
      case RDFTurtlePackage.BLANK__NODE_ID:
        return nodeID != null;
      case RDFTurtlePackage.BLANK__IS_SQUARE:
        return isSquare != IS_SQUARE_EDEFAULT;
      case RDFTurtlePackage.BLANK__PREDICATE_OBJECT_LIST:
        return predicateObjectList != null;
      case RDFTurtlePackage.BLANK__COLLECTION:
        return collection != null;
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
    result.append(" (isSquare: ");
    result.append(isSquare);
    result.append(')');
    return result.toString();
  }

} //BlankImpl
