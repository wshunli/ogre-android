/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Compositor extends Resource {
  private transient long swigCPtr;

  protected Compositor(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.Compositor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Compositor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Compositor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Compositor(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual, ManualResourceLoader loader) {
    this(OgreJNI.new_Compositor__SWIG_0(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public Compositor(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual) {
    this(OgreJNI.new_Compositor__SWIG_1(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual), true);
  }

  public Compositor(ResourceManager creator, String name, java.math.BigInteger handle, String group) {
    this(OgreJNI.new_Compositor__SWIG_2(ResourceManager.getCPtr(creator), creator, name, handle, group), true);
  }

  public CompositionTechnique createTechnique() {
    long cPtr = OgreJNI.Compositor_createTechnique(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public void removeTechnique(long idx) {
    OgreJNI.Compositor_removeTechnique(swigCPtr, this, idx);
  }

  public CompositionTechnique getTechnique(long idx) {
    long cPtr = OgreJNI.Compositor_getTechnique(swigCPtr, this, idx);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public long getNumTechniques() {
    return OgreJNI.Compositor_getNumTechniques(swigCPtr, this);
  }

  public void removeAllTechniques() {
    OgreJNI.Compositor_removeAllTechniques(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__CompositionTechnique_p_t__type_t getTechniqueIterator() {
    return new SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__CompositionTechnique_p_t__type_t(OgreJNI.Compositor_getTechniqueIterator(swigCPtr, this), true);
  }

  public CompositionTechnique getSupportedTechnique(long idx) {
    long cPtr = OgreJNI.Compositor_getSupportedTechnique__SWIG_0(swigCPtr, this, idx);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public long getNumSupportedTechniques() {
    return OgreJNI.Compositor_getNumSupportedTechniques(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__CompositionTechnique_p_t__type_t getSupportedTechniqueIterator() {
    return new SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__CompositionTechnique_p_t__type_t(OgreJNI.Compositor_getSupportedTechniqueIterator(swigCPtr, this), true);
  }

  public CompositionTechnique getSupportedTechnique(String schemeName) {
    long cPtr = OgreJNI.Compositor_getSupportedTechnique__SWIG_1(swigCPtr, this, schemeName);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public CompositionTechnique getSupportedTechnique() {
    long cPtr = OgreJNI.Compositor_getSupportedTechnique__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public String getTextureInstanceName(String name, long mrtIndex) {
    return OgreJNI.Compositor_getTextureInstanceName(swigCPtr, this, name, mrtIndex);
  }

  public TexturePtr getTextureInstance(String name, long mrtIndex) {
    return new TexturePtr(OgreJNI.Compositor_getTextureInstance(swigCPtr, this, name, mrtIndex), true);
  }

  public RenderTarget getRenderTarget(String name) {
    long cPtr = OgreJNI.Compositor_getRenderTarget(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderTarget(cPtr, false);
  }

}
