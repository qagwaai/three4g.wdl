/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.util;

import net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage
 * @generated
 */
public class ThreeJsWrapperDescriptionLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ThreeJsWrapperDescriptionLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreeJsWrapperDescriptionLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ThreeJsWrapperDescriptionLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThreeJsWrapperDescriptionLanguageSwitch<Adapter> modelSwitch =
    new ThreeJsWrapperDescriptionLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseObjectWrapper(ObjectWrapper object)
      {
        return createObjectWrapperAdapter();
      }
      @Override
      public Adapter caseConstructorSection(ConstructorSection object)
      {
        return createConstructorSectionAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter casePropertySection(PropertySection object)
      {
        return createPropertySectionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseMethodSection(MethodSection object)
      {
        return createMethodSectionAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseArrayType(ArrayType object)
      {
        return createArrayTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper <em>Object Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ObjectWrapper
   * @generated
   */
  public Adapter createObjectWrapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection <em>Constructor Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ConstructorSection
   * @generated
   */
  public Adapter createConstructorSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection <em>Property Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.PropertySection
   * @generated
   */
  public Adapter createPropertySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection <em>Method Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.MethodSection
   * @generated
   */
  public Adapter createMethodSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ArrayType
   * @generated
   */
  public Adapter createArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ThreeJsWrapperDescriptionLanguageAdapterFactory
