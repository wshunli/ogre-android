/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Root {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Root(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Root obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Root(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Root(String pluginFileName, String configFileName, String logFileName) {
    this(OgreJNI.new_Root__SWIG_0(pluginFileName, configFileName, logFileName), true);
  }

  public Root(String pluginFileName, String configFileName) {
    this(OgreJNI.new_Root__SWIG_1(pluginFileName, configFileName), true);
  }

  public Root(String pluginFileName) {
    this(OgreJNI.new_Root__SWIG_2(pluginFileName), true);
  }

  public Root() {
    this(OgreJNI.new_Root__SWIG_3(), true);
  }

  public void saveConfig() {
    OgreJNI.Root_saveConfig(swigCPtr, this);
  }

  public boolean restoreConfig() {
    return OgreJNI.Root_restoreConfig(swigCPtr, this);
  }

  public boolean showConfigDialog(ConfigDialog dialog) {
    return OgreJNI.Root_showConfigDialog(swigCPtr, this, ConfigDialog.getCPtr(dialog), dialog);
  }

  public void addRenderSystem(RenderSystem newRend) {
    OgreJNI.Root_addRenderSystem(swigCPtr, this, RenderSystem.getCPtr(newRend), newRend);
  }

  public RenderSystemList getAvailableRenderers() {
    return new RenderSystemList(OgreJNI.Root_getAvailableRenderers(swigCPtr, this), false);
  }

  public RenderSystem getRenderSystemByName(String name) {
    long cPtr = OgreJNI.Root_getRenderSystemByName(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderSystem(cPtr, false);
  }

  public void setRenderSystem(RenderSystem system) {
    OgreJNI.Root_setRenderSystem(swigCPtr, this, RenderSystem.getCPtr(system), system);
  }

  public RenderSystem getRenderSystem() {
    long cPtr = OgreJNI.Root_getRenderSystem(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderSystem(cPtr, false);
  }

  public RenderWindow initialise(boolean autoCreateWindow, String windowTitle, String customCapabilitiesConfig) {
    long cPtr = OgreJNI.Root_initialise__SWIG_0(swigCPtr, this, autoCreateWindow, windowTitle, customCapabilitiesConfig);
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public RenderWindow initialise(boolean autoCreateWindow, String windowTitle) {
    long cPtr = OgreJNI.Root_initialise__SWIG_1(swigCPtr, this, autoCreateWindow, windowTitle);
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public RenderWindow initialise(boolean autoCreateWindow) {
    long cPtr = OgreJNI.Root_initialise__SWIG_2(swigCPtr, this, autoCreateWindow);
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public boolean isInitialised() {
    return OgreJNI.Root_isInitialised(swigCPtr, this);
  }

  public void useCustomRenderSystemCapabilities(RenderSystemCapabilities capabilities) {
    OgreJNI.Root_useCustomRenderSystemCapabilities(swigCPtr, this, RenderSystemCapabilities.getCPtr(capabilities), capabilities);
  }

  public boolean getRemoveRenderQueueStructuresOnClear() {
    return OgreJNI.Root_getRemoveRenderQueueStructuresOnClear(swigCPtr, this);
  }

  public void setRemoveRenderQueueStructuresOnClear(boolean r) {
    OgreJNI.Root_setRemoveRenderQueueStructuresOnClear(swigCPtr, this, r);
  }

  public void addSceneManagerFactory(SceneManagerFactory fact) {
    OgreJNI.Root_addSceneManagerFactory(swigCPtr, this, SceneManagerFactory.getCPtr(fact), fact);
  }

  public void removeSceneManagerFactory(SceneManagerFactory fact) {
    OgreJNI.Root_removeSceneManagerFactory(swigCPtr, this, SceneManagerFactory.getCPtr(fact), fact);
  }

  public SceneManagerMetaData getSceneManagerMetaData(String typeName) {
    long cPtr = OgreJNI.Root_getSceneManagerMetaData__SWIG_0(swigCPtr, this, typeName);
    return (cPtr == 0) ? null : new SceneManagerMetaData(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__SceneManagerMetaData_const_p_t__type getSceneManagerMetaData() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__SceneManagerMetaData_const_p_t__type(OgreJNI.Root_getSceneManagerMetaData__SWIG_1(swigCPtr, this), false);
  }

  public SceneManager createSceneManager() {
    long cPtr = OgreJNI.Root_createSceneManager__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public SceneManager createSceneManager(String typeName, String instanceName) {
    long cPtr = OgreJNI.Root_createSceneManager__SWIG_1(swigCPtr, this, typeName, instanceName);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public SceneManager createSceneManager(String typeName) {
    long cPtr = OgreJNI.Root_createSceneManager__SWIG_2(swigCPtr, this, typeName);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public void destroySceneManager(SceneManager sm) {
    OgreJNI.Root_destroySceneManager(swigCPtr, this, SceneManager.getCPtr(sm), sm);
  }

  public SceneManager getSceneManager(String instanceName) {
    long cPtr = OgreJNI.Root_getSceneManager(swigCPtr, this, instanceName);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public boolean hasSceneManager(String instanceName) {
    return OgreJNI.Root_hasSceneManager(swigCPtr, this, instanceName);
  }

  public SWIGTYPE_p_Ogre__mapT_std__string_Ogre__SceneManager_p_std__lessT_std__string_t_t__type getSceneManagers() {
    return new SWIGTYPE_p_Ogre__mapT_std__string_Ogre__SceneManager_p_std__lessT_std__string_t_t__type(OgreJNI.Root_getSceneManagers(swigCPtr, this), false);
  }

  public TextureManager getTextureManager() {
    long cPtr = OgreJNI.Root_getTextureManager(swigCPtr, this);
    return (cPtr == 0) ? null : new TextureManager(cPtr, false);
  }

  public MeshManager getMeshManager() {
    long cPtr = OgreJNI.Root_getMeshManager(swigCPtr, this);
    return (cPtr == 0) ? null : new MeshManager(cPtr, false);
  }

  public void addFrameListener(FrameListener newListener) {
    OgreJNI.Root_addFrameListener(swigCPtr, this, FrameListener.getCPtr(newListener), newListener);
  }

  public void removeFrameListener(FrameListener oldListener) {
    OgreJNI.Root_removeFrameListener(swigCPtr, this, FrameListener.getCPtr(oldListener), oldListener);
  }

  public void queueEndRendering(boolean state) {
    OgreJNI.Root_queueEndRendering__SWIG_0(swigCPtr, this, state);
  }

  public void queueEndRendering() {
    OgreJNI.Root_queueEndRendering__SWIG_1(swigCPtr, this);
  }

  public boolean endRenderingQueued() {
    return OgreJNI.Root_endRenderingQueued(swigCPtr, this);
  }

  public void startRendering() {
    OgreJNI.Root_startRendering(swigCPtr, this);
  }

  public boolean renderOneFrame() {
    return OgreJNI.Root_renderOneFrame__SWIG_0(swigCPtr, this);
  }

  public boolean renderOneFrame(float timeSinceLastFrame) {
    return OgreJNI.Root_renderOneFrame__SWIG_1(swigCPtr, this, timeSinceLastFrame);
  }

  public void shutdown() {
    OgreJNI.Root_shutdown(swigCPtr, this);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t createFileStream(String filename, String groupName, boolean overwrite, String locationPattern) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_createFileStream__SWIG_0(filename, groupName, overwrite, locationPattern), true);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t createFileStream(String filename, String groupName, boolean overwrite) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_createFileStream__SWIG_1(filename, groupName, overwrite), true);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t createFileStream(String filename, String groupName) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_createFileStream__SWIG_2(filename, groupName), true);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t createFileStream(String filename) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_createFileStream__SWIG_3(filename), true);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t openFileStream(String filename, String groupName, String locationPattern) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_openFileStream__SWIG_0(filename, groupName, locationPattern), true);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t openFileStream(String filename, String groupName) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_openFileStream__SWIG_1(filename, groupName), true);
  }

  public static SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t openFileStream(String filename) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Root_openFileStream__SWIG_2(filename), true);
  }

  public void convertColourValue(ColourValue colour, SWIGTYPE_p_unsigned_int pDest) {
    OgreJNI.Root_convertColourValue(swigCPtr, this, ColourValue.getCPtr(colour), colour, SWIGTYPE_p_unsigned_int.getCPtr(pDest));
  }

  public RenderWindow getAutoCreatedWindow() {
    long cPtr = OgreJNI.Root_getAutoCreatedWindow(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public RenderWindow createRenderWindow(String name, long width, long height, boolean fullScreen, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t miscParams) {
    long cPtr = OgreJNI.Root_createRenderWindow__SWIG_0(swigCPtr, this, name, width, height, fullScreen, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(miscParams));
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public RenderWindow createRenderWindow(String name, long width, long height, boolean fullScreen) {
    long cPtr = OgreJNI.Root_createRenderWindow__SWIG_1(swigCPtr, this, name, width, height, fullScreen);
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public boolean createRenderWindows(SWIGTYPE_p_Ogre__vectorT_Ogre__RenderWindowDescription_t__type renderWindowDescriptions, SWIGTYPE_p_Ogre__vectorT_Ogre__RenderWindow_p_t__type createdWindows) {
    return OgreJNI.Root_createRenderWindows(swigCPtr, this, SWIGTYPE_p_Ogre__vectorT_Ogre__RenderWindowDescription_t__type.getCPtr(renderWindowDescriptions), SWIGTYPE_p_Ogre__vectorT_Ogre__RenderWindow_p_t__type.getCPtr(createdWindows));
  }

  public RenderTarget detachRenderTarget(RenderTarget pWin) {
    long cPtr = OgreJNI.Root_detachRenderTarget__SWIG_0(swigCPtr, this, RenderTarget.getCPtr(pWin), pWin);
    return (cPtr == 0) ? null : new RenderTarget(cPtr, false);
  }

  public RenderTarget detachRenderTarget(String name) {
    long cPtr = OgreJNI.Root_detachRenderTarget__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderTarget(cPtr, false);
  }

  public void destroyRenderTarget(RenderTarget target) {
    OgreJNI.Root_destroyRenderTarget__SWIG_0(swigCPtr, this, RenderTarget.getCPtr(target), target);
  }

  public void destroyRenderTarget(String name) {
    OgreJNI.Root_destroyRenderTarget__SWIG_1(swigCPtr, this, name);
  }

  public RenderTarget getRenderTarget(String name) {
    long cPtr = OgreJNI.Root_getRenderTarget(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderTarget(cPtr, false);
  }

  public void loadPlugin(String pluginName) {
    OgreJNI.Root_loadPlugin(swigCPtr, this, pluginName);
  }

  public void unloadPlugin(String pluginName) {
    OgreJNI.Root_unloadPlugin(swigCPtr, this, pluginName);
  }

  public void installPlugin(SWIGTYPE_p_Ogre__Plugin plugin) {
    OgreJNI.Root_installPlugin(swigCPtr, this, SWIGTYPE_p_Ogre__Plugin.getCPtr(plugin));
  }

  public void uninstallPlugin(SWIGTYPE_p_Ogre__Plugin plugin) {
    OgreJNI.Root_uninstallPlugin(swigCPtr, this, SWIGTYPE_p_Ogre__Plugin.getCPtr(plugin));
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__Plugin_p_t__type getInstalledPlugins() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__Plugin_p_t__type(OgreJNI.Root_getInstalledPlugins(swigCPtr, this), false);
  }

  public SWIGTYPE_p_Ogre__Timer getTimer() {
    long cPtr = OgreJNI.Root_getTimer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__Timer(cPtr, false);
  }

  public boolean _fireFrameStarted(FrameEvent evt) {
    return OgreJNI.Root__fireFrameStarted__SWIG_0(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public boolean _fireFrameRenderingQueued(FrameEvent evt) {
    return OgreJNI.Root__fireFrameRenderingQueued__SWIG_0(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public boolean _fireFrameEnded(FrameEvent evt) {
    return OgreJNI.Root__fireFrameEnded__SWIG_0(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public boolean _fireFrameStarted() {
    return OgreJNI.Root__fireFrameStarted__SWIG_1(swigCPtr, this);
  }

  public boolean _fireFrameRenderingQueued() {
    return OgreJNI.Root__fireFrameRenderingQueued__SWIG_1(swigCPtr, this);
  }

  public boolean _fireFrameEnded() {
    return OgreJNI.Root__fireFrameEnded__SWIG_1(swigCPtr, this);
  }

  public long getNextFrameNumber() {
    return OgreJNI.Root_getNextFrameNumber(swigCPtr, this);
  }

  public SceneManager _getCurrentSceneManager() {
    long cPtr = OgreJNI.Root__getCurrentSceneManager(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public void _pushCurrentSceneManager(SceneManager sm) {
    OgreJNI.Root__pushCurrentSceneManager(swigCPtr, this, SceneManager.getCPtr(sm), sm);
  }

  public void _popCurrentSceneManager(SceneManager sm) {
    OgreJNI.Root__popCurrentSceneManager(swigCPtr, this, SceneManager.getCPtr(sm), sm);
  }

  public boolean _updateAllRenderTargets() {
    return OgreJNI.Root__updateAllRenderTargets__SWIG_0(swigCPtr, this);
  }

  public boolean _updateAllRenderTargets(FrameEvent evt) {
    return OgreJNI.Root__updateAllRenderTargets__SWIG_1(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public RenderQueueInvocationSequence createRenderQueueInvocationSequence(String name) {
    long cPtr = OgreJNI.Root_createRenderQueueInvocationSequence(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderQueueInvocationSequence(cPtr, false);
  }

  public RenderQueueInvocationSequence getRenderQueueInvocationSequence(String name) {
    long cPtr = OgreJNI.Root_getRenderQueueInvocationSequence(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderQueueInvocationSequence(cPtr, false);
  }

  public void destroyRenderQueueInvocationSequence(String name) {
    OgreJNI.Root_destroyRenderQueueInvocationSequence(swigCPtr, this, name);
  }

  public void destroyAllRenderQueueInvocationSequences() {
    OgreJNI.Root_destroyAllRenderQueueInvocationSequences(swigCPtr, this);
  }

  public static Root getSingleton() {
    return new Root(OgreJNI.Root_getSingleton(), false);
  }

  public void clearEventTimes() {
    OgreJNI.Root_clearEventTimes(swigCPtr, this);
  }

  public void setFrameSmoothingPeriod(float period) {
    OgreJNI.Root_setFrameSmoothingPeriod(swigCPtr, this, period);
  }

  public float getFrameSmoothingPeriod() {
    return OgreJNI.Root_getFrameSmoothingPeriod(swigCPtr, this);
  }

  public void addMovableObjectFactory(MovableObjectFactory fact, boolean overrideExisting) {
    OgreJNI.Root_addMovableObjectFactory__SWIG_0(swigCPtr, this, MovableObjectFactory.getCPtr(fact), fact, overrideExisting);
  }

  public void addMovableObjectFactory(MovableObjectFactory fact) {
    OgreJNI.Root_addMovableObjectFactory__SWIG_1(swigCPtr, this, MovableObjectFactory.getCPtr(fact), fact);
  }

  public void removeMovableObjectFactory(MovableObjectFactory fact) {
    OgreJNI.Root_removeMovableObjectFactory(swigCPtr, this, MovableObjectFactory.getCPtr(fact), fact);
  }

  public boolean hasMovableObjectFactory(String typeName) {
    return OgreJNI.Root_hasMovableObjectFactory(swigCPtr, this, typeName);
  }

  public MovableObjectFactory getMovableObjectFactory(String typeName) {
    long cPtr = OgreJNI.Root_getMovableObjectFactory(swigCPtr, this, typeName);
    return (cPtr == 0) ? null : new MovableObjectFactory(cPtr, false);
  }

  public long _allocateNextMovableObjectTypeFlag() {
    return OgreJNI.Root__allocateNextMovableObjectTypeFlag(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__ConstMapIteratorT_Ogre__mapT_std__string_Ogre__MovableObjectFactory_p_std__lessT_std__string_t_t__type_t getMovableObjectFactoryIterator() {
    return new SWIGTYPE_p_Ogre__ConstMapIteratorT_Ogre__mapT_std__string_Ogre__MovableObjectFactory_p_std__lessT_std__string_t_t__type_t(OgreJNI.Root_getMovableObjectFactoryIterator(swigCPtr, this), true);
  }

  public long getDisplayMonitorCount() {
    return OgreJNI.Root_getDisplayMonitorCount(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__WorkQueue getWorkQueue() {
    long cPtr = OgreJNI.Root_getWorkQueue(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__WorkQueue(cPtr, false);
  }

  public void setWorkQueue(SWIGTYPE_p_Ogre__WorkQueue queue) {
    OgreJNI.Root_setWorkQueue(swigCPtr, this, SWIGTYPE_p_Ogre__WorkQueue.getCPtr(queue));
  }

  public void setBlendIndicesGpuRedundant(boolean redundant) {
    OgreJNI.Root_setBlendIndicesGpuRedundant(swigCPtr, this, redundant);
  }

  public boolean isBlendIndicesGpuRedundant() {
    return OgreJNI.Root_isBlendIndicesGpuRedundant(swigCPtr, this);
  }

  public void setBlendWeightsGpuRedundant(boolean redundant) {
    OgreJNI.Root_setBlendWeightsGpuRedundant(swigCPtr, this, redundant);
  }

  public boolean isBlendWeightsGpuRedundant() {
    return OgreJNI.Root_isBlendWeightsGpuRedundant(swigCPtr, this);
  }

  public void setDefaultMinPixelSize(float pixelSize) {
    OgreJNI.Root_setDefaultMinPixelSize(swigCPtr, this, pixelSize);
  }

  public float getDefaultMinPixelSize() {
    return OgreJNI.Root_getDefaultMinPixelSize(swigCPtr, this);
  }

}
