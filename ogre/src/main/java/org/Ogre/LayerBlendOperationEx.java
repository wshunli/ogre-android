/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class LayerBlendOperationEx {
  public final static LayerBlendOperationEx LBX_SOURCE1 = new LayerBlendOperationEx("LBX_SOURCE1");
  public final static LayerBlendOperationEx LBX_SOURCE2 = new LayerBlendOperationEx("LBX_SOURCE2");
  public final static LayerBlendOperationEx LBX_MODULATE = new LayerBlendOperationEx("LBX_MODULATE");
  public final static LayerBlendOperationEx LBX_MODULATE_X2 = new LayerBlendOperationEx("LBX_MODULATE_X2");
  public final static LayerBlendOperationEx LBX_MODULATE_X4 = new LayerBlendOperationEx("LBX_MODULATE_X4");
  public final static LayerBlendOperationEx LBX_ADD = new LayerBlendOperationEx("LBX_ADD");
  public final static LayerBlendOperationEx LBX_ADD_SIGNED = new LayerBlendOperationEx("LBX_ADD_SIGNED");
  public final static LayerBlendOperationEx LBX_ADD_SMOOTH = new LayerBlendOperationEx("LBX_ADD_SMOOTH");
  public final static LayerBlendOperationEx LBX_SUBTRACT = new LayerBlendOperationEx("LBX_SUBTRACT");
  public final static LayerBlendOperationEx LBX_BLEND_DIFFUSE_ALPHA = new LayerBlendOperationEx("LBX_BLEND_DIFFUSE_ALPHA");
  public final static LayerBlendOperationEx LBX_BLEND_TEXTURE_ALPHA = new LayerBlendOperationEx("LBX_BLEND_TEXTURE_ALPHA");
  public final static LayerBlendOperationEx LBX_BLEND_CURRENT_ALPHA = new LayerBlendOperationEx("LBX_BLEND_CURRENT_ALPHA");
  public final static LayerBlendOperationEx LBX_BLEND_MANUAL = new LayerBlendOperationEx("LBX_BLEND_MANUAL");
  public final static LayerBlendOperationEx LBX_DOTPRODUCT = new LayerBlendOperationEx("LBX_DOTPRODUCT");
  public final static LayerBlendOperationEx LBX_BLEND_DIFFUSE_COLOUR = new LayerBlendOperationEx("LBX_BLEND_DIFFUSE_COLOUR");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LayerBlendOperationEx swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LayerBlendOperationEx.class + " with value " + swigValue);
  }

  private LayerBlendOperationEx(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LayerBlendOperationEx(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LayerBlendOperationEx(String swigName, LayerBlendOperationEx swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LayerBlendOperationEx[] swigValues = { LBX_SOURCE1, LBX_SOURCE2, LBX_MODULATE, LBX_MODULATE_X2, LBX_MODULATE_X4, LBX_ADD, LBX_ADD_SIGNED, LBX_ADD_SMOOTH, LBX_SUBTRACT, LBX_BLEND_DIFFUSE_ALPHA, LBX_BLEND_TEXTURE_ALPHA, LBX_BLEND_CURRENT_ALPHA, LBX_BLEND_MANUAL, LBX_DOTPRODUCT, LBX_BLEND_DIFFUSE_COLOUR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
