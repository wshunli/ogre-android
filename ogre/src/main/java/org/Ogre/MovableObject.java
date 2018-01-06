/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class MovableObject extends ShadowCaster {
  private transient long swigCPtr;

  protected MovableObject(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.MovableObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MovableObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MovableObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
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
          OgreJNI.delete_MovableObject_Listener(swigCPtr);
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
      OgreJNI.MovableObject_Listener_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OgreJNI.MovableObject_Listener_change_ownership(this, swigCPtr, true);
    }
  
    public Listener() {
      this(OgreJNI.new_MovableObject_Listener(), true);
      OgreJNI.MovableObject_Listener_director_connect(this, swigCPtr, true, true);
    }
  
    public void objectDestroyed(MovableObject arg0) {
      if (getClass() == Listener.class) OgreJNI.MovableObject_Listener_objectDestroyed(swigCPtr, this, MovableObject.getCPtr(arg0), arg0); else OgreJNI.MovableObject_Listener_objectDestroyedSwigExplicitListener(swigCPtr, this, MovableObject.getCPtr(arg0), arg0);
    }
  
    public void objectAttached(MovableObject arg0) {
      if (getClass() == Listener.class) OgreJNI.MovableObject_Listener_objectAttached(swigCPtr, this, MovableObject.getCPtr(arg0), arg0); else OgreJNI.MovableObject_Listener_objectAttachedSwigExplicitListener(swigCPtr, this, MovableObject.getCPtr(arg0), arg0);
    }
  
    public void objectDetached(MovableObject arg0) {
      if (getClass() == Listener.class) OgreJNI.MovableObject_Listener_objectDetached(swigCPtr, this, MovableObject.getCPtr(arg0), arg0); else OgreJNI.MovableObject_Listener_objectDetachedSwigExplicitListener(swigCPtr, this, MovableObject.getCPtr(arg0), arg0);
    }
  
    public void objectMoved(MovableObject arg0) {
      if (getClass() == Listener.class) OgreJNI.MovableObject_Listener_objectMoved(swigCPtr, this, MovableObject.getCPtr(arg0), arg0); else OgreJNI.MovableObject_Listener_objectMovedSwigExplicitListener(swigCPtr, this, MovableObject.getCPtr(arg0), arg0);
    }
  
    public boolean objectRendering(MovableObject arg0, Camera arg1) {
      return (getClass() == Listener.class) ? OgreJNI.MovableObject_Listener_objectRendering(swigCPtr, this, MovableObject.getCPtr(arg0), arg0, Camera.getCPtr(arg1), arg1) : OgreJNI.MovableObject_Listener_objectRenderingSwigExplicitListener(swigCPtr, this, MovableObject.getCPtr(arg0), arg0, Camera.getCPtr(arg1), arg1);
    }
  
    public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t objectQueryLights(MovableObject arg0) {
      long cPtr = (getClass() == Listener.class) ? OgreJNI.MovableObject_Listener_objectQueryLights(swigCPtr, this, MovableObject.getCPtr(arg0), arg0) : OgreJNI.MovableObject_Listener_objectQueryLightsSwigExplicitListener(swigCPtr, this, MovableObject.getCPtr(arg0), arg0);
      return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(cPtr, false);
    }
  
  }

  public void _notifyCreator(MovableObjectFactory fact) {
    OgreJNI.MovableObject__notifyCreator(swigCPtr, this, MovableObjectFactory.getCPtr(fact), fact);
  }

  public MovableObjectFactory _getCreator() {
    long cPtr = OgreJNI.MovableObject__getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new MovableObjectFactory(cPtr, false);
  }

  public void _notifyManager(SceneManager man) {
    OgreJNI.MovableObject__notifyManager(swigCPtr, this, SceneManager.getCPtr(man), man);
  }

  public SceneManager _getManager() {
    long cPtr = OgreJNI.MovableObject__getManager(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public void _releaseManualHardwareResources() {
    OgreJNI.MovableObject__releaseManualHardwareResources(swigCPtr, this);
  }

  public void _restoreManualHardwareResources() {
    OgreJNI.MovableObject__restoreManualHardwareResources(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.MovableObject_getName(swigCPtr, this);
  }

  public String getMovableType() {
    return OgreJNI.MovableObject_getMovableType(swigCPtr, this);
  }

  public Node getParentNode() {
    long cPtr = OgreJNI.MovableObject_getParentNode(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public SceneNode getParentSceneNode() {
    long cPtr = OgreJNI.MovableObject_getParentSceneNode(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public boolean isParentTagPoint() {
    return OgreJNI.MovableObject_isParentTagPoint(swigCPtr, this);
  }

  public void _notifyAttached(Node parent, boolean isTagPoint) {
    OgreJNI.MovableObject__notifyAttached__SWIG_0(swigCPtr, this, Node.getCPtr(parent), parent, isTagPoint);
  }

  public void _notifyAttached(Node parent) {
    OgreJNI.MovableObject__notifyAttached__SWIG_1(swigCPtr, this, Node.getCPtr(parent), parent);
  }

  public boolean isAttached() {
    return OgreJNI.MovableObject_isAttached(swigCPtr, this);
  }

  public void detachFromParent() {
    OgreJNI.MovableObject_detachFromParent(swigCPtr, this);
  }

  public boolean isInScene() {
    return OgreJNI.MovableObject_isInScene(swigCPtr, this);
  }

  public void _notifyMoved() {
    OgreJNI.MovableObject__notifyMoved(swigCPtr, this);
  }

  public void _notifyCurrentCamera(Camera cam) {
    OgreJNI.MovableObject__notifyCurrentCamera(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public AxisAlignedBox getBoundingBox() {
    return new AxisAlignedBox(OgreJNI.MovableObject_getBoundingBox(swigCPtr, this), false);
  }

  public float getBoundingRadius() {
    return OgreJNI.MovableObject_getBoundingRadius(swigCPtr, this);
  }

  public AxisAlignedBox getWorldBoundingBox(boolean derive) {
    return new AxisAlignedBox(OgreJNI.MovableObject_getWorldBoundingBox__SWIG_0(swigCPtr, this, derive), false);
  }

  public AxisAlignedBox getWorldBoundingBox() {
    return new AxisAlignedBox(OgreJNI.MovableObject_getWorldBoundingBox__SWIG_1(swigCPtr, this), false);
  }

  public Sphere getWorldBoundingSphere(boolean derive) {
    return new Sphere(OgreJNI.MovableObject_getWorldBoundingSphere__SWIG_0(swigCPtr, this, derive), false);
  }

  public Sphere getWorldBoundingSphere() {
    return new Sphere(OgreJNI.MovableObject_getWorldBoundingSphere__SWIG_1(swigCPtr, this), false);
  }

  public void _updateRenderQueue(RenderQueue queue) {
    OgreJNI.MovableObject__updateRenderQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public void setVisible(boolean visible) {
    OgreJNI.MovableObject_setVisible(swigCPtr, this, visible);
  }

  public boolean getVisible() {
    return OgreJNI.MovableObject_getVisible(swigCPtr, this);
  }

  public boolean isVisible() {
    return OgreJNI.MovableObject_isVisible(swigCPtr, this);
  }

  public void setRenderingDistance(float dist) {
    OgreJNI.MovableObject_setRenderingDistance(swigCPtr, this, dist);
  }

  public float getRenderingDistance() {
    return OgreJNI.MovableObject_getRenderingDistance(swigCPtr, this);
  }

  public void setRenderingMinPixelSize(float pixelSize) {
    OgreJNI.MovableObject_setRenderingMinPixelSize(swigCPtr, this, pixelSize);
  }

  public float getRenderingMinPixelSize() {
    return OgreJNI.MovableObject_getRenderingMinPixelSize(swigCPtr, this);
  }

  public UserObjectBindings getUserObjectBindings() {
    return new UserObjectBindings(OgreJNI.MovableObject_getUserObjectBindings__SWIG_0(swigCPtr, this), false);
  }

  public void setRenderQueueGroup(short queueID) {
    OgreJNI.MovableObject_setRenderQueueGroup(swigCPtr, this, queueID);
  }

  public void setRenderQueueGroupAndPriority(short queueID, int priority) {
    OgreJNI.MovableObject_setRenderQueueGroupAndPriority(swigCPtr, this, queueID, priority);
  }

  public short getRenderQueueGroup() {
    return OgreJNI.MovableObject_getRenderQueueGroup(swigCPtr, this);
  }

  public Matrix4 _getParentNodeFullTransform() {
    return new Matrix4(OgreJNI.MovableObject__getParentNodeFullTransform(swigCPtr, this), false);
  }

  public void setQueryFlags(long flags) {
    OgreJNI.MovableObject_setQueryFlags(swigCPtr, this, flags);
  }

  public void addQueryFlags(long flags) {
    OgreJNI.MovableObject_addQueryFlags(swigCPtr, this, flags);
  }

  public void removeQueryFlags(long flags) {
    OgreJNI.MovableObject_removeQueryFlags(swigCPtr, this, flags);
  }

  public long getQueryFlags() {
    return OgreJNI.MovableObject_getQueryFlags(swigCPtr, this);
  }

  public static void setDefaultQueryFlags(long flags) {
    OgreJNI.MovableObject_setDefaultQueryFlags(flags);
  }

  public static long getDefaultQueryFlags() {
    return OgreJNI.MovableObject_getDefaultQueryFlags();
  }

  public void setVisibilityFlags(long flags) {
    OgreJNI.MovableObject_setVisibilityFlags(swigCPtr, this, flags);
  }

  public void addVisibilityFlags(long flags) {
    OgreJNI.MovableObject_addVisibilityFlags(swigCPtr, this, flags);
  }

  public void removeVisibilityFlags(long flags) {
    OgreJNI.MovableObject_removeVisibilityFlags(swigCPtr, this, flags);
  }

  public long getVisibilityFlags() {
    return OgreJNI.MovableObject_getVisibilityFlags(swigCPtr, this);
  }

  public static void setDefaultVisibilityFlags(long flags) {
    OgreJNI.MovableObject_setDefaultVisibilityFlags(flags);
  }

  public static long getDefaultVisibilityFlags() {
    return OgreJNI.MovableObject_getDefaultVisibilityFlags();
  }

  public void setListener(MovableObject.Listener listener) {
    OgreJNI.MovableObject_setListener(swigCPtr, this, MovableObject.Listener.getCPtr(listener), listener);
  }

  public MovableObject.Listener getListener() {
    long cPtr = OgreJNI.MovableObject_getListener(swigCPtr, this);
    return (cPtr == 0) ? null : new MovableObject.Listener(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t queryLights() {
    return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreJNI.MovableObject_queryLights(swigCPtr, this), false);
  }

  public long getLightMask() {
    return OgreJNI.MovableObject_getLightMask(swigCPtr, this);
  }

  public void setLightMask(long lightMask) {
    OgreJNI.MovableObject_setLightMask(swigCPtr, this, lightMask);
  }

  public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t _getLightList() {
    long cPtr = OgreJNI.MovableObject__getLightList(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__EdgeData getEdgeList() {
    long cPtr = OgreJNI.MovableObject_getEdgeList(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__EdgeData(cPtr, false);
  }

  public boolean hasEdgeList() {
    return OgreJNI.MovableObject_hasEdgeList(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t getShadowVolumeRenderableIterator(ShadowTechnique shadowTechnique, Light light, HardwareIndexBufferPtr indexBuffer, SWIGTYPE_p_size_t indexBufferUsedSize, boolean extrudeVertices, float extrusionDist, long flags) {
    return new SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t(OgreJNI.MovableObject_getShadowVolumeRenderableIterator__SWIG_0(swigCPtr, this, shadowTechnique.swigValue(), Light.getCPtr(light), light, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, SWIGTYPE_p_size_t.getCPtr(indexBufferUsedSize), extrudeVertices, extrusionDist, flags), true);
  }

  public SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t getShadowVolumeRenderableIterator(ShadowTechnique shadowTechnique, Light light, HardwareIndexBufferPtr indexBuffer, SWIGTYPE_p_size_t indexBufferUsedSize, boolean extrudeVertices, float extrusionDist) {
    return new SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t(OgreJNI.MovableObject_getShadowVolumeRenderableIterator__SWIG_1(swigCPtr, this, shadowTechnique.swigValue(), Light.getCPtr(light), light, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, SWIGTYPE_p_size_t.getCPtr(indexBufferUsedSize), extrudeVertices, extrusionDist), true);
  }

  public AxisAlignedBox getLightCapBounds() {
    return new AxisAlignedBox(OgreJNI.MovableObject_getLightCapBounds(swigCPtr, this), false);
  }

  public AxisAlignedBox getDarkCapBounds(Light light, float dirLightExtrusionDist) {
    return new AxisAlignedBox(OgreJNI.MovableObject_getDarkCapBounds(swigCPtr, this, Light.getCPtr(light), light, dirLightExtrusionDist), false);
  }

  public void setCastShadows(boolean enabled) {
    OgreJNI.MovableObject_setCastShadows(swigCPtr, this, enabled);
  }

  public boolean getCastShadows() {
    return OgreJNI.MovableObject_getCastShadows(swigCPtr, this);
  }

  public boolean getReceivesShadows() {
    return OgreJNI.MovableObject_getReceivesShadows(swigCPtr, this);
  }

  public float getPointExtrusionDistance(Light l) {
    return OgreJNI.MovableObject_getPointExtrusionDistance(swigCPtr, this, Light.getCPtr(l), l);
  }

  public long getTypeFlags() {
    return OgreJNI.MovableObject_getTypeFlags(swigCPtr, this);
  }

  public void visitRenderables(Renderable.Visitor visitor, boolean debugRenderables) {
    OgreJNI.MovableObject_visitRenderables__SWIG_0(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor, debugRenderables);
  }

  public void visitRenderables(Renderable.Visitor visitor) {
    OgreJNI.MovableObject_visitRenderables__SWIG_1(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor);
  }

  public void setDebugDisplayEnabled(boolean enabled) {
    OgreJNI.MovableObject_setDebugDisplayEnabled(swigCPtr, this, enabled);
  }

  public boolean isDebugDisplayEnabled() {
    return OgreJNI.MovableObject_isDebugDisplayEnabled(swigCPtr, this);
  }

}
