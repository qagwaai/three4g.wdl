/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends EObject
{
  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' attribute.
   * @see #setDimensions(int)
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getArrayType_Dimensions()
   * @model
   * @generated
   */
  int getDimensions();

  /**
   * Sets the value of the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType#getDimensions <em>Dimensions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimensions</em>' attribute.
   * @see #getDimensions()
   * @generated
   */
  void setDimensions(int value);

} // ArrayType
