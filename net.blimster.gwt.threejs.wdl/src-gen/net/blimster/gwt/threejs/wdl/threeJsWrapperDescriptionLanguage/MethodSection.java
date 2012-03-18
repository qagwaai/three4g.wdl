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
 * A representation of the model object '<em><b>Method Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getMethodSection()
 * @model
 * @generated
 */
public interface MethodSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getMethodSection_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // MethodSection
