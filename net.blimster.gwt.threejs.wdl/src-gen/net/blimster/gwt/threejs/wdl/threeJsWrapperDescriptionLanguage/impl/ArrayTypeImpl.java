/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ArrayTypeImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeImpl extends MinimalEObjectImpl.Container implements ArrayType
{
  /**
   * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected static final int DIMENSIONS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected int dimensions = DIMENSIONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeImpl()
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
    return ThreeJsWrapperDescriptionLanguagePackage.Literals.ARRAY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDimensions()
  {
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimensions(int newDimensions)
  {
    int oldDimensions = dimensions;
    dimensions = newDimensions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.ARRAY_TYPE__DIMENSIONS, oldDimensions, dimensions));
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
      case ThreeJsWrapperDescriptionLanguagePackage.ARRAY_TYPE__DIMENSIONS:
        return getDimensions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThreeJsWrapperDescriptionLanguagePackage.ARRAY_TYPE__DIMENSIONS:
        setDimensions((Integer)newValue);
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
      case ThreeJsWrapperDescriptionLanguagePackage.ARRAY_TYPE__DIMENSIONS:
        setDimensions(DIMENSIONS_EDEFAULT);
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
      case ThreeJsWrapperDescriptionLanguagePackage.ARRAY_TYPE__DIMENSIONS:
        return dimensions != DIMENSIONS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dimensions: ");
    result.append(dimensions);
    result.append(')');
    return result.toString();
  }

} //ArrayTypeImpl
