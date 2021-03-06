/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class EntityMeshLodChangedEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EntityMeshLodChangedEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EntityMeshLodChangedEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_EntityMeshLodChangedEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEntity(Entity value) {
    OgreJNI.EntityMeshLodChangedEvent_entity_set(swigCPtr, this, Entity.getCPtr(value), value);
  }

  public Entity getEntity() {
    long cPtr = OgreJNI.EntityMeshLodChangedEvent_entity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Entity(cPtr, false);
  }

  public void setCamera(Camera value) {
    OgreJNI.EntityMeshLodChangedEvent_camera_set(swigCPtr, this, Camera.getCPtr(value), value);
  }

  public Camera getCamera() {
    long cPtr = OgreJNI.EntityMeshLodChangedEvent_camera_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Camera(cPtr, false);
  }

  public void setLodValue(float value) {
    OgreJNI.EntityMeshLodChangedEvent_lodValue_set(swigCPtr, this, value);
  }

  public float getLodValue() {
    return OgreJNI.EntityMeshLodChangedEvent_lodValue_get(swigCPtr, this);
  }

  public void setPreviousLodIndex(int value) {
    OgreJNI.EntityMeshLodChangedEvent_previousLodIndex_set(swigCPtr, this, value);
  }

  public int getPreviousLodIndex() {
    return OgreJNI.EntityMeshLodChangedEvent_previousLodIndex_get(swigCPtr, this);
  }

  public void setNewLodIndex(int value) {
    OgreJNI.EntityMeshLodChangedEvent_newLodIndex_set(swigCPtr, this, value);
  }

  public int getNewLodIndex() {
    return OgreJNI.EntityMeshLodChangedEvent_newLodIndex_get(swigCPtr, this);
  }

  public EntityMeshLodChangedEvent() {
    this(OgreJNI.new_EntityMeshLodChangedEvent(), true);
  }

}
