/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class GuiVerticalAlignment {
  public final static GuiVerticalAlignment GVA_TOP = new GuiVerticalAlignment("GVA_TOP");
  public final static GuiVerticalAlignment GVA_CENTER = new GuiVerticalAlignment("GVA_CENTER");
  public final static GuiVerticalAlignment GVA_BOTTOM = new GuiVerticalAlignment("GVA_BOTTOM");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GuiVerticalAlignment swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GuiVerticalAlignment.class + " with value " + swigValue);
  }

  private GuiVerticalAlignment(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GuiVerticalAlignment(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GuiVerticalAlignment(String swigName, GuiVerticalAlignment swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GuiVerticalAlignment[] swigValues = { GVA_TOP, GVA_CENTER, GVA_BOTTOM };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
