/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class VertexPoseKeyFrame extends KeyFrame {
  private transient long swigCPtr;

  protected VertexPoseKeyFrame(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.VertexPoseKeyFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VertexPoseKeyFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_VertexPoseKeyFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VertexPoseKeyFrame(AnimationTrack parent, float time) {
    this(OgreJNI.new_VertexPoseKeyFrame(AnimationTrack.getCPtr(parent), parent, time), true);
  }

  static public class PoseRef {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PoseRef(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PoseRef obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_VertexPoseKeyFrame_PoseRef(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setPoseIndex(int value) {
      OgreJNI.VertexPoseKeyFrame_PoseRef_poseIndex_set(swigCPtr, this, value);
    }
  
    public int getPoseIndex() {
      return OgreJNI.VertexPoseKeyFrame_PoseRef_poseIndex_get(swigCPtr, this);
    }
  
    public void setInfluence(float value) {
      OgreJNI.VertexPoseKeyFrame_PoseRef_influence_set(swigCPtr, this, value);
    }
  
    public float getInfluence() {
      return OgreJNI.VertexPoseKeyFrame_PoseRef_influence_get(swigCPtr, this);
    }
  
    public PoseRef(int p, float i) {
      this(OgreJNI.new_VertexPoseKeyFrame_PoseRef(p, i), true);
    }
  
  }

  public void addPoseReference(int poseIndex, float influence) {
    OgreJNI.VertexPoseKeyFrame_addPoseReference(swigCPtr, this, poseIndex, influence);
  }

  public void updatePoseReference(int poseIndex, float influence) {
    OgreJNI.VertexPoseKeyFrame_updatePoseReference(swigCPtr, this, poseIndex, influence);
  }

  public void removePoseReference(int poseIndex) {
    OgreJNI.VertexPoseKeyFrame_removePoseReference(swigCPtr, this, poseIndex);
  }

  public void removeAllPoseReferences() {
    OgreJNI.VertexPoseKeyFrame_removeAllPoseReferences(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__VertexPoseKeyFrame__PoseRef_t__type getPoseReferences() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__VertexPoseKeyFrame__PoseRef_t__type(OgreJNI.VertexPoseKeyFrame_getPoseReferences(swigCPtr, this), false);
  }

  public KeyFrame _clone(AnimationTrack newParent) {
    long cPtr = OgreJNI.VertexPoseKeyFrame__clone(swigCPtr, this, AnimationTrack.getCPtr(newParent), newParent);
    return (cPtr == 0) ? null : new KeyFrame(cPtr, false);
  }

  public void _applyBaseKeyFrame(VertexPoseKeyFrame base) {
    OgreJNI.VertexPoseKeyFrame__applyBaseKeyFrame(swigCPtr, this, VertexPoseKeyFrame.getCPtr(base), base);
  }

}
