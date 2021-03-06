/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.Ogre;

public class TextureUnitStates extends java.util.AbstractList<TextureUnitState> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TextureUnitStates(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextureUnitStates obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_TextureUnitStates(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TextureUnitStates(TextureUnitState[] initialElements) {
    this();
    for (TextureUnitState element : initialElements) {
      add(element);
    }
  }

  public TextureUnitStates(Iterable<TextureUnitState> initialElements) {
    this();
    for (TextureUnitState element : initialElements) {
      add(element);
    }
  }

  public TextureUnitState get(int index) {
    return doGet(index);
  }

  public TextureUnitState set(int index, TextureUnitState e) {
    return doSet(index, e);
  }

  public boolean add(TextureUnitState e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, TextureUnitState e) {
    modCount++;
    doAdd(index, e);
  }

  public TextureUnitState remove(int index) {
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

  public TextureUnitStates() {
    this(OgreJNI.new_TextureUnitStates__SWIG_0(), true);
  }

  public TextureUnitStates(TextureUnitStates other) {
    this(OgreJNI.new_TextureUnitStates__SWIG_1(TextureUnitStates.getCPtr(other), other), true);
  }

  public long capacity() {
    return OgreJNI.TextureUnitStates_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    OgreJNI.TextureUnitStates_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return OgreJNI.TextureUnitStates_isEmpty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.TextureUnitStates_clear(swigCPtr, this);
  }

  public TextureUnitStates(int count) {
    this(OgreJNI.new_TextureUnitStates__SWIG_2(count), true);
  }

  public TextureUnitStates(int count, TextureUnitState value) {
    this(OgreJNI.new_TextureUnitStates__SWIG_3(count, TextureUnitState.getCPtr(value), value), true);
  }

  private int doSize() {
    return OgreJNI.TextureUnitStates_doSize(swigCPtr, this);
  }

  private void doAdd(TextureUnitState value) {
    OgreJNI.TextureUnitStates_doAdd__SWIG_0(swigCPtr, this, TextureUnitState.getCPtr(value), value);
  }

  private void doAdd(int index, TextureUnitState value) {
    OgreJNI.TextureUnitStates_doAdd__SWIG_1(swigCPtr, this, index, TextureUnitState.getCPtr(value), value);
  }

  private TextureUnitState doRemove(int index) {
    long cPtr = OgreJNI.TextureUnitStates_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new TextureUnitState(cPtr, false);
  }

  private TextureUnitState doGet(int index) {
    long cPtr = OgreJNI.TextureUnitStates_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new TextureUnitState(cPtr, false);
  }

  private TextureUnitState doSet(int index, TextureUnitState value) {
    long cPtr = OgreJNI.TextureUnitStates_doSet(swigCPtr, this, index, TextureUnitState.getCPtr(value), value);
    return (cPtr == 0) ? null : new TextureUnitState(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    OgreJNI.TextureUnitStates_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
