/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class StencilOperation {
  public final static StencilOperation SOP_KEEP = new StencilOperation("SOP_KEEP");
  public final static StencilOperation SOP_ZERO = new StencilOperation("SOP_ZERO");
  public final static StencilOperation SOP_REPLACE = new StencilOperation("SOP_REPLACE");
  public final static StencilOperation SOP_INCREMENT = new StencilOperation("SOP_INCREMENT");
  public final static StencilOperation SOP_DECREMENT = new StencilOperation("SOP_DECREMENT");
  public final static StencilOperation SOP_INCREMENT_WRAP = new StencilOperation("SOP_INCREMENT_WRAP");
  public final static StencilOperation SOP_DECREMENT_WRAP = new StencilOperation("SOP_DECREMENT_WRAP");
  public final static StencilOperation SOP_INVERT = new StencilOperation("SOP_INVERT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static StencilOperation swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + StencilOperation.class + " with value " + swigValue);
  }

  private StencilOperation(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private StencilOperation(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private StencilOperation(String swigName, StencilOperation swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static StencilOperation[] swigValues = { SOP_KEEP, SOP_ZERO, SOP_REPLACE, SOP_INCREMENT, SOP_DECREMENT, SOP_INCREMENT_WRAP, SOP_DECREMENT_WRAP, SOP_INVERT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

