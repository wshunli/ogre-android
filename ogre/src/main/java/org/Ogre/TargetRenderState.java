/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class TargetRenderState extends RenderState {
  private transient long swigCPtr;

  protected TargetRenderState(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.TargetRenderState_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TargetRenderState obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_TargetRenderState(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TargetRenderState() {
    this(OgreRTShaderJNI.new_TargetRenderState(), true);
  }

  public void link(RenderState other, Pass srcPass, Pass dstPass) {
    OgreRTShaderJNI.TargetRenderState_link(swigCPtr, this, RenderState.getCPtr(other), other, Pass.getCPtr(srcPass), srcPass, Pass.getCPtr(dstPass), dstPass);
  }

  public void updateGpuProgramsParams(Renderable rend, Pass pass, SWIGTYPE_p_Ogre__AutoParamDataSource source, SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t pLightList) {
    OgreRTShaderJNI.TargetRenderState_updateGpuProgramsParams(swigCPtr, this, Renderable.getCPtr(rend), rend, Pass.getCPtr(pass), pass, SWIGTYPE_p_Ogre__AutoParamDataSource.getCPtr(source), SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t.getCPtr(pLightList));
  }

}