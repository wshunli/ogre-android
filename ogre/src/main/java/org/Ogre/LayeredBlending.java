/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class LayeredBlending extends FFPTexturing {
  private transient long swigCPtr;

  protected LayeredBlending(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.LayeredBlending_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LayeredBlending obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_LayeredBlending(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static public class TextureBlend {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected TextureBlend(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(TextureBlend obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreRTShaderJNI.delete_LayeredBlending_TextureBlend(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public TextureBlend() {
      this(OgreRTShaderJNI.new_LayeredBlending_TextureBlend(), true);
    }
  
    public void setBlendMode(LayeredBlending.BlendMode value) {
      OgreRTShaderJNI.LayeredBlending_TextureBlend_blendMode_set(swigCPtr, this, value.swigValue());
    }
  
    public LayeredBlending.BlendMode getBlendMode() {
      return LayeredBlending.BlendMode.swigToEnum(OgreRTShaderJNI.LayeredBlending_TextureBlend_blendMode_get(swigCPtr, this));
    }
  
    public void setSourceModifier(LayeredBlending.SourceModifier value) {
      OgreRTShaderJNI.LayeredBlending_TextureBlend_sourceModifier_set(swigCPtr, this, value.swigValue());
    }
  
    public LayeredBlending.SourceModifier getSourceModifier() {
      return LayeredBlending.SourceModifier.swigToEnum(OgreRTShaderJNI.LayeredBlending_TextureBlend_sourceModifier_get(swigCPtr, this));
    }
  
    public void setCustomNum(int value) {
      OgreRTShaderJNI.LayeredBlending_TextureBlend_customNum_set(swigCPtr, this, value);
    }
  
    public int getCustomNum() {
      return OgreRTShaderJNI.LayeredBlending_TextureBlend_customNum_get(swigCPtr, this);
    }
  
    public void setModControlParam(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__RTShader__Parameter_t value) {
      OgreRTShaderJNI.LayeredBlending_TextureBlend_modControlParam_set(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__RTShader__Parameter_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__RTShader__Parameter_t getModControlParam() {
      long cPtr = OgreRTShaderJNI.LayeredBlending_TextureBlend_modControlParam_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__RTShader__Parameter_t(cPtr, false);
    }
  
  }

  public LayeredBlending() {
    this(OgreRTShaderJNI.new_LayeredBlending(), true);
  }

  public void setBlendMode(int index, LayeredBlending.BlendMode mode) {
    OgreRTShaderJNI.LayeredBlending_setBlendMode(swigCPtr, this, index, mode.swigValue());
  }

  public LayeredBlending.BlendMode getBlendMode(int index) {
    return LayeredBlending.BlendMode.swigToEnum(OgreRTShaderJNI.LayeredBlending_getBlendMode(swigCPtr, this, index));
  }

  public void setSourceModifier(int index, LayeredBlending.SourceModifier modType, int customNum) {
    OgreRTShaderJNI.LayeredBlending_setSourceModifier(swigCPtr, this, index, modType.swigValue(), customNum);
  }

  public boolean getSourceModifier(int index, SWIGTYPE_p_Ogre__RTShader__LayeredBlending__SourceModifier modType, SWIGTYPE_p_int customNum) {
    return OgreRTShaderJNI.LayeredBlending_getSourceModifier(swigCPtr, this, index, SWIGTYPE_p_Ogre__RTShader__LayeredBlending__SourceModifier.getCPtr(modType), SWIGTYPE_p_int.getCPtr(customNum));
  }

  public void copyFrom(SubRenderState rhs) {
    OgreRTShaderJNI.LayeredBlending_copyFrom(swigCPtr, this, SubRenderState.getCPtr(rhs), rhs);
  }

  public static void setType(String value) {
    OgreRTShaderJNI.LayeredBlending_Type_set(value);
  }

  public static String getType() {
    return OgreRTShaderJNI.LayeredBlending_Type_get();
  }

  public final static class BlendMode {
    public final static LayeredBlending.BlendMode LB_Invalid = new LayeredBlending.BlendMode("LB_Invalid", OgreRTShaderJNI.LayeredBlending_LB_Invalid_get());
    public final static LayeredBlending.BlendMode LB_FFPBlend = new LayeredBlending.BlendMode("LB_FFPBlend");
    public final static LayeredBlending.BlendMode LB_BlendNormal = new LayeredBlending.BlendMode("LB_BlendNormal");
    public final static LayeredBlending.BlendMode LB_BlendLighten = new LayeredBlending.BlendMode("LB_BlendLighten");
    public final static LayeredBlending.BlendMode LB_BlendDarken = new LayeredBlending.BlendMode("LB_BlendDarken");
    public final static LayeredBlending.BlendMode LB_BlendMultiply = new LayeredBlending.BlendMode("LB_BlendMultiply");
    public final static LayeredBlending.BlendMode LB_BlendAverage = new LayeredBlending.BlendMode("LB_BlendAverage");
    public final static LayeredBlending.BlendMode LB_BlendAdd = new LayeredBlending.BlendMode("LB_BlendAdd");
    public final static LayeredBlending.BlendMode LB_BlendSubtract = new LayeredBlending.BlendMode("LB_BlendSubtract");
    public final static LayeredBlending.BlendMode LB_BlendDifference = new LayeredBlending.BlendMode("LB_BlendDifference");
    public final static LayeredBlending.BlendMode LB_BlendNegation = new LayeredBlending.BlendMode("LB_BlendNegation");
    public final static LayeredBlending.BlendMode LB_BlendExclusion = new LayeredBlending.BlendMode("LB_BlendExclusion");
    public final static LayeredBlending.BlendMode LB_BlendScreen = new LayeredBlending.BlendMode("LB_BlendScreen");
    public final static LayeredBlending.BlendMode LB_BlendOverlay = new LayeredBlending.BlendMode("LB_BlendOverlay");
    public final static LayeredBlending.BlendMode LB_BlendSoftLight = new LayeredBlending.BlendMode("LB_BlendSoftLight");
    public final static LayeredBlending.BlendMode LB_BlendHardLight = new LayeredBlending.BlendMode("LB_BlendHardLight");
    public final static LayeredBlending.BlendMode LB_BlendColorDodge = new LayeredBlending.BlendMode("LB_BlendColorDodge");
    public final static LayeredBlending.BlendMode LB_BlendColorBurn = new LayeredBlending.BlendMode("LB_BlendColorBurn");
    public final static LayeredBlending.BlendMode LB_BlendLinearDodge = new LayeredBlending.BlendMode("LB_BlendLinearDodge");
    public final static LayeredBlending.BlendMode LB_BlendLinearBurn = new LayeredBlending.BlendMode("LB_BlendLinearBurn");
    public final static LayeredBlending.BlendMode LB_BlendLinearLight = new LayeredBlending.BlendMode("LB_BlendLinearLight");
    public final static LayeredBlending.BlendMode LB_BlendVividLight = new LayeredBlending.BlendMode("LB_BlendVividLight");
    public final static LayeredBlending.BlendMode LB_BlendPinLight = new LayeredBlending.BlendMode("LB_BlendPinLight");
    public final static LayeredBlending.BlendMode LB_BlendHardMix = new LayeredBlending.BlendMode("LB_BlendHardMix");
    public final static LayeredBlending.BlendMode LB_BlendReflect = new LayeredBlending.BlendMode("LB_BlendReflect");
    public final static LayeredBlending.BlendMode LB_BlendGlow = new LayeredBlending.BlendMode("LB_BlendGlow");
    public final static LayeredBlending.BlendMode LB_BlendPhoenix = new LayeredBlending.BlendMode("LB_BlendPhoenix");
    public final static LayeredBlending.BlendMode LB_BlendSaturation = new LayeredBlending.BlendMode("LB_BlendSaturation");
    public final static LayeredBlending.BlendMode LB_BlendColor = new LayeredBlending.BlendMode("LB_BlendColor");
    public final static LayeredBlending.BlendMode LB_BlendLuminosity = new LayeredBlending.BlendMode("LB_BlendLuminosity");
    public final static LayeredBlending.BlendMode LB_MaxBlendModes = new LayeredBlending.BlendMode("LB_MaxBlendModes");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static BlendMode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + BlendMode.class + " with value " + swigValue);
    }

    private BlendMode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private BlendMode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private BlendMode(String swigName, BlendMode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static BlendMode[] swigValues = { LB_Invalid, LB_FFPBlend, LB_BlendNormal, LB_BlendLighten, LB_BlendDarken, LB_BlendMultiply, LB_BlendAverage, LB_BlendAdd, LB_BlendSubtract, LB_BlendDifference, LB_BlendNegation, LB_BlendExclusion, LB_BlendScreen, LB_BlendOverlay, LB_BlendSoftLight, LB_BlendHardLight, LB_BlendColorDodge, LB_BlendColorBurn, LB_BlendLinearDodge, LB_BlendLinearBurn, LB_BlendLinearLight, LB_BlendVividLight, LB_BlendPinLight, LB_BlendHardMix, LB_BlendReflect, LB_BlendGlow, LB_BlendPhoenix, LB_BlendSaturation, LB_BlendColor, LB_BlendLuminosity, LB_MaxBlendModes };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class SourceModifier {
    public final static LayeredBlending.SourceModifier SM_Invalid = new LayeredBlending.SourceModifier("SM_Invalid", OgreRTShaderJNI.LayeredBlending_SM_Invalid_get());
    public final static LayeredBlending.SourceModifier SM_None = new LayeredBlending.SourceModifier("SM_None");
    public final static LayeredBlending.SourceModifier SM_Source1Modulate = new LayeredBlending.SourceModifier("SM_Source1Modulate");
    public final static LayeredBlending.SourceModifier SM_Source2Modulate = new LayeredBlending.SourceModifier("SM_Source2Modulate");
    public final static LayeredBlending.SourceModifier SM_Source1InvModulate = new LayeredBlending.SourceModifier("SM_Source1InvModulate");
    public final static LayeredBlending.SourceModifier SM_Source2InvModulate = new LayeredBlending.SourceModifier("SM_Source2InvModulate");
    public final static LayeredBlending.SourceModifier SM_MaxSourceModifiers = new LayeredBlending.SourceModifier("SM_MaxSourceModifiers");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static SourceModifier swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + SourceModifier.class + " with value " + swigValue);
    }

    private SourceModifier(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private SourceModifier(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private SourceModifier(String swigName, SourceModifier swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static SourceModifier[] swigValues = { SM_Invalid, SM_None, SM_Source1Modulate, SM_Source2Modulate, SM_Source1InvModulate, SM_Source2InvModulate, SM_MaxSourceModifiers };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
