/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class CameraMan extends InputListener {
  private transient long swigCPtr;

  protected CameraMan(long cPtr, boolean cMemoryOwn) {
    super(OgreBitesJNI.CameraMan_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CameraMan obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreBitesJNI.delete_CameraMan(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CameraMan(SceneNode cam) {
    this(OgreBitesJNI.new_CameraMan(SceneNode.getCPtr(cam), cam), true);
  }

  public void setCamera(SceneNode cam) {
    OgreBitesJNI.CameraMan_setCamera(swigCPtr, this, SceneNode.getCPtr(cam), cam);
  }

  public SceneNode getCamera() {
    long cPtr = OgreBitesJNI.CameraMan_getCamera(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public void setTarget(SceneNode target) {
    OgreBitesJNI.CameraMan_setTarget(swigCPtr, this, SceneNode.getCPtr(target), target);
  }

  public SceneNode getTarget() {
    long cPtr = OgreBitesJNI.CameraMan_getTarget(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public void setYawPitchDist(Radian yaw, Radian pitch, float dist) {
    OgreBitesJNI.CameraMan_setYawPitchDist(swigCPtr, this, Radian.getCPtr(yaw), yaw, Radian.getCPtr(pitch), pitch, dist);
  }

  public void setTopSpeed(float topSpeed) {
    OgreBitesJNI.CameraMan_setTopSpeed(swigCPtr, this, topSpeed);
  }

  public float getTopSpeed() {
    return OgreBitesJNI.CameraMan_getTopSpeed(swigCPtr, this);
  }

  public void setStyle(CameraStyle style) {
    OgreBitesJNI.CameraMan_setStyle(swigCPtr, this, style.swigValue());
  }

  public CameraStyle getStyle() {
    return CameraStyle.swigToEnum(OgreBitesJNI.CameraMan_getStyle(swigCPtr, this));
  }

  public void manualStop() {
    OgreBitesJNI.CameraMan_manualStop(swigCPtr, this);
  }

  public void frameRendered(FrameEvent evt) {
    OgreBitesJNI.CameraMan_frameRendered(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public boolean keyPressed(KeyboardEvent evt) {
    return OgreBitesJNI.CameraMan_keyPressed(swigCPtr, this, KeyboardEvent.getCPtr(evt), evt);
  }

  public boolean keyReleased(KeyboardEvent evt) {
    return OgreBitesJNI.CameraMan_keyReleased(swigCPtr, this, KeyboardEvent.getCPtr(evt), evt);
  }

  public boolean mouseMoved(MouseMotionEvent evt) {
    return OgreBitesJNI.CameraMan_mouseMoved(swigCPtr, this, MouseMotionEvent.getCPtr(evt), evt);
  }

  public boolean mouseWheelRolled(MouseWheelEvent evt) {
    return OgreBitesJNI.CameraMan_mouseWheelRolled(swigCPtr, this, MouseWheelEvent.getCPtr(evt), evt);
  }

  public boolean mousePressed(MouseButtonEvent evt) {
    return OgreBitesJNI.CameraMan_mousePressed(swigCPtr, this, MouseButtonEvent.getCPtr(evt), evt);
  }

  public boolean mouseReleased(MouseButtonEvent evt) {
    return OgreBitesJNI.CameraMan_mouseReleased(swigCPtr, this, MouseButtonEvent.getCPtr(evt), evt);
  }

}