/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Button extends Widget {
  private transient long swigCPtr;

  protected Button(long cPtr, boolean cMemoryOwn) {
    super(OgreBitesJNI.Button_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Button obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreBitesJNI.delete_Button(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Button(String name, SWIGTYPE_p_Ogre__DisplayString caption, float width) {
    this(OgreBitesJNI.new_Button(name, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption), width), true);
  }

  public SWIGTYPE_p_Ogre__DisplayString getCaption() {
    return new SWIGTYPE_p_Ogre__DisplayString(OgreBitesJNI.Button_getCaption(swigCPtr, this), false);
  }

  public void setCaption(SWIGTYPE_p_Ogre__DisplayString caption) {
    OgreBitesJNI.Button_setCaption(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption));
  }

  public ButtonState getState() {
    return ButtonState.swigToEnum(OgreBitesJNI.Button_getState(swigCPtr, this));
  }

  public void _cursorPressed(Vector2 cursorPos) {
    OgreBitesJNI.Button__cursorPressed(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos);
  }

  public void _cursorReleased(Vector2 cursorPos) {
    OgreBitesJNI.Button__cursorReleased(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos);
  }

  public void _cursorMoved(Vector2 cursorPos, float wheelDelta) {
    OgreBitesJNI.Button__cursorMoved(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos, wheelDelta);
  }

  public void _focusLost() {
    OgreBitesJNI.Button__focusLost(swigCPtr, this);
  }

}
