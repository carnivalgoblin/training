package aufgabe9;

public class Main {

  public static void main(String[] args) {

    Point p1 = new Point(10, 5);
    Point p2 = new Point(9, 4);

    Point p3 = p1.add(p2);
    Point p4 = p1.subtract(p2);

    Point p5 = p1.multiply(5);
    Point p6 = p1.divide(2);

    System.out.println(p1 + ", " + p2);
  //  System.out.println(p3);
  //  System.out.println(p4);
  //  System.out.println(p5);
  //  System.out.println(p6);

    System.out.println(PointUtils.addPoints(p1, p2));
  }

}
