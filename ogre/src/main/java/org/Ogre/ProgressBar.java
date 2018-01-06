/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ProgressBar extends Widget {
  private transient long swigCPtr;

  protected ProgressBar(long cPtr, boolean cMemoryOwn) {
    super(OgreBitesJNI.ProgressBar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProgressBar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreBitesJNI.delete_ProgressBar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ProgressBar(String name, SWIGTYPE_p_Ogre__DisplayString caption, float width, float commentBoxWidth) {
    this(OgreBitesJNI.new_ProgressBar(name, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption), width, commentBoxWidth), true);
  }

  public void setProgress(float progress) {
    OgreBitesJNI.ProgressBar_setProgress(swigCPtr, this, progress);
  }

  public float getProgress() {
    return OgreBitesJNI.ProgressBar_getProgress(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__DisplayString getCaption() {
    return new SWIGTYPE_p_Ogre__DisplayString(OgreBitesJNI.ProgressBar_getCaption(swigCPtr, this), false);
  }

  public void setCaption(SWIGTYPE_p_Ogre__DisplayString caption) {
    OgreBitesJNI.ProgressBar_setCaption(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption));
  }

  public SWIGTYPE_p_Ogre__DisplayString getComment() {
    return new SWIGTYPE_p_Ogre__DisplayString(OgreBitesJNI.ProgressBar_getComment(swigCPtr, this), false);
  }

  public void setComment(SWIGTYPE_p_Ogre__DisplayString comment) {
    OgreBitesJNI.ProgressBar_setComment(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(comment));
  }

}