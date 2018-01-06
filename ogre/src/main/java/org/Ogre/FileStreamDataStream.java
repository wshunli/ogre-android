/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class FileStreamDataStream extends DataStream {
  private transient long swigCPtr;

  protected FileStreamDataStream(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.FileStreamDataStream_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileStreamDataStream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_FileStreamDataStream(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FileStreamDataStream(SWIGTYPE_p_std__ifstream s, boolean freeOnClose) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_0(SWIGTYPE_p_std__ifstream.getCPtr(s), freeOnClose), true);
  }

  public FileStreamDataStream(SWIGTYPE_p_std__ifstream s) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_1(SWIGTYPE_p_std__ifstream.getCPtr(s)), true);
  }

  public FileStreamDataStream(SWIGTYPE_p_std__fstream s, boolean freeOnClose) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_2(SWIGTYPE_p_std__fstream.getCPtr(s), freeOnClose), true);
  }

  public FileStreamDataStream(SWIGTYPE_p_std__fstream s) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_3(SWIGTYPE_p_std__fstream.getCPtr(s)), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__ifstream s, boolean freeOnClose) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_4(name, SWIGTYPE_p_std__ifstream.getCPtr(s), freeOnClose), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__ifstream s) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_5(name, SWIGTYPE_p_std__ifstream.getCPtr(s)), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__fstream s, boolean freeOnClose) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_6(name, SWIGTYPE_p_std__fstream.getCPtr(s), freeOnClose), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__fstream s) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_7(name, SWIGTYPE_p_std__fstream.getCPtr(s)), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__ifstream s, long size, boolean freeOnClose) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_8(name, SWIGTYPE_p_std__ifstream.getCPtr(s), size, freeOnClose), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__ifstream s, long size) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_9(name, SWIGTYPE_p_std__ifstream.getCPtr(s), size), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__fstream s, long size, boolean freeOnClose) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_10(name, SWIGTYPE_p_std__fstream.getCPtr(s), size, freeOnClose), true);
  }

  public FileStreamDataStream(String name, SWIGTYPE_p_std__fstream s, long size) {
    this(OgreJNI.new_FileStreamDataStream__SWIG_11(name, SWIGTYPE_p_std__fstream.getCPtr(s), size), true);
  }

  public long read(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.FileStreamDataStream_read(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long write(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.FileStreamDataStream_write(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long readLine(String buf, long maxCount, String delim) {
    return OgreJNI.FileStreamDataStream_readLine__SWIG_0(swigCPtr, this, buf, maxCount, delim);
  }

  public long readLine(String buf, long maxCount) {
    return OgreJNI.FileStreamDataStream_readLine__SWIG_1(swigCPtr, this, buf, maxCount);
  }

  public void skip(int count) {
    OgreJNI.FileStreamDataStream_skip(swigCPtr, this, count);
  }

  public void seek(long pos) {
    OgreJNI.FileStreamDataStream_seek(swigCPtr, this, pos);
  }

  public long tell() {
    return OgreJNI.FileStreamDataStream_tell(swigCPtr, this);
  }

  public boolean eof() {
    return OgreJNI.FileStreamDataStream_eof(swigCPtr, this);
  }

  public void close() {
    OgreJNI.FileStreamDataStream_close(swigCPtr, this);
  }

}