/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class UnimplementedException extends OgreException {
  private transient long swigCPtr;

  protected UnimplementedException(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.UnimplementedException_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UnimplementedException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_UnimplementedException(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UnimplementedException(int inNumber, String inDescription, String inSource, String inFile, int inLine) {
    this(OgreJNI.new_UnimplementedException(inNumber, inDescription, inSource, inFile, inLine), true);
  }

}