/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class FFPLighting extends SubRenderState {
  private transient long swigCPtr;

  protected FFPLighting(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.FFPLighting_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FFPLighting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_FFPLighting(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FFPLighting() {
    this(OgreRTShaderJNI.new_FFPLighting(), true);
  }

  public int getExecutionOrder() {
    return OgreRTShaderJNI.FFPLighting_getExecutionOrder(swigCPtr, this);
  }

  public void updateGpuProgramsParams(Renderable rend, Pass pass, SWIGTYPE_p_Ogre__AutoParamDataSource source, SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t pLightList) {
    OgreRTShaderJNI.FFPLighting_updateGpuProgramsParams(swigCPtr, this, Renderable.getCPtr(rend), rend, Pass.getCPtr(pass), pass, SWIGTYPE_p_Ogre__AutoParamDataSource.getCPtr(source), SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t.getCPtr(pLightList));
  }

  public void copyFrom(SubRenderState rhs) {
    OgreRTShaderJNI.FFPLighting_copyFrom(swigCPtr, this, SubRenderState.getCPtr(rhs), rhs);
  }

  public boolean preAddToRenderState(RenderState renderState, Pass srcPass, Pass dstPass) {
    return OgreRTShaderJNI.FFPLighting_preAddToRenderState(swigCPtr, this, RenderState.getCPtr(renderState), renderState, Pass.getCPtr(srcPass), srcPass, Pass.getCPtr(dstPass), dstPass);
  }

  public static void setType(String value) {
    OgreRTShaderJNI.FFPLighting_Type_set(value);
  }

  public static String getType() {
    return OgreRTShaderJNI.FFPLighting_Type_get();
  }

}
