/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class MouseButtonEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MouseButtonEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MouseButtonEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreBitesJNI.delete_MouseButtonEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    OgreBitesJNI.MouseButtonEvent_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return OgreBitesJNI.MouseButtonEvent_type_get(swigCPtr, this);
  }

  public void setX(int value) {
    OgreBitesJNI.MouseButtonEvent_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return OgreBitesJNI.MouseButtonEvent_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    OgreBitesJNI.MouseButtonEvent_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return OgreBitesJNI.MouseButtonEvent_y_get(swigCPtr, this);
  }

  public void setButton(int value) {
    OgreBitesJNI.MouseButtonEvent_button_set(swigCPtr, this, value);
  }

  public int getButton() {
    return OgreBitesJNI.MouseButtonEvent_button_get(swigCPtr, this);
  }

  public MouseButtonEvent() {
    this(OgreBitesJNI.new_MouseButtonEvent(), true);
  }

}