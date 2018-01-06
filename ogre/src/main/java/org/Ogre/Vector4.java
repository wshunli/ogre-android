/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Vector4 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Vector4(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vector4 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Vector4(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    OgreJNI.Vector4_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return OgreJNI.Vector4_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    OgreJNI.Vector4_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return OgreJNI.Vector4_y_get(swigCPtr, this);
  }

  public void setZ(float value) {
    OgreJNI.Vector4_z_set(swigCPtr, this, value);
  }

  public float getZ() {
    return OgreJNI.Vector4_z_get(swigCPtr, this);
  }

  public void setW(float value) {
    OgreJNI.Vector4_w_set(swigCPtr, this, value);
  }

  public float getW() {
    return OgreJNI.Vector4_w_get(swigCPtr, this);
  }

  public Vector4() {
    this(OgreJNI.new_Vector4__SWIG_0(), true);
  }

  public Vector4(float fX, float fY, float fZ, float fW) {
    this(OgreJNI.new_Vector4__SWIG_1(fX, fY, fZ, fW), true);
  }

  public Vector4(SWIGTYPE_p_float afCoordinate) {
    this(OgreJNI.new_Vector4__SWIG_2(SWIGTYPE_p_float.getCPtr(afCoordinate)), true);
  }

  public Vector4(SWIGTYPE_p_int afCoordinate) {
    this(OgreJNI.new_Vector4__SWIG_3(SWIGTYPE_p_int.getCPtr(afCoordinate)), true);
  }

  public Vector4(float scaler) {
    this(OgreJNI.new_Vector4__SWIG_5(scaler), true);
  }

  public Vector4(Vector3 rhs) {
    this(OgreJNI.new_Vector4__SWIG_6(Vector3.getCPtr(rhs), rhs), true);
  }

  public Vector3 xyz() {
    return new Vector3(OgreJNI.Vector4_xyz(swigCPtr, this), true);
  }

  public Vector2 xy() {
    return new Vector2(OgreJNI.Vector4_xy(swigCPtr, this), true);
  }

  public void swap(Vector4 other) {
    OgreJNI.Vector4_swap(swigCPtr, this, Vector4.getCPtr(other), other);
  }

  public float __getitem__(long i) {
    return OgreJNI.Vector4___getitem____SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_float ptr() {
    long cPtr = OgreJNI.Vector4_ptr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public float dotProduct(Vector4 vec) {
    return OgreJNI.Vector4_dotProduct(swigCPtr, this, Vector4.getCPtr(vec), vec);
  }

  public boolean isNaN() {
    return OgreJNI.Vector4_isNaN(swigCPtr, this);
  }

  public static Vector4 getZERO() {
    long cPtr = OgreJNI.Vector4_ZERO_get();
    return (cPtr == 0) ? null : new Vector4(cPtr, false);
  }

  public String toString() {
    return OgreJNI.Vector4_toString(swigCPtr, this);
  }

}
