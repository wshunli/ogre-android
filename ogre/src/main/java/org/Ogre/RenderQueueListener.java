/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class RenderQueueListener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RenderQueueListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RenderQueueListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RenderQueueListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void preRenderQueues() {
    OgreJNI.RenderQueueListener_preRenderQueues(swigCPtr, this);
  }

  public void postRenderQueues() {
    OgreJNI.RenderQueueListener_postRenderQueues(swigCPtr, this);
  }

  public void renderQueueStarted(short queueGroupId, String invocation, SWIGTYPE_p_bool skipThisInvocation) {
    OgreJNI.RenderQueueListener_renderQueueStarted(swigCPtr, this, queueGroupId, invocation, SWIGTYPE_p_bool.getCPtr(skipThisInvocation));
  }

  public void renderQueueEnded(short queueGroupId, String invocation, SWIGTYPE_p_bool repeatThisInvocation) {
    OgreJNI.RenderQueueListener_renderQueueEnded(swigCPtr, this, queueGroupId, invocation, SWIGTYPE_p_bool.getCPtr(repeatThisInvocation));
  }

  public RenderQueueListener() {
    this(OgreJNI.new_RenderQueueListener(), true);
  }

}
