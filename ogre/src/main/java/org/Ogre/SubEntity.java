/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class SubEntity extends Renderable {
  private transient long swigCPtr;

  protected SubEntity(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.SubEntity_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SubEntity obj) {
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

  public String getMaterialName() {
    return OgreJNI.SubEntity_getMaterialName(swigCPtr, this);
  }

  public void setMaterialName(String name, String groupName) {
    OgreJNI.SubEntity_setMaterialName__SWIG_0(swigCPtr, this, name, groupName);
  }

  public void setMaterialName(String name) {
    OgreJNI.SubEntity_setMaterialName__SWIG_1(swigCPtr, this, name);
  }

  public void setMaterial(MaterialPtr material) {
    OgreJNI.SubEntity_setMaterial(swigCPtr, this, MaterialPtr.getCPtr(material), material);
  }

  public void setVisible(boolean visible) {
    OgreJNI.SubEntity_setVisible(swigCPtr, this, visible);
  }

  public boolean isVisible() {
    return OgreJNI.SubEntity_isVisible(swigCPtr, this);
  }

  public void setRenderQueueGroup(short queueID) {
    OgreJNI.SubEntity_setRenderQueueGroup(swigCPtr, this, queueID);
  }

  public void setRenderQueueGroupAndPriority(short queueID, int priority) {
    OgreJNI.SubEntity_setRenderQueueGroupAndPriority(swigCPtr, this, queueID, priority);
  }

  public short getRenderQueueGroup() {
    return OgreJNI.SubEntity_getRenderQueueGroup(swigCPtr, this);
  }

  public int getRenderQueuePriority() {
    return OgreJNI.SubEntity_getRenderQueuePriority(swigCPtr, this);
  }

  public boolean isRenderQueueGroupSet() {
    return OgreJNI.SubEntity_isRenderQueueGroupSet(swigCPtr, this);
  }

  public boolean isRenderQueuePrioritySet() {
    return OgreJNI.SubEntity_isRenderQueuePrioritySet(swigCPtr, this);
  }

  public SubMesh getSubMesh() {
    long cPtr = OgreJNI.SubEntity_getSubMesh(swigCPtr, this);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public Entity getParent() {
    long cPtr = OgreJNI.SubEntity_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new Entity(cPtr, false);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreJNI.SubEntity_getMaterial(swigCPtr, this), false);
  }

  public Technique getTechnique() {
    long cPtr = OgreJNI.SubEntity_getTechnique(swigCPtr, this);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public void getRenderOperation(RenderOperation op) {
    OgreJNI.SubEntity_getRenderOperation(swigCPtr, this, RenderOperation.getCPtr(op), op);
  }

  public void setIndexDataStartIndex(long start_index) {
    OgreJNI.SubEntity_setIndexDataStartIndex(swigCPtr, this, start_index);
  }

  public long getIndexDataStartIndex() {
    return OgreJNI.SubEntity_getIndexDataStartIndex(swigCPtr, this);
  }

  public void setIndexDataEndIndex(long end_index) {
    OgreJNI.SubEntity_setIndexDataEndIndex(swigCPtr, this, end_index);
  }

  public long getIndexDataEndIndex() {
    return OgreJNI.SubEntity_getIndexDataEndIndex(swigCPtr, this);
  }

  public void resetIndexDataStartEndIndex() {
    OgreJNI.SubEntity_resetIndexDataStartEndIndex(swigCPtr, this);
  }

  public void getWorldTransforms(Matrix4 xform) {
    OgreJNI.SubEntity_getWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
  }

  public int getNumWorldTransforms() {
    return OgreJNI.SubEntity_getNumWorldTransforms(swigCPtr, this);
  }

  public float getSquaredViewDepth(Camera cam) {
    return OgreJNI.SubEntity_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t getLights() {
    return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreJNI.SubEntity_getLights(swigCPtr, this), false);
  }

  public boolean getCastsShadows() {
    return OgreJNI.SubEntity_getCastsShadows(swigCPtr, this);
  }

  public VertexData _getSkelAnimVertexData() {
    long cPtr = OgreJNI.SubEntity__getSkelAnimVertexData(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public VertexData _getSoftwareVertexAnimVertexData() {
    long cPtr = OgreJNI.SubEntity__getSoftwareVertexAnimVertexData(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public VertexData _getHardwareVertexAnimVertexData() {
    long cPtr = OgreJNI.SubEntity__getHardwareVertexAnimVertexData(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public TempBlendedBufferInfo _getSkelAnimTempBufferInfo() {
    long cPtr = OgreJNI.SubEntity__getSkelAnimTempBufferInfo(swigCPtr, this);
    return (cPtr == 0) ? null : new TempBlendedBufferInfo(cPtr, false);
  }

  public TempBlendedBufferInfo _getVertexAnimTempBufferInfo() {
    long cPtr = OgreJNI.SubEntity__getVertexAnimTempBufferInfo(swigCPtr, this);
    return (cPtr == 0) ? null : new TempBlendedBufferInfo(cPtr, false);
  }

  public VertexData getVertexDataForBinding() {
    long cPtr = OgreJNI.SubEntity_getVertexDataForBinding(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void _markBuffersUnusedForAnimation() {
    OgreJNI.SubEntity__markBuffersUnusedForAnimation(swigCPtr, this);
  }

  public void _markBuffersUsedForAnimation() {
    OgreJNI.SubEntity__markBuffersUsedForAnimation(swigCPtr, this);
  }

  public boolean _getBuffersMarkedForAnimation() {
    return OgreJNI.SubEntity__getBuffersMarkedForAnimation(swigCPtr, this);
  }

  public void _restoreBuffersForUnusedAnimation(boolean hardwareAnimation) {
    OgreJNI.SubEntity__restoreBuffersForUnusedAnimation(swigCPtr, this, hardwareAnimation);
  }

  public void _updateCustomGpuParameter(GpuProgramParameters.AutoConstantEntry constantEntry, GpuProgramParameters params) {
    OgreJNI.SubEntity__updateCustomGpuParameter(swigCPtr, this, GpuProgramParameters.AutoConstantEntry.getCPtr(constantEntry), constantEntry, GpuProgramParameters.getCPtr(params), params);
  }

  public void _invalidateCameraCache() {
    OgreJNI.SubEntity__invalidateCameraCache(swigCPtr, this);
  }

}