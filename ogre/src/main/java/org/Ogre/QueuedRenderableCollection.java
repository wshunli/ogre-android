/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class QueuedRenderableCollection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected QueuedRenderableCollection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QueuedRenderableCollection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_QueuedRenderableCollection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public QueuedRenderableCollection() {
    this(OgreJNI.new_QueuedRenderableCollection(), true);
  }

  public void clear() {
    OgreJNI.QueuedRenderableCollection_clear(swigCPtr, this);
  }

  public void removePassGroup(Pass p) {
    OgreJNI.QueuedRenderableCollection_removePassGroup(swigCPtr, this, Pass.getCPtr(p), p);
  }

  public void resetOrganisationModes() {
    OgreJNI.QueuedRenderableCollection_resetOrganisationModes(swigCPtr, this);
  }

  public void addOrganisationMode(QueuedRenderableCollection.OrganisationMode om) {
    OgreJNI.QueuedRenderableCollection_addOrganisationMode(swigCPtr, this, om.swigValue());
  }

  public void addRenderable(Pass pass, Renderable rend) {
    OgreJNI.QueuedRenderableCollection_addRenderable(swigCPtr, this, Pass.getCPtr(pass), pass, Renderable.getCPtr(rend), rend);
  }

  public void sort(Camera cam) {
    OgreJNI.QueuedRenderableCollection_sort(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public void acceptVisitor(QueuedRenderableVisitor visitor, QueuedRenderableCollection.OrganisationMode om) {
    OgreJNI.QueuedRenderableCollection_acceptVisitor(swigCPtr, this, QueuedRenderableVisitor.getCPtr(visitor), visitor, om.swigValue());
  }

  public void merge(QueuedRenderableCollection rhs) {
    OgreJNI.QueuedRenderableCollection_merge(swigCPtr, this, QueuedRenderableCollection.getCPtr(rhs), rhs);
  }

  public final static class OrganisationMode {
    public final static QueuedRenderableCollection.OrganisationMode OM_PASS_GROUP = new QueuedRenderableCollection.OrganisationMode("OM_PASS_GROUP", OgreJNI.QueuedRenderableCollection_OM_PASS_GROUP_get());
    public final static QueuedRenderableCollection.OrganisationMode OM_SORT_DESCENDING = new QueuedRenderableCollection.OrganisationMode("OM_SORT_DESCENDING", OgreJNI.QueuedRenderableCollection_OM_SORT_DESCENDING_get());
    public final static QueuedRenderableCollection.OrganisationMode OM_SORT_ASCENDING = new QueuedRenderableCollection.OrganisationMode("OM_SORT_ASCENDING", OgreJNI.QueuedRenderableCollection_OM_SORT_ASCENDING_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static OrganisationMode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + OrganisationMode.class + " with value " + swigValue);
    }

    private OrganisationMode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private OrganisationMode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private OrganisationMode(String swigName, OrganisationMode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static OrganisationMode[] swigValues = { OM_PASS_GROUP, OM_SORT_DESCENDING, OM_SORT_ASCENDING };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
