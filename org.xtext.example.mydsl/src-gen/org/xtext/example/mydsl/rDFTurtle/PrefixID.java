/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.PrefixID#getPrefixName <em>Prefix Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.PrefixID#getIriref <em>Iriref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getPrefixID()
 * @model
 * @generated
 */
public interface PrefixID extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefix Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Name</em>' attribute.
   * @see #setPrefixName(String)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getPrefixID_PrefixName()
   * @model
   * @generated
   */
  String getPrefixName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.PrefixID#getPrefixName <em>Prefix Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix Name</em>' attribute.
   * @see #getPrefixName()
   * @generated
   */
  void setPrefixName(String value);

  /**
   * Returns the value of the '<em><b>Iriref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iriref</em>' attribute.
   * @see #setIriref(String)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getPrefixID_Iriref()
   * @model
   * @generated
   */
  String getIriref();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.PrefixID#getIriref <em>Iriref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iriref</em>' attribute.
   * @see #getIriref()
   * @generated
   */
  void setIriref(String value);

} // PrefixID
