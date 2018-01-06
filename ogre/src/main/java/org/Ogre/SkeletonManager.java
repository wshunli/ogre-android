/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class SkeletonManager extends ResourceManager {
  private transient long swigCPtr;

  protected SkeletonManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.SkeletonManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SkeletonManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SkeletonManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SkeletonManager() {
    this(OgreJNI.new_SkeletonManager(), true);
  }

  public SkeletonPtr create(String name, String group, boolean isManual, ManualResourceLoader loader, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t createParams) {
    return new SkeletonPtr(OgreJNI.SkeletonManager_create__SWIG_0(swigCPtr, this, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(createParams)), true);
  }

  public SkeletonPtr create(String name, String group, boolean isManual, ManualResourceLoader loader) {
    return new SkeletonPtr(OgreJNI.SkeletonManager_create__SWIG_1(swigCPtr, this, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public SkeletonPtr create(String name, String group, boolean isManual) {
    return new SkeletonPtr(OgreJNI.SkeletonManager_create__SWIG_2(swigCPtr, this, name, group, isManual), true);
  }

  public SkeletonPtr create(String name, String group) {
    return new SkeletonPtr(OgreJNI.SkeletonManager_create__SWIG_3(swigCPtr, this, name, group), true);
  }

  public SkeletonPtr getByName(String name, String groupName) {
    return new SkeletonPtr(OgreJNI.SkeletonManager_getByName(swigCPtr, this, name, groupName), true);
  }

  public static SkeletonManager getSingleton() {
    return new SkeletonManager(OgreJNI.SkeletonManager_getSingleton(), false);
  }

}
