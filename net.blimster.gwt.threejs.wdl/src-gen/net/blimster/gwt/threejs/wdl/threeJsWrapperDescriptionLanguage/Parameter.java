/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Parameter
