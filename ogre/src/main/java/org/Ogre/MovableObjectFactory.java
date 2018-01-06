/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class MovableObjectFactory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MovableObjectFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MovableObjectFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MovableObjectFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MovableObject createInstance(String name, SceneManager manager, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t params) {
    long cPtr = OgreJNI.MovableObjectFactory_createInstance__SWIG_0(swigCPtr, this, name, SceneManager.getCPtr(manager), manager, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(params));
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public MovableObject createInstance(String name, SceneManager manager) {
    long cPtr = OgreJNI.MovableObjectFactory_createInstance__SWIG_1(swigCPtr, this, name, SceneManager.getCPtr(manager), manager);
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public void destroyInstance(MovableObject obj) {
    OgreJNI.MovableObjectFactory_destroyInstance(swigCPtr, this, MovableObject.getCPtr(obj), obj);
  }

  public boolean requestTypeFlags() {
    return OgreJNI.MovableObjectFactory_requestTypeFlags(swigCPtr, this);
  }

  public void _notifyTypeFlags(long flag) {
    OgreJNI.MovableObjectFactory__notifyTypeFlags(swigCPtr, this, flag);
  }

  public long getTypeFlags() {
    return OgreJNI.MovableObjectFactory_getTypeFlags(swigCPtr, this);
  }

}
