package aufgabe14;

public class ArrayWrapper<T> {


  private Object[] arr;
  private int arrSize;
  private int elementCount;

  // CONSTRUCTOR
  public ArrayWrapper(int arrSize) {
    this.arr = new Object [arrSize];
    this.arrSize = arrSize;
  }

  // METHODS
  public void addElement(int pos,Object e) {
    if (pos <= arrSize) {
      this.arr[pos] = e;
    } else {
      Object[] tempArr = new Object[arrSize*2];
      for (int i = 0; i < arr.length; ++i) {
        tempArr[i] = arr[i];
      }
      arr = tempArr;
      this.arr[pos] = e;
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
    @SuppressWarnings("unchecked")
    final T t = (T)arr[i];
    return t;
  }

  void setArr(int i, T t) {
    arr[i] = t;
  }

  public void setArrSize(int arrSize) {
    this.arrSize = arrSize;
  }
}