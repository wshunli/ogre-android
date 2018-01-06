/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class TextureAccess {
  public final static TextureAccess TA_READ = new TextureAccess("TA_READ", OgreJNI.TA_READ_get());
  public final static TextureAccess TA_WRITE = new TextureAccess("TA_WRITE", OgreJNI.TA_WRITE_get());
  public final static TextureAccess TA_READ_WRITE = new TextureAccess("TA_READ_WRITE", OgreJNI.TA_READ_WRITE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TextureAccess swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TextureAccess.class + " with value " + swigValue);
  }

  private TextureAccess(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TextureAccess(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TextureAccess(String swigName, TextureAccess swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TextureAccess[] swigValues = { TA_READ, TA_WRITE, TA_READ_WRITE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
