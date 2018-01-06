/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Serializer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Serializer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Serializer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Serializer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Serializer() {
    this(OgreJNI.new_Serializer(), true);
  }

  public final static class Endian {
    public final static Serializer.Endian ENDIAN_NATIVE = new Serializer.Endian("ENDIAN_NATIVE");
    public final static Serializer.Endian ENDIAN_BIG = new Serializer.Endian("ENDIAN_BIG");
    public final static Serializer.Endian ENDIAN_LITTLE = new Serializer.Endian("ENDIAN_LITTLE");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Endian swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Endian.class + " with value " + swigValue);
    }

    private Endian(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Endian(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Endian(String swigName, Endian swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Endian[] swigValues = { ENDIAN_NATIVE, ENDIAN_BIG, ENDIAN_LITTLE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}