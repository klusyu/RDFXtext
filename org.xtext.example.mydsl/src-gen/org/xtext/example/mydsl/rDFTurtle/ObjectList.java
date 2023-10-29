/**
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.ObjectList#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getObjectList()
 * @model
 * @generated
 */
public interface ObjectList extends EObject
{
  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDFTurtle.Object}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getObjectList_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.mydsl.rDFTurtle.Object> getObjects();

} // ObjectList
