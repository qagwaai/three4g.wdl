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
 * A representation of the model object '<em><b>Property Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getPropertySection()
 * @model
 * @generated
 */
public interface PropertySection extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getPropertySection_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // PropertySection
