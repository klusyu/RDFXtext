/**
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Collection#getItemList <em>Item List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject
{
  /**
   * Returns the value of the '<em><b>Item List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item List</em>' containment reference.
   * @see #setItemList(ItemList)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getCollection_ItemList()
   * @model containment="true"
   * @generated
   */
  ItemList getItemList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Collection#getItemList <em>Item List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item List</em>' containment reference.
   * @see #getItemList()
   * @generated
   */
  void setItemList(ItemList value);

} // Collection
