/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class BillboardChainFactory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BillboardChainFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BillboardChainFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_BillboardChainFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BillboardChainFactory() {
    this(OgreJNI.new_BillboardChainFactory(), true);
  }

  public static void setFACTORY_TYPE_NAME(String value) {
    OgreJNI.BillboardChainFactory_FACTORY_TYPE_NAME_set(value);
  }

  public static String getFACTORY_TYPE_NAME() {
    return OgreJNI.BillboardChainFactory_FACTORY_TYPE_NAME_get();
  }

  public void destroyInstance(MovableObject obj) {
    OgreJNI.BillboardChainFactory_destroyInstance(swigCPtr, this, MovableObject.getCPtr(obj), obj);
  }

}
