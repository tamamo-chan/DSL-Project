/**
 * generated by Xtext 2.24.0
 */
package sdu.mmmi.tamamo.decisionTree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conclusion Nested</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mmmi.tamamo.decisionTree.ConclusionNested#getParent <em>Parent</em>}</li>
 *   <li>{@link sdu.mmmi.tamamo.decisionTree.ConclusionNested#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @see sdu.mmmi.tamamo.decisionTree.DecisionTreePackage#getConclusionNested()
 * @model
 * @generated
 */
public interface ConclusionNested extends Conclusion
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' attribute.
   * @see #setParent(String)
   * @see sdu.mmmi.tamamo.decisionTree.DecisionTreePackage#getConclusionNested_Parent()
   * @model
   * @generated
   */
  String getParent();

  /**
   * Sets the value of the '{@link sdu.mmmi.tamamo.decisionTree.ConclusionNested#getParent <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' attribute.
   * @see #getParent()
   * @generated
   */
  void setParent(String value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' containment reference.
   * @see #setNested(Conclusion)
   * @see sdu.mmmi.tamamo.decisionTree.DecisionTreePackage#getConclusionNested_Nested()
   * @model containment="true"
   * @generated
   */
  Conclusion getNested();

  /**
   * Sets the value of the '{@link sdu.mmmi.tamamo.decisionTree.ConclusionNested#getNested <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' containment reference.
   * @see #getNested()
   * @generated
   */
  void setNested(Conclusion value);

} // ConclusionNested