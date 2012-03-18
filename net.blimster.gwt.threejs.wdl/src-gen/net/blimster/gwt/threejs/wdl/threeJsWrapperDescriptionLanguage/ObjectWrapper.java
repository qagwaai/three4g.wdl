/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getName <em>Name</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPck <em>Pck</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getConstructorSection <em>Constructor Section</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPropertySection <em>Property Section</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getMethodSection <em>Method Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper()
 * @model
 * @generated
 */
public interface ObjectWrapper extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Supertype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supertype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supertype</em>' reference.
   * @see #setSupertype(ObjectWrapper)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_Supertype()
   * @model
   * @generated
   */
  ObjectWrapper getSupertype();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getSupertype <em>Supertype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supertype</em>' reference.
   * @see #getSupertype()
   * @generated
   */
  void setSupertype(ObjectWrapper value);

  /**
   * Returns the value of the '<em><b>Pck</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pck</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pck</em>' attribute.
   * @see #setPck(String)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_Pck()
   * @model
   * @generated
   */
  String getPck();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPck <em>Pck</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pck</em>' attribute.
   * @see #getPck()
   * @generated
   */
  void setPck(String value);

  /**
   * Returns the value of the '<em><b>Constructor Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor Section</em>' containment reference.
   * @see #setConstructorSection(ConstructorSection)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_ConstructorSection()
   * @model containment="true"
   * @generated
   */
  ConstructorSection getConstructorSection();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getConstructorSection <em>Constructor Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor Section</em>' containment reference.
   * @see #getConstructorSection()
   * @generated
   */
  void setConstructorSection(ConstructorSection value);

  /**
   * Returns the value of the '<em><b>Property Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Section</em>' containment reference.
   * @see #setPropertySection(PropertySection)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_PropertySection()
   * @model containment="true"
   * @generated
   */
  PropertySection getPropertySection();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPropertySection <em>Property Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Section</em>' containment reference.
   * @see #getPropertySection()
   * @generated
   */
  void setPropertySection(PropertySection value);

  /**
   * Returns the value of the '<em><b>Method Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Section</em>' containment reference.
   * @see #setMethodSection(MethodSection)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getObjectWrapper_MethodSection()
   * @model containment="true"
   * @generated
   */
  MethodSection getMethodSection();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getMethodSection <em>Method Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Section</em>' containment reference.
   * @see #getMethodSection()
   * @generated
   */
  void setMethodSection(MethodSection value);

} // ObjectWrapper
