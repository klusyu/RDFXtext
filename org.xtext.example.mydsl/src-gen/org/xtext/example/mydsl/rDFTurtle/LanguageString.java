/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.rDFTurtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.LanguageString#getQutoedString <em>Qutoed String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDFTurtle.LanguageString#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getLanguageString()
 * @model
 * @generated
 */
public interface LanguageString extends EObject
{
  /**
   * Returns the value of the '<em><b>Qutoed String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qutoed String</em>' attribute.
   * @see #setQutoedString(String)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getLanguageString_QutoedString()
   * @model
   * @generated
   */
  String getQutoedString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.LanguageString#getQutoedString <em>Qutoed String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qutoed String</em>' attribute.
   * @see #getQutoedString()
   * @generated
   */
  void setQutoedString(String value);

  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage#getLanguageString_Lang()
   * @model
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDFTurtle.LanguageString#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

} // LanguageString
