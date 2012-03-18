/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import java.util.Collection;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl#isJson <em>Json</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends MinimalEObjectImpl.Container implements Constructor
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The default value of the '{@link #isJson() <em>Json</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJson()
   * @generated
   * @ordered
   */
  protected static final boolean JSON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isJson() <em>Json</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJson()
   * @generated
   * @ordered
   */
  protected boolean json = JSON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorImpl()
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
    return ThreeJsWrapperDescriptionLanguagePackage.Literals.CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isJson()
  {
    return json;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJson(boolean newJson)
  {
    boolean oldJson = json;
    json = newJson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__JSON, oldJson, json));
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__NAME:
        return getName();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__PARAMETERS:
        return getParameters();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__JSON:
        return isJson();
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__NAME:
        setName((String)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__JSON:
        setJson((Boolean)newValue);
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__JSON:
        setJson(JSON_EDEFAULT);
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR__JSON:
        return json != JSON_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", json: ");
    result.append(json);
    result.append(')');
    return result.toString();
  }

} //ConstructorImpl
