/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class GpuSharedParametersUsage {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GpuSharedParametersUsage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GpuSharedParametersUsage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_GpuSharedParametersUsage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GpuSharedParametersUsage(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuSharedParameters_t sharedParams, GpuProgramParameters params) {
    this(OgreJNI.new_GpuSharedParametersUsage(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuSharedParameters_t.getCPtr(sharedParams), GpuProgramParameters.getCPtr(params), params), true);
  }

  public void _copySharedParamsToTargetParams() {
    OgreJNI.GpuSharedParametersUsage__copySharedParamsToTargetParams(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.GpuSharedParametersUsage_getName(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuSharedParameters_t getSharedParams() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuSharedParameters_t(OgreJNI.GpuSharedParametersUsage_getSharedParams(swigCPtr, this), true);
  }

  public GpuProgramParameters getTargetParams() {
    long cPtr = OgreJNI.GpuSharedParametersUsage_getTargetParams(swigCPtr, this);
    return (cPtr == 0) ? null : new GpuProgramParameters(cPtr, false);
  }

  public void _setRenderSystemData(Any data) {
    OgreJNI.GpuSharedParametersUsage__setRenderSystemData(swigCPtr, this, Any.getCPtr(data), data);
  }

  public Any _getRenderSystemData() {
    return new Any(OgreJNI.GpuSharedParametersUsage__getRenderSystemData(swigCPtr, this), false);
  }

}