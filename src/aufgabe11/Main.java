package aufgabe11;

import aufgabe9.Point;

public class Main {

  public static void main(String[] args) {

    Triangle t1 = new Triangle(new Point(5,9), new Point(6,11), new Point(4,20));

    System.out.println(t1);
    t1.calculateCircumference();
    System.out.println(t1.getCircumference());
    t1.calculateArea();
    System.out.println(t1.getArea());

    System.out.println("--------------------------------------------");

    Circle c1 = new Circle(5, new Point(4, 8));

    System.out.println(c1);
    c1.calculateCircumference();
    System.out.println(c1.getCircumference());
    c1.calculateArea();
    System.out.println(c1.getArea());

    System.out.println("--------------------------------------------");

    Rectangle r1 = new Rectangle(new Point(0,0), new Point(10,0), new Point(10,5), new Point(0,5));

    System.out.println(r1);
    r1.calculateCircumference();
    System.out.println(r1.getCircumference());
    r1.calculateArea();
    System.out.println(r1.getArea());
  }

}
