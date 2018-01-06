/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class IlluminationStage {
  public final static IlluminationStage IS_AMBIENT = new IlluminationStage("IS_AMBIENT");
  public final static IlluminationStage IS_PER_LIGHT = new IlluminationStage("IS_PER_LIGHT");
  public final static IlluminationStage IS_DECAL = new IlluminationStage("IS_DECAL");
  public final static IlluminationStage IS_UNKNOWN = new IlluminationStage("IS_UNKNOWN");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static IlluminationStage swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + IlluminationStage.class + " with value " + swigValue);
  }

  private IlluminationStage(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private IlluminationStage(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private IlluminationStage(String swigName, IlluminationStage swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static IlluminationStage[] swigValues = { IS_AMBIENT, IS_PER_LIGHT, IS_DECAL, IS_UNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

