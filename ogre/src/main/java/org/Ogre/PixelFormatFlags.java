/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class PixelFormatFlags {
  public final static PixelFormatFlags PFF_HASALPHA = new PixelFormatFlags("PFF_HASALPHA", OgreJNI.PFF_HASALPHA_get());
  public final static PixelFormatFlags PFF_COMPRESSED = new PixelFormatFlags("PFF_COMPRESSED", OgreJNI.PFF_COMPRESSED_get());
  public final static PixelFormatFlags PFF_FLOAT = new PixelFormatFlags("PFF_FLOAT", OgreJNI.PFF_FLOAT_get());
  public final static PixelFormatFlags PFF_DEPTH = new PixelFormatFlags("PFF_DEPTH", OgreJNI.PFF_DEPTH_get());
  public final static PixelFormatFlags PFF_NATIVEENDIAN = new PixelFormatFlags("PFF_NATIVEENDIAN", OgreJNI.PFF_NATIVEENDIAN_get());
  public final static PixelFormatFlags PFF_LUMINANCE = new PixelFormatFlags("PFF_LUMINANCE", OgreJNI.PFF_LUMINANCE_get());
  public final static PixelFormatFlags PFF_INTEGER = new PixelFormatFlags("PFF_INTEGER", OgreJNI.PFF_INTEGER_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PixelFormatFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PixelFormatFlags.class + " with value " + swigValue);
  }

  private PixelFormatFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PixelFormatFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PixelFormatFlags(String swigName, PixelFormatFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PixelFormatFlags[] swigValues = { PFF_HASALPHA, PFF_COMPRESSED, PFF_FLOAT, PFF_DEPTH, PFF_NATIVEENDIAN, PFF_LUMINANCE, PFF_INTEGER };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

