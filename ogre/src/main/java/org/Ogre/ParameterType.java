/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class ParameterType {
  public final static ParameterType PT_BOOL = new ParameterType("PT_BOOL");
  public final static ParameterType PT_REAL = new ParameterType("PT_REAL");
  public final static ParameterType PT_INT = new ParameterType("PT_INT");
  public final static ParameterType PT_UNSIGNED_INT = new ParameterType("PT_UNSIGNED_INT");
  public final static ParameterType PT_SHORT = new ParameterType("PT_SHORT");
  public final static ParameterType PT_UNSIGNED_SHORT = new ParameterType("PT_UNSIGNED_SHORT");
  public final static ParameterType PT_LONG = new ParameterType("PT_LONG");
  public final static ParameterType PT_UNSIGNED_LONG = new ParameterType("PT_UNSIGNED_LONG");
  public final static ParameterType PT_STRING = new ParameterType("PT_STRING");
  public final static ParameterType PT_VECTOR3 = new ParameterType("PT_VECTOR3");
  public final static ParameterType PT_MATRIX3 = new ParameterType("PT_MATRIX3");
  public final static ParameterType PT_MATRIX4 = new ParameterType("PT_MATRIX4");
  public final static ParameterType PT_QUATERNION = new ParameterType("PT_QUATERNION");
  public final static ParameterType PT_COLOURVALUE = new ParameterType("PT_COLOURVALUE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ParameterType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ParameterType.class + " with value " + swigValue);
  }

  private ParameterType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ParameterType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ParameterType(String swigName, ParameterType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ParameterType[] swigValues = { PT_BOOL, PT_REAL, PT_INT, PT_UNSIGNED_INT, PT_SHORT, PT_UNSIGNED_SHORT, PT_LONG, PT_UNSIGNED_LONG, PT_STRING, PT_VECTOR3, PT_MATRIX3, PT_MATRIX4, PT_QUATERNION, PT_COLOURVALUE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

