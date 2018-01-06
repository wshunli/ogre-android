/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ImportAbstractNode extends AbstractNode {
  private transient long swigCPtr;

  protected ImportAbstractNode(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.ImportAbstractNode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImportAbstractNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ImportAbstractNode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setTarget(String value) {
    OgreJNI.ImportAbstractNode_target_set(swigCPtr, this, value);
  }

  public String getTarget() {
    return OgreJNI.ImportAbstractNode_target_get(swigCPtr, this);
  }

  public void setSource(String value) {
    OgreJNI.ImportAbstractNode_source_set(swigCPtr, this, value);
  }

  public String getSource() {
    return OgreJNI.ImportAbstractNode_source_get(swigCPtr, this);
  }

  public ImportAbstractNode() {
    this(OgreJNI.new_ImportAbstractNode(), true);
  }

  public AbstractNode clone() {
    long cPtr = OgreJNI.ImportAbstractNode_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractNode(cPtr, false);
  }

  public String getValue() {
    return OgreJNI.ImportAbstractNode_getValue(swigCPtr, this);
  }

}
