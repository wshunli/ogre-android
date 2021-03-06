/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class ColourBufferType {
  public final static ColourBufferType CBT_BACK = new ColourBufferType("CBT_BACK", OgreJNI.CBT_BACK_get());
  public final static ColourBufferType CBT_BACK_LEFT = new ColourBufferType("CBT_BACK_LEFT");
  public final static ColourBufferType CBT_BACK_RIGHT = new ColourBufferType("CBT_BACK_RIGHT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ColourBufferType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ColourBufferType.class + " with value " + swigValue);
  }

  private ColourBufferType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ColourBufferType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ColourBufferType(String swigName, ColourBufferType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ColourBufferType[] swigValues = { CBT_BACK, CBT_BACK_LEFT, CBT_BACK_RIGHT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

