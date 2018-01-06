/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class SceneBlendType {
  public final static SceneBlendType SBT_TRANSPARENT_ALPHA = new SceneBlendType("SBT_TRANSPARENT_ALPHA");
  public final static SceneBlendType SBT_TRANSPARENT_COLOUR = new SceneBlendType("SBT_TRANSPARENT_COLOUR");
  public final static SceneBlendType SBT_ADD = new SceneBlendType("SBT_ADD");
  public final static SceneBlendType SBT_MODULATE = new SceneBlendType("SBT_MODULATE");
  public final static SceneBlendType SBT_REPLACE = new SceneBlendType("SBT_REPLACE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SceneBlendType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SceneBlendType.class + " with value " + swigValue);
  }

  private SceneBlendType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SceneBlendType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SceneBlendType(String swigName, SceneBlendType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SceneBlendType[] swigValues = { SBT_TRANSPARENT_ALPHA, SBT_TRANSPARENT_COLOUR, SBT_ADD, SBT_MODULATE, SBT_REPLACE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
