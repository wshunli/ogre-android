/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class Techniques extends java.util.AbstractList<Technique> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Techniques(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Techniques obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Techniques(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Techniques(Technique[] initialElements) {
    this();
    for (Technique element : initialElements) {
      add(element);
    }
  }

  public Techniques(Iterable<Technique> initialElements) {
    this();
    for (Technique element : initialElements) {
      add(element);
    }
  }

  public Technique get(int index) {
    return doGet(index);
  }

  public Technique set(int index, Technique e) {
    return doSet(index, e);
  }

  public boolean add(Technique e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Technique e) {
    modCount++;
    doAdd(index, e);
  }

  public Technique remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public Techniques() {
    this(OgreJNI.new_Techniques__SWIG_0(), true);
  }

  public Techniques(Techniques other) {
    this(OgreJNI.new_Techniques__SWIG_1(Techniques.getCPtr(other), other), true);
  }

  public long capacity() {
    return OgreJNI.Techniques_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    OgreJNI.Techniques_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return OgreJNI.Techniques_isEmpty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.Techniques_clear(swigCPtr, this);
  }

  public Techniques(int count) {
    this(OgreJNI.new_Techniques__SWIG_2(count), true);
  }

  public Techniques(int count, Technique value) {
    this(OgreJNI.new_Techniques__SWIG_3(count, Technique.getCPtr(value), value), true);
  }

  private int doSize() {
    return OgreJNI.Techniques_doSize(swigCPtr, this);
  }

  private void doAdd(Technique value) {
    OgreJNI.Techniques_doAdd__SWIG_0(swigCPtr, this, Technique.getCPtr(value), value);
  }

  private void doAdd(int index, Technique value) {
    OgreJNI.Techniques_doAdd__SWIG_1(swigCPtr, this, index, Technique.getCPtr(value), value);
  }

  private Technique doRemove(int index) {
    long cPtr = OgreJNI.Techniques_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  private Technique doGet(int index) {
    long cPtr = OgreJNI.Techniques_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  private Technique doSet(int index, Technique value) {
    long cPtr = OgreJNI.Techniques_doSet(swigCPtr, this, index, Technique.getCPtr(value), value);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    OgreJNI.Techniques_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
