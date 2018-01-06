/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class ShadowRenderableFlags {
  public final static ShadowRenderableFlags SRF_INCLUDE_LIGHT_CAP = new ShadowRenderableFlags("SRF_INCLUDE_LIGHT_CAP", OgreJNI.SRF_INCLUDE_LIGHT_CAP_get());
  public final static ShadowRenderableFlags SRF_INCLUDE_DARK_CAP = new ShadowRenderableFlags("SRF_INCLUDE_DARK_CAP", OgreJNI.SRF_INCLUDE_DARK_CAP_get());
  public final static ShadowRenderableFlags SRF_EXTRUDE_TO_INFINITY = new ShadowRenderableFlags("SRF_EXTRUDE_TO_INFINITY", OgreJNI.SRF_EXTRUDE_TO_INFINITY_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ShadowRenderableFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ShadowRenderableFlags.class + " with value " + swigValue);
  }

  private ShadowRenderableFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ShadowRenderableFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ShadowRenderableFlags(String swigName, ShadowRenderableFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ShadowRenderableFlags[] swigValues = { SRF_INCLUDE_LIGHT_CAP, SRF_INCLUDE_DARK_CAP, SRF_EXTRUDE_TO_INFINITY };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

