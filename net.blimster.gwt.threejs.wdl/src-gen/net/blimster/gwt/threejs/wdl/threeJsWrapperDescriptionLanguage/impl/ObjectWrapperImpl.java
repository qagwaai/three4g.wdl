/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#getPck <em>Pck</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#getConstructorSection <em>Constructor Section</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#getPropertySection <em>Property Section</em>}</li>
 *   <li>{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl#getMethodSection <em>Method Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectWrapperImpl extends MinimalEObjectImpl.Container implements ObjectWrapper
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupertype()
   * @generated
   * @ordered
   */
  protected ObjectWrapper supertype;

  /**
   * The default value of the '{@link #getPck() <em>Pck</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPck()
   * @generated
   * @ordered
   */
  protected static final String PCK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPck() <em>Pck</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPck()
   * @generated
   * @ordered
   */
  protected String pck = PCK_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstructorSection() <em>Constructor Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructorSection()
   * @generated
   * @ordered
   */
  protected ConstructorSection constructorSection;

  /**
   * The cached value of the '{@link #getPropertySection() <em>Property Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertySection()
   * @generated
   * @ordered
   */
  protected PropertySection propertySection;

  /**
   * The cached value of the '{@link #getMethodSection() <em>Method Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodSection()
   * @generated
   * @ordered
   */
  protected MethodSection methodSection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectWrapperImpl()
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
    return ThreeJsWrapperDescriptionLanguagePackage.Literals.OBJECT_WRAPPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectWrapper getSupertype()
  {
    if (supertype != null && supertype.eIsProxy())
    {
      InternalEObject oldSupertype = (InternalEObject)supertype;
      supertype = (ObjectWrapper)eResolveProxy(oldSupertype);
      if (supertype != oldSupertype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__SUPERTYPE, oldSupertype, supertype));
      }
    }
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectWrapper basicGetSupertype()
  {
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupertype(ObjectWrapper newSupertype)
  {
    ObjectWrapper oldSupertype = supertype;
    supertype = newSupertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__SUPERTYPE, oldSupertype, supertype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPck()
  {
    return pck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPck(String newPck)
  {
    String oldPck = pck;
    pck = newPck;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PCK, oldPck, pck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorSection getConstructorSection()
  {
    return constructorSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstructorSection(ConstructorSection newConstructorSection, NotificationChain msgs)
  {
    ConstructorSection oldConstructorSection = constructorSection;
    constructorSection = newConstructorSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION, oldConstructorSection, newConstructorSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructorSection(ConstructorSection newConstructorSection)
  {
    if (newConstructorSection != constructorSection)
    {
      NotificationChain msgs = null;
      if (constructorSection != null)
        msgs = ((InternalEObject)constructorSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION, null, msgs);
      if (newConstructorSection != null)
        msgs = ((InternalEObject)newConstructorSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION, null, msgs);
      msgs = basicSetConstructorSection(newConstructorSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION, newConstructorSection, newConstructorSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySection getPropertySection()
  {
    return propertySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertySection(PropertySection newPropertySection, NotificationChain msgs)
  {
    PropertySection oldPropertySection = propertySection;
    propertySection = newPropertySection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION, oldPropertySection, newPropertySection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertySection(PropertySection newPropertySection)
  {
    if (newPropertySection != propertySection)
    {
      NotificationChain msgs = null;
      if (propertySection != null)
        msgs = ((InternalEObject)propertySection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION, null, msgs);
      if (newPropertySection != null)
        msgs = ((InternalEObject)newPropertySection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION, null, msgs);
      msgs = basicSetPropertySection(newPropertySection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION, newPropertySection, newPropertySection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodSection getMethodSection()
  {
    return methodSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodSection(MethodSection newMethodSection, NotificationChain msgs)
  {
    MethodSection oldMethodSection = methodSection;
    methodSection = newMethodSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION, oldMethodSection, newMethodSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodSection(MethodSection newMethodSection)
  {
    if (newMethodSection != methodSection)
    {
      NotificationChain msgs = null;
      if (methodSection != null)
        msgs = ((InternalEObject)methodSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION, null, msgs);
      if (newMethodSection != null)
        msgs = ((InternalEObject)newMethodSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION, null, msgs);
      msgs = basicSetMethodSection(newMethodSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION, newMethodSection, newMethodSection));
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
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION:
        return basicSetConstructorSection(null, msgs);
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION:
        return basicSetPropertySection(null, msgs);
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION:
        return basicSetMethodSection(null, msgs);
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
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__ABSTRACT:
        return isAbstract();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__NAME:
        return getName();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__SUPERTYPE:
        if (resolve) return getSupertype();
        return basicGetSupertype();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PCK:
        return getPck();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION:
        return getConstructorSection();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION:
        return getPropertySection();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION:
        return getMethodSection();
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
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__NAME:
        setName((String)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__SUPERTYPE:
        setSupertype((ObjectWrapper)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PCK:
        setPck((String)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION:
        setConstructorSection((ConstructorSection)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION:
        setPropertySection((PropertySection)newValue);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION:
        setMethodSection((MethodSection)newValue);
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
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__SUPERTYPE:
        setSupertype((ObjectWrapper)null);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PCK:
        setPck(PCK_EDEFAULT);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION:
        setConstructorSection((ConstructorSection)null);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION:
        setPropertySection((PropertySection)null);
        return;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION:
        setMethodSection((MethodSection)null);
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
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__SUPERTYPE:
        return supertype != null;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PCK:
        return PCK_EDEFAULT == null ? pck != null : !PCK_EDEFAULT.equals(pck);
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__CONSTRUCTOR_SECTION:
        return constructorSection != null;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__PROPERTY_SECTION:
        return propertySection != null;
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER__METHOD_SECTION:
        return methodSection != null;
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", name: ");
    result.append(name);
    result.append(", pck: ");
    result.append(pck);
    result.append(')');
    return result.toString();
  }

} //ObjectWrapperImpl
