/**
 * generated by Xtext 2.24.0
 */
package sdu.mmmi.tamamo.decisionTree.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sdu.mmmi.tamamo.decisionTree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sdu.mmmi.tamamo.decisionTree.DecisionTreePackage
 * @generated
 */
public class DecisionTreeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DecisionTreePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTreeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DecisionTreePackage.eINSTANCE;
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
  protected DecisionTreeSwitch<Adapter> modelSwitch =
    new DecisionTreeSwitch<Adapter>()
    {
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseDecision(Decision object)
      {
        return createDecisionAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseInputInt(InputInt object)
      {
        return createInputIntAdapter();
      }
      @Override
      public Adapter caseInputString(InputString object)
      {
        return createInputStringAdapter();
      }
      @Override
      public Adapter caseInputBool(InputBool object)
      {
        return createInputBoolAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseRules(Rules object)
      {
        return createRulesAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseConclusion(Conclusion object)
      {
        return createConclusionAdapter();
      }
      @Override
      public Adapter caseConclusionNested(ConclusionNested object)
      {
        return createConclusionNestedAdapter();
      }
      @Override
      public Adapter caseGreaterThan(GreaterThan object)
      {
        return createGreaterThanAdapter();
      }
      @Override
      public Adapter caseLessThan(LessThan object)
      {
        return createLessThanAdapter();
      }
      @Override
      public Adapter caseGreaterEqual(GreaterEqual object)
      {
        return createGreaterEqualAdapter();
      }
      @Override
      public Adapter caseLessEqual(LessEqual object)
      {
        return createLessEqualAdapter();
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
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Decision
   * @generated
   */
  public Adapter createDecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.InputInt <em>Input Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.InputInt
   * @generated
   */
  public Adapter createInputIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.InputString <em>Input String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.InputString
   * @generated
   */
  public Adapter createInputStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.InputBool <em>Input Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.InputBool
   * @generated
   */
  public Adapter createInputBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Rules
   * @generated
   */
  public Adapter createRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.Conclusion <em>Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.Conclusion
   * @generated
   */
  public Adapter createConclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.ConclusionNested <em>Conclusion Nested</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.ConclusionNested
   * @generated
   */
  public Adapter createConclusionNestedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.GreaterThan <em>Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.GreaterThan
   * @generated
   */
  public Adapter createGreaterThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.LessThan <em>Less Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.LessThan
   * @generated
   */
  public Adapter createLessThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.GreaterEqual <em>Greater Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.GreaterEqual
   * @generated
   */
  public Adapter createGreaterEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdu.mmmi.tamamo.decisionTree.LessEqual <em>Less Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdu.mmmi.tamamo.decisionTree.LessEqual
   * @generated
   */
  public Adapter createLessEqualAdapter()
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

} //DecisionTreeAdapterFactory