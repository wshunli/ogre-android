/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ConfigDialog {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConfigDialog(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConfigDialog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ConfigDialog(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConfigDialog() {
    this(OgreJNI.new_ConfigDialog(), true);
  }

  public boolean display() {
    return OgreJNI.ConfigDialog_display(swigCPtr, this);
  }

}
