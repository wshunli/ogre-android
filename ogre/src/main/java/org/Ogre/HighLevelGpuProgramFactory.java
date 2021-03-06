/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class HighLevelGpuProgramFactory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HighLevelGpuProgramFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HighLevelGpuProgramFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HighLevelGpuProgramFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getLanguage() {
    return OgreJNI.HighLevelGpuProgramFactory_getLanguage(swigCPtr, this);
  }

  public HighLevelGpuProgram create(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual, ManualResourceLoader loader) {
    long cPtr = OgreJNI.HighLevelGpuProgramFactory_create(swigCPtr, this, ResourceManager.getCPtr(creator), creator, name, handle, group, isManual, ManualResourceLoader.getCPtr(loader), loader);
    return (cPtr == 0) ? null : new HighLevelGpuProgram(cPtr, false);
  }

  public void destroy(HighLevelGpuProgram prog) {
    OgreJNI.HighLevelGpuProgramFactory_destroy(swigCPtr, this, HighLevelGpuProgram.getCPtr(prog), prog);
  }

}
