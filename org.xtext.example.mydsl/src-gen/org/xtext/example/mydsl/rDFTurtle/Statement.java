/**
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Statement#getDirective <em>Directive</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.Statement#getTriples <em>Triples</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Directive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive</em>' containment reference.
   * @see #setDirective(Directive)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getStatement_Directive()
   * @model containment="true"
   * @generated
   */
  Directive getDirective();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Statement#getDirective <em>Directive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directive</em>' containment reference.
   * @see #getDirective()
   * @generated
   */
  void setDirective(Directive value);

  /**
   * Returns the value of the '<em><b>Triples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triples</em>' containment reference.
   * @see #setTriples(Triples)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getStatement_Triples()
   * @model containment="true"
   * @generated
   */
  Triples getTriples();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.Statement#getTriples <em>Triples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triples</em>' containment reference.
   * @see #getTriples()
   * @generated
   */
  void setTriples(Triples value);

} // Statement