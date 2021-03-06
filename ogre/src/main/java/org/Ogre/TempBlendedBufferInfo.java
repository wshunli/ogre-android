/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class TempBlendedBufferInfo extends HardwareBufferLicensee {
  private transient long swigCPtr;

  protected TempBlendedBufferInfo(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.TempBlendedBufferInfo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TempBlendedBufferInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_TempBlendedBufferInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void extractFrom(VertexData sourceData) {
    OgreJNI.TempBlendedBufferInfo_extractFrom(swigCPtr, this, VertexData.getCPtr(sourceData), sourceData);
  }

  public void checkoutTempCopies(boolean positions, boolean normals) {
    OgreJNI.TempBlendedBufferInfo_checkoutTempCopies__SWIG_0(swigCPtr, this, positions, normals);
  }

  public void checkoutTempCopies(boolean positions) {
    OgreJNI.TempBlendedBufferInfo_checkoutTempCopies__SWIG_1(swigCPtr, this, positions);
  }

  public void checkoutTempCopies() {
    OgreJNI.TempBlendedBufferInfo_checkoutTempCopies__SWIG_2(swigCPtr, this);
  }

  public void bindTempCopies(VertexData targetData, boolean suppressHardwareUpload) {
    OgreJNI.TempBlendedBufferInfo_bindTempCopies(swigCPtr, this, VertexData.getCPtr(targetData), targetData, suppressHardwareUpload);
  }

  public void licenseExpired(HardwareBuffer buffer) {
    OgreJNI.TempBlendedBufferInfo_licenseExpired(swigCPtr, this, HardwareBuffer.getCPtr(buffer), buffer);
  }

  public boolean buffersCheckedOut(boolean positions, boolean normals) {
    return OgreJNI.TempBlendedBufferInfo_buffersCheckedOut__SWIG_0(swigCPtr, this, positions, normals);
  }

  public boolean buffersCheckedOut(boolean positions) {
    return OgreJNI.TempBlendedBufferInfo_buffersCheckedOut__SWIG_1(swigCPtr, this, positions);
  }

  public boolean buffersCheckedOut() {
    return OgreJNI.TempBlendedBufferInfo_buffersCheckedOut__SWIG_2(swigCPtr, this);
  }

  public TempBlendedBufferInfo() {
    this(OgreJNI.new_TempBlendedBufferInfo(), true);
  }

}
