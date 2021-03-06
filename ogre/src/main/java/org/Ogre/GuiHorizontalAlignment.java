/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class GuiHorizontalAlignment {
  public final static GuiHorizontalAlignment GHA_LEFT = new GuiHorizontalAlignment("GHA_LEFT");
  public final static GuiHorizontalAlignment GHA_CENTER = new GuiHorizontalAlignment("GHA_CENTER");
  public final static GuiHorizontalAlignment GHA_RIGHT = new GuiHorizontalAlignment("GHA_RIGHT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GuiHorizontalAlignment swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GuiHorizontalAlignment.class + " with value " + swigValue);
  }

  private GuiHorizontalAlignment(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GuiHorizontalAlignment(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GuiHorizontalAlignment(String swigName, GuiHorizontalAlignment swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GuiHorizontalAlignment[] swigValues = { GHA_LEFT, GHA_CENTER, GHA_RIGHT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

