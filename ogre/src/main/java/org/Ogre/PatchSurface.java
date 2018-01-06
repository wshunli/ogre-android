/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class PatchSurface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PatchSurface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PatchSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_PatchSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PatchSurface() {
    this(OgreJNI.new_PatchSurface(), true);
  }

  public void defineSurface(SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, PatchSurface.PatchSurfaceType pType, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel, PatchSurface.VisibleSide visibleSide) {
    OgreJNI.PatchSurface_defineSurface__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, pType.swigValue(), uMaxSubdivisionLevel, vMaxSubdivisionLevel, visibleSide.swigValue());
  }

  public void defineSurface(SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, PatchSurface.PatchSurfaceType pType, long uMaxSubdivisionLevel, long vMaxSubdivisionLevel) {
    OgreJNI.PatchSurface_defineSurface__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, pType.swigValue(), uMaxSubdivisionLevel, vMaxSubdivisionLevel);
  }

  public void defineSurface(SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, PatchSurface.PatchSurfaceType pType, long uMaxSubdivisionLevel) {
    OgreJNI.PatchSurface_defineSurface__SWIG_2(swigCPtr, this, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, pType.swigValue(), uMaxSubdivisionLevel);
  }

  public void defineSurface(SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height, PatchSurface.PatchSurfaceType pType) {
    OgreJNI.PatchSurface_defineSurface__SWIG_3(swigCPtr, this, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height, pType.swigValue());
  }

  public void defineSurface(SWIGTYPE_p_void controlPointBuffer, VertexDeclaration declaration, long width, long height) {
    OgreJNI.PatchSurface_defineSurface__SWIG_4(swigCPtr, this, SWIGTYPE_p_void.getCPtr(controlPointBuffer), VertexDeclaration.getCPtr(declaration), declaration, width, height);
  }

  public long getRequiredVertexCount() {
    return OgreJNI.PatchSurface_getRequiredVertexCount(swigCPtr, this);
  }

  public long getRequiredIndexCount() {
    return OgreJNI.PatchSurface_getRequiredIndexCount(swigCPtr, this);
  }

  public long getCurrentIndexCount() {
    return OgreJNI.PatchSurface_getCurrentIndexCount(swigCPtr, this);
  }

  public long getIndexOffset() {
    return OgreJNI.PatchSurface_getIndexOffset(swigCPtr, this);
  }

  public long getVertexOffset() {
    return OgreJNI.PatchSurface_getVertexOffset(swigCPtr, this);
  }

  public AxisAlignedBox getBounds() {
    return new AxisAlignedBox(OgreJNI.PatchSurface_getBounds(swigCPtr, this), false);
  }

  public float getBoundingSphereRadius() {
    return OgreJNI.PatchSurface_getBoundingSphereRadius(swigCPtr, this);
  }

  public void build(HardwareVertexBufferPtr destVertexBuffer, long vertexStart, HardwareIndexBufferPtr destIndexBuffer, long indexStart) {
    OgreJNI.PatchSurface_build(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(destVertexBuffer), destVertexBuffer, vertexStart, HardwareIndexBufferPtr.getCPtr(destIndexBuffer), destIndexBuffer, indexStart);
  }

  public void setSubdivisionFactor(float factor) {
    OgreJNI.PatchSurface_setSubdivisionFactor(swigCPtr, this, factor);
  }

  public float getSubdivisionFactor() {
    return OgreJNI.PatchSurface_getSubdivisionFactor(swigCPtr, this);
  }

  public SWIGTYPE_p_void getControlPointBuffer() {
    long cPtr = OgreJNI.PatchSurface_getControlPointBuffer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void notifyControlPointBufferDeallocated() {
    OgreJNI.PatchSurface_notifyControlPointBufferDeallocated(swigCPtr, this);
  }

  public final static class PatchSurfaceType {
    public final static PatchSurface.PatchSurfaceType PST_BEZIER = new PatchSurface.PatchSurfaceType("PST_BEZIER");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PatchSurfaceType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PatchSurfaceType.class + " with value " + swigValue);
    }

    private PatchSurfaceType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PatchSurfaceType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PatchSurfaceType(String swigName, PatchSurfaceType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PatchSurfaceType[] swigValues = { PST_BEZIER };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int AUTO_LEVEL = OgreJNI.PatchSurface_AUTO_LEVEL_get();

  public final static class VisibleSide {
    public final static PatchSurface.VisibleSide VS_FRONT = new PatchSurface.VisibleSide("VS_FRONT");
    public final static PatchSurface.VisibleSide VS_BACK = new PatchSurface.VisibleSide("VS_BACK");
    public final static PatchSurface.VisibleSide VS_BOTH = new PatchSurface.VisibleSide("VS_BOTH");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static VisibleSide swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + VisibleSide.class + " with value " + swigValue);
    }

    private VisibleSide(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private VisibleSide(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private VisibleSide(String swigName, VisibleSide swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static VisibleSide[] swigValues = { VS_FRONT, VS_BACK, VS_BOTH };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}