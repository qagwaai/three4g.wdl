/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ThreeJsWrapperDescriptionLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "threeJsWrapperDescriptionLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.blimster.net/gwt/threejs/wdl/ThreeJsWrapperDescriptionLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "threeJsWrapperDescriptionLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ThreeJsWrapperDescriptionLanguagePackage eINSTANCE = net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ModelImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Wrappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WRAPPERS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl <em>Object Wrapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getObjectWrapper()
   * @generated
   */
  int OBJECT_WRAPPER = 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__NAME = 1;

  /**
   * The feature id for the '<em><b>Supertype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__SUPERTYPE = 2;

  /**
   * The feature id for the '<em><b>Pck</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__PCK = 3;

  /**
   * The feature id for the '<em><b>Constructor Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__CONSTRUCTOR_SECTION = 4;

  /**
   * The feature id for the '<em><b>Property Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__PROPERTY_SECTION = 5;

  /**
   * The feature id for the '<em><b>Method Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER__METHOD_SECTION = 6;

  /**
   * The number of structural features of the '<em>Object Wrapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_WRAPPER_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl <em>Constructor Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getConstructorSection()
   * @generated
   */
  int CONSTRUCTOR_SECTION = 2;

  /**
   * The feature id for the '<em><b>Builder Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR = 0;

  /**
   * The feature id for the '<em><b>Default Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR = 1;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_SECTION__CONSTRUCTORS = 2;

  /**
   * The number of structural features of the '<em>Constructor Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Json</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__JSON = 2;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertySectionImpl <em>Property Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertySectionImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getPropertySection()
   * @generated
   */
  int PROPERTY_SECTION = 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_SECTION__PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>Property Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertyImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__READ_ONLY = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodSectionImpl <em>Method Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodSectionImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getMethodSection()
   * @generated
   */
  int METHOD_SECTION = 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_SECTION__METHODS = 0;

  /**
   * The number of structural features of the '<em>Method Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getMethod()
   * @generated
   */
  int METHOD = 7;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ParameterImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Wrapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__WRAPPER = 1;

  /**
   * The feature id for the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ARRAY_TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ArrayTypeImpl
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 10;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__DIMENSIONS = 0;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype <em>Datatype</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 11;


  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model#getWrappers <em>Wrappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Wrappers</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model#getWrappers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Wrappers();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper <em>Object Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Wrapper</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper
   * @generated
   */
  EClass getObjectWrapper();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#isAbstract()
   * @see #getObjectWrapper()
   * @generated
   */
  EAttribute getObjectWrapper_Abstract();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getName()
   * @see #getObjectWrapper()
   * @generated
   */
  EAttribute getObjectWrapper_Name();

  /**
   * Returns the meta object for the reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getSupertype <em>Supertype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Supertype</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getSupertype()
   * @see #getObjectWrapper()
   * @generated
   */
  EReference getObjectWrapper_Supertype();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPck <em>Pck</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pck</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPck()
   * @see #getObjectWrapper()
   * @generated
   */
  EAttribute getObjectWrapper_Pck();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getConstructorSection <em>Constructor Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor Section</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getConstructorSection()
   * @see #getObjectWrapper()
   * @generated
   */
  EReference getObjectWrapper_ConstructorSection();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPropertySection <em>Property Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Section</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getPropertySection()
   * @see #getObjectWrapper()
   * @generated
   */
  EReference getObjectWrapper_PropertySection();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getMethodSection <em>Method Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Section</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper#getMethodSection()
   * @see #getObjectWrapper()
   * @generated
   */
  EReference getObjectWrapper_MethodSection();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection <em>Constructor Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Section</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection
   * @generated
   */
  EClass getConstructorSection();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getBuilderConstructor <em>Builder Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builder Constructor</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getBuilderConstructor()
   * @see #getConstructorSection()
   * @generated
   */
  EAttribute getConstructorSection_BuilderConstructor();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getDefaultConstructor <em>Default Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Constructor</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getDefaultConstructor()
   * @see #getConstructorSection()
   * @generated
   */
  EAttribute getConstructorSection_DefaultConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection#getConstructors()
   * @see #getConstructorSection()
   * @generated
   */
  EReference getConstructorSection_Constructors();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getName()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#getParameters()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Parameters();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#isJson <em>Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Json</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor#isJson()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Json();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection <em>Property Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Section</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection
   * @generated
   */
  EClass getPropertySection();

  /**
   * Returns the meta object for the containment reference list '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection#getProperties()
   * @see #getPropertySection()
   * @generated
   */
  EReference getPropertySection_Properties();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property#isReadOnly <em>Read Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Only</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property#isReadOnly()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_ReadOnly();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection <em>Method Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Section</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection
   * @generated
   */
  EClass getMethodSection();

  /**
   * Returns the meta object for the containment reference list '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection#getMethods()
   * @see #getMethodSection()
   * @generated
   */
  EReference getMethodSection_Methods();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method#getReturnType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Parameters();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datatype</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getDatatype()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Datatype();

  /**
   * Returns the meta object for the reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getWrapper <em>Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wrapper</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getWrapper()
   * @see #getType()
   * @generated
   */
  EReference getType_Wrapper();

  /**
   * Returns the meta object for the containment reference '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Type</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type#getArrayType()
   * @see #getType()
   * @generated
   */
  EReference getType_ArrayType();

  /**
   * Returns the meta object for class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the attribute '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dimensions</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType#getDimensions()
   * @see #getArrayType()
   * @generated
   */
  EAttribute getArrayType_Dimensions();

  /**
   * Returns the meta object for enum '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Datatype</em>'.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype
   * @generated
   */
  EEnum getDatatype();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ThreeJsWrapperDescriptionLanguageFactory getThreeJsWrapperDescriptionLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ModelImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Wrappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WRAPPERS = eINSTANCE.getModel_Wrappers();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl <em>Object Wrapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ObjectWrapperImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getObjectWrapper()
     * @generated
     */
    EClass OBJECT_WRAPPER = eINSTANCE.getObjectWrapper();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_WRAPPER__ABSTRACT = eINSTANCE.getObjectWrapper_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_WRAPPER__NAME = eINSTANCE.getObjectWrapper_Name();

    /**
     * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_WRAPPER__SUPERTYPE = eINSTANCE.getObjectWrapper_Supertype();

    /**
     * The meta object literal for the '<em><b>Pck</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_WRAPPER__PCK = eINSTANCE.getObjectWrapper_Pck();

    /**
     * The meta object literal for the '<em><b>Constructor Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_WRAPPER__CONSTRUCTOR_SECTION = eINSTANCE.getObjectWrapper_ConstructorSection();

    /**
     * The meta object literal for the '<em><b>Property Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_WRAPPER__PROPERTY_SECTION = eINSTANCE.getObjectWrapper_PropertySection();

    /**
     * The meta object literal for the '<em><b>Method Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_WRAPPER__METHOD_SECTION = eINSTANCE.getObjectWrapper_MethodSection();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl <em>Constructor Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorSectionImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getConstructorSection()
     * @generated
     */
    EClass CONSTRUCTOR_SECTION = eINSTANCE.getConstructorSection();

    /**
     * The meta object literal for the '<em><b>Builder Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_SECTION__BUILDER_CONSTRUCTOR = eINSTANCE.getConstructorSection_BuilderConstructor();

    /**
     * The meta object literal for the '<em><b>Default Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_SECTION__DEFAULT_CONSTRUCTOR = eINSTANCE.getConstructorSection_DefaultConstructor();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_SECTION__CONSTRUCTORS = eINSTANCE.getConstructorSection_Constructors();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ConstructorImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__NAME = eINSTANCE.getConstructor_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

    /**
     * The meta object literal for the '<em><b>Json</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__JSON = eINSTANCE.getConstructor_Json();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertySectionImpl <em>Property Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertySectionImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getPropertySection()
     * @generated
     */
    EClass PROPERTY_SECTION = eINSTANCE.getPropertySection();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_SECTION__PROPERTIES = eINSTANCE.getPropertySection_Properties();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.PropertyImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__READ_ONLY = eINSTANCE.getProperty_ReadOnly();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodSectionImpl <em>Method Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodSectionImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getMethodSection()
     * @generated
     */
    EClass METHOD_SECTION = eINSTANCE.getMethodSection();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_SECTION__METHODS = eINSTANCE.getMethodSection_Methods();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.MethodImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ParameterImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.TypeImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__DATATYPE = eINSTANCE.getType_Datatype();

    /**
     * The meta object literal for the '<em><b>Wrapper</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__WRAPPER = eINSTANCE.getType_Wrapper();

    /**
     * The meta object literal for the '<em><b>Array Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ARRAY_TYPE = eINSTANCE.getType_ArrayType();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ArrayTypeImpl
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_TYPE__DIMENSIONS = eINSTANCE.getArrayType_Dimensions();

    /**
     * The meta object literal for the '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype <em>Datatype</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Datatype
     * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl.ThreeJsWrapperDescriptionLanguagePackageImpl#getDatatype()
     * @generated
     */
    EEnum DATATYPE = eINSTANCE.getDatatype();

  }

} //ThreeJsWrapperDescriptionLanguagePackage
