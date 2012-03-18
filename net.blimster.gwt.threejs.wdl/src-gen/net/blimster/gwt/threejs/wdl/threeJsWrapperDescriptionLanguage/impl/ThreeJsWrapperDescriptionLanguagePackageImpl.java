/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguageFactory;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage;
import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreeJsWrapperDescriptionLanguagePackageImpl extends EPackageImpl implements ThreeJsWrapperDescriptionLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectWrapperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertySectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum datatypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ThreeJsWrapperDescriptionLanguagePackageImpl()
  {
    super(eNS_URI, ThreeJsWrapperDescriptionLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ThreeJsWrapperDescriptionLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ThreeJsWrapperDescriptionLanguagePackage init()
  {
    if (isInited) return (ThreeJsWrapperDescriptionLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ThreeJsWrapperDescriptionLanguagePackage.eNS_URI);

    // Obtain or create and register package
    ThreeJsWrapperDescriptionLanguagePackageImpl theThreeJsWrapperDescriptionLanguagePackage = (ThreeJsWrapperDescriptionLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThreeJsWrapperDescriptionLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThreeJsWrapperDescriptionLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theThreeJsWrapperDescriptionLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theThreeJsWrapperDescriptionLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theThreeJsWrapperDescriptionLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ThreeJsWrapperDescriptionLanguagePackage.eNS_URI, theThreeJsWrapperDescriptionLanguagePackage);
    return theThreeJsWrapperDescriptionLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Wrappers()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectWrapper()
  {
    return objectWrapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectWrapper_Abstract()
  {
    return (EAttribute)objectWrapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectWrapper_Name()
  {
    return (EAttribute)objectWrapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectWrapper_Supertype()
  {
    return (EReference)objectWrapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectWrapper_Pck()
  {
    return (EAttribute)objectWrapperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectWrapper_ConstructorSection()
  {
    return (EReference)objectWrapperEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectWrapper_PropertySection()
  {
    return (EReference)objectWrapperEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectWrapper_MethodSection()
  {
    return (EReference)objectWrapperEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorSection()
  {
    return constructorSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructorSection_BuilderConstructor()
  {
    return (EAttribute)constructorSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructorSection_DefaultConstructor()
  {
    return (EAttribute)constructorSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorSection_Constructors()
  {
    return (EReference)constructorSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructor()
  {
    return constructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Name()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_Parameters()
  {
    return (EReference)constructorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_Json()
  {
    return (EAttribute)constructorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertySection()
  {
    return propertySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertySection_Properties()
  {
    return (EReference)propertySectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_ReadOnly()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodSection()
  {
    return methodSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodSection_Methods()
  {
    return (EReference)methodSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_ReturnType()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Parameters()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Datatype()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Wrapper()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_ArrayType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayType_Dimensions()
  {
    return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDatatype()
  {
    return datatypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreeJsWrapperDescriptionLanguageFactory getThreeJsWrapperDescriptionLanguageFactory()
  {
    return (ThreeJsWrapperDescriptionLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__WRAPPERS);

    objectWrapperEClass = createEClass(OBJECT_WRAPPER);
    createEAttribute(objectWrapperEClass, OBJECT_WRAPPER__ABSTRACT);
    createEAttribute(objectWrapperEClass, OBJECT_WRAPPER__NAME);
    createEReference(objectWrapperEClass, OBJECT_WRAPPER__SUPERTYPE);
    createEAttribute(objectWrapperEClass, OBJECT_WRAPPER__PCK);
    createEReference(objectWrapperEClass, OBJECT_WRAPPER__CONSTRUCTOR_SECTION);
    createEReference(objectWrapperEClass, OBJECT_WRAPPER__PROPERTY_SECTION);
    createEReference(objectWrapperEClass, OBJECT_WRAPPER__METHOD_SECTION);

    constructorSectionEClass = createEClass(CONSTRUCTOR_SECTION);
    createEAttribute(constructorSectionEClass, CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR);
    createEAttribute(constructorSectionEClass, CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR);
    createEReference(constructorSectionEClass, CONSTRUCTOR_SECTION__CONSTRUCTORS);

    constructorEClass = createEClass(CONSTRUCTOR);
    createEAttribute(constructorEClass, CONSTRUCTOR__NAME);
    createEReference(constructorEClass, CONSTRUCTOR__PARAMETERS);
    createEAttribute(constructorEClass, CONSTRUCTOR__JSON);

    propertySectionEClass = createEClass(PROPERTY_SECTION);
    createEReference(propertySectionEClass, PROPERTY_SECTION__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__READ_ONLY);
    createEReference(propertyEClass, PROPERTY__TYPE);
    createEAttribute(propertyEClass, PROPERTY__NAME);

    methodSectionEClass = createEClass(METHOD_SECTION);
    createEReference(methodSectionEClass, METHOD_SECTION__METHODS);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__RETURN_TYPE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMETERS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__DATATYPE);
    createEReference(typeEClass, TYPE__WRAPPER);
    createEReference(typeEClass, TYPE__ARRAY_TYPE);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEAttribute(arrayTypeEClass, ARRAY_TYPE__DIMENSIONS);

    // Create enums
    datatypeEEnum = createEEnum(DATATYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Wrappers(), this.getObjectWrapper(), null, "wrappers", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectWrapperEClass, ObjectWrapper.class, "ObjectWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectWrapper_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectWrapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectWrapper_Supertype(), this.getObjectWrapper(), null, "supertype", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectWrapper_Pck(), ecorePackage.getEString(), "pck", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectWrapper_ConstructorSection(), this.getConstructorSection(), null, "constructorSection", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectWrapper_PropertySection(), this.getPropertySection(), null, "propertySection", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectWrapper_MethodSection(), this.getMethodSection(), null, "methodSection", null, 0, 1, ObjectWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorSectionEClass, ConstructorSection.class, "ConstructorSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructorSection_BuilderConstructor(), ecorePackage.getEString(), "builderConstructor", null, 0, 1, ConstructorSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructorSection_DefaultConstructor(), ecorePackage.getEString(), "defaultConstructor", null, 0, 1, ConstructorSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorSection_Constructors(), this.getConstructor(), null, "constructors", null, 0, -1, ConstructorSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_Json(), ecorePackage.getEBoolean(), "json", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertySectionEClass, PropertySection.class, "PropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertySection_Properties(), this.getProperty(), null, "properties", null, 0, -1, PropertySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Type(), this.getType(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodSectionEClass, MethodSection.class, "MethodSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodSection_Methods(), this.getMethod(), null, "methods", null, 0, -1, MethodSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_ReturnType(), this.getType(), null, "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Datatype(), this.getDatatype(), "datatype", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Wrapper(), this.getObjectWrapper(), null, "wrapper", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_ArrayType(), this.getArrayType(), null, "arrayType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrayType_Dimensions(), ecorePackage.getEInt(), "dimensions", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(datatypeEEnum, Datatype.class, "Datatype");
    addEEnumLiteral(datatypeEEnum, Datatype.INT);
    addEEnumLiteral(datatypeEEnum, Datatype.FLOAT);
    addEEnumLiteral(datatypeEEnum, Datatype.BOOL);
    addEEnumLiteral(datatypeEEnum, Datatype.STRING);

    // Create resource
    createResource(eNS_URI);
  }

} //ThreeJsWrapperDescriptionLanguagePackageImpl
