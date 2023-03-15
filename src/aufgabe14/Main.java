package aufgabe14;


public class Main {

  public static void main(String[] args) {

    ArrayWrapper arr = new ArrayWrapper(6);

    arr.addElement(1,4);
    arr.addElement(0,"Hello");

    System.out.println(arr.getArraySize());
    System.out.println(arr.getElementCount());

    arr.addElement(9,14);
    System.out.println(arr.getArraySize());
    System.out.println(arr.getArr(0));



  }
}
