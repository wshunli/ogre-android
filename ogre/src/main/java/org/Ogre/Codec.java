/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Codec {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Codec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Codec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Codec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class CodecData {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected CodecData(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(CodecData obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_Codec_CodecData(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public String dataType() {
      return OgreJNI.Codec_CodecData_dataType(swigCPtr, this);
    }
  
    public CodecData() {
      this(OgreJNI.new_Codec_CodecData(), true);
    }
  
  }

  public static void registerCodec(Codec pCodec) {
    OgreJNI.Codec_registerCodec(Codec.getCPtr(pCodec), pCodec);
  }

  public static boolean isCodecRegistered(String codecType) {
    return OgreJNI.Codec_isCodecRegistered(codecType);
  }

  public static void unregisterCodec(Codec pCodec) {
    OgreJNI.Codec_unregisterCodec(Codec.getCPtr(pCodec), pCodec);
  }

  public static SWIGTYPE_p_Ogre__ConstMapIteratorT_Ogre__mapT_std__string_Ogre__Codec_p_std__lessT_std__string_t_t__type_t getCodecIterator() {
    return new SWIGTYPE_p_Ogre__ConstMapIteratorT_Ogre__mapT_std__string_Ogre__Codec_p_std__lessT_std__string_t_t__type_t(OgreJNI.Codec_getCodecIterator(), true);
  }

  public static StringVector getExtensions() {
    return new StringVector(OgreJNI.Codec_getExtensions(), true);
  }

  public static Codec getCodec(String extension) {
    long cPtr = OgreJNI.Codec_getCodec__SWIG_0(extension);
    return (cPtr == 0) ? null : new Codec(cPtr, false);
  }

  public static Codec getCodec(String magicNumberPtr, long maxbytes) {
    long cPtr = OgreJNI.Codec_getCodec__SWIG_1(magicNumberPtr, maxbytes);
    return (cPtr == 0) ? null : new Codec(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t encode(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__MemoryDataStream_t input, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Codec__CodecData_t pData) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t(OgreJNI.Codec_encode(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__MemoryDataStream_t.getCPtr(input), SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Codec__CodecData_t.getCPtr(pData)), true);
  }

  public void encodeToFile(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__MemoryDataStream_t input, String outFileName, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Codec__CodecData_t pData) {
    OgreJNI.Codec_encodeToFile(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__MemoryDataStream_t.getCPtr(input), outFileName, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__Codec__CodecData_t.getCPtr(pData));
  }

  public SWIGTYPE_p_std__pairT_Ogre__SharedPtrT_Ogre__MemoryDataStream_t_Ogre__SharedPtrT_Ogre__Codec__CodecData_t_t decode(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t input) {
    return new SWIGTYPE_p_std__pairT_Ogre__SharedPtrT_Ogre__MemoryDataStream_t_Ogre__SharedPtrT_Ogre__Codec__CodecData_t_t(OgreJNI.Codec_decode(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__DataStream_t.getCPtr(input)), true);
  }

  public String getDataType() {
    return OgreJNI.Codec_getDataType(swigCPtr, this);
  }

  public boolean magicNumberMatch(String magicNumberPtr, long maxbytes) {
    return OgreJNI.Codec_magicNumberMatch(swigCPtr, this, magicNumberPtr, maxbytes);
  }

  public String magicNumberToFileExt(String magicNumberPtr, long maxbytes) {
    return OgreJNI.Codec_magicNumberToFileExt(swigCPtr, this, magicNumberPtr, maxbytes);
  }

}