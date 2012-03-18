/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import java.util.Collection;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ModelImpl#getWrappers <em>Wrappers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getWrappers() <em>Wrappers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrappers()
   * @generated
   * @ordered
   */
  protected EList<ObjectWrapper> wrappers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThreeJsWrapperDescriptionLanguagePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectWrapper> getWrappers()
  {
    if (wrappers == null)
    {
      wrappers = new EObjectContainmentEList<ObjectWrapper>(ObjectWrapper.class, this, ThreeJsWrapperDescriptionLanguagePackage.MODEL__WRAPPERS);
    }
    return wrappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ThreeJsWrapperDescriptionLanguagePackage.MODEL__WRAPPERS:
        return ((InternalEList<?>)getWrappers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThreeJsWrapperDescriptionLanguagePackage.MODEL__WRAPPERS:
        return getWrappers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThreeJsWrapperDescriptionLanguagePackage.MODEL__WRAPPERS:
        getWrappers().clear();
        getWrappers().addAll((Collection<? extends ObjectWrapper>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThreeJsWrapperDescriptionLanguagePackage.MODEL__WRAPPERS:
        getWrappers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThreeJsWrapperDescriptionLanguagePackage.MODEL__WRAPPERS:
        return wrappers != null && !wrappers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
