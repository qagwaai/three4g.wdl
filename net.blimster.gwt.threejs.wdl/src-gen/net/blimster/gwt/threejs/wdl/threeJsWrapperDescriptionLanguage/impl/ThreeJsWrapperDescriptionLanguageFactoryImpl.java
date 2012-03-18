/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.impl;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreeJsWrapperDescriptionLanguageFactoryImpl extends EFactoryImpl implements ThreeJsWrapperDescriptionLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ThreeJsWrapperDescriptionLanguageFactory init()
  {
    try
    {
      ThreeJsWrapperDescriptionLanguageFactory theThreeJsWrapperDescriptionLanguageFactory = (ThreeJsWrapperDescriptionLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.blimster.net/gwt/threejs/wdl/ThreeJsWrapperDescriptionLanguage"); 
      if (theThreeJsWrapperDescriptionLanguageFactory != null)
      {
        return theThreeJsWrapperDescriptionLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ThreeJsWrapperDescriptionLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreeJsWrapperDescriptionLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ThreeJsWrapperDescriptionLanguagePackage.MODEL: return createModel();
      case ThreeJsWrapperDescriptionLanguagePackage.OBJECT_WRAPPER: return createObjectWrapper();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR_SECTION: return createConstructorSection();
      case ThreeJsWrapperDescriptionLanguagePackage.CONSTRUCTOR: return createConstructor();
      case ThreeJsWrapperDescriptionLanguagePackage.PROPERTY_SECTION: return createPropertySection();
      case ThreeJsWrapperDescriptionLanguagePackage.PROPERTY: return createProperty();
      case ThreeJsWrapperDescriptionLanguagePackage.METHOD_SECTION: return createMethodSection();
      case ThreeJsWrapperDescriptionLanguagePackage.METHOD: return createMethod();
      case ThreeJsWrapperDescriptionLanguagePackage.PARAMETER: return createParameter();
      case ThreeJsWrapperDescriptionLanguagePackage.TYPE: return createType();
      case ThreeJsWrapperDescriptionLanguagePackage.ARRAY_TYPE: return createArrayType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ThreeJsWrapperDescriptionLanguagePackage.DATATYPE:
        return createDatatypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ThreeJsWrapperDescriptionLanguagePackage.DATATYPE:
        return convertDatatypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectWrapper createObjectWrapper()
  {
    ObjectWrapperImpl objectWrapper = new ObjectWrapperImpl();
    return objectWrapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorSection createConstructorSection()
  {
    ConstructorSectionImpl constructorSection = new ConstructorSectionImpl();
    return constructorSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySection createPropertySection()
  {
    PropertySectionImpl propertySection = new PropertySectionImpl();
    return propertySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodSection createMethodSection()
  {
    MethodSectionImpl methodSection = new MethodSectionImpl();
    return methodSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatypeFromString(EDataType eDataType, String initialValue)
  {
    Datatype result = Datatype.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatatypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreeJsWrapperDescriptionLanguagePackage getThreeJsWrapperDescriptionLanguagePackage()
  {
    return (ThreeJsWrapperDescriptionLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ThreeJsWrapperDescriptionLanguagePackage getPackage()
  {
    return ThreeJsWrapperDescriptionLanguagePackage.eINSTANCE;
  }

} //ThreeJsWrapperDescriptionLanguageFactoryImpl
