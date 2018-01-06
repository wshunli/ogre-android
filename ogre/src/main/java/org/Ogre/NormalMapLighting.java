/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class NormalMapLighting extends PerPixelLighting {
  private transient long swigCPtr;

  protected NormalMapLighting(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.NormalMapLighting_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NormalMapLighting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_NormalMapLighting(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NormalMapLighting() {
    this(OgreRTShaderJNI.new_NormalMapLighting(), true);
  }

  public void updateGpuProgramsParams(Renderable rend, Pass pass, SWIGTYPE_p_Ogre__AutoParamDataSource source, SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t pLightList) {
    OgreRTShaderJNI.NormalMapLighting_updateGpuProgramsParams(swigCPtr, this, Renderable.getCPtr(rend), rend, Pass.getCPtr(pass), pass, SWIGTYPE_p_Ogre__AutoParamDataSource.getCPtr(source), SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t.getCPtr(pLightList));
  }

  public void copyFrom(SubRenderState rhs) {
    OgreRTShaderJNI.NormalMapLighting_copyFrom(swigCPtr, this, SubRenderState.getCPtr(rhs), rhs);
  }

  public boolean preAddToRenderState(RenderState renderState, Pass srcPass, Pass dstPass) {
    return OgreRTShaderJNI.NormalMapLighting_preAddToRenderState(swigCPtr, this, RenderState.getCPtr(renderState), renderState, Pass.getCPtr(srcPass), srcPass, Pass.getCPtr(dstPass), dstPass);
  }

  public void setTexCoordIndex(long index) {
    OgreRTShaderJNI.NormalMapLighting_setTexCoordIndex(swigCPtr, this, index);
  }

  public long getTexCoordIndex() {
    return OgreRTShaderJNI.NormalMapLighting_getTexCoordIndex(swigCPtr, this);
  }

  public static void setType(String value) {
    OgreRTShaderJNI.NormalMapLighting_Type_set(value);
  }

  public static String getType() {
    return OgreRTShaderJNI.NormalMapLighting_Type_get();
  }

  public void setNormalMapSpace(NormalMapLighting.NormalMapSpace normalMapSpace) {
    OgreRTShaderJNI.NormalMapLighting_setNormalMapSpace(swigCPtr, this, normalMapSpace.swigValue());
  }

  public NormalMapLighting.NormalMapSpace getNormalMapSpace() {
    return NormalMapLighting.NormalMapSpace.swigToEnum(OgreRTShaderJNI.NormalMapLighting_getNormalMapSpace(swigCPtr, this));
  }

  public void setNormalMapTextureName(String textureName) {
    OgreRTShaderJNI.NormalMapLighting_setNormalMapTextureName(swigCPtr, this, textureName);
  }

  public String getNormalMapTextureName() {
    return OgreRTShaderJNI.NormalMapLighting_getNormalMapTextureName(swigCPtr, this);
  }

  public void setNormalMapFiltering(FilterOptions minFilter, FilterOptions magFilter, FilterOptions mipFilter) {
    OgreRTShaderJNI.NormalMapLighting_setNormalMapFiltering(swigCPtr, this, minFilter.swigValue(), magFilter.swigValue(), mipFilter.swigValue());
  }

  public void getNormalMapFiltering(SWIGTYPE_p_Ogre__FilterOptions minFilter, SWIGTYPE_p_Ogre__FilterOptions magFilter, SWIGTYPE_p_Ogre__FilterOptions mipFilter) {
    OgreRTShaderJNI.NormalMapLighting_getNormalMapFiltering(swigCPtr, this, SWIGTYPE_p_Ogre__FilterOptions.getCPtr(minFilter), SWIGTYPE_p_Ogre__FilterOptions.getCPtr(magFilter), SWIGTYPE_p_Ogre__FilterOptions.getCPtr(mipFilter));
  }

  public void setNormalMapAnisotropy(long anisotropy) {
    OgreRTShaderJNI.NormalMapLighting_setNormalMapAnisotropy(swigCPtr, this, anisotropy);
  }

  public long getNormalMapAnisotropy() {
    return OgreRTShaderJNI.NormalMapLighting_getNormalMapAnisotropy(swigCPtr, this);
  }

  public void setNormalMapMipBias(float mipBias) {
    OgreRTShaderJNI.NormalMapLighting_setNormalMapMipBias(swigCPtr, this, mipBias);
  }

  public float getNormalMapMipBias() {
    return OgreRTShaderJNI.NormalMapLighting_getNormalMapMipBias(swigCPtr, this);
  }

  public final static class NormalMapSpace {
    public final static NormalMapLighting.NormalMapSpace NMS_TANGENT = new NormalMapLighting.NormalMapSpace("NMS_TANGENT");
    public final static NormalMapLighting.NormalMapSpace NMS_OBJECT = new NormalMapLighting.NormalMapSpace("NMS_OBJECT");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static NormalMapSpace swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + NormalMapSpace.class + " with value " + swigValue);
    }

    private NormalMapSpace(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private NormalMapSpace(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private NormalMapSpace(String swigName, NormalMapSpace swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static NormalMapSpace[] swigValues = { NMS_TANGENT, NMS_OBJECT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
