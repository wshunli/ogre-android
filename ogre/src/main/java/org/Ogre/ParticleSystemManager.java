/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ParticleSystemManager extends ScriptLoader {
  private transient long swigCPtr;

  protected ParticleSystemManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.ParticleSystemManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParticleSystemManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ParticleSystemManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ParticleSystemManager() {
    this(OgreJNI.new_ParticleSystemManager(), true);
  }

  public void addEmitterFactory(ParticleEmitterFactory factory) {
    OgreJNI.ParticleSystemManager_addEmitterFactory(swigCPtr, this, ParticleEmitterFactory.getCPtr(factory), factory);
  }

  public void addAffectorFactory(ParticleAffectorFactory factory) {
    OgreJNI.ParticleSystemManager_addAffectorFactory(swigCPtr, this, ParticleAffectorFactory.getCPtr(factory), factory);
  }

  public void addRendererFactory(SWIGTYPE_p_Ogre__ParticleSystemRendererFactory factory) {
    OgreJNI.ParticleSystemManager_addRendererFactory(swigCPtr, this, SWIGTYPE_p_Ogre__ParticleSystemRendererFactory.getCPtr(factory));
  }

  public void addTemplate(String name, ParticleSystem sysTemplate) {
    OgreJNI.ParticleSystemManager_addTemplate(swigCPtr, this, name, ParticleSystem.getCPtr(sysTemplate), sysTemplate);
  }

  public void removeTemplate(String name, boolean deleteTemplate) {
    OgreJNI.ParticleSystemManager_removeTemplate__SWIG_0(swigCPtr, this, name, deleteTemplate);
  }

  public void removeTemplate(String name) {
    OgreJNI.ParticleSystemManager_removeTemplate__SWIG_1(swigCPtr, this, name);
  }

  public void removeAllTemplates(boolean deleteTemplate) {
    OgreJNI.ParticleSystemManager_removeAllTemplates__SWIG_0(swigCPtr, this, deleteTemplate);
  }

  public void removeAllTemplates() {
    OgreJNI.ParticleSystemManager_removeAllTemplates__SWIG_1(swigCPtr, this);
  }

  public void removeTemplatesByResourceGroup(String resourceGroup) {
    OgreJNI.ParticleSystemManager_removeTemplatesByResourceGroup(swigCPtr, this, resourceGroup);
  }

  public ParticleSystem createTemplate(String name, String resourceGroup) {
    long cPtr = OgreJNI.ParticleSystemManager_createTemplate(swigCPtr, this, name, resourceGroup);
    return (cPtr == 0) ? null : new ParticleSystem(cPtr, false);
  }

  public ParticleSystem getTemplate(String name) {
    long cPtr = OgreJNI.ParticleSystemManager_getTemplate(swigCPtr, this, name);
    return (cPtr == 0) ? null : new ParticleSystem(cPtr, false);
  }

  public ParticleEmitter _createEmitter(String emitterType, ParticleSystem psys) {
    long cPtr = OgreJNI.ParticleSystemManager__createEmitter(swigCPtr, this, emitterType, ParticleSystem.getCPtr(psys), psys);
    return (cPtr == 0) ? null : new ParticleEmitter(cPtr, false);
  }

  public void _destroyEmitter(ParticleEmitter emitter) {
    OgreJNI.ParticleSystemManager__destroyEmitter(swigCPtr, this, ParticleEmitter.getCPtr(emitter), emitter);
  }

  public ParticleAffector _createAffector(String affectorType, ParticleSystem psys) {
    long cPtr = OgreJNI.ParticleSystemManager__createAffector(swigCPtr, this, affectorType, ParticleSystem.getCPtr(psys), psys);
    return (cPtr == 0) ? null : new ParticleAffector(cPtr, false);
  }

  public void _destroyAffector(ParticleAffector affector) {
    OgreJNI.ParticleSystemManager__destroyAffector(swigCPtr, this, ParticleAffector.getCPtr(affector), affector);
  }

  public SWIGTYPE_p_Ogre__ParticleSystemRenderer _createRenderer(String rendererType) {
    long cPtr = OgreJNI.ParticleSystemManager__createRenderer(swigCPtr, this, rendererType);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__ParticleSystemRenderer(cPtr, false);
  }

  public void _destroyRenderer(SWIGTYPE_p_Ogre__ParticleSystemRenderer renderer) {
    OgreJNI.ParticleSystemManager__destroyRenderer(swigCPtr, this, SWIGTYPE_p_Ogre__ParticleSystemRenderer.getCPtr(renderer));
  }

  public void _initialise() {
    OgreJNI.ParticleSystemManager__initialise(swigCPtr, this);
  }

  public StringVector getScriptPatterns() {
    return new StringVector(OgreJNI.ParticleSystemManager_getScriptPatterns(swigCPtr, this), false);
  }

  public void parseScript(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t stream, String groupName) {
    OgreJNI.ParticleSystemManager_parseScript(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(stream), groupName);
  }

  public float getLoadingOrder() {
    return OgreJNI.ParticleSystemManager_getLoadingOrder(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleAffectorFactory_p_std__lessT_std__string_t_t__type_t getAffectorFactoryIterator() {
    return new SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleAffectorFactory_p_std__lessT_std__string_t_t__type_t(OgreJNI.ParticleSystemManager_getAffectorFactoryIterator(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleEmitterFactory_p_std__lessT_std__string_t_t__type_t getEmitterFactoryIterator() {
    return new SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleEmitterFactory_p_std__lessT_std__string_t_t__type_t(OgreJNI.ParticleSystemManager_getEmitterFactoryIterator(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleSystemRendererFactory_p_std__lessT_std__string_t_t__type_t getRendererFactoryIterator() {
    return new SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleSystemRendererFactory_p_std__lessT_std__string_t_t__type_t(OgreJNI.ParticleSystemManager_getRendererFactoryIterator(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleSystem_p_std__lessT_std__string_t_t__type_t getTemplateIterator() {
    return new SWIGTYPE_p_Ogre__MapIteratorT_Ogre__mapT_std__string_Ogre__ParticleSystem_p_std__lessT_std__string_t_t__type_t(OgreJNI.ParticleSystemManager_getTemplateIterator(swigCPtr, this), true);
  }

  public ParticleSystemFactory _getFactory() {
    long cPtr = OgreJNI.ParticleSystemManager__getFactory(swigCPtr, this);
    return (cPtr == 0) ? null : new ParticleSystemFactory(cPtr, false);
  }

  public static ParticleSystemManager getSingleton() {
    return new ParticleSystemManager(OgreJNI.ParticleSystemManager_getSingleton(), false);
  }

}
