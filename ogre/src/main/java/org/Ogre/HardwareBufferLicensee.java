/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class HardwareBufferLicensee {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HardwareBufferLicensee(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HardwareBufferLicensee obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HardwareBufferLicensee(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void licenseExpired(HardwareBuffer buffer) {
    OgreJNI.HardwareBufferLicensee_licenseExpired(swigCPtr, this, HardwareBuffer.getCPtr(buffer), buffer);
  }

}
