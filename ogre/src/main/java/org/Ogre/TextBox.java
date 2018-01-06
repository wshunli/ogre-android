/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class TextBox extends Widget {
  private transient long swigCPtr;

  protected TextBox(long cPtr, boolean cMemoryOwn) {
    super(OgreBitesJNI.TextBox_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreBitesJNI.delete_TextBox(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TextBox(String name, SWIGTYPE_p_Ogre__DisplayString caption, float width, float height) {
    this(OgreBitesJNI.new_TextBox(name, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption), width, height), true);
  }

  public void setPadding(float padding) {
    OgreBitesJNI.TextBox_setPadding(swigCPtr, this, padding);
  }

  public float getPadding() {
    return OgreBitesJNI.TextBox_getPadding(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__DisplayString getCaption() {
    return new SWIGTYPE_p_Ogre__DisplayString(OgreBitesJNI.TextBox_getCaption(swigCPtr, this), false);
  }

  public void setCaption(SWIGTYPE_p_Ogre__DisplayString caption) {
    OgreBitesJNI.TextBox_setCaption(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption));
  }

  public SWIGTYPE_p_Ogre__DisplayString getText() {
    return new SWIGTYPE_p_Ogre__DisplayString(OgreBitesJNI.TextBox_getText(swigCPtr, this), false);
  }

  public void setText(SWIGTYPE_p_Ogre__DisplayString text) {
    OgreBitesJNI.TextBox_setText(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(text));
  }

  public void setTextAlignment(SWIGTYPE_p_Ogre__TextAreaOverlayElement__Alignment ta) {
    OgreBitesJNI.TextBox_setTextAlignment(swigCPtr, this, SWIGTYPE_p_Ogre__TextAreaOverlayElement__Alignment.getCPtr(ta));
  }

  public void clearText() {
    OgreBitesJNI.TextBox_clearText(swigCPtr, this);
  }

  public void appendText(SWIGTYPE_p_Ogre__DisplayString text) {
    OgreBitesJNI.TextBox_appendText(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(text));
  }

  public void refitContents() {
    OgreBitesJNI.TextBox_refitContents(swigCPtr, this);
  }

  public void setScrollPercentage(float percentage) {
    OgreBitesJNI.TextBox_setScrollPercentage(swigCPtr, this, percentage);
  }

  public float getScrollPercentage() {
    return OgreBitesJNI.TextBox_getScrollPercentage(swigCPtr, this);
  }

  public long getHeightInLines() {
    return OgreBitesJNI.TextBox_getHeightInLines(swigCPtr, this);
  }

  public void _cursorPressed(Vector2 cursorPos) {
    OgreBitesJNI.TextBox__cursorPressed(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos);
  }

  public void _cursorReleased(Vector2 cursorPos) {
    OgreBitesJNI.TextBox__cursorReleased(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos);
  }

  public void _cursorMoved(Vector2 cursorPos, float wheelDelta) {
    OgreBitesJNI.TextBox__cursorMoved(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos, wheelDelta);
  }

  public void _focusLost() {
    OgreBitesJNI.TextBox__focusLost(swigCPtr, this);
  }

}