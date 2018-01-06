/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class FontType {
  public final static FontType FT_TRUETYPE = new FontType("FT_TRUETYPE", OgreOverlayJNI.FT_TRUETYPE_get());
  public final static FontType FT_IMAGE = new FontType("FT_IMAGE", OgreOverlayJNI.FT_IMAGE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FontType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FontType.class + " with value " + swigValue);
  }

  private FontType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FontType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FontType(String swigName, FontType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FontType[] swigValues = { FT_TRUETYPE, FT_IMAGE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
