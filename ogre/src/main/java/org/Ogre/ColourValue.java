/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ColourValue {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ColourValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColourValue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ColourValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static ColourValue getZERO() {
    long cPtr = OgreJNI.ColourValue_ZERO_get();
    return (cPtr == 0) ? null : new ColourValue(cPtr, false);
  }

  public static ColourValue getBlack() {
    long cPtr = OgreJNI.ColourValue_Black_get();
    return (cPtr == 0) ? null : new ColourValue(cPtr, false);
  }

  public static ColourValue getWhite() {
    long cPtr = OgreJNI.ColourValue_White_get();
    return (cPtr == 0) ? null : new ColourValue(cPtr, false);
  }

  public static ColourValue getRed() {
    long cPtr = OgreJNI.ColourValue_Red_get();
    return (cPtr == 0) ? null : new ColourValue(cPtr, false);
  }

  public static ColourValue getGreen() {
    long cPtr = OgreJNI.ColourValue_Green_get();
    return (cPtr == 0) ? null : new ColourValue(cPtr, false);
  }

  public static ColourValue getBlue() {
    long cPtr = OgreJNI.ColourValue_Blue_get();
    return (cPtr == 0) ? null : new ColourValue(cPtr, false);
  }

  public ColourValue(float red, float green, float blue, float alpha) {
    this(OgreJNI.new_ColourValue__SWIG_0(red, green, blue, alpha), true);
  }

  public ColourValue(float red, float green, float blue) {
    this(OgreJNI.new_ColourValue__SWIG_1(red, green, blue), true);
  }

  public ColourValue(float red, float green) {
    this(OgreJNI.new_ColourValue__SWIG_2(red, green), true);
  }

  public ColourValue(float red) {
    this(OgreJNI.new_ColourValue__SWIG_3(red), true);
  }

  public ColourValue() {
    this(OgreJNI.new_ColourValue__SWIG_4(), true);
  }

  public void setR(float value) {
    OgreJNI.ColourValue_r_set(swigCPtr, this, value);
  }

  public float getR() {
    return OgreJNI.ColourValue_r_get(swigCPtr, this);
  }

  public void setG(float value) {
    OgreJNI.ColourValue_g_set(swigCPtr, this, value);
  }

  public float getG() {
    return OgreJNI.ColourValue_g_get(swigCPtr, this);
  }

  public void setB(float value) {
    OgreJNI.ColourValue_b_set(swigCPtr, this, value);
  }

  public float getB() {
    return OgreJNI.ColourValue_b_get(swigCPtr, this);
  }

  public void setA(float value) {
    OgreJNI.ColourValue_a_set(swigCPtr, this, value);
  }

  public float getA() {
    return OgreJNI.ColourValue_a_get(swigCPtr, this);
  }

  public long getAsRGBA() {
    return OgreJNI.ColourValue_getAsRGBA(swigCPtr, this);
  }

  public long getAsARGB() {
    return OgreJNI.ColourValue_getAsARGB(swigCPtr, this);
  }

  public long getAsBGRA() {
    return OgreJNI.ColourValue_getAsBGRA(swigCPtr, this);
  }

  public long getAsABGR() {
    return OgreJNI.ColourValue_getAsABGR(swigCPtr, this);
  }

  public void setAsRGBA(long val) {
    OgreJNI.ColourValue_setAsRGBA(swigCPtr, this, val);
  }

  public void setAsARGB(long val) {
    OgreJNI.ColourValue_setAsARGB(swigCPtr, this, val);
  }

  public void setAsBGRA(long val) {
    OgreJNI.ColourValue_setAsBGRA(swigCPtr, this, val);
  }

  public void setAsABGR(long val) {
    OgreJNI.ColourValue_setAsABGR(swigCPtr, this, val);
  }

  public void saturate() {
    OgreJNI.ColourValue_saturate(swigCPtr, this);
  }

  public ColourValue saturateCopy() {
    return new ColourValue(OgreJNI.ColourValue_saturateCopy(swigCPtr, this), true);
  }

  public SWIGTYPE_p_float ptr() {
    long cPtr = OgreJNI.ColourValue_ptr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setHSB(float hue, float saturation, float brightness) {
    OgreJNI.ColourValue_setHSB(swigCPtr, this, hue, saturation, brightness);
  }

  public void getHSB(SWIGTYPE_p_float hue, SWIGTYPE_p_float saturation, SWIGTYPE_p_float brightness) {
    OgreJNI.ColourValue_getHSB(swigCPtr, this, SWIGTYPE_p_float.getCPtr(hue), SWIGTYPE_p_float.getCPtr(saturation), SWIGTYPE_p_float.getCPtr(brightness));
  }

  public String toString() {
    return OgreJNI.ColourValue_toString(swigCPtr, this);
  }

}
