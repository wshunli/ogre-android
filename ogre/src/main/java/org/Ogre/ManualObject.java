/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ManualObject extends MovableObject {
  private transient long swigCPtr;

  protected ManualObject(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.ManualObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ManualObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ManualObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ManualObject(String name) {
    this(OgreJNI.new_ManualObject(name), true);
  }

  public void _releaseManualHardwareResources() {
    OgreJNI.ManualObject__releaseManualHardwareResources(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.ManualObject_clear(swigCPtr, this);
  }

  public void estimateVertexCount(long vcount) {
    OgreJNI.ManualObject_estimateVertexCount(swigCPtr, this, vcount);
  }

  public void estimateIndexCount(long icount) {
    OgreJNI.ManualObject_estimateIndexCount(swigCPtr, this, icount);
  }

  public void begin(String materialName, RenderOperation.OperationType opType, String groupName) {
    OgreJNI.ManualObject_begin__SWIG_0(swigCPtr, this, materialName, opType.swigValue(), groupName);
  }

  public void begin(String materialName, RenderOperation.OperationType opType) {
    OgreJNI.ManualObject_begin__SWIG_1(swigCPtr, this, materialName, opType.swigValue());
  }

  public void begin(String materialName) {
    OgreJNI.ManualObject_begin__SWIG_2(swigCPtr, this, materialName);
  }

  public void setDynamic(boolean dyn) {
    OgreJNI.ManualObject_setDynamic(swigCPtr, this, dyn);
  }

  public boolean getDynamic() {
    return OgreJNI.ManualObject_getDynamic(swigCPtr, this);
  }

  public void beginUpdate(long sectionIndex) {
    OgreJNI.ManualObject_beginUpdate(swigCPtr, this, sectionIndex);
  }

  public void position(Vector3 pos) {
    OgreJNI.ManualObject_position__SWIG_0(swigCPtr, this, Vector3.getCPtr(pos), pos);
  }

  public void position(float x, float y, float z) {
    OgreJNI.ManualObject_position__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void normal(Vector3 norm) {
    OgreJNI.ManualObject_normal__SWIG_0(swigCPtr, this, Vector3.getCPtr(norm), norm);
  }

  public void normal(float x, float y, float z) {
    OgreJNI.ManualObject_normal__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void tangent(Vector3 tan) {
    OgreJNI.ManualObject_tangent__SWIG_0(swigCPtr, this, Vector3.getCPtr(tan), tan);
  }

  public void tangent(float x, float y, float z) {
    OgreJNI.ManualObject_tangent__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void textureCoord(float u) {
    OgreJNI.ManualObject_textureCoord__SWIG_0(swigCPtr, this, u);
  }

  public void textureCoord(float u, float v) {
    OgreJNI.ManualObject_textureCoord__SWIG_1(swigCPtr, this, u, v);
  }

  public void textureCoord(float u, float v, float w) {
    OgreJNI.ManualObject_textureCoord__SWIG_2(swigCPtr, this, u, v, w);
  }

  public void textureCoord(float x, float y, float z, float w) {
    OgreJNI.ManualObject_textureCoord__SWIG_3(swigCPtr, this, x, y, z, w);
  }

  public void textureCoord(Vector2 uv) {
    OgreJNI.ManualObject_textureCoord__SWIG_4(swigCPtr, this, Vector2.getCPtr(uv), uv);
  }

  public void textureCoord(Vector3 uvw) {
    OgreJNI.ManualObject_textureCoord__SWIG_5(swigCPtr, this, Vector3.getCPtr(uvw), uvw);
  }

  public void textureCoord(Vector4 xyzw) {
    OgreJNI.ManualObject_textureCoord__SWIG_6(swigCPtr, this, Vector4.getCPtr(xyzw), xyzw);
  }

  public void colour(ColourValue col) {
    OgreJNI.ManualObject_colour__SWIG_0(swigCPtr, this, ColourValue.getCPtr(col), col);
  }

  public void colour(float r, float g, float b, float a) {
    OgreJNI.ManualObject_colour__SWIG_1(swigCPtr, this, r, g, b, a);
  }

  public void colour(float r, float g, float b) {
    OgreJNI.ManualObject_colour__SWIG_2(swigCPtr, this, r, g, b);
  }

  public void index(long idx) {
    OgreJNI.ManualObject_index(swigCPtr, this, idx);
  }

  public void triangle(long i1, long i2, long i3) {
    OgreJNI.ManualObject_triangle(swigCPtr, this, i1, i2, i3);
  }

  public void quad(long i1, long i2, long i3, long i4) {
    OgreJNI.ManualObject_quad(swigCPtr, this, i1, i2, i3, i4);
  }

  public long getCurrentVertexCount() {
    return OgreJNI.ManualObject_getCurrentVertexCount(swigCPtr, this);
  }

  public long getCurrentIndexCount() {
    return OgreJNI.ManualObject_getCurrentIndexCount(swigCPtr, this);
  }

  public ManualObject.ManualObjectSection end() {
    long cPtr = OgreJNI.ManualObject_end(swigCPtr, this);
    return (cPtr == 0) ? null : new ManualObject.ManualObjectSection(cPtr, false);
  }

  public void setMaterialName(long subIndex, String name, String group) {
    OgreJNI.ManualObject_setMaterialName__SWIG_0(swigCPtr, this, subIndex, name, group);
  }

  public void setMaterialName(long subIndex, String name) {
    OgreJNI.ManualObject_setMaterialName__SWIG_1(swigCPtr, this, subIndex, name);
  }

  public MeshPtr convertToMesh(String meshName, String groupName) {
    return new MeshPtr(OgreJNI.ManualObject_convertToMesh__SWIG_0(swigCPtr, this, meshName, groupName), true);
  }

  public MeshPtr convertToMesh(String meshName) {
    return new MeshPtr(OgreJNI.ManualObject_convertToMesh__SWIG_1(swigCPtr, this, meshName), true);
  }

  public void setUseIdentityProjection(boolean useIdentityProjection) {
    OgreJNI.ManualObject_setUseIdentityProjection(swigCPtr, this, useIdentityProjection);
  }

  public boolean getUseIdentityProjection() {
    return OgreJNI.ManualObject_getUseIdentityProjection(swigCPtr, this);
  }

  public void setUseIdentityView(boolean useIdentityView) {
    OgreJNI.ManualObject_setUseIdentityView(swigCPtr, this, useIdentityView);
  }

  public boolean getUseIdentityView() {
    return OgreJNI.ManualObject_getUseIdentityView(swigCPtr, this);
  }

  public void setBoundingBox(AxisAlignedBox box) {
    OgreJNI.ManualObject_setBoundingBox(swigCPtr, this, AxisAlignedBox.getCPtr(box), box);
  }

  public ManualObject.ManualObjectSection getSection(long index) {
    long cPtr = OgreJNI.ManualObject_getSection(swigCPtr, this, index);
    return (cPtr == 0) ? null : new ManualObject.ManualObjectSection(cPtr, false);
  }

  public long getNumSections() {
    return OgreJNI.ManualObject_getNumSections(swigCPtr, this);
  }

  public void setKeepDeclarationOrder(boolean keepOrder) {
    OgreJNI.ManualObject_setKeepDeclarationOrder(swigCPtr, this, keepOrder);
  }

  public boolean getKeepDeclarationOrder() {
    return OgreJNI.ManualObject_getKeepDeclarationOrder(swigCPtr, this);
  }

  public String getMovableType() {
    return OgreJNI.ManualObject_getMovableType(swigCPtr, this);
  }

  public AxisAlignedBox getBoundingBox() {
    return new AxisAlignedBox(OgreJNI.ManualObject_getBoundingBox(swigCPtr, this), false);
  }

  public float getBoundingRadius() {
    return OgreJNI.ManualObject_getBoundingRadius(swigCPtr, this);
  }

  public void _updateRenderQueue(RenderQueue queue) {
    OgreJNI.ManualObject__updateRenderQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public SWIGTYPE_p_Ogre__EdgeData getEdgeList() {
    long cPtr = OgreJNI.ManualObject_getEdgeList(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__EdgeData(cPtr, false);
  }

  public boolean hasEdgeList() {
    return OgreJNI.ManualObject_hasEdgeList(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t getShadowVolumeRenderableIterator(ShadowTechnique shadowTechnique, Light light, HardwareIndexBufferPtr indexBuffer, SWIGTYPE_p_size_t indexBufferUsedSize, boolean extrudeVertices, float extrusionDist, long flags) {
    return new SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t(OgreJNI.ManualObject_getShadowVolumeRenderableIterator__SWIG_0(swigCPtr, this, shadowTechnique.swigValue(), Light.getCPtr(light), light, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, SWIGTYPE_p_size_t.getCPtr(indexBufferUsedSize), extrudeVertices, extrusionDist, flags), true);
  }

  public SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t getShadowVolumeRenderableIterator(ShadowTechnique shadowTechnique, Light light, HardwareIndexBufferPtr indexBuffer, SWIGTYPE_p_size_t indexBufferUsedSize, boolean extrudeVertices, float extrusionDist) {
    return new SWIGTYPE_p_Ogre__VectorIteratorT_Ogre__vectorT_Ogre__ShadowRenderable_p_t__type_t(OgreJNI.ManualObject_getShadowVolumeRenderableIterator__SWIG_1(swigCPtr, this, shadowTechnique.swigValue(), Light.getCPtr(light), light, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, SWIGTYPE_p_size_t.getCPtr(indexBufferUsedSize), extrudeVertices, extrusionDist), true);
  }

  static public class ManualObjectSection extends Renderable {
    private transient long swigCPtr;
  
    protected ManualObjectSection(long cPtr, boolean cMemoryOwn) {
      super(OgreJNI.ManualObject_ManualObjectSection_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ManualObjectSection obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_ManualObject_ManualObjectSection(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public ManualObjectSection(ManualObject parent, String materialName, RenderOperation.OperationType opType, String groupName) {
      this(OgreJNI.new_ManualObject_ManualObjectSection__SWIG_0(ManualObject.getCPtr(parent), parent, materialName, opType.swigValue(), groupName), true);
    }
  
    public ManualObjectSection(ManualObject parent, String materialName, RenderOperation.OperationType opType) {
      this(OgreJNI.new_ManualObject_ManualObjectSection__SWIG_1(ManualObject.getCPtr(parent), parent, materialName, opType.swigValue()), true);
    }
  
    public RenderOperation getRenderOperation() {
      long cPtr = OgreJNI.ManualObject_ManualObjectSection_getRenderOperation__SWIG_0(swigCPtr, this);
      return (cPtr == 0) ? null : new RenderOperation(cPtr, false);
    }
  
    public String getMaterialName() {
      return OgreJNI.ManualObject_ManualObjectSection_getMaterialName(swigCPtr, this);
    }
  
    public String getMaterialGroup() {
      return OgreJNI.ManualObject_ManualObjectSection_getMaterialGroup(swigCPtr, this);
    }
  
    public void setMaterialName(String name, String groupName) {
      OgreJNI.ManualObject_ManualObjectSection_setMaterialName__SWIG_0(swigCPtr, this, name, groupName);
    }
  
    public void setMaterialName(String name) {
      OgreJNI.ManualObject_ManualObjectSection_setMaterialName__SWIG_1(swigCPtr, this, name);
    }
  
    public void set32BitIndices(boolean n32) {
      OgreJNI.ManualObject_ManualObjectSection_set32BitIndices(swigCPtr, this, n32);
    }
  
    public boolean get32BitIndices() {
      return OgreJNI.ManualObject_ManualObjectSection_get32BitIndices(swigCPtr, this);
    }
  
    public MaterialPtr getMaterial() {
      return new MaterialPtr(OgreJNI.ManualObject_ManualObjectSection_getMaterial(swigCPtr, this), false);
    }
  
    public void getRenderOperation(RenderOperation op) {
      OgreJNI.ManualObject_ManualObjectSection_getRenderOperation__SWIG_1(swigCPtr, this, RenderOperation.getCPtr(op), op);
    }
  
    public void getWorldTransforms(Matrix4 xform) {
      OgreJNI.ManualObject_ManualObjectSection_getWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
    }
  
    public float getSquaredViewDepth(Camera arg0) {
      return OgreJNI.ManualObject_ManualObjectSection_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(arg0), arg0);
    }
  
    public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t getLights() {
      return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreJNI.ManualObject_ManualObjectSection_getLights(swigCPtr, this), false);
    }
  
  }

  static public class ManualObjectSectionShadowRenderable extends ShadowRenderable {
    private transient long swigCPtr;
  
    protected ManualObjectSectionShadowRenderable(long cPtr, boolean cMemoryOwn) {
      super(OgreJNI.ManualObject_ManualObjectSectionShadowRenderable_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ManualObjectSectionShadowRenderable obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_ManualObject_ManualObjectSectionShadowRenderable(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public ManualObjectSectionShadowRenderable(ManualObject parent, HardwareIndexBufferPtr indexBuffer, VertexData vertexData, boolean createSeparateLightCap, boolean isLightCap) {
      this(OgreJNI.new_ManualObject_ManualObjectSectionShadowRenderable__SWIG_0(ManualObject.getCPtr(parent), parent, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, VertexData.getCPtr(vertexData), vertexData, createSeparateLightCap, isLightCap), true);
    }
  
    public ManualObjectSectionShadowRenderable(ManualObject parent, HardwareIndexBufferPtr indexBuffer, VertexData vertexData, boolean createSeparateLightCap) {
      this(OgreJNI.new_ManualObject_ManualObjectSectionShadowRenderable__SWIG_1(ManualObject.getCPtr(parent), parent, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer, VertexData.getCPtr(vertexData), vertexData, createSeparateLightCap), true);
    }
  
    public void getWorldTransforms(Matrix4 xform) {
      OgreJNI.ManualObject_ManualObjectSectionShadowRenderable_getWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
    }
  
    public HardwareVertexBufferPtr getPositionBuffer() {
      return new HardwareVertexBufferPtr(OgreJNI.ManualObject_ManualObjectSectionShadowRenderable_getPositionBuffer(swigCPtr, this), true);
    }
  
    public HardwareVertexBufferPtr getWBuffer() {
      return new HardwareVertexBufferPtr(OgreJNI.ManualObject_ManualObjectSectionShadowRenderable_getWBuffer(swigCPtr, this), true);
    }
  
    public void rebindIndexBuffer(HardwareIndexBufferPtr indexBuffer) {
      OgreJNI.ManualObject_ManualObjectSectionShadowRenderable_rebindIndexBuffer(swigCPtr, this, HardwareIndexBufferPtr.getCPtr(indexBuffer), indexBuffer);
    }
  
  }

  public void visitRenderables(Renderable.Visitor visitor, boolean debugRenderables) {
    OgreJNI.ManualObject_visitRenderables__SWIG_0(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor, debugRenderables);
  }

  public void visitRenderables(Renderable.Visitor visitor) {
    OgreJNI.ManualObject_visitRenderables__SWIG_1(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor);
  }

}
