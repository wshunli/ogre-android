/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class CreateHighLevelGpuProgramScriptCompilerEvent extends ScriptCompilerEvent {
  private transient long swigCPtr;

  protected CreateHighLevelGpuProgramScriptCompilerEvent(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CreateHighLevelGpuProgramScriptCompilerEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CreateHighLevelGpuProgramScriptCompilerEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setMFile(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mFile_set(swigCPtr, this, value);
  }

  public String getMFile() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mFile_get(swigCPtr, this);
  }

  public void setMName(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mName_set(swigCPtr, this, value);
  }

  public String getMName() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mName_get(swigCPtr, this);
  }

  public void setMResourceGroup(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mResourceGroup_set(swigCPtr, this, value);
  }

  public String getMResourceGroup() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mResourceGroup_get(swigCPtr, this);
  }

  public void setMSource(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mSource_set(swigCPtr, this, value);
  }

  public String getMSource() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mSource_get(swigCPtr, this);
  }

  public void setMLanguage(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mLanguage_set(swigCPtr, this, value);
  }

  public String getMLanguage() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mLanguage_get(swigCPtr, this);
  }

  public void setMProgramType(GpuProgramType value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mProgramType_set(swigCPtr, this, value.swigValue());
  }

  public GpuProgramType getMProgramType() {
    return GpuProgramType.swigToEnum(OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_mProgramType_get(swigCPtr, this));
  }

  public static void setEventType(String value) {
    OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_eventType_set(value);
  }

  public static String getEventType() {
    return OgreJNI.CreateHighLevelGpuProgramScriptCompilerEvent_eventType_get();
  }

  public CreateHighLevelGpuProgramScriptCompilerEvent(String file, String name, String resourceGroup, String source, String language, GpuProgramType programType) {
    this(OgreJNI.new_CreateHighLevelGpuProgramScriptCompilerEvent(file, name, resourceGroup, source, language, programType.swigValue()), true);
  }

}
