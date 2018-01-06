/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class DriverVersion {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DriverVersion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DriverVersion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_DriverVersion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMajor(int value) {
    OgreJNI.DriverVersion_major_set(swigCPtr, this, value);
  }

  public int getMajor() {
    return OgreJNI.DriverVersion_major_get(swigCPtr, this);
  }

  public void setMinor(int value) {
    OgreJNI.DriverVersion_minor_set(swigCPtr, this, value);
  }

  public int getMinor() {
    return OgreJNI.DriverVersion_minor_get(swigCPtr, this);
  }

  public void setRelease(int value) {
    OgreJNI.DriverVersion_release_set(swigCPtr, this, value);
  }

  public int getRelease() {
    return OgreJNI.DriverVersion_release_get(swigCPtr, this);
  }

  public void setBuild(int value) {
    OgreJNI.DriverVersion_build_set(swigCPtr, this, value);
  }

  public int getBuild() {
    return OgreJNI.DriverVersion_build_get(swigCPtr, this);
  }

  public DriverVersion() {
    this(OgreJNI.new_DriverVersion(), true);
  }

  public String toString() {
    return OgreJNI.DriverVersion_toString(swigCPtr, this);
  }

  public void fromString(String versionString) {
    OgreJNI.DriverVersion_fromString(swigCPtr, this, versionString);
  }

}
