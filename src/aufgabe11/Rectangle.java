package aufgabe11;

import aufgabe9.Point;

public class Rectangle implements GeometricCalculation{

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

  // METHODS

  /**
   * Method to calculate area of a rectangle
   * @param r1 Rectangle object with 4 Point objects to mark corners
   * @return Area as double
   */
  @Override
  public double calculateArea() {
    double height = this.getP3().getX();
    double width = this.getP3().getY();

    return height * width;
  }

  /**
   * Method to calculate circumference of a rectangle
   * @param r1 Rectangle object with 4 Point objects to mark corners
   * @return Circumference as double
   */
  @Override
  public double calculateCircumference() {
    double length1 = Math.sqrt(Math.pow(this.getP1().getX(), 2) + Math.pow(this.getP1().getY(), 2));
    double length2 = Math.sqrt(Math.pow(this.getP2().getX(), 2) + Math.pow(this.getP2().getY(), 2));
    double length3 = Math.sqrt(Math.pow(this.getP3().getX(), 2) + Math.pow(this.getP3().getY(), 2));
    double length4 = Math.sqrt(Math.pow(this.getP4().getX(), 2) + Math.pow(this.getP4().getY(), 2));

    return length1 + length2 + length3 + length4;

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
