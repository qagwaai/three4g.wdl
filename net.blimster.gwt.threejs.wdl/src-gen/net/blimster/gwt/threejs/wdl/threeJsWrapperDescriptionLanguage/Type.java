/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getWrapper <em>Wrapper</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getArrayType <em>Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' attribute.
   * The literals are from the enumeration {@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' attribute.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype
   * @see #setDatatype(Datatype)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getType_Datatype()
   * @model
   * @generated
   */
  Datatype getDatatype();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getDatatype <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' attribute.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(Datatype value);

  /**
   * Returns the value of the '<em><b>Wrapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrapper</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wrapper</em>' reference.
   * @see #setWrapper(ObjectWrapper)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getType_Wrapper()
   * @model
   * @generated
   */
  ObjectWrapper getWrapper();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getWrapper <em>Wrapper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wrapper</em>' reference.
   * @see #getWrapper()
   * @generated
   */
  void setWrapper(ObjectWrapper value);

  /**
   * Returns the value of the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Type</em>' containment reference.
   * @see #setArrayType(ArrayType)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getType_ArrayType()
   * @model containment="true"
   * @generated
   */
  ArrayType getArrayType();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getArrayType <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Type</em>' containment reference.
   * @see #getArrayType()
   * @generated
   */
  void setArrayType(ArrayType value);

} // Type
