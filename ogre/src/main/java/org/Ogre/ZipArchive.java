/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class ZipArchive extends Archive {
  private transient long swigCPtr;

  protected ZipArchive(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.ZipArchive_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZipArchive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ZipArchive(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZipArchive(String name, String archType, SWIGTYPE_p__zzip_plugin_io pluginIo) {
    this(OgreJNI.new_ZipArchive__SWIG_0(name, archType, SWIGTYPE_p__zzip_plugin_io.getCPtr(pluginIo)), true);
  }

  public ZipArchive(String name, String archType) {
    this(OgreJNI.new_ZipArchive__SWIG_1(name, archType), true);
  }

  public boolean isCaseSensitive() {
    return OgreJNI.ZipArchive_isCaseSensitive(swigCPtr, this);
  }

  public void load() {
    OgreJNI.ZipArchive_load(swigCPtr, this);
  }

  public void unload() {
    OgreJNI.ZipArchive_unload(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t open(String filename, boolean readOnly) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.ZipArchive_open__SWIG_0(swigCPtr, this, filename, readOnly), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t open(String filename) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.ZipArchive_open__SWIG_1(swigCPtr, this, filename), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t create(String filename) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.ZipArchive_create(swigCPtr, this, filename), true);
  }

  public void remove(String filename) {
    OgreJNI.ZipArchive_remove(swigCPtr, this, filename);
  }

  public StringVectorPtr list(boolean recursive, boolean dirs) {
    return new StringVectorPtr(OgreJNI.ZipArchive_list__SWIG_0(swigCPtr, this, recursive, dirs), true);
  }

  public StringVectorPtr list(boolean recursive) {
    return new StringVectorPtr(OgreJNI.ZipArchive_list__SWIG_1(swigCPtr, this, recursive), true);
  }

  public StringVectorPtr list() {
    return new StringVectorPtr(OgreJNI.ZipArchive_list__SWIG_2(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t listFileInfo(boolean recursive, boolean dirs) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t(OgreJNI.ZipArchive_listFileInfo__SWIG_0(swigCPtr, this, recursive, dirs), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t listFileInfo(boolean recursive) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t(OgreJNI.ZipArchive_listFileInfo__SWIG_1(swigCPtr, this, recursive), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t listFileInfo() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t(OgreJNI.ZipArchive_listFileInfo__SWIG_2(swigCPtr, this), true);
  }

  public StringVectorPtr find(String pattern, boolean recursive, boolean dirs) {
    return new StringVectorPtr(OgreJNI.ZipArchive_find__SWIG_0(swigCPtr, this, pattern, recursive, dirs), true);
  }

  public StringVectorPtr find(String pattern, boolean recursive) {
    return new StringVectorPtr(OgreJNI.ZipArchive_find__SWIG_1(swigCPtr, this, pattern, recursive), true);
  }

  public StringVectorPtr find(String pattern) {
    return new StringVectorPtr(OgreJNI.ZipArchive_find__SWIG_2(swigCPtr, this, pattern), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t findFileInfo(String pattern, boolean recursive, boolean dirs) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t(OgreJNI.ZipArchive_findFileInfo__SWIG_0(swigCPtr, this, pattern, recursive, dirs), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t findFileInfo(String pattern, boolean recursive) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t(OgreJNI.ZipArchive_findFileInfo__SWIG_1(swigCPtr, this, pattern, recursive), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t findFileInfo(String pattern) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__vectorT_Ogre__FileInfo_t__type_t(OgreJNI.ZipArchive_findFileInfo__SWIG_2(swigCPtr, this, pattern), true);
  }

  public boolean exists(String filename) {
    return OgreJNI.ZipArchive_exists(swigCPtr, this, filename);
  }

  public SWIGTYPE_p_time_t getModifiedTime(String filename) {
    return new SWIGTYPE_p_time_t(OgreJNI.ZipArchive_getModifiedTime(swigCPtr, this, filename), true);
  }

}
