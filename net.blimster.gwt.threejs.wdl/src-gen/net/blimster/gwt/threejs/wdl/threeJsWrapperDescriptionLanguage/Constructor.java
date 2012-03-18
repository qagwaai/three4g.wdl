/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getName <em>Name</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#isJson <em>Json</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends EObject
{
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
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructor_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Json</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Json</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json</em>' attribute.
   * @see #setJson(boolean)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructor_Json()
   * @model
   * @generated
   */
  boolean isJson();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#isJson <em>Json</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json</em>' attribute.
   * @see #isJson()
   * @generated
   */
  void setJson(boolean value);

} // Constructor
