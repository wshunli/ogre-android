/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public final class SceneType {
  public final static SceneType ST_GENERIC = new SceneType("ST_GENERIC", OgreJNI.ST_GENERIC_get());
  public final static SceneType ST_EXTERIOR_CLOSE = new SceneType("ST_EXTERIOR_CLOSE", OgreJNI.ST_EXTERIOR_CLOSE_get());
  public final static SceneType ST_EXTERIOR_FAR = new SceneType("ST_EXTERIOR_FAR", OgreJNI.ST_EXTERIOR_FAR_get());
  public final static SceneType ST_EXTERIOR_REAL_FAR = new SceneType("ST_EXTERIOR_REAL_FAR", OgreJNI.ST_EXTERIOR_REAL_FAR_get());
  public final static SceneType ST_INTERIOR = new SceneType("ST_INTERIOR", OgreJNI.ST_INTERIOR_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SceneType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SceneType.class + " with value " + swigValue);
  }

  private SceneType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SceneType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SceneType(String swigName, SceneType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SceneType[] swigValues = { ST_GENERIC, ST_EXTERIOR_CLOSE, ST_EXTERIOR_FAR, ST_EXTERIOR_REAL_FAR, ST_INTERIOR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

