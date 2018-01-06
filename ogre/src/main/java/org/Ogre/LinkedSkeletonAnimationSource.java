/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class LinkedSkeletonAnimationSource {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LinkedSkeletonAnimationSource(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LinkedSkeletonAnimationSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_LinkedSkeletonAnimationSource(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSkeletonName(String value) {
    OgreJNI.LinkedSkeletonAnimationSource_skeletonName_set(swigCPtr, this, value);
  }

  public String getSkeletonName() {
    return OgreJNI.LinkedSkeletonAnimationSource_skeletonName_get(swigCPtr, this);
  }

  public void setPSkeleton(SkeletonPtr value) {
    OgreJNI.LinkedSkeletonAnimationSource_pSkeleton_set(swigCPtr, this, SkeletonPtr.getCPtr(value), value);
  }

  public SkeletonPtr getPSkeleton() {
    long cPtr = OgreJNI.LinkedSkeletonAnimationSource_pSkeleton_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SkeletonPtr(cPtr, false);
  }

  public void setScale(float value) {
    OgreJNI.LinkedSkeletonAnimationSource_scale_set(swigCPtr, this, value);
  }

  public float getScale() {
    return OgreJNI.LinkedSkeletonAnimationSource_scale_get(swigCPtr, this);
  }

  public LinkedSkeletonAnimationSource(String skelName, float scl) {
    this(OgreJNI.new_LinkedSkeletonAnimationSource__SWIG_0(skelName, scl), true);
  }

  public LinkedSkeletonAnimationSource(String skelName, float scl, SkeletonPtr skelPtr) {
    this(OgreJNI.new_LinkedSkeletonAnimationSource__SWIG_1(skelName, scl, SkeletonPtr.getCPtr(skelPtr), skelPtr), true);
  }

}
