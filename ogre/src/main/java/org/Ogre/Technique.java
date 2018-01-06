/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Technique {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Technique(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Technique obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Technique(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class GPUVendorRule {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected GPUVendorRule(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(GPUVendorRule obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_Technique_GPUVendorRule(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setVendor(GPUVendor value) {
      OgreJNI.Technique_GPUVendorRule_vendor_set(swigCPtr, this, value.swigValue());
    }
  
    public GPUVendor getVendor() {
      return GPUVendor.swigToEnum(OgreJNI.Technique_GPUVendorRule_vendor_get(swigCPtr, this));
    }
  
    public void setIncludeOrExclude(Technique.IncludeOrExclude value) {
      OgreJNI.Technique_GPUVendorRule_includeOrExclude_set(swigCPtr, this, value.swigValue());
    }
  
    public Technique.IncludeOrExclude getIncludeOrExclude() {
      return Technique.IncludeOrExclude.swigToEnum(OgreJNI.Technique_GPUVendorRule_includeOrExclude_get(swigCPtr, this));
    }
  
    public GPUVendorRule() {
      this(OgreJNI.new_Technique_GPUVendorRule__SWIG_0(), true);
    }
  
    public GPUVendorRule(GPUVendor v, Technique.IncludeOrExclude ie) {
      this(OgreJNI.new_Technique_GPUVendorRule__SWIG_1(v.swigValue(), ie.swigValue()), true);
    }
  
  }

  static public class GPUDeviceNameRule {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected GPUDeviceNameRule(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(GPUDeviceNameRule obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_Technique_GPUDeviceNameRule(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setDevicePattern(String value) {
      OgreJNI.Technique_GPUDeviceNameRule_devicePattern_set(swigCPtr, this, value);
    }
  
    public String getDevicePattern() {
      return OgreJNI.Technique_GPUDeviceNameRule_devicePattern_get(swigCPtr, this);
    }
  
    public void setIncludeOrExclude(Technique.IncludeOrExclude value) {
      OgreJNI.Technique_GPUDeviceNameRule_includeOrExclude_set(swigCPtr, this, value.swigValue());
    }
  
    public Technique.IncludeOrExclude getIncludeOrExclude() {
      return Technique.IncludeOrExclude.swigToEnum(OgreJNI.Technique_GPUDeviceNameRule_includeOrExclude_get(swigCPtr, this));
    }
  
    public void setCaseSensitive(boolean value) {
      OgreJNI.Technique_GPUDeviceNameRule_caseSensitive_set(swigCPtr, this, value);
    }
  
    public boolean getCaseSensitive() {
      return OgreJNI.Technique_GPUDeviceNameRule_caseSensitive_get(swigCPtr, this);
    }
  
    public GPUDeviceNameRule() {
      this(OgreJNI.new_Technique_GPUDeviceNameRule__SWIG_0(), true);
    }
  
    public GPUDeviceNameRule(String pattern, Technique.IncludeOrExclude ie, boolean caseSen) {
      this(OgreJNI.new_Technique_GPUDeviceNameRule__SWIG_1(pattern, ie.swigValue(), caseSen), true);
    }
  
  }

  public Technique(Material parent) {
    this(OgreJNI.new_Technique__SWIG_0(Material.getCPtr(parent), parent), true);
  }

  public Technique(Material parent, Technique oth) {
    this(OgreJNI.new_Technique__SWIG_1(Material.getCPtr(parent), parent, Technique.getCPtr(oth), oth), true);
  }

  public boolean isSupported() {
    return OgreJNI.Technique_isSupported(swigCPtr, this);
  }

  public String _compile(boolean autoManageTextureUnits) {
    return OgreJNI.Technique__compile(swigCPtr, this, autoManageTextureUnits);
  }

  public boolean checkGPURules(SWIGTYPE_p_std__basic_stringstreamT_char_std__char_traitsT_char_t_std__allocatorT_char_t_t errors) {
    return OgreJNI.Technique_checkGPURules(swigCPtr, this, SWIGTYPE_p_std__basic_stringstreamT_char_std__char_traitsT_char_t_std__allocatorT_char_t_t.getCPtr(errors));
  }

  public boolean checkHardwareSupport(boolean autoManageTextureUnits, SWIGTYPE_p_std__basic_stringstreamT_char_std__char_traitsT_char_t_std__allocatorT_char_t_t compileErrors) {
    return OgreJNI.Technique_checkHardwareSupport(swigCPtr, this, autoManageTextureUnits, SWIGTYPE_p_std__basic_stringstreamT_char_std__char_traitsT_char_t_std__allocatorT_char_t_t.getCPtr(compileErrors));
  }

  public void _compileIlluminationPasses() {
    OgreJNI.Technique__compileIlluminationPasses(swigCPtr, this);
  }

  public long calculateSize() {
    return OgreJNI.Technique_calculateSize(swigCPtr, this);
  }

  public Pass createPass() {
    long cPtr = OgreJNI.Technique_createPass(swigCPtr, this);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public Pass getPass(int index) {
    long cPtr = OgreJNI.Technique_getPass__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public Pass getPass(String name) {
    long cPtr = OgreJNI.Technique_getPass__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public int getNumPasses() {
    return OgreJNI.Technique_getNumPasses(swigCPtr, this);
  }

  public void removePass(int index) {
    OgreJNI.Technique_removePass(swigCPtr, this, index);
  }

  public void removeAllPasses() {
    OgreJNI.Technique_removeAllPasses(swigCPtr, this);
  }

  public boolean movePass(int sourceIndex, int destinationIndex) {
    return OgreJNI.Technique_movePass(swigCPtr, this, sourceIndex, destinationIndex);
  }

  public Passes getPasses() {
    return new Passes(OgreJNI.Technique_getPasses(swigCPtr, this), false);
  }

  public IlluminationPassList getIlluminationPasses() {
    return new IlluminationPassList(OgreJNI.Technique_getIlluminationPasses(swigCPtr, this), false);
  }

  public Material getParent() {
    long cPtr = OgreJNI.Technique_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new Material(cPtr, false);
  }

  public String getResourceGroup() {
    return OgreJNI.Technique_getResourceGroup(swigCPtr, this);
  }

  public boolean isTransparent() {
    return OgreJNI.Technique_isTransparent(swigCPtr, this);
  }

  public boolean isTransparentSortingEnabled() {
    return OgreJNI.Technique_isTransparentSortingEnabled(swigCPtr, this);
  }

  public boolean isTransparentSortingForced() {
    return OgreJNI.Technique_isTransparentSortingForced(swigCPtr, this);
  }

  public void _prepare() {
    OgreJNI.Technique__prepare(swigCPtr, this);
  }

  public void _unprepare() {
    OgreJNI.Technique__unprepare(swigCPtr, this);
  }

  public void _load() {
    OgreJNI.Technique__load(swigCPtr, this);
  }

  public void _unload() {
    OgreJNI.Technique__unload(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.Technique_isLoaded(swigCPtr, this);
  }

  public void _notifyNeedsRecompile() {
    OgreJNI.Technique__notifyNeedsRecompile(swigCPtr, this);
  }

  public MaterialPtr getShadowCasterMaterial() {
    return new MaterialPtr(OgreJNI.Technique_getShadowCasterMaterial(swigCPtr, this), true);
  }

  public void setShadowCasterMaterial(MaterialPtr val) {
    OgreJNI.Technique_setShadowCasterMaterial__SWIG_0(swigCPtr, this, MaterialPtr.getCPtr(val), val);
  }

  public void setShadowCasterMaterial(String name) {
    OgreJNI.Technique_setShadowCasterMaterial__SWIG_1(swigCPtr, this, name);
  }

  public MaterialPtr getShadowReceiverMaterial() {
    return new MaterialPtr(OgreJNI.Technique_getShadowReceiverMaterial(swigCPtr, this), true);
  }

  public void setShadowReceiverMaterial(MaterialPtr val) {
    OgreJNI.Technique_setShadowReceiverMaterial__SWIG_0(swigCPtr, this, MaterialPtr.getCPtr(val), val);
  }

  public void setShadowReceiverMaterial(String name) {
    OgreJNI.Technique_setShadowReceiverMaterial__SWIG_1(swigCPtr, this, name);
  }

  public void setPointSize(float ps) {
    OgreJNI.Technique_setPointSize(swigCPtr, this, ps);
  }

  public void setAmbient(float red, float green, float blue) {
    OgreJNI.Technique_setAmbient__SWIG_0(swigCPtr, this, red, green, blue);
  }

  public void setAmbient(ColourValue ambient) {
    OgreJNI.Technique_setAmbient__SWIG_1(swigCPtr, this, ColourValue.getCPtr(ambient), ambient);
  }

  public void setDiffuse(float red, float green, float blue, float alpha) {
    OgreJNI.Technique_setDiffuse__SWIG_0(swigCPtr, this, red, green, blue, alpha);
  }

  public void setDiffuse(ColourValue diffuse) {
    OgreJNI.Technique_setDiffuse__SWIG_1(swigCPtr, this, ColourValue.getCPtr(diffuse), diffuse);
  }

  public void setSpecular(float red, float green, float blue, float alpha) {
    OgreJNI.Technique_setSpecular__SWIG_0(swigCPtr, this, red, green, blue, alpha);
  }

  public void setSpecular(ColourValue specular) {
    OgreJNI.Technique_setSpecular__SWIG_1(swigCPtr, this, ColourValue.getCPtr(specular), specular);
  }

  public void setShininess(float val) {
    OgreJNI.Technique_setShininess(swigCPtr, this, val);
  }

  public void setSelfIllumination(float red, float green, float blue) {
    OgreJNI.Technique_setSelfIllumination__SWIG_0(swigCPtr, this, red, green, blue);
  }

  public void setSelfIllumination(ColourValue selfIllum) {
    OgreJNI.Technique_setSelfIllumination__SWIG_1(swigCPtr, this, ColourValue.getCPtr(selfIllum), selfIllum);
  }

  public void setDepthCheckEnabled(boolean enabled) {
    OgreJNI.Technique_setDepthCheckEnabled(swigCPtr, this, enabled);
  }

  public void setDepthWriteEnabled(boolean enabled) {
    OgreJNI.Technique_setDepthWriteEnabled(swigCPtr, this, enabled);
  }

  public void setDepthFunction(CompareFunction func) {
    OgreJNI.Technique_setDepthFunction(swigCPtr, this, func.swigValue());
  }

  public void setColourWriteEnabled(boolean enabled) {
    OgreJNI.Technique_setColourWriteEnabled(swigCPtr, this, enabled);
  }

  public void setCullingMode(CullingMode mode) {
    OgreJNI.Technique_setCullingMode(swigCPtr, this, mode.swigValue());
  }

  public void setManualCullingMode(ManualCullingMode mode) {
    OgreJNI.Technique_setManualCullingMode(swigCPtr, this, mode.swigValue());
  }

  public void setLightingEnabled(boolean enabled) {
    OgreJNI.Technique_setLightingEnabled(swigCPtr, this, enabled);
  }

  public void setShadingMode(ShadeOptions mode) {
    OgreJNI.Technique_setShadingMode(swigCPtr, this, mode.swigValue());
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour, float expDensity, float linearStart, float linearEnd) {
    OgreJNI.Technique_setFog__SWIG_0(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour, expDensity, linearStart, linearEnd);
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour, float expDensity, float linearStart) {
    OgreJNI.Technique_setFog__SWIG_1(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour, expDensity, linearStart);
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour, float expDensity) {
    OgreJNI.Technique_setFog__SWIG_2(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour, expDensity);
  }

  public void setFog(boolean overrideScene, FogMode mode, ColourValue colour) {
    OgreJNI.Technique_setFog__SWIG_3(swigCPtr, this, overrideScene, mode.swigValue(), ColourValue.getCPtr(colour), colour);
  }

  public void setFog(boolean overrideScene, FogMode mode) {
    OgreJNI.Technique_setFog__SWIG_4(swigCPtr, this, overrideScene, mode.swigValue());
  }

  public void setFog(boolean overrideScene) {
    OgreJNI.Technique_setFog__SWIG_5(swigCPtr, this, overrideScene);
  }

  public void setDepthBias(float constantBias, float slopeScaleBias) {
    OgreJNI.Technique_setDepthBias(swigCPtr, this, constantBias, slopeScaleBias);
  }

  public void setTextureFiltering(TextureFilterOptions filterType) {
    OgreJNI.Technique_setTextureFiltering(swigCPtr, this, filterType.swigValue());
  }

  public void setTextureAnisotropy(long maxAniso) {
    OgreJNI.Technique_setTextureAnisotropy(swigCPtr, this, maxAniso);
  }

  public void setSceneBlending(SceneBlendType sbt) {
    OgreJNI.Technique_setSceneBlending__SWIG_0(swigCPtr, this, sbt.swigValue());
  }

  public void setSeparateSceneBlending(SceneBlendType sbt, SceneBlendType sbta) {
    OgreJNI.Technique_setSeparateSceneBlending__SWIG_0(swigCPtr, this, sbt.swigValue(), sbta.swigValue());
  }

  public void setSceneBlending(SceneBlendFactor sourceFactor, SceneBlendFactor destFactor) {
    OgreJNI.Technique_setSceneBlending__SWIG_1(swigCPtr, this, sourceFactor.swigValue(), destFactor.swigValue());
  }

  public void setSeparateSceneBlending(SceneBlendFactor sourceFactor, SceneBlendFactor destFactor, SceneBlendFactor sourceFactorAlpha, SceneBlendFactor destFactorAlpha) {
    OgreJNI.Technique_setSeparateSceneBlending__SWIG_1(swigCPtr, this, sourceFactor.swigValue(), destFactor.swigValue(), sourceFactorAlpha.swigValue(), destFactorAlpha.swigValue());
  }

  public void setLodIndex(int index) {
    OgreJNI.Technique_setLodIndex(swigCPtr, this, index);
  }

  public int getLodIndex() {
    return OgreJNI.Technique_getLodIndex(swigCPtr, this);
  }

  public void setSchemeName(String schemeName) {
    OgreJNI.Technique_setSchemeName(swigCPtr, this, schemeName);
  }

  public String getSchemeName() {
    return OgreJNI.Technique_getSchemeName(swigCPtr, this);
  }

  public int _getSchemeIndex() {
    return OgreJNI.Technique__getSchemeIndex(swigCPtr, this);
  }

  public boolean isDepthWriteEnabled() {
    return OgreJNI.Technique_isDepthWriteEnabled(swigCPtr, this);
  }

  public boolean isDepthCheckEnabled() {
    return OgreJNI.Technique_isDepthCheckEnabled(swigCPtr, this);
  }

  public boolean hasColourWriteDisabled() {
    return OgreJNI.Technique_hasColourWriteDisabled(swigCPtr, this);
  }

  public void setName(String name) {
    OgreJNI.Technique_setName(swigCPtr, this, name);
  }

  public String getName() {
    return OgreJNI.Technique_getName(swigCPtr, this);
  }

  public boolean applyTextureAliases(SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t aliasList, boolean apply) {
    return OgreJNI.Technique_applyTextureAliases__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(aliasList), apply);
  }

  public boolean applyTextureAliases(SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t aliasList) {
    return OgreJNI.Technique_applyTextureAliases__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(aliasList));
  }

  public void addGPUVendorRule(GPUVendor vendor, Technique.IncludeOrExclude includeOrExclude) {
    OgreJNI.Technique_addGPUVendorRule__SWIG_0(swigCPtr, this, vendor.swigValue(), includeOrExclude.swigValue());
  }

  public void addGPUVendorRule(Technique.GPUVendorRule rule) {
    OgreJNI.Technique_addGPUVendorRule__SWIG_1(swigCPtr, this, Technique.GPUVendorRule.getCPtr(rule), rule);
  }

  public void removeGPUVendorRule(GPUVendor vendor) {
    OgreJNI.Technique_removeGPUVendorRule(swigCPtr, this, vendor.swigValue());
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__Technique__GPUVendorRule_t__type getGPUVendorRules() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__Technique__GPUVendorRule_t__type(OgreJNI.Technique_getGPUVendorRules(swigCPtr, this), false);
  }

  public void addGPUDeviceNameRule(String devicePattern, Technique.IncludeOrExclude includeOrExclude, boolean caseSensitive) {
    OgreJNI.Technique_addGPUDeviceNameRule__SWIG_0(swigCPtr, this, devicePattern, includeOrExclude.swigValue(), caseSensitive);
  }

  public void addGPUDeviceNameRule(String devicePattern, Technique.IncludeOrExclude includeOrExclude) {
    OgreJNI.Technique_addGPUDeviceNameRule__SWIG_1(swigCPtr, this, devicePattern, includeOrExclude.swigValue());
  }

  public void addGPUDeviceNameRule(Technique.GPUDeviceNameRule rule) {
    OgreJNI.Technique_addGPUDeviceNameRule__SWIG_2(swigCPtr, this, Technique.GPUDeviceNameRule.getCPtr(rule), rule);
  }

  public void removeGPUDeviceNameRule(String devicePattern) {
    OgreJNI.Technique_removeGPUDeviceNameRule(swigCPtr, this, devicePattern);
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__Technique__GPUDeviceNameRule_t__type getGPUDeviceNameRules() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__Technique__GPUDeviceNameRule_t__type(OgreJNI.Technique_getGPUDeviceNameRules(swigCPtr, this), false);
  }

  public UserObjectBindings getUserObjectBindings() {
    return new UserObjectBindings(OgreJNI.Technique_getUserObjectBindings__SWIG_0(swigCPtr, this), false);
  }

  public final static class IncludeOrExclude {
    public final static Technique.IncludeOrExclude INCLUDE = new Technique.IncludeOrExclude("INCLUDE", OgreJNI.Technique_INCLUDE_get());
    public final static Technique.IncludeOrExclude EXCLUDE = new Technique.IncludeOrExclude("EXCLUDE", OgreJNI.Technique_EXCLUDE_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static IncludeOrExclude swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + IncludeOrExclude.class + " with value " + swigValue);
    }

    private IncludeOrExclude(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private IncludeOrExclude(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private IncludeOrExclude(String swigName, IncludeOrExclude swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static IncludeOrExclude[] swigValues = { INCLUDE, EXCLUDE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}