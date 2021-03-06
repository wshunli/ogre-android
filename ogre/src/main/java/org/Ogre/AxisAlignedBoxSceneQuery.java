/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class AxisAlignedBoxSceneQuery extends RegionSceneQuery {
  private transient long swigCPtr;

  protected AxisAlignedBoxSceneQuery(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.AxisAlignedBoxSceneQuery_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AxisAlignedBoxSceneQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_AxisAlignedBoxSceneQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setBox(AxisAlignedBox box) {
    OgreJNI.AxisAlignedBoxSceneQuery_setBox(swigCPtr, this, AxisAlignedBox.getCPtr(box), box);
  }

  public AxisAlignedBox getBox() {
    return new AxisAlignedBox(OgreJNI.AxisAlignedBoxSceneQuery_getBox(swigCPtr, this), false);
  }

}
