/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class ManualCullingMode {
  public final static ManualCullingMode MANUAL_CULL_NONE = new ManualCullingMode("MANUAL_CULL_NONE", OgreJNI.MANUAL_CULL_NONE_get());
  public final static ManualCullingMode MANUAL_CULL_BACK = new ManualCullingMode("MANUAL_CULL_BACK", OgreJNI.MANUAL_CULL_BACK_get());
  public final static ManualCullingMode MANUAL_CULL_FRONT = new ManualCullingMode("MANUAL_CULL_FRONT", OgreJNI.MANUAL_CULL_FRONT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ManualCullingMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ManualCullingMode.class + " with value " + swigValue);
  }

  private ManualCullingMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ManualCullingMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ManualCullingMode(String swigName, ManualCullingMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ManualCullingMode[] swigValues = { MANUAL_CULL_NONE, MANUAL_CULL_BACK, MANUAL_CULL_FRONT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

