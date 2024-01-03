/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.rDFTurtle.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.rDFTurtle.Base;
import org.xtext.example.mydsl.rDFTurtle.Blank;
import org.xtext.example.mydsl.rDFTurtle.Collection;
import org.xtext.example.mydsl.rDFTurtle.DatatypeString;
import org.xtext.example.mydsl.rDFTurtle.Directive;
import org.xtext.example.mydsl.rDFTurtle.ItemList;
import org.xtext.example.mydsl.rDFTurtle.LanguageString;
import org.xtext.example.mydsl.rDFTurtle.Literal;
import org.xtext.example.mydsl.rDFTurtle.NodeID;
import org.xtext.example.mydsl.rDFTurtle.ObjectList;
import org.xtext.example.mydsl.rDFTurtle.PredicateObject;
import org.xtext.example.mydsl.rDFTurtle.PredicateObjectList;
import org.xtext.example.mydsl.rDFTurtle.PrefixID;
import org.xtext.example.mydsl.rDFTurtle.Qname;
import org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage;
import org.xtext.example.mydsl.rDFTurtle.SparqlBase;
import org.xtext.example.mydsl.rDFTurtle.SparqlPrefix;
import org.xtext.example.mydsl.rDFTurtle.Statement;
import org.xtext.example.mydsl.rDFTurtle.Subject;
import org.xtext.example.mydsl.rDFTurtle.Triples;
import org.xtext.example.mydsl.rDFTurtle.TurtleDoc;
import org.xtext.example.mydsl.rDFTurtle.Verb;
import org.xtext.example.mydsl.rDFTurtle.iResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage
 * @generated
 */
public class RDFTurtleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RDFTurtlePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDFTurtleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RDFTurtlePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RDFTurtlePackage.TURTLE_DOC:
      {
        TurtleDoc turtleDoc = (TurtleDoc)theEObject;
        T result = caseTurtleDoc(turtleDoc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.DIRECTIVE:
      {
        Directive directive = (Directive)theEObject;
        T result = caseDirective(directive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.PREFIX_ID:
      {
        PrefixID prefixID = (PrefixID)theEObject;
        T result = casePrefixID(prefixID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.BASE:
      {
        Base base = (Base)theEObject;
        T result = caseBase(base);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.SPARQL_PREFIX:
      {
        SparqlPrefix sparqlPrefix = (SparqlPrefix)theEObject;
        T result = caseSparqlPrefix(sparqlPrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.SPARQL_BASE:
      {
        SparqlBase sparqlBase = (SparqlBase)theEObject;
        T result = caseSparqlBase(sparqlBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.TRIPLES:
      {
        Triples triples = (Triples)theEObject;
        T result = caseTriples(triples);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.PREDICATE_OBJECT:
      {
        PredicateObject predicateObject = (PredicateObject)theEObject;
        T result = casePredicateObject(predicateObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.PREDICATE_OBJECT_LIST:
      {
        PredicateObjectList predicateObjectList = (PredicateObjectList)theEObject;
        T result = casePredicateObjectList(predicateObjectList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.OBJECT_LIST:
      {
        ObjectList objectList = (ObjectList)theEObject;
        T result = caseObjectList(objectList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.VERB:
      {
        Verb verb = (Verb)theEObject;
        T result = caseVerb(verb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.SUBJECT:
      {
        Subject subject = (Subject)theEObject;
        T result = caseSubject(subject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.IRESOURCE:
      {
        iResource iResource = (iResource)theEObject;
        T result = caseiResource(iResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.OBJECT:
      {
        org.xtext.example.mydsl.rDFTurtle.Object object = (org.xtext.example.mydsl.rDFTurtle.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.LANGUAGE_STRING:
      {
        LanguageString languageString = (LanguageString)theEObject;
        T result = caseLanguageString(languageString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.DATATYPE_STRING:
      {
        DatatypeString datatypeString = (DatatypeString)theEObject;
        T result = caseDatatypeString(datatypeString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.BLANK:
      {
        Blank blank = (Blank)theEObject;
        T result = caseBlank(blank);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.ITEM_LIST:
      {
        ItemList itemList = (ItemList)theEObject;
        T result = caseItemList(itemList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.COLLECTION:
      {
        Collection collection = (Collection)theEObject;
        T result = caseCollection(collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.NODE_ID:
      {
        NodeID nodeID = (NodeID)theEObject;
        T result = caseNodeID(nodeID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RDFTurtlePackage.QNAME:
      {
        Qname qname = (Qname)theEObject;
        T result = caseQname(qname);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Turtle Doc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Turtle Doc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTurtleDoc(TurtleDoc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirective(Directive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixID(PrefixID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBase(Base object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sparql Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sparql Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSparqlPrefix(SparqlPrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sparql Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sparql Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSparqlBase(SparqlBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triples</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triples</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriples(Triples object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateObject(PredicateObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Object List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Object List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateObjectList(PredicateObjectList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectList(ObjectList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verb</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verb</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerb(Verb object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubject(Subject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iResource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iResource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiResource(iResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.xtext.example.mydsl.rDFTurtle.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageString(LanguageString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypeString(DatatypeString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blank</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blank</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlank(Blank object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemList(ItemList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollection(Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeID(NodeID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qname</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qname</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQname(Qname object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RDFTurtleSwitch
