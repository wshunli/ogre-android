/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class FFPFogFactory extends SubRenderStateFactory {
  private transient long swigCPtr;

  protected FFPFogFactory(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.FFPFogFactory_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FFPFogFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreRTShaderJNI.delete_FFPFogFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubRenderState createInstance(ScriptCompiler compiler, PropertyAbstractNode prop, Pass pass, SGScriptTranslator translator) {
    long cPtr = OgreRTShaderJNI.FFPFogFactory_createInstance(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, PropertyAbstractNode.getCPtr(prop), prop, Pass.getCPtr(pass), pass, SGScriptTranslator.getCPtr(translator), translator);
    return (cPtr == 0) ? null : new SubRenderState(cPtr, false);
  }

  public void writeInstance(MaterialSerializer ser, SubRenderState subRenderState, Pass srcPass, Pass dstPass) {
    OgreRTShaderJNI.FFPFogFactory_writeInstance(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, SubRenderState.getCPtr(subRenderState), subRenderState, Pass.getCPtr(srcPass), srcPass, Pass.getCPtr(dstPass), dstPass);
  }

  public FFPFogFactory() {
    this(OgreRTShaderJNI.new_FFPFogFactory(), true);
  }

}