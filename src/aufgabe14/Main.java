package aufgabe14;


public class Main {

  public static void main(String[] args) {

    ArrayWrapper<Integer> arr = new ArrayWrapper<>(6);
    ArrayWrapper<String> stringArr = new ArrayWrapper<>(6);

    arr.addElement(1,4);
    stringArr.addElement(0,"Hello");

    System.out.println(arr.getArraySize());
    System.out.println(arr.getElementCount());

    arr.addElement(9,14);
    System.out.println(arr.getArraySize());
    System.out.println(arr.getArr(0));



  }
}
