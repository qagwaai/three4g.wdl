/**
 * <copyright>
 * </copyright>
 *
 */
package net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datatype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.blimster.gwt.threejs.wdl.threeJsWrapperDescriptionLanguage.ThreeJsWrapperDescriptionLanguagePackage#getDatatype()
 * @model
 * @generated
 */
public enum Datatype implements Enumerator
{
  /**
   * The '<em><b>INT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(0, "INT", "int"),

  /**
   * The '<em><b>FLOAT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(1, "FLOAT", "float"),

  /**
   * The '<em><b>BOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOL_VALUE
   * @generated
   * @ordered
   */
  BOOL(2, "BOOL", "boolean"),

  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(3, "STRING", "string");

  /**
   * The '<em><b>INT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT
   * @model literal="int"
   * @generated
   * @ordered
   */
  public static final int INT_VALUE = 0;

  /**
   * The '<em><b>FLOAT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model literal="float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 1;

  /**
   * The '<em><b>BOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOL
   * @model literal="boolean"
   * @generated
   * @ordered
   */
  public static final int BOOL_VALUE = 2;

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 3;

  /**
   * An array of all the '<em><b>Datatype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Datatype[] VALUES_ARRAY =
    new Datatype[]
    {
      INT,
      FLOAT,
      BOOL,
      STRING,
    };

  /**
   * A public read-only list of all the '<em><b>Datatype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Datatype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Datatype get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Datatype result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Datatype getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Datatype result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Datatype get(int value)
  {
    switch (value)
    {
      case INT_VALUE: return INT;
      case FLOAT_VALUE: return FLOAT;
      case BOOL_VALUE: return BOOL;
      case STRING_VALUE: return STRING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Datatype(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Datatype
