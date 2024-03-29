package aufgabe14;

import java.util.Arrays;
import java.util.Objects;

public class ArrayWrapper <T> {


  private T[] arr;
  private int arrSize;
  private int elementCount;

  // CONSTRUCTOR
  public ArrayWrapper(int arrSize) {
    this.arr = (T[]) new Object[arrSize];
    this.arrSize = arrSize;
  }

  // METHODS
  public void addElement(int pos,T e) {
    if (pos <= arrSize) {
      arr[pos] = e;
    } else {
      T[] tempArr = (T[]) new Object[arrSize*2];
      for (int i = 0; i < arr.length; ++i) {
        tempArr[i] = arr[i];
      }
      arr = tempArr;
      arr[pos] = e;
    }
  }

  public int getArraySize() {
    return arr.length;
  }

  public int getElementCount() {
    for (int i = 0; i < arrSize; i++) {
      if (arr[i] != null) {
        elementCount++;
      }
    }
    return elementCount;
  }

  // GETTER & SETTER
  T getArr(int i) {
    return arr[i];
  }

  void setArr(int i, T t) {
    arr[i] = t;
  }

  public void setArrSize(int arrSize) {
    this.arrSize = arrSize;
  }

}