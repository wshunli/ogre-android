/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class IntegratedPSSM3Factory extends SubRenderStateFactory {
  private transient long swigCPtr;

  protected IntegratedPSSM3Factory(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.IntegratedPSSM3Factory_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntegratedPSSM3Factory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_IntegratedPSSM3Factory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubRenderState createInstance(ScriptCompiler compiler, PropertyAbstractNode prop, Pass pass, SGScriptTranslator translator) {
    long cPtr = OgreRTShaderJNI.IntegratedPSSM3Factory_createInstance(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, PropertyAbstractNode.getCPtr(prop), prop, Pass.getCPtr(pass), pass, SGScriptTranslator.getCPtr(translator), translator);
    return (cPtr == 0) ? null : new SubRenderState(cPtr, false);
  }

  public IntegratedPSSM3Factory() {
    this(OgreRTShaderJNI.new_IntegratedPSSM3Factory(), true);
  }

}
