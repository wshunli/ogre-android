/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class BillboardRotationType {
  public final static BillboardRotationType BBR_VERTEX = new BillboardRotationType("BBR_VERTEX");
  public final static BillboardRotationType BBR_TEXCOORD = new BillboardRotationType("BBR_TEXCOORD");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BillboardRotationType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BillboardRotationType.class + " with value " + swigValue);
  }

  private BillboardRotationType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BillboardRotationType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BillboardRotationType(String swigName, BillboardRotationType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BillboardRotationType[] swigValues = { BBR_VERTEX, BBR_TEXCOORD };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
