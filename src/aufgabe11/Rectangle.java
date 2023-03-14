package aufgabe11;

import aufgabe9.Point;

public class Rectangle {

  private double rectangleXP1;
  private double rectangleYP1;
  private double rectangleXP2;
  private double rectangleYP2;
  private double rectangleXP3;
  private double rectangleYP3;
  private double rectangleXP4;
  private double rectangleYP4;

  private Point p1 = new Point(rectangleXP1, rectangleYP1);
  private Point p2 = new Point(rectangleXP2, rectangleYP2);
  private Point p3 = new Point(rectangleXP3, rectangleYP3);
  private Point p4 = new Point(rectangleXP4, rectangleYP4);

  // CONSTRUCTOR
  public Rectangle(Point p1, Point p2, Point p3, Point p4) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.p4 = p4;
  }

  // SETTER & GETTER
  public Point getP1() {
    return p1;
  }

  public void setP1(Point p1) {
    this.p1 = p1;
  }

  public Point getP2() {
    return p2;
  }

  public void setP2(Point p2) {
    this.p2 = p2;
  }

  public Point getP3() {
    return p3;
  }

  public void setP3(Point p3) {
    this.p3 = p3;
  }

  public Point getP4() {
    return p4;
  }

  public void setP4(Point p4) {
    this.p4 = p4;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "p1=" + p1 +
            ", p2=" + p2 +
            ", p3=" + p3 +
            ", p4=" + p4 +
            '}';
  }
}
