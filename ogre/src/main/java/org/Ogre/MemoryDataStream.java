/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class MemoryDataStream extends DataStream {
  private transient long swigCPtr;

  protected MemoryDataStream(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.MemoryDataStream_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MemoryDataStream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MemoryDataStream(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MemoryDataStream(SWIGTYPE_p_void pMem, long size, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_0(SWIGTYPE_p_void.getCPtr(pMem), size, freeOnClose, readOnly), true);
  }

  public MemoryDataStream(SWIGTYPE_p_void pMem, long size, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_1(SWIGTYPE_p_void.getCPtr(pMem), size, freeOnClose), true);
  }

  public MemoryDataStream(SWIGTYPE_p_void pMem, long size) {
    this(OgreJNI.new_MemoryDataStream__SWIG_2(SWIGTYPE_p_void.getCPtr(pMem), size), true);
  }

  public MemoryDataStream(String name, SWIGTYPE_p_void pMem, long size, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_3(name, SWIGTYPE_p_void.getCPtr(pMem), size, freeOnClose, readOnly), true);
  }

  public MemoryDataStream(String name, SWIGTYPE_p_void pMem, long size, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_4(name, SWIGTYPE_p_void.getCPtr(pMem), size, freeOnClose), true);
  }

  public MemoryDataStream(String name, SWIGTYPE_p_void pMem, long size) {
    this(OgreJNI.new_MemoryDataStream__SWIG_5(name, SWIGTYPE_p_void.getCPtr(pMem), size), true);
  }

  public MemoryDataStream(DataStream sourceStream, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_6(DataStream.getCPtr(sourceStream), sourceStream, freeOnClose, readOnly), true);
  }

  public MemoryDataStream(DataStream sourceStream, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_7(DataStream.getCPtr(sourceStream), sourceStream, freeOnClose), true);
  }

  public MemoryDataStream(DataStream sourceStream) {
    this(OgreJNI.new_MemoryDataStream__SWIG_8(DataStream.getCPtr(sourceStream), sourceStream), true);
  }

  public MemoryDataStream(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t sourceStream, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_9(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(sourceStream), freeOnClose, readOnly), true);
  }

  public MemoryDataStream(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t sourceStream, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_10(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(sourceStream), freeOnClose), true);
  }

  public MemoryDataStream(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t sourceStream) {
    this(OgreJNI.new_MemoryDataStream__SWIG_11(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(sourceStream)), true);
  }

  public MemoryDataStream(String name, DataStream sourceStream, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_12(name, DataStream.getCPtr(sourceStream), sourceStream, freeOnClose, readOnly), true);
  }

  public MemoryDataStream(String name, DataStream sourceStream, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_13(name, DataStream.getCPtr(sourceStream), sourceStream, freeOnClose), true);
  }

  public MemoryDataStream(String name, DataStream sourceStream) {
    this(OgreJNI.new_MemoryDataStream__SWIG_14(name, DataStream.getCPtr(sourceStream), sourceStream), true);
  }

  public MemoryDataStream(String name, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t sourceStream, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_15(name, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(sourceStream), freeOnClose, readOnly), true);
  }

  public MemoryDataStream(String name, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t sourceStream, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_16(name, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(sourceStream), freeOnClose), true);
  }

  public MemoryDataStream(String name, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t sourceStream) {
    this(OgreJNI.new_MemoryDataStream__SWIG_17(name, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(sourceStream)), true);
  }

  public MemoryDataStream(long size, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_18(size, freeOnClose, readOnly), true);
  }

  public MemoryDataStream(long size) {
    this(OgreJNI.new_MemoryDataStream__SWIG_19(size), true);
  }

  public MemoryDataStream(String name, long size, boolean freeOnClose, boolean readOnly) {
    this(OgreJNI.new_MemoryDataStream__SWIG_20(name, size, freeOnClose, readOnly), true);
  }

  public MemoryDataStream(String name, long size, boolean freeOnClose) {
    this(OgreJNI.new_MemoryDataStream__SWIG_21(name, size, freeOnClose), true);
  }

  public MemoryDataStream(String name, long size) {
    this(OgreJNI.new_MemoryDataStream__SWIG_22(name, size), true);
  }

  public SWIGTYPE_p_unsigned_char getPtr() {
    long cPtr = OgreJNI.MemoryDataStream_getPtr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public SWIGTYPE_p_unsigned_char getCurrentPtr() {
    long cPtr = OgreJNI.MemoryDataStream_getCurrentPtr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public long read(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.MemoryDataStream_read(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long write(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.MemoryDataStream_write(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long readLine(String buf, long maxCount, String delim) {
    return OgreJNI.MemoryDataStream_readLine__SWIG_0(swigCPtr, this, buf, maxCount, delim);
  }

  public long readLine(String buf, long maxCount) {
    return OgreJNI.MemoryDataStream_readLine__SWIG_1(swigCPtr, this, buf, maxCount);
  }

  public long skipLine(String delim) {
    return OgreJNI.MemoryDataStream_skipLine__SWIG_0(swigCPtr, this, delim);
  }

  public long skipLine() {
    return OgreJNI.MemoryDataStream_skipLine__SWIG_1(swigCPtr, this);
  }

  public void skip(int count) {
    OgreJNI.MemoryDataStream_skip(swigCPtr, this, count);
  }

  public void seek(long pos) {
    OgreJNI.MemoryDataStream_seek(swigCPtr, this, pos);
  }

  public long tell() {
    return OgreJNI.MemoryDataStream_tell(swigCPtr, this);
  }

  public boolean eof() {
    return OgreJNI.MemoryDataStream_eof(swigCPtr, this);
  }

  public void close() {
    OgreJNI.MemoryDataStream_close(swigCPtr, this);
  }

  public void setFreeOnClose(boolean free) {
    OgreJNI.MemoryDataStream_setFreeOnClose(swigCPtr, this, free);
  }

}
