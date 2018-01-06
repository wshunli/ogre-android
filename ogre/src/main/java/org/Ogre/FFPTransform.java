/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class FFPTransform extends SubRenderState {
  private transient long swigCPtr;

  protected FFPTransform(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.FFPTransform_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FFPTransform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_FFPTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int getExecutionOrder() {
    return OgreRTShaderJNI.FFPTransform_getExecutionOrder(swigCPtr, this);
  }

  public void copyFrom(SubRenderState rhs) {
    OgreRTShaderJNI.FFPTransform_copyFrom(swigCPtr, this, SubRenderState.getCPtr(rhs), rhs);
  }

  public boolean createCpuSubPrograms(SWIGTYPE_p_Ogre__RTShader__ProgramSet programSet) {
    return OgreRTShaderJNI.FFPTransform_createCpuSubPrograms(swigCPtr, this, SWIGTYPE_p_Ogre__RTShader__ProgramSet.getCPtr(programSet));
  }

  public boolean preAddToRenderState(RenderState renderState, Pass srcPass, Pass dstPass) {
    return OgreRTShaderJNI.FFPTransform_preAddToRenderState(swigCPtr, this, RenderState.getCPtr(renderState), renderState, Pass.getCPtr(srcPass), srcPass, Pass.getCPtr(dstPass), dstPass);
  }

  public static void setType(String value) {
    OgreRTShaderJNI.FFPTransform_Type_set(value);
  }

  public static String getType() {
    return OgreRTShaderJNI.FFPTransform_Type_get();
  }

  public FFPTransform() {
    this(OgreRTShaderJNI.new_FFPTransform(), true);
  }

}
