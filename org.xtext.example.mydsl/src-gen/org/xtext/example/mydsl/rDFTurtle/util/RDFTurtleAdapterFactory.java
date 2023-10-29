/**
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.rDFTurtle.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDFTurtle.RDFTurtlePackage
 * @generated
 */
public class RDFTurtleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RDFTurtlePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDFTurtleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RDFTurtlePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RDFTurtleSwitch<Adapter> modelSwitch =
    new RDFTurtleSwitch<Adapter>()
    {
      @Override
      public Adapter caseTurtleDoc(TurtleDoc object)
      {
        return createTurtleDocAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDirective(Directive object)
      {
        return createDirectiveAdapter();
      }
      @Override
      public Adapter casePrefixID(PrefixID object)
      {
        return createPrefixIDAdapter();
      }
      @Override
      public Adapter caseBase(Base object)
      {
        return createBaseAdapter();
      }
      @Override
      public Adapter caseSparqlPrefix(SparqlPrefix object)
      {
        return createSparqlPrefixAdapter();
      }
      @Override
      public Adapter caseSparqlBase(SparqlBase object)
      {
        return createSparqlBaseAdapter();
      }
      @Override
      public Adapter caseTriples(Triples object)
      {
        return createTriplesAdapter();
      }
      @Override
      public Adapter casePredicateObject(PredicateObject object)
      {
        return createPredicateObjectAdapter();
      }
      @Override
      public Adapter casePredicateObjectList(PredicateObjectList object)
      {
        return createPredicateObjectListAdapter();
      }
      @Override
      public Adapter caseObjectList(ObjectList object)
      {
        return createObjectListAdapter();
      }
      @Override
      public Adapter caseVerb(Verb object)
      {
        return createVerbAdapter();
      }
      @Override
      public Adapter caseSubject(Subject object)
      {
        return createSubjectAdapter();
      }
      @Override
      public Adapter caseiResource(iResource object)
      {
        return createiResourceAdapter();
      }
      @Override
      public Adapter caseObject(org.xtext.example.mydsl.rDFTurtle.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseLanguageString(LanguageString object)
      {
        return createLanguageStringAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseDatatypeString(DatatypeString object)
      {
        return createDatatypeStringAdapter();
      }
      @Override
      public Adapter caseBlank(Blank object)
      {
        return createBlankAdapter();
      }
      @Override
      public Adapter caseItemList(ItemList object)
      {
        return createItemListAdapter();
      }
      @Override
      public Adapter caseCollection(Collection object)
      {
        return createCollectionAdapter();
      }
      @Override
      public Adapter caseNodeID(NodeID object)
      {
        return createNodeIDAdapter();
      }
      @Override
      public Adapter caseQname(Qname object)
      {
        return createQnameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.TurtleDoc <em>Turtle Doc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.TurtleDoc
   * @generated
   */
  public Adapter createTurtleDocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Directive
   * @generated
   */
  public Adapter createDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.PrefixID <em>Prefix ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.PrefixID
   * @generated
   */
  public Adapter createPrefixIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Base <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Base
   * @generated
   */
  public Adapter createBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.SparqlPrefix <em>Sparql Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.SparqlPrefix
   * @generated
   */
  public Adapter createSparqlPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.SparqlBase <em>Sparql Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.SparqlBase
   * @generated
   */
  public Adapter createSparqlBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Triples <em>Triples</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Triples
   * @generated
   */
  public Adapter createTriplesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.PredicateObject <em>Predicate Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.PredicateObject
   * @generated
   */
  public Adapter createPredicateObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.PredicateObjectList <em>Predicate Object List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.PredicateObjectList
   * @generated
   */
  public Adapter createPredicateObjectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.ObjectList <em>Object List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.ObjectList
   * @generated
   */
  public Adapter createObjectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Verb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Verb
   * @generated
   */
  public Adapter createVerbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Subject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Subject
   * @generated
   */
  public Adapter createSubjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.iResource <em>iResource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.iResource
   * @generated
   */
  public Adapter createiResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.LanguageString <em>Language String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.LanguageString
   * @generated
   */
  public Adapter createLanguageStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.DatatypeString <em>Datatype String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.DatatypeString
   * @generated
   */
  public Adapter createDatatypeStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Blank <em>Blank</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Blank
   * @generated
   */
  public Adapter createBlankAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.ItemList <em>Item List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.ItemList
   * @generated
   */
  public Adapter createItemListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Collection
   * @generated
   */
  public Adapter createCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.NodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.NodeID
   * @generated
   */
  public Adapter createNodeIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.rDFTurtle.Qname <em>Qname</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.rDFTurtle.Qname
   * @generated
   */
  public Adapter createQnameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RDFTurtleAdapterFactory