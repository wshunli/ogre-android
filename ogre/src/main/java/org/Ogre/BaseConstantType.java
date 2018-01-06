/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class BaseConstantType {
  public final static BaseConstantType BCT_FLOAT = new BaseConstantType("BCT_FLOAT", OgreJNI.BCT_FLOAT_get());
  public final static BaseConstantType BCT_INT = new BaseConstantType("BCT_INT", OgreJNI.BCT_INT_get());
  public final static BaseConstantType BCT_DOUBLE = new BaseConstantType("BCT_DOUBLE", OgreJNI.BCT_DOUBLE_get());
  public final static BaseConstantType BCT_UINT = new BaseConstantType("BCT_UINT", OgreJNI.BCT_UINT_get());
  public final static BaseConstantType BCT_BOOL = new BaseConstantType("BCT_BOOL", OgreJNI.BCT_BOOL_get());
  public final static BaseConstantType BCT_SAMPLER = new BaseConstantType("BCT_SAMPLER", OgreJNI.BCT_SAMPLER_get());
  public final static BaseConstantType BCT_SUBROUTINE = new BaseConstantType("BCT_SUBROUTINE", OgreJNI.BCT_SUBROUTINE_get());
  public final static BaseConstantType BCT_UNKNOWN = new BaseConstantType("BCT_UNKNOWN", OgreJNI.BCT_UNKNOWN_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BaseConstantType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BaseConstantType.class + " with value " + swigValue);
  }

  private BaseConstantType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BaseConstantType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BaseConstantType(String swigName, BaseConstantType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BaseConstantType[] swigValues = { BCT_FLOAT, BCT_INT, BCT_DOUBLE, BCT_UINT, BCT_BOOL, BCT_SAMPLER, BCT_SUBROUTINE, BCT_UNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
