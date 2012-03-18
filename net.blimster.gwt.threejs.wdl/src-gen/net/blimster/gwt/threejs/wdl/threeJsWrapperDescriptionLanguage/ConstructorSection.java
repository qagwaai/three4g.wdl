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
 * A representation of the model object '<em><b>Constructor Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getBuilderConstructor <em>Builder Constructor</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getDefaultConstructor <em>Default Constructor</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getConstructors <em>Constructors</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructorSection()
 * @model
 * @generated
 */
public interface ConstructorSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Builder Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builder Constructor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builder Constructor</em>' attribute.
   * @see #setBuilderConstructor(String)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructorSection_BuilderConstructor()
   * @model
   * @generated
   */
  String getBuilderConstructor();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getBuilderConstructor <em>Builder Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builder Constructor</em>' attribute.
   * @see #getBuilderConstructor()
   * @generated
   */
  void setBuilderConstructor(String value);

  /**
   * Returns the value of the '<em><b>Default Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Constructor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Constructor</em>' attribute.
   * @see #setDefaultConstructor(String)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructorSection_DefaultConstructor()
   * @model
   * @generated
   */
  String getDefaultConstructor();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getDefaultConstructor <em>Default Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Constructor</em>' attribute.
   * @see #getDefaultConstructor()
   * @generated
   */
  void setDefaultConstructor(String value);

  /**
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getConstructorSection_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<Constructor> getConstructors();

} // ConstructorSection
