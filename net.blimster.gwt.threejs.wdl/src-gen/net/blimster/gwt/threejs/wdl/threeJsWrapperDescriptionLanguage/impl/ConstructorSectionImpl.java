/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import java.util.Collection;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection;
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
 * An implementation of the model object '<em><b>Constructor Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl#getBuilderConstructor <em>Builder Constructor</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl#getDefaultConstructor <em>Default Constructor</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorSectionImpl extends MinimalEObjectImpl.Container implements ConstructorSection
{
  /**
   * The default value of the '{@link #getBuilderConstructor() <em>Builder Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilderConstructor()
   * @generated
   * @ordered
   */
  protected static final String BUILDER_CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuilderConstructor() <em>Builder Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilderConstructor()
   * @generated
   * @ordered
   */
  protected String builderConstructor = BUILDER_CONSTRUCTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultConstructor() <em>Default Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultConstructor()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultConstructor() <em>Default Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultConstructor()
   * @generated
   * @ordered
   */
  protected String defaultConstructor = DEFAULT_CONSTRUCTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<Constructor> constructors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorSectionImpl()
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
    return ThreeJsWrapperDescriptionLanguagePackage.Literals.CONSTRUCTOR_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuilderConstructor()
  {
    return builderConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuilderConstructor(String newBuilderConstructor)
  {
    String oldBuilderConstructor = builderConstructor;
    builderConstructor = newBuilderConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR, oldBuilderConstructor, builderConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultConstructor()
  {
    return defaultConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultConstructor(String newDefaultConstructor)
  {
    String oldDefaultConstructor = defaultConstructor;
    defaultConstructor = newDefaultConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR, oldDefaultConstructor, defaultConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constructor> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<Constructor>(Constructor.class, this, ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__CONSTRUCTORS);
    }
    return constructors;
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR:
        return getBuilderConstructor();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR:
        return getDefaultConstructor();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__CONSTRUCTORS:
        return getConstructors();
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR:
        setBuilderConstructor((String)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR:
        setDefaultConstructor((String)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends Constructor>)newValue);
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR:
        setBuilderConstructor(BUILDER_CONSTRUCTOR_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR:
        setDefaultConstructor(DEFAULT_CONSTRUCTOR_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__CONSTRUCTORS:
        getConstructors().clear();
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
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR:
        return BUILDER_CONSTRUCTOR_EDEFAULT == null ? builderConstructor != null : !BUILDER_CONSTRUCTOR_EDEFAULT.equals(builderConstructor);
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR:
        return DEFAULT_CONSTRUCTOR_EDEFAULT == null ? defaultConstructor != null : !DEFAULT_CONSTRUCTOR_EDEFAULT.equals(defaultConstructor);
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
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
    result.append(" (builderConstructor: ");
    result.append(builderConstructor);
    result.append(", defaultConstructor: ");
    result.append(defaultConstructor);
    result.append(')');
    return result.toString();
  }

} //ConstructorSectionImpl
