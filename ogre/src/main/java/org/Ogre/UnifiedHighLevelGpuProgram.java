/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class UnifiedHighLevelGpuProgram extends HighLevelGpuProgram {
  private transient long swigCPtr;

  protected UnifiedHighLevelGpuProgram(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.UnifiedHighLevelGpuProgram_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UnifiedHighLevelGpuProgram obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_UnifiedHighLevelGpuProgram(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static void setPriority(String shaderLanguage, int priority) {
    OgreJNI.UnifiedHighLevelGpuProgram_setPriority(shaderLanguage, priority);
  }

  public static int getPriority(String shaderLanguage) {
    return OgreJNI.UnifiedHighLevelGpuProgram_getPriority(shaderLanguage);
  }

  public UnifiedHighLevelGpuProgram(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual, ManualResourceLoader loader) {
    this(OgreJNI.new_UnifiedHighLevelGpuProgram__SWIG_0(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public UnifiedHighLevelGpuProgram(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual) {
    this(OgreJNI.new_UnifiedHighLevelGpuProgram__SWIG_1(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual), true);
  }

  public UnifiedHighLevelGpuProgram(ResourceManager creator, String name, java.math.BigInteger handle, String group) {
    this(OgreJNI.new_UnifiedHighLevelGpuProgram__SWIG_2(ResourceManager.getCPtr(creator), creator, name, handle, group), true);
  }

  public long calculateSize() {
    return OgreJNI.UnifiedHighLevelGpuProgram_calculateSize(swigCPtr, this);
  }

  public void addDelegateProgram(String name) {
    OgreJNI.UnifiedHighLevelGpuProgram_addDelegateProgram(swigCPtr, this, name);
  }

  public void clearDelegatePrograms() {
    OgreJNI.UnifiedHighLevelGpuProgram_clearDelegatePrograms(swigCPtr, this);
  }

  public HighLevelGpuProgramPtr _getDelegate() {
    return new HighLevelGpuProgramPtr(OgreJNI.UnifiedHighLevelGpuProgram__getDelegate(swigCPtr, this), false);
  }

  public String getLanguage() {
    return OgreJNI.UnifiedHighLevelGpuProgram_getLanguage(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t createParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.UnifiedHighLevelGpuProgram_createParameters(swigCPtr, this), true);
  }

  public GpuProgram _getBindingDelegate() {
    long cPtr = OgreJNI.UnifiedHighLevelGpuProgram__getBindingDelegate(swigCPtr, this);
    return (cPtr == 0) ? null : new GpuProgram(cPtr, false);
  }

  public boolean isSupported() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isSupported(swigCPtr, this);
  }

  public boolean isSkeletalAnimationIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isSkeletalAnimationIncluded(swigCPtr, this);
  }

  public boolean isMorphAnimationIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isMorphAnimationIncluded(swigCPtr, this);
  }

  public boolean isPoseAnimationIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isPoseAnimationIncluded(swigCPtr, this);
  }

  public int getNumberOfPosesIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgram_getNumberOfPosesIncluded(swigCPtr, this);
  }

  public boolean isVertexTextureFetchRequired() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isVertexTextureFetchRequired(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t getDefaultParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.UnifiedHighLevelGpuProgram_getDefaultParameters(swigCPtr, this), true);
  }

  public boolean hasDefaultParameters() {
    return OgreJNI.UnifiedHighLevelGpuProgram_hasDefaultParameters(swigCPtr, this);
  }

  public boolean getPassSurfaceAndLightStates() {
    return OgreJNI.UnifiedHighLevelGpuProgram_getPassSurfaceAndLightStates(swigCPtr, this);
  }

  public boolean getPassFogStates() {
    return OgreJNI.UnifiedHighLevelGpuProgram_getPassFogStates(swigCPtr, this);
  }

  public boolean getPassTransformStates() {
    return OgreJNI.UnifiedHighLevelGpuProgram_getPassTransformStates(swigCPtr, this);
  }

  public boolean hasCompileError() {
    return OgreJNI.UnifiedHighLevelGpuProgram_hasCompileError(swigCPtr, this);
  }

  public void resetCompileError() {
    OgreJNI.UnifiedHighLevelGpuProgram_resetCompileError(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreJNI.UnifiedHighLevelGpuProgram_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreJNI.UnifiedHighLevelGpuProgram_load__SWIG_1(swigCPtr, this);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.UnifiedHighLevelGpuProgram_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.UnifiedHighLevelGpuProgram_reload__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isReloadable(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreJNI.UnifiedHighLevelGpuProgram_getLoadingState(swigCPtr, this));
  }

  public void unload() {
    OgreJNI.UnifiedHighLevelGpuProgram_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreJNI.UnifiedHighLevelGpuProgram_getSize(swigCPtr, this);
  }

  public void touch() {
    OgreJNI.UnifiedHighLevelGpuProgram_touch(swigCPtr, this);
  }

  public boolean isBackgroundLoaded() {
    return OgreJNI.UnifiedHighLevelGpuProgram_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreJNI.UnifiedHighLevelGpuProgram_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreJNI.UnifiedHighLevelGpuProgram_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreJNI.UnifiedHighLevelGpuProgram_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreJNI.UnifiedHighLevelGpuProgram_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

}
