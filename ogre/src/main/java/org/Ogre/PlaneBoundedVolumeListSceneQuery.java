/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class PlaneBoundedVolumeListSceneQuery extends RegionSceneQuery {
  private transient long swigCPtr;

  protected PlaneBoundedVolumeListSceneQuery(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.PlaneBoundedVolumeListSceneQuery_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PlaneBoundedVolumeListSceneQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_PlaneBoundedVolumeListSceneQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setVolumes(SWIGTYPE_p_Ogre__vectorT_Ogre__PlaneBoundedVolume_t__type volumes) {
    OgreJNI.PlaneBoundedVolumeListSceneQuery_setVolumes(swigCPtr, this, SWIGTYPE_p_Ogre__vectorT_Ogre__PlaneBoundedVolume_t__type.getCPtr(volumes));
  }

  public SWIGTYPE_p_Ogre__vectorT_Ogre__PlaneBoundedVolume_t__type getVolumes() {
    return new SWIGTYPE_p_Ogre__vectorT_Ogre__PlaneBoundedVolume_t__type(OgreJNI.PlaneBoundedVolumeListSceneQuery_getVolumes(swigCPtr, this), false);
  }

}
