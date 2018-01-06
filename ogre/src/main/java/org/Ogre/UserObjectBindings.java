/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class UserObjectBindings {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UserObjectBindings(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UserObjectBindings obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_UserObjectBindings(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UserObjectBindings() {
    this(OgreJNI.new_UserObjectBindings__SWIG_0(), true);
  }

  public void eraseUserAny(String key) {
    OgreJNI.UserObjectBindings_eraseUserAny(swigCPtr, this, key);
  }

  public void clear() {
    OgreJNI.UserObjectBindings_clear(swigCPtr, this);
  }

  public UserObjectBindings(UserObjectBindings other) {
    this(OgreJNI.new_UserObjectBindings__SWIG_1(UserObjectBindings.getCPtr(other), other), true);
  }

  public UserObjectBindings swap(UserObjectBindings rhs) {
    return new UserObjectBindings(OgreJNI.UserObjectBindings_swap(swigCPtr, this, UserObjectBindings.getCPtr(rhs), rhs), false);
  }

}
