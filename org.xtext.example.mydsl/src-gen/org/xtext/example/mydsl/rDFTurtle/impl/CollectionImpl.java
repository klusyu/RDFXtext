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

import org.xtext.example.mydsl.rDFTurtle.Collection;
import org.xtext.example.mydsl.rDFTurtle.ItemList;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.impl.CollectionImpl#getItemList <em>Item List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection
{
  /**
   * The cached value of the '{@link #getItemList() <em>Item List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemList()
   * @generated
   * @ordered
   */
  protected ItemList itemList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionImpl()
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
    return RDFTurtlePackage.Literals.COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemList getItemList()
  {
    return itemList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItemList(ItemList newItemList, NotificationChain msgs)
  {
    ItemList oldItemList = itemList;
    itemList = newItemList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.COLLECTION__ITEM_LIST, oldItemList, newItemList);
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
  public void setItemList(ItemList newItemList)
  {
    if (newItemList != itemList)
    {
      NotificationChain msgs = null;
      if (itemList != null)
        msgs = ((InternalEObject)itemList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.COLLECTION__ITEM_LIST, null, msgs);
      if (newItemList != null)
        msgs = ((InternalEObject)newItemList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDFTurtlePackage.COLLECTION__ITEM_LIST, null, msgs);
      msgs = basicSetItemList(newItemList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDFTurtlePackage.COLLECTION__ITEM_LIST, newItemList, newItemList));
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
      case RDFTurtlePackage.COLLECTION__ITEM_LIST:
        return basicSetItemList(null, msgs);
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
      case RDFTurtlePackage.COLLECTION__ITEM_LIST:
        return getItemList();
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
      case RDFTurtlePackage.COLLECTION__ITEM_LIST:
        setItemList((ItemList)newValue);
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
      case RDFTurtlePackage.COLLECTION__ITEM_LIST:
        setItemList((ItemList)null);
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
      case RDFTurtlePackage.COLLECTION__ITEM_LIST:
        return itemList != null;
    }
    return super.eIsSet(featureID);
  }

} //CollectionImpl
