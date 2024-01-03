/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Subject#getResource <em>Resource</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Subject#getBlank <em>Blank</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(iResource)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getSubject_Resource()
   * @model containment="true"
   * @generated
   */
  iResource getResource();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Subject#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(iResource value);

  /**
   * Returns the value of the '<em><b>Blank</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blank</em>' containment reference.
   * @see #setBlank(Blank)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getSubject_Blank()
   * @model containment="true"
   * @generated
   */
  Blank getBlank();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Subject#getBlank <em>Blank</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blank</em>' containment reference.
   * @see #getBlank()
   * @generated
   */
  void setBlank(Blank value);

} // Subject
