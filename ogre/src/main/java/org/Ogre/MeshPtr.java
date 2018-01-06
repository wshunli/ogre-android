/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class MeshPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MeshPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MeshPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MeshPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MeshPtr() {
    this(OgreJNI.new_MeshPtr__SWIG_1(), true);
  }

  public MeshPtr(MeshPtr r) {
    this(OgreJNI.new_MeshPtr__SWIG_2(MeshPtr.getCPtr(r), r), true);
  }

  public Mesh __ref__() {
    return new Mesh(OgreJNI.MeshPtr___ref__(swigCPtr, this), false);
  }

  public Mesh __deref__() {
    long cPtr = OgreJNI.MeshPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Mesh(cPtr, false);
  }

  public Mesh get() {
    long cPtr = OgreJNI.MeshPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Mesh(cPtr, false);
  }

  public boolean unique() {
    return OgreJNI.MeshPtr_unique(swigCPtr, this);
  }

  public int use_count() {
    return OgreJNI.MeshPtr_use_count(swigCPtr, this);
  }

  public void reset() {
    OgreJNI.MeshPtr_reset__SWIG_0(swigCPtr, this);
  }

  public void reset(Mesh rep) {
    OgreJNI.MeshPtr_reset__SWIG_1(swigCPtr, this, Mesh.getCPtr(rep), rep);
  }

  public SubMesh createSubMesh() {
    long cPtr = OgreJNI.MeshPtr_createSubMesh__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public SubMesh createSubMesh(String name) {
    long cPtr = OgreJNI.MeshPtr_createSubMesh__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public void nameSubMesh(String name, int index) {
    OgreJNI.MeshPtr_nameSubMesh(swigCPtr, this, name, index);
  }

  public void unnameSubMesh(String name) {
    OgreJNI.MeshPtr_unnameSubMesh(swigCPtr, this, name);
  }

  public int _getSubMeshIndex(String name) {
    return OgreJNI.MeshPtr__getSubMeshIndex(swigCPtr, this, name);
  }

  public long getNumSubMeshes() {
    return OgreJNI.MeshPtr_getNumSubMeshes(swigCPtr, this);
  }

  public SubMesh getSubMesh(long index) {
    long cPtr = OgreJNI.MeshPtr_getSubMesh__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public SubMesh getSubMesh(String name) {
    long cPtr = OgreJNI.MeshPtr_getSubMesh__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public void destroySubMesh(int index) {
    OgreJNI.MeshPtr_destroySubMesh__SWIG_0(swigCPtr, this, index);
  }

  public void destroySubMesh(String name) {
    OgreJNI.MeshPtr_destroySubMesh__SWIG_1(swigCPtr, this, name);
  }

  public SubMeshList getSubMeshes() {
    return new SubMeshList(OgreJNI.MeshPtr_getSubMeshes(swigCPtr, this), false);
  }

  public void setSharedVertexData(VertexData value) {
    OgreJNI.MeshPtr_sharedVertexData_set(swigCPtr, this, VertexData.getCPtr(value), value);
  }

  public VertexData getSharedVertexData() {
    long cPtr = OgreJNI.MeshPtr_sharedVertexData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void setSharedBlendIndexToBoneIndexMap(SWIGTYPE_p_Ogre__vectorT_unsigned_short_t__type value) {
    OgreJNI.MeshPtr_sharedBlendIndexToBoneIndexMap_set(swigCPtr, this, SWIGTYPE_p_Ogre__vectorT_unsigned_short_t__type.getCPtr(value));
  }

  public SWIGTYPE_p_Ogre__vectorT_unsigned_short_t__type getSharedBlendIndexToBoneIndexMap() {
    long cPtr = OgreJNI.MeshPtr_sharedBlendIndexToBoneIndexMap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__vectorT_unsigned_short_t__type(cPtr, false);
  }

  public MeshPtr clone(String newName, String newGroup) {
    return new MeshPtr(OgreJNI.MeshPtr_clone__SWIG_0(swigCPtr, this, newName, newGroup), true);
  }

  public MeshPtr clone(String newName) {
    return new MeshPtr(OgreJNI.MeshPtr_clone__SWIG_1(swigCPtr, this, newName), true);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.MeshPtr_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.MeshPtr_reload__SWIG_1(swigCPtr, this);
  }

  public AxisAlignedBox getBounds() {
    return new AxisAlignedBox(OgreJNI.MeshPtr_getBounds(swigCPtr, this), false);
  }

  public float getBoundingSphereRadius() {
    return OgreJNI.MeshPtr_getBoundingSphereRadius(swigCPtr, this);
  }

  public float getBoneBoundingRadius() {
    return OgreJNI.MeshPtr_getBoneBoundingRadius(swigCPtr, this);
  }

  public void _setBounds(AxisAlignedBox bounds, boolean pad) {
    OgreJNI.MeshPtr__setBounds__SWIG_0(swigCPtr, this, AxisAlignedBox.getCPtr(bounds), bounds, pad);
  }

  public void _setBounds(AxisAlignedBox bounds) {
    OgreJNI.MeshPtr__setBounds__SWIG_1(swigCPtr, this, AxisAlignedBox.getCPtr(bounds), bounds);
  }

  public void _setBoundingSphereRadius(float radius) {
    OgreJNI.MeshPtr__setBoundingSphereRadius(swigCPtr, this, radius);
  }

  public void _setBoneBoundingRadius(float radius) {
    OgreJNI.MeshPtr__setBoneBoundingRadius(swigCPtr, this, radius);
  }

  public void _computeBoneBoundingRadius() {
    OgreJNI.MeshPtr__computeBoneBoundingRadius(swigCPtr, this);
  }

  public void _updateBoundsFromVertexBuffers(boolean pad) {
    OgreJNI.MeshPtr__updateBoundsFromVertexBuffers__SWIG_0(swigCPtr, this, pad);
  }

  public void _updateBoundsFromVertexBuffers() {
    OgreJNI.MeshPtr__updateBoundsFromVertexBuffers__SWIG_1(swigCPtr, this);
  }

  public void _calcBoundsFromVertexBuffer(VertexData vertexData, AxisAlignedBox outAABB, SWIGTYPE_p_float outRadius, boolean updateOnly) {
    OgreJNI.MeshPtr__calcBoundsFromVertexBuffer__SWIG_0(swigCPtr, this, VertexData.getCPtr(vertexData), vertexData, AxisAlignedBox.getCPtr(outAABB), outAABB, SWIGTYPE_p_float.getCPtr(outRadius), updateOnly);
  }

  public void _calcBoundsFromVertexBuffer(VertexData vertexData, AxisAlignedBox outAABB, SWIGTYPE_p_float outRadius) {
    OgreJNI.MeshPtr__calcBoundsFromVertexBuffer__SWIG_1(swigCPtr, this, VertexData.getCPtr(vertexData), vertexData, AxisAlignedBox.getCPtr(outAABB), outAABB, SWIGTYPE_p_float.getCPtr(outRadius));
  }

  public void setSkeletonName(String skelName) {
    OgreJNI.MeshPtr_setSkeletonName(swigCPtr, this, skelName);
  }

  public boolean hasSkeleton() {
    return OgreJNI.MeshPtr_hasSkeleton(swigCPtr, this);
  }

  public boolean hasVertexAnimation() {
    return OgreJNI.MeshPtr_hasVertexAnimation(swigCPtr, this);
  }

  public SkeletonPtr getSkeleton() {
    return new SkeletonPtr(OgreJNI.MeshPtr_getSkeleton(swigCPtr, this), false);
  }

  public String getSkeletonName() {
    return OgreJNI.MeshPtr_getSkeletonName(swigCPtr, this);
  }

  public void _initAnimationState(AnimationStateSet animSet) {
    OgreJNI.MeshPtr__initAnimationState(swigCPtr, this, AnimationStateSet.getCPtr(animSet), animSet);
  }

  public void _refreshAnimationState(AnimationStateSet animSet) {
    OgreJNI.MeshPtr__refreshAnimationState(swigCPtr, this, AnimationStateSet.getCPtr(animSet), animSet);
  }

  public void addBoneAssignment(VertexBoneAssignment vertBoneAssign) {
    OgreJNI.MeshPtr_addBoneAssignment(swigCPtr, this, VertexBoneAssignment.getCPtr(vertBoneAssign), vertBoneAssign);
  }

  public void clearBoneAssignments() {
    OgreJNI.MeshPtr_clearBoneAssignments(swigCPtr, this);
  }

  public void _notifySkeleton(SkeletonPtr pSkel) {
    OgreJNI.MeshPtr__notifySkeleton(swigCPtr, this, SkeletonPtr.getCPtr(pSkel), pSkel);
  }

  public SWIGTYPE_p_Ogre__MapIteratorT_Ogre__multimapT_size_t_Ogre__VertexBoneAssignment_s_std__lessT_size_t_t_t__type_t getBoneAssignmentIterator() {
    return new SWIGTYPE_p_Ogre__MapIteratorT_Ogre__multimapT_size_t_Ogre__VertexBoneAssignment_s_std__lessT_size_t_t_t__type_t(OgreJNI.MeshPtr_getBoneAssignmentIterator(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__multimapT_size_t_Ogre__VertexBoneAssignment_s_std__lessT_size_t_t_t__type getBoneAssignments() {
    return new SWIGTYPE_p_Ogre__multimapT_size_t_Ogre__VertexBoneAssignment_s_std__lessT_size_t_t_t__type(OgreJNI.MeshPtr_getBoneAssignments(swigCPtr, this), false);
  }

  public int getNumLodLevels() {
    return OgreJNI.MeshPtr_getNumLodLevels(swigCPtr, this);
  }

  public MeshLodUsage getLodLevel(int index) {
    return new MeshLodUsage(OgreJNI.MeshPtr_getLodLevel(swigCPtr, this, index), false);
  }

  public int getLodIndex(float value) {
    return OgreJNI.MeshPtr_getLodIndex(swigCPtr, this, value);
  }

  public boolean hasManualLodLevel() {
    return OgreJNI.MeshPtr_hasManualLodLevel(swigCPtr, this);
  }

  public void updateManualLodLevel(int index, String meshName) {
    OgreJNI.MeshPtr_updateManualLodLevel(swigCPtr, this, index, meshName);
  }

  public void _setLodInfo(int numLevels) {
    OgreJNI.MeshPtr__setLodInfo(swigCPtr, this, numLevels);
  }

  public void _setLodUsage(int level, MeshLodUsage usage) {
    OgreJNI.MeshPtr__setLodUsage(swigCPtr, this, level, MeshLodUsage.getCPtr(usage), usage);
  }

  public void _setSubMeshLodFaceList(int subIdx, int level, IndexData facedata) {
    OgreJNI.MeshPtr__setSubMeshLodFaceList(swigCPtr, this, subIdx, level, IndexData.getCPtr(facedata), facedata);
  }

  public boolean _isManualLodLevel(int level) {
    return OgreJNI.MeshPtr__isManualLodLevel(swigCPtr, this, level);
  }

  public void removeLodLevels() {
    OgreJNI.MeshPtr_removeLodLevels(swigCPtr, this);
  }

  public void setHardwareBufferManager(HardwareBufferManagerBase bufferManager) {
    OgreJNI.MeshPtr_setHardwareBufferManager(swigCPtr, this, HardwareBufferManagerBase.getCPtr(bufferManager), bufferManager);
  }

  public HardwareBufferManagerBase getHardwareBufferManager() {
    long cPtr = OgreJNI.MeshPtr_getHardwareBufferManager(swigCPtr, this);
    return (cPtr == 0) ? null : new HardwareBufferManagerBase(cPtr, false);
  }

  public void setVertexBufferPolicy(HardwareBuffer.Usage usage, boolean shadowBuffer) {
    OgreJNI.MeshPtr_setVertexBufferPolicy__SWIG_0(swigCPtr, this, usage.swigValue(), shadowBuffer);
  }

  public void setVertexBufferPolicy(HardwareBuffer.Usage usage) {
    OgreJNI.MeshPtr_setVertexBufferPolicy__SWIG_1(swigCPtr, this, usage.swigValue());
  }

  public void setIndexBufferPolicy(HardwareBuffer.Usage usage, boolean shadowBuffer) {
    OgreJNI.MeshPtr_setIndexBufferPolicy__SWIG_0(swigCPtr, this, usage.swigValue(), shadowBuffer);
  }

  public void setIndexBufferPolicy(HardwareBuffer.Usage usage) {
    OgreJNI.MeshPtr_setIndexBufferPolicy__SWIG_1(swigCPtr, this, usage.swigValue());
  }

  public HardwareBuffer.Usage getVertexBufferUsage() {
    return HardwareBuffer.Usage.swigToEnum(OgreJNI.MeshPtr_getVertexBufferUsage(swigCPtr, this));
  }

  public HardwareBuffer.Usage getIndexBufferUsage() {
    return HardwareBuffer.Usage.swigToEnum(OgreJNI.MeshPtr_getIndexBufferUsage(swigCPtr, this));
  }

  public boolean isVertexBufferShadowed() {
    return OgreJNI.MeshPtr_isVertexBufferShadowed(swigCPtr, this);
  }

  public boolean isIndexBufferShadowed() {
    return OgreJNI.MeshPtr_isIndexBufferShadowed(swigCPtr, this);
  }

  public int _rationaliseBoneAssignments(long vertexCount, SWIGTYPE_p_Ogre__multimapT_size_t_Ogre__VertexBoneAssignment_s_std__lessT_size_t_t_t__type assignments) {
    return OgreJNI.MeshPtr__rationaliseBoneAssignments(swigCPtr, this, vertexCount, SWIGTYPE_p_Ogre__multimapT_size_t_Ogre__VertexBoneAssignment_s_std__lessT_size_t_t_t__type.getCPtr(assignments));
  }

  public void _compileBoneAssignments() {
    OgreJNI.MeshPtr__compileBoneAssignments(swigCPtr, this);
  }

  public void _updateCompiledBoneAssignments() {
    OgreJNI.MeshPtr__updateCompiledBoneAssignments(swigCPtr, this);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index, boolean splitMirrored, boolean splitRotated, boolean storeParityInW) {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_0(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index, splitMirrored, splitRotated, storeParityInW);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index, boolean splitMirrored, boolean splitRotated) {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_1(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index, splitMirrored, splitRotated);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index, boolean splitMirrored) {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_2(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index, splitMirrored);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index) {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_3(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet) {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_4(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic) {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_5(swigCPtr, this, targetSemantic.swigValue());
  }

  public void buildTangentVectors() {
    OgreJNI.MeshPtr_buildTangentVectors__SWIG_6(swigCPtr, this);
  }

  public boolean suggestTangentVectorBuildParams(VertexElementSemantic targetSemantic, SWIGTYPE_p_unsigned_short outSourceCoordSet, SWIGTYPE_p_unsigned_short outIndex) {
    return OgreJNI.MeshPtr_suggestTangentVectorBuildParams(swigCPtr, this, targetSemantic.swigValue(), SWIGTYPE_p_unsigned_short.getCPtr(outSourceCoordSet), SWIGTYPE_p_unsigned_short.getCPtr(outIndex));
  }

  public void buildEdgeList() {
    OgreJNI.MeshPtr_buildEdgeList(swigCPtr, this);
  }

  public void freeEdgeList() {
    OgreJNI.MeshPtr_freeEdgeList(swigCPtr, this);
  }

  public void prepareForShadowVolume() {
    OgreJNI.MeshPtr_prepareForShadowVolume(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__EdgeData getEdgeList(int lodIndex) {
    long cPtr = OgreJNI.MeshPtr_getEdgeList__SWIG_0(swigCPtr, this, lodIndex);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__EdgeData(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__EdgeData getEdgeList() {
    long cPtr = OgreJNI.MeshPtr_getEdgeList__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__EdgeData(cPtr, false);
  }

  public boolean isPreparedForShadowVolumes() {
    return OgreJNI.MeshPtr_isPreparedForShadowVolumes(swigCPtr, this);
  }

  public boolean isEdgeListBuilt() {
    return OgreJNI.MeshPtr_isEdgeListBuilt(swigCPtr, this);
  }

  public void prepareMatricesForVertexBlend(SWIGTYPE_p_p_Ogre__Matrix4 blendMatrices, Matrix4 boneMatrices, SWIGTYPE_p_Ogre__vectorT_unsigned_short_t__type indexMap) {
    OgreJNI.MeshPtr_prepareMatricesForVertexBlend(swigCPtr, this, SWIGTYPE_p_p_Ogre__Matrix4.getCPtr(blendMatrices), Matrix4.getCPtr(boneMatrices), boneMatrices, SWIGTYPE_p_Ogre__vectorT_unsigned_short_t__type.getCPtr(indexMap));
  }

  public void softwareVertexBlend(VertexData sourceVertexData, VertexData targetVertexData, SWIGTYPE_p_p_Ogre__Matrix4 blendMatrices, long numMatrices, boolean blendNormals) {
    OgreJNI.MeshPtr_softwareVertexBlend(swigCPtr, this, VertexData.getCPtr(sourceVertexData), sourceVertexData, VertexData.getCPtr(targetVertexData), targetVertexData, SWIGTYPE_p_p_Ogre__Matrix4.getCPtr(blendMatrices), numMatrices, blendNormals);
  }

  public void softwareVertexMorph(float t, HardwareVertexBufferPtr b1, HardwareVertexBufferPtr b2, VertexData targetVertexData) {
    OgreJNI.MeshPtr_softwareVertexMorph(swigCPtr, this, t, HardwareVertexBufferPtr.getCPtr(b1), b1, HardwareVertexBufferPtr.getCPtr(b2), b2, VertexData.getCPtr(targetVertexData), targetVertexData);
  }

  public void softwareVertexPoseBlend(float weight, SWIGTYPE_p_Ogre__mapT_size_t_Ogre__Vector3_std__lessT_size_t_t_t__type vertexOffsetMap, SWIGTYPE_p_Ogre__mapT_size_t_Ogre__Vector3_std__lessT_size_t_t_t__type normalsMap, VertexData targetVertexData) {
    OgreJNI.MeshPtr_softwareVertexPoseBlend(swigCPtr, this, weight, SWIGTYPE_p_Ogre__mapT_size_t_Ogre__Vector3_std__lessT_size_t_t_t__type.getCPtr(vertexOffsetMap), SWIGTYPE_p_Ogre__mapT_size_t_Ogre__Vector3_std__lessT_size_t_t_t__type.getCPtr(normalsMap), VertexData.getCPtr(targetVertexData), targetVertexData);
  }

  public SWIGTYPE_p_std__tr1__unordered_mapT_Ogre__String_Ogre__ushort_t getSubMeshNameMap() {
    return new SWIGTYPE_p_std__tr1__unordered_mapT_Ogre__String_Ogre__ushort_t(OgreJNI.MeshPtr_getSubMeshNameMap(swigCPtr, this), false);
  }

  public void setAutoBuildEdgeLists(boolean autobuild) {
    OgreJNI.MeshPtr_setAutoBuildEdgeLists(swigCPtr, this, autobuild);
  }

  public boolean getAutoBuildEdgeLists() {
    return OgreJNI.MeshPtr_getAutoBuildEdgeLists(swigCPtr, this);
  }

  public VertexAnimationType getSharedVertexDataAnimationType() {
    return VertexAnimationType.swigToEnum(OgreJNI.MeshPtr_getSharedVertexDataAnimationType(swigCPtr, this));
  }

  public boolean getSharedVertexDataAnimationIncludesNormals() {
    return OgreJNI.MeshPtr_getSharedVertexDataAnimationIncludesNormals(swigCPtr, this);
  }

  public Animation createAnimation(String name, float length) {
    long cPtr = OgreJNI.MeshPtr_createAnimation(swigCPtr, this, name, length);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation getAnimation(String name) {
    long cPtr = OgreJNI.MeshPtr_getAnimation__SWIG_0(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation getAnimation(int index) {
    long cPtr = OgreJNI.MeshPtr_getAnimation__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation _getAnimationImpl(String name) {
    long cPtr = OgreJNI.MeshPtr__getAnimationImpl(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public boolean hasAnimation(String name) {
    return OgreJNI.MeshPtr_hasAnimation(swigCPtr, this, name);
  }

  public void removeAnimation(String name) {
    OgreJNI.MeshPtr_removeAnimation(swigCPtr, this, name);
  }

  public int getNumAnimations() {
    return OgreJNI.MeshPtr_getNumAnimations(swigCPtr, this);
  }

  public void removeAllAnimations() {
    OgreJNI.MeshPtr_removeAllAnimations(swigCPtr, this);
  }

  public VertexData getVertexDataByTrackHandle(int handle) {
    long cPtr = OgreJNI.MeshPtr_getVertexDataByTrackHandle(swigCPtr, this, handle);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void updateMaterialForAllSubMeshes() {
    OgreJNI.MeshPtr_updateMaterialForAllSubMeshes(swigCPtr, this);
  }

  public void _determineAnimationTypes() {
    OgreJNI.MeshPtr__determineAnimationTypes(swigCPtr, this);
  }

  public boolean _getAnimationTypesDirty() {
    return OgreJNI.MeshPtr__getAnimationTypesDirty(swigCPtr, this);
  }

  public Pose createPose(int target, String name) {
    long cPtr = OgreJNI.MeshPtr_createPose__SWIG_0(swigCPtr, this, target, name);
    return (cPtr == 0) ? null : new Pose(cPtr, false);
  }

  public Pose createPose(int target) {
    long cPtr = OgreJNI.MeshPtr_createPose__SWIG_1(swigCPtr, this, target);
    return (cPtr == 0) ? null : new Pose(cPtr, false);
  }

  public void removePose(int index) {
    OgreJNI.MeshPtr_removePose__SWIG_0(swigCPtr, this, index);
  }

  public void removePose(String name) {
    OgreJNI.MeshPtr_removePose__SWIG_1(swigCPtr, this, name);
  }

  public void removeAllPoses() {
    OgreJNI.MeshPtr_removeAllPoses(swigCPtr, this);
  }

  public PoseList getPoseList() {
    return new PoseList(OgreJNI.MeshPtr_getPoseList(swigCPtr, this), false);
  }

  public SWIGTYPE_p_Ogre__LodStrategy getLodStrategy() {
    long cPtr = OgreJNI.MeshPtr_getLodStrategy(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__LodStrategy(cPtr, false);
  }

  public void setLodStrategy(SWIGTYPE_p_Ogre__LodStrategy lodStrategy) {
    OgreJNI.MeshPtr_setLodStrategy(swigCPtr, this, SWIGTYPE_p_Ogre__LodStrategy.getCPtr(lodStrategy));
  }

  public void prepare(boolean backgroundThread) {
    OgreJNI.MeshPtr_prepare__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void prepare() {
    OgreJNI.MeshPtr_prepare__SWIG_1(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreJNI.MeshPtr_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreJNI.MeshPtr_load__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreJNI.MeshPtr_isReloadable(swigCPtr, this);
  }

  public boolean isManuallyLoaded() {
    return OgreJNI.MeshPtr_isManuallyLoaded(swigCPtr, this);
  }

  public void unload() {
    OgreJNI.MeshPtr_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreJNI.MeshPtr_getSize(swigCPtr, this);
  }

  public void touch() {
    OgreJNI.MeshPtr_touch(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.MeshPtr_getName(swigCPtr, this);
  }

  public java.math.BigInteger getHandle() {
    return OgreJNI.MeshPtr_getHandle(swigCPtr, this);
  }

  public boolean isPrepared() {
    return OgreJNI.MeshPtr_isPrepared(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.MeshPtr_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreJNI.MeshPtr_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreJNI.MeshPtr_getLoadingState(swigCPtr, this));
  }

  public boolean isBackgroundLoaded() {
    return OgreJNI.MeshPtr_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreJNI.MeshPtr_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreJNI.MeshPtr_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreJNI.MeshPtr_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreJNI.MeshPtr_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public String getGroup() {
    return OgreJNI.MeshPtr_getGroup(swigCPtr, this);
  }

  public void changeGroupOwnership(String newGroup) {
    OgreJNI.MeshPtr_changeGroupOwnership(swigCPtr, this, newGroup);
  }

  public ResourceManager getCreator() {
    long cPtr = OgreJNI.MeshPtr_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public String getOrigin() {
    return OgreJNI.MeshPtr_getOrigin(swigCPtr, this);
  }

  public void _notifyOrigin(String origin) {
    OgreJNI.MeshPtr__notifyOrigin(swigCPtr, this, origin);
  }

  public long getStateCount() {
    return OgreJNI.MeshPtr_getStateCount(swigCPtr, this);
  }

  public void _dirtyState() {
    OgreJNI.MeshPtr__dirtyState(swigCPtr, this);
  }

  public void _fireLoadingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.MeshPtr__fireLoadingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _firePreparingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.MeshPtr__firePreparingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _fireUnloadingComplete() {
    OgreJNI.MeshPtr__fireUnloadingComplete(swigCPtr, this);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreJNI.MeshPtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__ParameterDef_t__type getParameters() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__ParameterDef_t__type(OgreJNI.MeshPtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreJNI.MeshPtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t paramList) {
    OgreJNI.MeshPtr_setParameterList(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(paramList));
  }

  public String getParameter(String name) {
    return OgreJNI.MeshPtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreJNI.MeshPtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreJNI.MeshPtr_cleanupDictionary(swigCPtr, this);
  }

}