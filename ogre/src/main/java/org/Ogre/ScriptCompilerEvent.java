/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ScriptCompilerEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ScriptCompilerEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ScriptCompilerEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ScriptCompilerEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMType(String value) {
    OgreJNI.ScriptCompilerEvent_mType_set(swigCPtr, this, value);
  }

  public String getMType() {
    return OgreJNI.ScriptCompilerEvent_mType_get(swigCPtr, this);
  }

  public ScriptCompilerEvent(String type) {
    this(OgreJNI.new_ScriptCompilerEvent(type), true);
  }

}
