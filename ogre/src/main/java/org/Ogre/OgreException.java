/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class OgreException {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OgreException(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OgreException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_OgreException(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OgreException(int number, String description, String source) {
    this(OgreJNI.new_OgreException__SWIG_0(number, description, source), true);
  }

  public OgreException(int number, String description, String source, String type, String file, int line) {
    this(OgreJNI.new_OgreException__SWIG_1(number, description, source, type, file, line), true);
  }

  public OgreException(OgreException rhs) {
    this(OgreJNI.new_OgreException__SWIG_2(OgreException.getCPtr(rhs), rhs), true);
  }

  public String getFullDescription() {
    return OgreJNI.OgreException_getFullDescription(swigCPtr, this);
  }

  public String getSource() {
    return OgreJNI.OgreException_getSource(swigCPtr, this);
  }

  public String getFile() {
    return OgreJNI.OgreException_getFile(swigCPtr, this);
  }

  public int getLine() {
    return OgreJNI.OgreException_getLine(swigCPtr, this);
  }

  public String getDescription() {
    return OgreJNI.OgreException_getDescription(swigCPtr, this);
  }

  public String what() {
    return OgreJNI.OgreException_what(swigCPtr, this);
  }

  public final static class ExceptionCodes {
    public final static OgreException.ExceptionCodes ERR_CANNOT_WRITE_TO_FILE = new OgreException.ExceptionCodes("ERR_CANNOT_WRITE_TO_FILE");
    public final static OgreException.ExceptionCodes ERR_INVALID_STATE = new OgreException.ExceptionCodes("ERR_INVALID_STATE");
    public final static OgreException.ExceptionCodes ERR_INVALIDPARAMS = new OgreException.ExceptionCodes("ERR_INVALIDPARAMS");
    public final static OgreException.ExceptionCodes ERR_RENDERINGAPI_ERROR = new OgreException.ExceptionCodes("ERR_RENDERINGAPI_ERROR");
    public final static OgreException.ExceptionCodes ERR_DUPLICATE_ITEM = new OgreException.ExceptionCodes("ERR_DUPLICATE_ITEM");
    public final static OgreException.ExceptionCodes ERR_ITEM_NOT_FOUND = new OgreException.ExceptionCodes("ERR_ITEM_NOT_FOUND");
    public final static OgreException.ExceptionCodes ERR_FILE_NOT_FOUND = new OgreException.ExceptionCodes("ERR_FILE_NOT_FOUND");
    public final static OgreException.ExceptionCodes ERR_INTERNAL_ERROR = new OgreException.ExceptionCodes("ERR_INTERNAL_ERROR");
    public final static OgreException.ExceptionCodes ERR_RT_ASSERTION_FAILED = new OgreException.ExceptionCodes("ERR_RT_ASSERTION_FAILED");
    public final static OgreException.ExceptionCodes ERR_NOT_IMPLEMENTED = new OgreException.ExceptionCodes("ERR_NOT_IMPLEMENTED");
    public final static OgreException.ExceptionCodes ERR_INVALID_CALL = new OgreException.ExceptionCodes("ERR_INVALID_CALL");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ExceptionCodes swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ExceptionCodes.class + " with value " + swigValue);
    }

    private ExceptionCodes(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ExceptionCodes(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ExceptionCodes(String swigName, ExceptionCodes swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ExceptionCodes[] swigValues = { ERR_CANNOT_WRITE_TO_FILE, ERR_INVALID_STATE, ERR_INVALIDPARAMS, ERR_RENDERINGAPI_ERROR, ERR_DUPLICATE_ITEM, ERR_ITEM_NOT_FOUND, ERR_FILE_NOT_FOUND, ERR_INTERNAL_ERROR, ERR_RT_ASSERTION_FAILED, ERR_NOT_IMPLEMENTED, ERR_INVALID_CALL };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}