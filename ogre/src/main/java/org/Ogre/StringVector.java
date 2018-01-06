/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class StringVector extends java.util.AbstractList<String> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_StringVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringVector(String[] initialElements) {
    this();
    for (String element : initialElements) {
      add(element);
    }
  }

  public StringVector(Iterable<String> initialElements) {
    this();
    for (String element : initialElements) {
      add(element);
    }
  }

  public String get(int index) {
    return doGet(index);
  }

  public String set(int index, String e) {
    return doSet(index, e);
  }

  public boolean add(String e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, String e) {
    modCount++;
    doAdd(index, e);
  }

  public String remove(int index) {
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

  public StringVector() {
    this(OgreJNI.new_StringVector__SWIG_0(), true);
  }

  public StringVector(StringVector other) {
    this(OgreJNI.new_StringVector__SWIG_1(StringVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return OgreJNI.StringVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    OgreJNI.StringVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return OgreJNI.StringVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.StringVector_clear(swigCPtr, this);
  }

  public StringVector(int count) {
    this(OgreJNI.new_StringVector__SWIG_2(count), true);
  }

  public StringVector(int count, String value) {
    this(OgreJNI.new_StringVector__SWIG_3(count, value), true);
  }

  private int doSize() {
    return OgreJNI.StringVector_doSize(swigCPtr, this);
  }

  private void doAdd(String value) {
    OgreJNI.StringVector_doAdd__SWIG_0(swigCPtr, this, value);
  }

  private void doAdd(int index, String value) {
    OgreJNI.StringVector_doAdd__SWIG_1(swigCPtr, this, index, value);
  }

  private String doRemove(int index) {
    return OgreJNI.StringVector_doRemove(swigCPtr, this, index);
  }

  private String doGet(int index) {
    return OgreJNI.StringVector_doGet(swigCPtr, this, index);
  }

  private String doSet(int index, String value) {
    return OgreJNI.StringVector_doSet(swigCPtr, this, index, value);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    OgreJNI.StringVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}