/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ShadowCameraSetupPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ShadowCameraSetupPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ShadowCameraSetupPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ShadowCameraSetupPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShadowCameraSetupPtr() {
    this(OgreJNI.new_ShadowCameraSetupPtr__SWIG_1(), true);
  }

  public ShadowCameraSetupPtr(ShadowCameraSetupPtr r) {
    this(OgreJNI.new_ShadowCameraSetupPtr__SWIG_2(ShadowCameraSetupPtr.getCPtr(r), r), true);
  }

  public ShadowCameraSetup __ref__() {
    return new ShadowCameraSetup(OgreJNI.ShadowCameraSetupPtr___ref__(swigCPtr, this), false);
  }

  public ShadowCameraSetup __deref__() {
    long cPtr = OgreJNI.ShadowCameraSetupPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new ShadowCameraSetup(cPtr, false);
  }

  public ShadowCameraSetup get() {
    long cPtr = OgreJNI.ShadowCameraSetupPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ShadowCameraSetup(cPtr, false);
  }

  public boolean unique() {
    return OgreJNI.ShadowCameraSetupPtr_unique(swigCPtr, this);
  }

  public int use_count() {
    return OgreJNI.ShadowCameraSetupPtr_use_count(swigCPtr, this);
  }

  public void reset() {
    OgreJNI.ShadowCameraSetupPtr_reset__SWIG_0(swigCPtr, this);
  }

  public void reset(ShadowCameraSetup rep) {
    OgreJNI.ShadowCameraSetupPtr_reset__SWIG_1(swigCPtr, this, ShadowCameraSetup.getCPtr(rep), rep);
  }

  public void getShadowCamera(SceneManager sm, Camera cam, Viewport vp, Light light, Camera texCam, long iteration) {
    OgreJNI.ShadowCameraSetupPtr_getShadowCamera(swigCPtr, this, SceneManager.getCPtr(sm), sm, Camera.getCPtr(cam), cam, Viewport.getCPtr(vp), vp, Light.getCPtr(light), light, Camera.getCPtr(texCam), texCam, iteration);
  }

}
