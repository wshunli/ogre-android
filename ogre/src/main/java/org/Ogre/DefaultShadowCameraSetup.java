/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class DefaultShadowCameraSetup extends ShadowCameraSetup {
  private transient long swigCPtr;

  protected DefaultShadowCameraSetup(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.DefaultShadowCameraSetup_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultShadowCameraSetup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_DefaultShadowCameraSetup(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DefaultShadowCameraSetup() {
    this(OgreJNI.new_DefaultShadowCameraSetup(), true);
  }

  public void getShadowCamera(SceneManager sm, Camera cam, Viewport vp, Light light, Camera texCam, long iteration) {
    OgreJNI.DefaultShadowCameraSetup_getShadowCamera(swigCPtr, this, SceneManager.getCPtr(sm), sm, Camera.getCPtr(cam), cam, Viewport.getCPtr(vp), vp, Light.getCPtr(light), light, Camera.getCPtr(texCam), texCam, iteration);
  }

}
