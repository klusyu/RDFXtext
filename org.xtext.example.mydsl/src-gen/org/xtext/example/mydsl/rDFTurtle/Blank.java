/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Blank#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Blank#isIsSquare <em>Is Square</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Blank#getPredicateObjectList <em>Predicate Object List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Blank#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getBlank()
 * @model
 * @generated
 */
public interface Blank extends EObject
{
  /**
   * Returns the value of the '<em><b>Node ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node ID</em>' containment reference.
   * @see #setNodeID(NodeID)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getBlank_NodeID()
   * @model containment="true"
   * @generated
   */
  NodeID getNodeID();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Blank#getNodeID <em>Node ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node ID</em>' containment reference.
   * @see #getNodeID()
   * @generated
   */
  void setNodeID(NodeID value);

  /**
   * Returns the value of the '<em><b>Is Square</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Square</em>' attribute.
   * @see #setIsSquare(boolean)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getBlank_IsSquare()
   * @model
   * @generated
   */
  boolean isIsSquare();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Blank#isIsSquare <em>Is Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Square</em>' attribute.
   * @see #isIsSquare()
   * @generated
   */
  void setIsSquare(boolean value);

  /**
   * Returns the value of the '<em><b>Predicate Object List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate Object List</em>' containment reference.
   * @see #setPredicateObjectList(PredicateObjectList)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getBlank_PredicateObjectList()
   * @model containment="true"
   * @generated
   */
  PredicateObjectList getPredicateObjectList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Blank#getPredicateObjectList <em>Predicate Object List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate Object List</em>' containment reference.
   * @see #getPredicateObjectList()
   * @generated
   */
  void setPredicateObjectList(PredicateObjectList value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' containment reference.
   * @see #setCollection(Collection)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getBlank_Collection()
   * @model containment="true"
   * @generated
   */
  Collection getCollection();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Blank#getCollection <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' containment reference.
   * @see #getCollection()
   * @generated
   */
  void setCollection(Collection value);

} // Blank
