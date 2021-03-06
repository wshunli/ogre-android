/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class SGMaterialSerializerListener extends MaterialSerializer.Listener {
  private transient long swigCPtr;

  protected SGMaterialSerializerListener(long cPtr, boolean cMemoryOwn) {
    super(OgreRTShaderJNI.SGMaterialSerializerListener_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SGMaterialSerializerListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void materialEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, Material mat) {
    OgreRTShaderJNI.SGMaterialSerializerListener_materialEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Material.getCPtr(mat), mat);
  }

  public void techniqueEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, Technique tech) {
    OgreRTShaderJNI.SGMaterialSerializerListener_techniqueEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Technique.getCPtr(tech), tech);
  }

  public void passEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, Pass tech) {
    OgreRTShaderJNI.SGMaterialSerializerListener_passEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Pass.getCPtr(tech), tech);
  }

  public void textureUnitStateEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, TextureUnitState textureUnit) {
    OgreRTShaderJNI.SGMaterialSerializerListener_textureUnitStateEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), TextureUnitState.getCPtr(textureUnit), textureUnit);
  }

}
