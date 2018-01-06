/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class OverlaySystem extends RenderQueueListener {
  private transient long swigCPtr;

  protected OverlaySystem(long cPtr, boolean cMemoryOwn) {
    super(OgreOverlayJNI.OverlaySystem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OverlaySystem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreOverlayJNI.delete_OverlaySystem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void renderQueueStarted(short queueGroupId, String invocation, SWIGTYPE_p_bool skipThisInvocation) {
    OgreOverlayJNI.OverlaySystem_renderQueueStarted(swigCPtr, this, queueGroupId, invocation, SWIGTYPE_p_bool.getCPtr(skipThisInvocation));
  }

  public void eventOccurred(String eventName, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t parameters) {
    OgreOverlayJNI.OverlaySystem_eventOccurred(swigCPtr, this, eventName, SWIGTYPE_p_std__mapT_std__string_std__string_std__lessT_std__string_t_t.getCPtr(parameters));
  }

}
