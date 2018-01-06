/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ResourcePtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ResourcePtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResourcePtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ResourcePtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ResourcePtr() {
    this(OgreJNI.new_ResourcePtr__SWIG_1(), true);
  }

  public ResourcePtr(ResourcePtr r) {
    this(OgreJNI.new_ResourcePtr__SWIG_2(ResourcePtr.getCPtr(r), r), true);
  }

  public Resource __ref__() {
    return new Resource(OgreJNI.ResourcePtr___ref__(swigCPtr, this), false);
  }

  public Resource __deref__() {
    long cPtr = OgreJNI.ResourcePtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Resource(cPtr, false);
  }

  public Resource get() {
    long cPtr = OgreJNI.ResourcePtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Resource(cPtr, false);
  }

  public boolean unique() {
    return OgreJNI.ResourcePtr_unique(swigCPtr, this);
  }

  public int use_count() {
    return OgreJNI.ResourcePtr_use_count(swigCPtr, this);
  }

  public void reset() {
    OgreJNI.ResourcePtr_reset__SWIG_0(swigCPtr, this);
  }

  public void reset(Resource rep) {
    OgreJNI.ResourcePtr_reset__SWIG_1(swigCPtr, this, Resource.getCPtr(rep), rep);
  }

  public void prepare(boolean backgroundThread) {
    OgreJNI.ResourcePtr_prepare__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void prepare() {
    OgreJNI.ResourcePtr_prepare__SWIG_1(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreJNI.ResourcePtr_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreJNI.ResourcePtr_load__SWIG_1(swigCPtr, this);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.ResourcePtr_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.ResourcePtr_reload__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreJNI.ResourcePtr_isReloadable(swigCPtr, this);
  }

  public boolean isManuallyLoaded() {
    return OgreJNI.ResourcePtr_isManuallyLoaded(swigCPtr, this);
  }

  public void unload() {
    OgreJNI.ResourcePtr_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreJNI.ResourcePtr_getSize(swigCPtr, this);
  }

  public void touch() {
    OgreJNI.ResourcePtr_touch(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.ResourcePtr_getName(swigCPtr, this);
  }

  public java.math.BigInteger getHandle() {
    return OgreJNI.ResourcePtr_getHandle(swigCPtr, this);
  }

  public boolean isPrepared() {
    return OgreJNI.ResourcePtr_isPrepared(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.ResourcePtr_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreJNI.ResourcePtr_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreJNI.ResourcePtr_getLoadingState(swigCPtr, this));
  }

  public boolean isBackgroundLoaded() {
    return OgreJNI.ResourcePtr_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreJNI.ResourcePtr_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreJNI.ResourcePtr_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreJNI.ResourcePtr_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreJNI.ResourcePtr_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public String getGroup() {
    return OgreJNI.ResourcePtr_getGroup(swigCPtr, this);
  }

  public void changeGroupOwnership(String newGroup) {
    OgreJNI.ResourcePtr_changeGroupOwnership(swigCPtr, this, newGroup);
  }

  public ResourceManager getCreator() {
    long cPtr = OgreJNI.ResourcePtr_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public String getOrigin() {
    return OgreJNI.ResourcePtr_getOrigin(swigCPtr, this);
  }

  public void _notifyOrigin(String origin) {
    OgreJNI.ResourcePtr__notifyOrigin(swigCPtr, this, origin);
  }

  public long getStateCount() {
    return OgreJNI.ResourcePtr_getStateCount(swigCPtr, this);
  }

  public void _dirtyState() {
    OgreJNI.ResourcePtr__dirtyState(swigCPtr, this);
  }

  public void _fireLoadingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.ResourcePtr__fireLoadingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _firePreparingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.ResourcePtr__firePreparingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _fireUnloadingComplete() {
    OgreJNI.ResourcePtr__fireUnloadingComplete(swigCPtr, this);
  }

  public long calculateSize() {
    return OgreJNI.ResourcePtr_calculateSize(swigCPtr, this);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreJNI.ResourcePtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__ParameterDef_t__type getParameters() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__ParameterDef_t__type(OgreJNI.ResourcePtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreJNI.ResourcePtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t paramList) {
    OgreJNI.ResourcePtr_setParameterList(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(paramList));
  }

  public String getParameter(String name) {
    return OgreJNI.ResourcePtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreJNI.ResourcePtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreJNI.ResourcePtr_cleanupDictionary(swigCPtr, this);
  }

}
