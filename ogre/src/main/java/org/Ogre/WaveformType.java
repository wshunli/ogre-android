/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class WaveformType {
  public final static WaveformType WFT_SINE = new WaveformType("WFT_SINE");
  public final static WaveformType WFT_TRIANGLE = new WaveformType("WFT_TRIANGLE");
  public final static WaveformType WFT_SQUARE = new WaveformType("WFT_SQUARE");
  public final static WaveformType WFT_SAWTOOTH = new WaveformType("WFT_SAWTOOTH");
  public final static WaveformType WFT_INVERSE_SAWTOOTH = new WaveformType("WFT_INVERSE_SAWTOOTH");
  public final static WaveformType WFT_PWM = new WaveformType("WFT_PWM");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static WaveformType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + WaveformType.class + " with value " + swigValue);
  }

  private WaveformType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private WaveformType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private WaveformType(String swigName, WaveformType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static WaveformType[] swigValues = { WFT_SINE, WFT_TRIANGLE, WFT_SQUARE, WFT_SAWTOOTH, WFT_INVERSE_SAWTOOTH, WFT_PWM };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

