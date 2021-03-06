/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class EmbeddedZipArchiveFactory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EmbeddedZipArchiveFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EmbeddedZipArchiveFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_EmbeddedZipArchiveFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EmbeddedZipArchiveFactory() {
    this(OgreJNI.new_EmbeddedZipArchiveFactory(), true);
  }

  public Archive createInstance(String name, boolean readOnly) {
    long cPtr = OgreJNI.EmbeddedZipArchiveFactory_createInstance(swigCPtr, this, name, readOnly);
    return (cPtr == 0) ? null : new Archive(cPtr, false);
  }

  public static void addEmbbeddedFile(String name, SWIGTYPE_p_unsigned_char fileData, long fileSize, SWIGTYPE_p_f_size_t_p_void_size_t__bool decryptFunc) {
    OgreJNI.EmbeddedZipArchiveFactory_addEmbbeddedFile(name, SWIGTYPE_p_unsigned_char.getCPtr(fileData), fileSize, SWIGTYPE_p_f_size_t_p_void_size_t__bool.getCPtr(decryptFunc));
  }

  public static void removeEmbbeddedFile(String name) {
    OgreJNI.EmbeddedZipArchiveFactory_removeEmbbeddedFile(name);
  }

}
