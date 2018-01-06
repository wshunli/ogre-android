/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class VertexData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VertexData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VertexData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_VertexData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VertexData(HardwareBufferManagerBase mgr) {
    this(OgreJNI.new_VertexData__SWIG_0(HardwareBufferManagerBase.getCPtr(mgr), mgr), true);
  }

  public VertexData() {
    this(OgreJNI.new_VertexData__SWIG_1(), true);
  }

  public VertexData(VertexDeclaration dcl, VertexBufferBinding bind) {
    this(OgreJNI.new_VertexData__SWIG_2(VertexDeclaration.getCPtr(dcl), dcl, VertexBufferBinding.getCPtr(bind), bind), true);
  }

  public void setVertexDeclaration(VertexDeclaration value) {
    OgreJNI.VertexData_vertexDeclaration_set(swigCPtr, this, VertexDeclaration.getCPtr(value), value);
  }

  public VertexDeclaration getVertexDeclaration() {
    long cPtr = OgreJNI.VertexData_vertexDeclaration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexDeclaration(cPtr, false);
  }

  public void setVertexBufferBinding(VertexBufferBinding value) {
    OgreJNI.VertexData_vertexBufferBinding_set(swigCPtr, this, VertexBufferBinding.getCPtr(value), value);
  }

  public VertexBufferBinding getVertexBufferBinding() {
    long cPtr = OgreJNI.VertexData_vertexBufferBinding_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexBufferBinding(cPtr, false);
  }

  public void setMDeleteDclBinding(boolean value) {
    OgreJNI.VertexData_mDeleteDclBinding_set(swigCPtr, this, value);
  }

  public boolean getMDeleteDclBinding() {
    return OgreJNI.VertexData_mDeleteDclBinding_get(swigCPtr, this);
  }

  public void setVertexStart(long value) {
    OgreJNI.VertexData_vertexStart_set(swigCPtr, this, value);
  }

  public long getVertexStart() {
    return OgreJNI.VertexData_vertexStart_get(swigCPtr, this);
  }

  public void setVertexCount(long value) {
    OgreJNI.VertexData_vertexCount_set(swigCPtr, this, value);
  }

  public long getVertexCount() {
    return OgreJNI.VertexData_vertexCount_get(swigCPtr, this);
  }

  static public class HardwareAnimationData {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected HardwareAnimationData(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(HardwareAnimationData obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_VertexData_HardwareAnimationData(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setTargetBufferIndex(int value) {
      OgreJNI.VertexData_HardwareAnimationData_targetBufferIndex_set(swigCPtr, this, value);
    }
  
    public int getTargetBufferIndex() {
      return OgreJNI.VertexData_HardwareAnimationData_targetBufferIndex_get(swigCPtr, this);
    }
  
    public void setParametric(float value) {
      OgreJNI.VertexData_HardwareAnimationData_parametric_set(swigCPtr, this, value);
    }
  
    public float getParametric() {
      return OgreJNI.VertexData_HardwareAnimationData_parametric_get(swigCPtr, this);
    }
  
    public HardwareAnimationData() {
      this(OgreJNI.new_VertexData_HardwareAnimationData(), true);
    }
  
  }

  public void setHwAnimationDataList(SWIGTYPE_p_Ogre__vectorT_Ogre__VertexData__HardwareAnimationData_t__type value) {
    OgreJNI.VertexData_hwAnimationDataList_set(swigCPtr, this, SWIGTYPE_p_Ogre__vectorT_Ogre__VertexData__HardwareAnimationData_t__type.getCPtr(value));
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__VertexData__HardwareAnimationData_t__type getHwAnimationDataList() {
    long cPtr = OgreJNI.VertexData_hwAnimationDataList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__vectorT_Ogre__VertexData__HardwareAnimationData_t__type(cPtr, false);
  }

  public void setHwAnimDataItemsUsed(long value) {
    OgreJNI.VertexData_hwAnimDataItemsUsed_set(swigCPtr, this, value);
  }

  public long getHwAnimDataItemsUsed() {
    return OgreJNI.VertexData_hwAnimDataItemsUsed_get(swigCPtr, this);
  }

  public VertexData clone(boolean copyData, HardwareBufferManagerBase mgr) {
    long cPtr = OgreJNI.VertexData_clone__SWIG_0(swigCPtr, this, copyData, HardwareBufferManagerBase.getCPtr(mgr), mgr);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public VertexData clone(boolean copyData) {
    long cPtr = OgreJNI.VertexData_clone__SWIG_1(swigCPtr, this, copyData);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public VertexData clone() {
    long cPtr = OgreJNI.VertexData_clone__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void prepareForShadowVolume() {
    OgreJNI.VertexData_prepareForShadowVolume(swigCPtr, this);
  }

  public void setHardwareShadowVolWBuffer(HardwareVertexBufferPtr value) {
    OgreJNI.VertexData_hardwareShadowVolWBuffer_set(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(value), value);
  }

  public HardwareVertexBufferPtr getHardwareShadowVolWBuffer() {
    long cPtr = OgreJNI.VertexData_hardwareShadowVolWBuffer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HardwareVertexBufferPtr(cPtr, false);
  }

  public void reorganiseBuffers(VertexDeclaration newDeclaration, SWIGTYPE_p_Ogre__vectorT_Ogre__HardwareBuffer__Usage_t__type bufferUsage, HardwareBufferManagerBase mgr) {
    OgreJNI.VertexData_reorganiseBuffers__SWIG_0(swigCPtr, this, VertexDeclaration.getCPtr(newDeclaration), newDeclaration, SWIGTYPE_p_Ogre__vectorT_Ogre__HardwareBuffer__Usage_t__type.getCPtr(bufferUsage), HardwareBufferManagerBase.getCPtr(mgr), mgr);
  }

  public void reorganiseBuffers(VertexDeclaration newDeclaration, SWIGTYPE_p_Ogre__vectorT_Ogre__HardwareBuffer__Usage_t__type bufferUsage) {
    OgreJNI.VertexData_reorganiseBuffers__SWIG_1(swigCPtr, this, VertexDeclaration.getCPtr(newDeclaration), newDeclaration, SWIGTYPE_p_Ogre__vectorT_Ogre__HardwareBuffer__Usage_t__type.getCPtr(bufferUsage));
  }

  public void reorganiseBuffers(VertexDeclaration newDeclaration, HardwareBufferManagerBase mgr) {
    OgreJNI.VertexData_reorganiseBuffers__SWIG_2(swigCPtr, this, VertexDeclaration.getCPtr(newDeclaration), newDeclaration, HardwareBufferManagerBase.getCPtr(mgr), mgr);
  }

  public void reorganiseBuffers(VertexDeclaration newDeclaration) {
    OgreJNI.VertexData_reorganiseBuffers__SWIG_3(swigCPtr, this, VertexDeclaration.getCPtr(newDeclaration), newDeclaration);
  }

  public void closeGapsInBindings() {
    OgreJNI.VertexData_closeGapsInBindings(swigCPtr, this);
  }

  public void removeUnusedBuffers() {
    OgreJNI.VertexData_removeUnusedBuffers(swigCPtr, this);
  }

  public void convertPackedColour(VertexElementType srcType, VertexElementType destType) {
    OgreJNI.VertexData_convertPackedColour(swigCPtr, this, srcType.swigValue(), destType.swigValue());
  }

  public int allocateHardwareAnimationElements(int count, boolean animateNormals) {
    return OgreJNI.VertexData_allocateHardwareAnimationElements(swigCPtr, this, count, animateNormals);
  }

}
