/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class GuiMetricsMode {
  public final static GuiMetricsMode GMM_RELATIVE = new GuiMetricsMode("GMM_RELATIVE");
  public final static GuiMetricsMode GMM_PIXELS = new GuiMetricsMode("GMM_PIXELS");
  public final static GuiMetricsMode GMM_RELATIVE_ASPECT_ADJUSTED = new GuiMetricsMode("GMM_RELATIVE_ASPECT_ADJUSTED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GuiMetricsMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GuiMetricsMode.class + " with value " + swigValue);
  }

  private GuiMetricsMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GuiMetricsMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GuiMetricsMode(String swigName, GuiMetricsMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GuiMetricsMode[] swigValues = { GMM_RELATIVE, GMM_PIXELS, GMM_RELATIVE_ASPECT_ADJUSTED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
