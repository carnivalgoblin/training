package aufgabe11;

import aufgabe9.Point;

public class Triangle implements GeometricCalculation {

  private double triangleXP1;
  private double triangleYP1;
  private double triangleXP2;
  private double triangleYP2;
  private double triangleXP3;
  private double triangleYP3;

  private Point p1 = new Point(triangleXP1, triangleYP1);
  private Point p2 = new Point(triangleXP2, triangleYP2);
  private Point p3 = new Point(triangleXP3, triangleYP3);

  // CONSTRUCTOR
  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
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

  @Override
  public String toString() {
    return "Triangle{" +
            "p1=" + p1 +
            ", p2=" + p2 +
            ", p3=" + p3 +
            '}';
  }
}
