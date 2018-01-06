/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class PixelBox extends Box {
  private transient long swigCPtr;

  protected PixelBox(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.PixelBox_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PixelBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_PixelBox(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PixelBox() {
    this(OgreJNI.new_PixelBox__SWIG_0(), true);
  }

  public PixelBox(Box extents, PixelFormat pixelFormat, SWIGTYPE_p_void pixelData) {
    this(OgreJNI.new_PixelBox__SWIG_1(Box.getCPtr(extents), extents, pixelFormat.swigValue(), SWIGTYPE_p_void.getCPtr(pixelData)), true);
  }

  public PixelBox(Box extents, PixelFormat pixelFormat) {
    this(OgreJNI.new_PixelBox__SWIG_2(Box.getCPtr(extents), extents, pixelFormat.swigValue()), true);
  }

  public PixelBox(long width, long height, long depth, PixelFormat pixelFormat, SWIGTYPE_p_void pixelData) {
    this(OgreJNI.new_PixelBox__SWIG_3(width, height, depth, pixelFormat.swigValue(), SWIGTYPE_p_void.getCPtr(pixelData)), true);
  }

  public PixelBox(long width, long height, long depth, PixelFormat pixelFormat) {
    this(OgreJNI.new_PixelBox__SWIG_4(width, height, depth, pixelFormat.swigValue()), true);
  }

  public void setData(SWIGTYPE_p_void value) {
    OgreJNI.PixelBox_data_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getData() {
    long cPtr = OgreJNI.PixelBox_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setFormat(PixelFormat value) {
    OgreJNI.PixelBox_format_set(swigCPtr, this, value.swigValue());
  }

  public PixelFormat getFormat() {
    return PixelFormat.swigToEnum(OgreJNI.PixelBox_format_get(swigCPtr, this));
  }

  public void setRowPitch(long value) {
    OgreJNI.PixelBox_rowPitch_set(swigCPtr, this, value);
  }

  public long getRowPitch() {
    return OgreJNI.PixelBox_rowPitch_get(swigCPtr, this);
  }

  public void setSlicePitch(long value) {
    OgreJNI.PixelBox_slicePitch_set(swigCPtr, this, value);
  }

  public long getSlicePitch() {
    return OgreJNI.PixelBox_slicePitch_get(swigCPtr, this);
  }

  public void setConsecutive() {
    OgreJNI.PixelBox_setConsecutive(swigCPtr, this);
  }

  public long getRowSkip() {
    return OgreJNI.PixelBox_getRowSkip(swigCPtr, this);
  }

  public long getSliceSkip() {
    return OgreJNI.PixelBox_getSliceSkip(swigCPtr, this);
  }

  public boolean isConsecutive() {
    return OgreJNI.PixelBox_isConsecutive(swigCPtr, this);
  }

  public long getConsecutiveSize() {
    return OgreJNI.PixelBox_getConsecutiveSize(swigCPtr, this);
  }

  public PixelBox getSubVolume(Box def, boolean resetOrigin) {
    return new PixelBox(OgreJNI.PixelBox_getSubVolume__SWIG_0(swigCPtr, this, Box.getCPtr(def), def, resetOrigin), true);
  }

  public PixelBox getSubVolume(Box def) {
    return new PixelBox(OgreJNI.PixelBox_getSubVolume__SWIG_1(swigCPtr, this, Box.getCPtr(def), def), true);
  }

  public SWIGTYPE_p_void getTopLeftFrontPixelPtr() {
    long cPtr = OgreJNI.PixelBox_getTopLeftFrontPixelPtr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public ColourValue getColourAt(long x, long y, long z) {
    return new ColourValue(OgreJNI.PixelBox_getColourAt(swigCPtr, this, x, y, z), true);
  }

  public void setColourAt(ColourValue cv, long x, long y, long z) {
    OgreJNI.PixelBox_setColourAt(swigCPtr, this, ColourValue.getCPtr(cv), cv, x, y, z);
  }

}
