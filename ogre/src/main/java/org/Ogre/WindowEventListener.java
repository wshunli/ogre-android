/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class WindowEventListener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected WindowEventListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WindowEventListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreBitesJNI.delete_WindowEventListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void windowMoved(RenderWindow rw) {
    OgreBitesJNI.WindowEventListener_windowMoved(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void windowResized(RenderWindow rw) {
    OgreBitesJNI.WindowEventListener_windowResized(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public boolean windowClosing(RenderWindow rw) {
    return OgreBitesJNI.WindowEventListener_windowClosing(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void windowClosed(RenderWindow rw) {
    OgreBitesJNI.WindowEventListener_windowClosed(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void windowFocusChange(RenderWindow rw) {
    OgreBitesJNI.WindowEventListener_windowFocusChange(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public WindowEventListener() {
    this(OgreBitesJNI.new_WindowEventListener(), true);
  }

}