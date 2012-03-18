/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl#getWrapper <em>Wrapper</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl#getArrayType <em>Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected static final Datatype DATATYPE_EDEFAULT = Datatype.INT;

  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected Datatype datatype = DATATYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getWrapper() <em>Wrapper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrapper()
   * @generated
   * @ordered
   */
  protected ObjectWrapper wrapper;

  /**
   * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayType()
   * @generated
   * @ordered
   */
  protected ArrayType arrayType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return ThreeJsWrapperDescriptionLanguagePackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype getDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatype(Datatype newDatatype)
  {
    Datatype oldDatatype = datatype;
    datatype = newDatatype == null ? DATATYPE_EDEFAULT : newDatatype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.TYPE__DATATYPE, oldDatatype, datatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectWrapper getWrapper()
  {
    if (wrapper != null && wrapper.eIsProxy())
    {
      InternalEObject oldWrapper = (InternalEObject)wrapper;
      wrapper = (ObjectWrapper)eResolveProxy(oldWrapper);
      if (wrapper != oldWrapper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThreeJsWrapperDescriptionLanguagePackage.TYPE__WRAPPER, oldWrapper, wrapper));
      }
    }
    return wrapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectWrapper basicGetWrapper()
  {
    return wrapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrapper(ObjectWrapper newWrapper)
  {
    ObjectWrapper oldWrapper = wrapper;
    wrapper = newWrapper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.TYPE__WRAPPER, oldWrapper, wrapper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType getArrayType()
  {
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayType(ArrayType newArrayType, NotificationChain msgs)
  {
    ArrayType oldArrayType = arrayType;
    arrayType = newArrayType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE, oldArrayType, newArrayType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayType(ArrayType newArrayType)
  {
    if (newArrayType != arrayType)
    {
      NotificationChain msgs = null;
      if (arrayType != null)
        msgs = ((InternalEObject)arrayType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE, null, msgs);
      if (newArrayType != null)
        msgs = ((InternalEObject)newArrayType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE, null, msgs);
      msgs = basicSetArrayType(newArrayType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE, newArrayType, newArrayType));
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
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE:
        return basicSetArrayType(null, msgs);
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
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__DATATYPE:
        return getDatatype();
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__WRAPPER:
        if (resolve) return getWrapper();
        return basicGetWrapper();
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE:
        return getArrayType();
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
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__DATATYPE:
        setDatatype((Datatype)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__WRAPPER:
        setWrapper((ObjectWrapper)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE:
        setArrayType((ArrayType)newValue);
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
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__DATATYPE:
        setDatatype(DATATYPE_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__WRAPPER:
        setWrapper((ObjectWrapper)null);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE:
        setArrayType((ArrayType)null);
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
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__DATATYPE:
        return datatype != DATATYPE_EDEFAULT;
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__WRAPPER:
        return wrapper != null;
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE__ARRAY_TYPE:
        return arrayType != null;
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
    result.append(" (datatype: ");
    result.append(datatype);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
