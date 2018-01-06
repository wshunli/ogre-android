/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class CompositorInstance {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CompositorInstance(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompositorInstance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CompositorInstance(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CompositorInstance(CompositionTechnique technique, CompositorChain chain) {
    this(OgreJNI.new_CompositorInstance(CompositionTechnique.getCPtr(technique), technique, CompositorChain.getCPtr(chain), chain), true);
  }

  static public class Listener {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Listener(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Listener obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_CompositorInstance_Listener(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    protected void swigDirectorDisconnect() {
      swigCMemOwn = false;
      delete();
    }
  
    public void swigReleaseOwnership() {
      swigCMemOwn = false;
      OgreJNI.CompositorInstance_Listener_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OgreJNI.CompositorInstance_Listener_change_ownership(this, swigCPtr, true);
    }
  
    public void notifyMaterialSetup(long pass_id, MaterialPtr mat) {
      if (getClass() == Listener.class) OgreJNI.CompositorInstance_Listener_notifyMaterialSetup(swigCPtr, this, pass_id, MaterialPtr.getCPtr(mat), mat); else OgreJNI.CompositorInstance_Listener_notifyMaterialSetupSwigExplicitListener(swigCPtr, this, pass_id, MaterialPtr.getCPtr(mat), mat);
    }
  
    public void notifyMaterialRender(long pass_id, MaterialPtr mat) {
      if (getClass() == Listener.class) OgreJNI.CompositorInstance_Listener_notifyMaterialRender(swigCPtr, this, pass_id, MaterialPtr.getCPtr(mat), mat); else OgreJNI.CompositorInstance_Listener_notifyMaterialRenderSwigExplicitListener(swigCPtr, this, pass_id, MaterialPtr.getCPtr(mat), mat);
    }
  
    public void notifyResourcesCreated(boolean forResizeOnly) {
      if (getClass() == Listener.class) OgreJNI.CompositorInstance_Listener_notifyResourcesCreated(swigCPtr, this, forResizeOnly); else OgreJNI.CompositorInstance_Listener_notifyResourcesCreatedSwigExplicitListener(swigCPtr, this, forResizeOnly);
    }
  
    public void notifyResourcesReleased(boolean forResizeOnly) {
      if (getClass() == Listener.class) OgreJNI.CompositorInstance_Listener_notifyResourcesReleased(swigCPtr, this, forResizeOnly); else OgreJNI.CompositorInstance_Listener_notifyResourcesReleasedSwigExplicitListener(swigCPtr, this, forResizeOnly);
    }
  
    public Listener() {
      this(OgreJNI.new_CompositorInstance_Listener(), true);
      OgreJNI.CompositorInstance_Listener_director_connect(this, swigCPtr, true, true);
    }
  
  }

  static public class RenderSystemOperation {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected RenderSystemOperation(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(RenderSystemOperation obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_CompositorInstance_RenderSystemOperation(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void execute(SceneManager sm, RenderSystem rs) {
      OgreJNI.CompositorInstance_RenderSystemOperation_execute(swigCPtr, this, SceneManager.getCPtr(sm), sm, RenderSystem.getCPtr(rs), rs);
    }
  
  }

  static public class TargetOperation {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected TargetOperation(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(TargetOperation obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_CompositorInstance_TargetOperation(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public TargetOperation() {
      this(OgreJNI.new_CompositorInstance_TargetOperation__SWIG_0(), true);
    }
  
    public TargetOperation(RenderTarget inTarget) {
      this(OgreJNI.new_CompositorInstance_TargetOperation__SWIG_1(RenderTarget.getCPtr(inTarget), inTarget), true);
    }
  
    public void setTarget(RenderTarget value) {
      OgreJNI.CompositorInstance_TargetOperation_target_set(swigCPtr, this, RenderTarget.getCPtr(value), value);
    }
  
    public RenderTarget getTarget() {
      long cPtr = OgreJNI.CompositorInstance_TargetOperation_target_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RenderTarget(cPtr, false);
    }
  
    public void setCurrentQueueGroupID(int value) {
      OgreJNI.CompositorInstance_TargetOperation_currentQueueGroupID_set(swigCPtr, this, value);
    }
  
    public int getCurrentQueueGroupID() {
      return OgreJNI.CompositorInstance_TargetOperation_currentQueueGroupID_get(swigCPtr, this);
    }
  
    public void setRenderSystemOperations(SWIGTYPE_p_Ogre__vectorT_std__pairT_int_Ogre__CompositorInstance__RenderSystemOperation_p_t_t__type value) {
      OgreJNI.CompositorInstance_TargetOperation_renderSystemOperations_set(swigCPtr, this, SWIGTYPE_p_Ogre__vectorT_std__pairT_int_Ogre__CompositorInstance__RenderSystemOperation_p_t_t__type.getCPtr(value));
    }
  
    public SWIGTYPE_p_Ogre__vectorT_std__pairT_int_Ogre__CompositorInstance__RenderSystemOperation_p_t_t__type getRenderSystemOperations() {
      long cPtr = OgreJNI.CompositorInstance_TargetOperation_renderSystemOperations_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__vectorT_std__pairT_int_Ogre__CompositorInstance__RenderSystemOperation_p_t_t__type(cPtr, false);
    }
  
    public void setVisibilityMask(long value) {
      OgreJNI.CompositorInstance_TargetOperation_visibilityMask_set(swigCPtr, this, value);
    }
  
    public long getVisibilityMask() {
      return OgreJNI.CompositorInstance_TargetOperation_visibilityMask_get(swigCPtr, this);
    }
  
    public void setLodBias(float value) {
      OgreJNI.CompositorInstance_TargetOperation_lodBias_set(swigCPtr, this, value);
    }
  
    public float getLodBias() {
      return OgreJNI.CompositorInstance_TargetOperation_lodBias_get(swigCPtr, this);
    }
  
    public void setRenderQueues(SWIGTYPE_p_std__bitsetT_Ogre__RENDER_QUEUE_MAX_1_t value) {
      OgreJNI.CompositorInstance_TargetOperation_renderQueues_set(swigCPtr, this, SWIGTYPE_p_std__bitsetT_Ogre__RENDER_QUEUE_MAX_1_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_std__bitsetT_Ogre__RENDER_QUEUE_MAX_1_t getRenderQueues() {
      return new SWIGTYPE_p_std__bitsetT_Ogre__RENDER_QUEUE_MAX_1_t(OgreJNI.CompositorInstance_TargetOperation_renderQueues_get(swigCPtr, this), true);
    }
  
    public void setOnlyInitial(boolean value) {
      OgreJNI.CompositorInstance_TargetOperation_onlyInitial_set(swigCPtr, this, value);
    }
  
    public boolean getOnlyInitial() {
      return OgreJNI.CompositorInstance_TargetOperation_onlyInitial_get(swigCPtr, this);
    }
  
    public void setHasBeenRendered(boolean value) {
      OgreJNI.CompositorInstance_TargetOperation_hasBeenRendered_set(swigCPtr, this, value);
    }
  
    public boolean getHasBeenRendered() {
      return OgreJNI.CompositorInstance_TargetOperation_hasBeenRendered_get(swigCPtr, this);
    }
  
    public void setFindVisibleObjects(boolean value) {
      OgreJNI.CompositorInstance_TargetOperation_findVisibleObjects_set(swigCPtr, this, value);
    }
  
    public boolean getFindVisibleObjects() {
      return OgreJNI.CompositorInstance_TargetOperation_findVisibleObjects_get(swigCPtr, this);
    }
  
    public void setMaterialScheme(String value) {
      OgreJNI.CompositorInstance_TargetOperation_materialScheme_set(swigCPtr, this, value);
    }
  
    public String getMaterialScheme() {
      return OgreJNI.CompositorInstance_TargetOperation_materialScheme_get(swigCPtr, this);
    }
  
    public void setShadowsEnabled(boolean value) {
      OgreJNI.CompositorInstance_TargetOperation_shadowsEnabled_set(swigCPtr, this, value);
    }
  
    public boolean getShadowsEnabled() {
      return OgreJNI.CompositorInstance_TargetOperation_shadowsEnabled_get(swigCPtr, this);
    }
  
  }

  public void setEnabled(boolean value) {
    OgreJNI.CompositorInstance_setEnabled(swigCPtr, this, value);
  }

  public boolean getEnabled() {
    return OgreJNI.CompositorInstance_getEnabled(swigCPtr, this);
  }

  public void setAlive(boolean value) {
    OgreJNI.CompositorInstance_setAlive(swigCPtr, this, value);
  }

  public boolean getAlive() {
    return OgreJNI.CompositorInstance_getAlive(swigCPtr, this);
  }

  public String getTextureInstanceName(String name, long mrtIndex) {
    return OgreJNI.CompositorInstance_getTextureInstanceName(swigCPtr, this, name, mrtIndex);
  }

  public TexturePtr getTextureInstance(String name, long mrtIndex) {
    return new TexturePtr(OgreJNI.CompositorInstance_getTextureInstance(swigCPtr, this, name, mrtIndex), true);
  }

  public RenderTarget getRenderTarget(String name) {
    long cPtr = OgreJNI.CompositorInstance_getRenderTarget(swigCPtr, this, name);
    return (cPtr == 0) ? null : new RenderTarget(cPtr, false);
  }

  public void _compileTargetOperations(SWIGTYPE_p_Ogre__vectorT_Ogre__CompositorInstance__TargetOperation_t__type compiledState) {
    OgreJNI.CompositorInstance__compileTargetOperations(swigCPtr, this, SWIGTYPE_p_Ogre__vectorT_Ogre__CompositorInstance__TargetOperation_t__type.getCPtr(compiledState));
  }

  public void _compileOutputOperation(CompositorInstance.TargetOperation finalState) {
    OgreJNI.CompositorInstance__compileOutputOperation(swigCPtr, this, CompositorInstance.TargetOperation.getCPtr(finalState), finalState);
  }

  public Compositor getCompositor() {
    long cPtr = OgreJNI.CompositorInstance_getCompositor(swigCPtr, this);
    return (cPtr == 0) ? null : new Compositor(cPtr, false);
  }

  public CompositionTechnique getTechnique() {
    long cPtr = OgreJNI.CompositorInstance_getTechnique(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public void setTechnique(CompositionTechnique tech, boolean reuseTextures) {
    OgreJNI.CompositorInstance_setTechnique__SWIG_0(swigCPtr, this, CompositionTechnique.getCPtr(tech), tech, reuseTextures);
  }

  public void setTechnique(CompositionTechnique tech) {
    OgreJNI.CompositorInstance_setTechnique__SWIG_1(swigCPtr, this, CompositionTechnique.getCPtr(tech), tech);
  }

  public void setScheme(String schemeName, boolean reuseTextures) {
    OgreJNI.CompositorInstance_setScheme__SWIG_0(swigCPtr, this, schemeName, reuseTextures);
  }

  public void setScheme(String schemeName) {
    OgreJNI.CompositorInstance_setScheme__SWIG_1(swigCPtr, this, schemeName);
  }

  public String getScheme() {
    return OgreJNI.CompositorInstance_getScheme(swigCPtr, this);
  }

  public void notifyResized() {
    OgreJNI.CompositorInstance_notifyResized(swigCPtr, this);
  }

  public CompositorChain getChain() {
    long cPtr = OgreJNI.CompositorInstance_getChain(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositorChain(cPtr, false);
  }

  public void addListener(CompositorInstance.Listener l) {
    OgreJNI.CompositorInstance_addListener(swigCPtr, this, CompositorInstance.Listener.getCPtr(l), l);
  }

  public void removeListener(CompositorInstance.Listener l) {
    OgreJNI.CompositorInstance_removeListener(swigCPtr, this, CompositorInstance.Listener.getCPtr(l), l);
  }

  public void _fireNotifyMaterialSetup(long pass_id, MaterialPtr mat) {
    OgreJNI.CompositorInstance__fireNotifyMaterialSetup(swigCPtr, this, pass_id, MaterialPtr.getCPtr(mat), mat);
  }

  public void _fireNotifyMaterialRender(long pass_id, MaterialPtr mat) {
    OgreJNI.CompositorInstance__fireNotifyMaterialRender(swigCPtr, this, pass_id, MaterialPtr.getCPtr(mat), mat);
  }

  public void _fireNotifyResourcesCreated(boolean forResizeOnly) {
    OgreJNI.CompositorInstance__fireNotifyResourcesCreated(swigCPtr, this, forResizeOnly);
  }

  public void _fireNotifyResourcesReleased(boolean forResizeOnly) {
    OgreJNI.CompositorInstance__fireNotifyResourcesReleased(swigCPtr, this, forResizeOnly);
  }

}
