package aufgabe14;

public class ArrayWrapper {


  private int[] arr;
  private int arrSize;
  private int elementCount;

  // CONSTRUCTOR
  public ArrayWrapper(int arrSize) {
    this.arrSize = arrSize;

    this.arr = new int[arrSize];
  }

  // METHODS
  public void addElement(int pos,int e) {
    if (pos <= arrSize) {
      this.arr[pos] = e;
    } else {
      int[] tempArr = new int[arrSize*2];
      for (int i = 0; i < arr.length; ++i) {
        tempArr[i] = arr[i];
      }
      arr = tempArr;
      this.arr[pos] = e;
    }

  }

  public int getElement(int pos) {
    return this.arr[pos];
  }

  public int getElementCount() {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        elementCount++;
      }
    }
    return elementCount;
  }

  public int getArraySize() {

    return arr.length;
  }

  // GETTER & SETTER
  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  public void setArrSize(int arrSize) {
    this.arrSize = arrSize;
  }

  /*
  private int sizeX;
  private int sizeY;
  private int[][] arr;

  // CONSTRUCTOR
  public ArrayWrapper(int sizeX, int sizeY) {
    this.sizeX = sizeX;
    this.sizeY = sizeY;

    this.arr = new int[sizeX][sizeY];
  }

  // METHODS
  public void addElement(int posX, int posY, int e) {
    if (posX >= arr.length) {

      int[][] newArr = new int[arr.length * 2][arr[posX].length];
      int[][] tempArr = arr;

      System.arraycopy(tempArr[posX], 0, newArr[posX], 0, newArr[posX].length);

      arr = newArr;
      arr[posX][posY] = e;

    } else if (posY >= arr[posX].length) {
      int lengthX = arr.length;
      int lengthY = arr[0].length;
      int[][] newArr = new int[lengthX][lengthY * 2];
      int[][] tempArr = arr;
      for (int i = 0; i < tempArr[0].length; ++i) {
        newArr[i] = new int[tempArr[i].length];
        System.arraycopy(tempArr[i], 0, newArr[i], 0, newArr[i].length);
      }
      arr = newArr;
      arr[posX][posY] = e;

    } else {
      arr[posX][posY] = e;
    }
  }

  public int getElement(int posX, int posY) {
    return arr[posX][posY];
  }

  public int getArraySize() {
    return arr.length * arr[0].length;
  }

  public int getElementCount() {

    int elementCount = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] != 0) {
          elementCount++;
        }
      }
    }

    return elementCount;
  }

  // GETTER & SETTER
  public int getSizeX() {
    return sizeX;
  }

  public void setSizeX(int sizeX) {
    this.sizeX = sizeX;
  }

  public int getSizeY() {
    return sizeY;
  }

  public void setSizeY(int sizeY) {
    this.sizeY = sizeY;
  }

  public int[][] getArr() {
    return arr;
  }

  public void setArr(int[][] arr) {
    this.arr = arr;
  }

*/
}
