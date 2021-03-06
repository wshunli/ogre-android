/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class CapabilitiesCategory {
  public final static CapabilitiesCategory CAPS_CATEGORY_COMMON = new CapabilitiesCategory("CAPS_CATEGORY_COMMON", OgreJNI.CAPS_CATEGORY_COMMON_get());
  public final static CapabilitiesCategory CAPS_CATEGORY_COMMON_2 = new CapabilitiesCategory("CAPS_CATEGORY_COMMON_2", OgreJNI.CAPS_CATEGORY_COMMON_2_get());
  public final static CapabilitiesCategory CAPS_CATEGORY_D3D9 = new CapabilitiesCategory("CAPS_CATEGORY_D3D9", OgreJNI.CAPS_CATEGORY_D3D9_get());
  public final static CapabilitiesCategory CAPS_CATEGORY_GL = new CapabilitiesCategory("CAPS_CATEGORY_GL", OgreJNI.CAPS_CATEGORY_GL_get());
  public final static CapabilitiesCategory CAPS_CATEGORY_COMMON_3 = new CapabilitiesCategory("CAPS_CATEGORY_COMMON_3", OgreJNI.CAPS_CATEGORY_COMMON_3_get());
  public final static CapabilitiesCategory CAPS_CATEGORY_COUNT = new CapabilitiesCategory("CAPS_CATEGORY_COUNT", OgreJNI.CAPS_CATEGORY_COUNT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CapabilitiesCategory swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CapabilitiesCategory.class + " with value " + swigValue);
  }

  private CapabilitiesCategory(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CapabilitiesCategory(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CapabilitiesCategory(String swigName, CapabilitiesCategory swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CapabilitiesCategory[] swigValues = { CAPS_CATEGORY_COMMON, CAPS_CATEGORY_COMMON_2, CAPS_CATEGORY_D3D9, CAPS_CATEGORY_GL, CAPS_CATEGORY_COMMON_3, CAPS_CATEGORY_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

