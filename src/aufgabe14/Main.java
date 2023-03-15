package aufgabe14;

public class Main {

  public static void main(String[] args) {

    ArrayWrapper arr = new ArrayWrapper(6);
   // ArrayWrapper[] arr2 = new ArrayWrapper[];

    arr.addElement(1,4);
    arr.addElement(0,1);
    arr.getElement(2);

    System.out.println(arr.getArraySize());

    System.out.println(arr.getElementCount());

    System.out.println(arr.getElement(1));
    System.out.println(arr.getElement(0));

    arr.addElement(9,14);
    System.out.println(arr.getArraySize());

    System.out.println(arr.getElementCount());

    System.out.println(arr.getElement(9));

  }
}
