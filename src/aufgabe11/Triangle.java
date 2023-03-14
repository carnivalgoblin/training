package aufgabe11;

import aufgabe9.Point;

public class Triangle extends GeometricCalculation {

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

  // METHODS
  /**
   * Method to calculate circumference of a triangle
   *
   * @return Circumference as double
   */
    public double calculateCircumference() {

    double length1 = Math.sqrt(Math.pow(this.getP1().getX(), 2) + Math.pow(this.getP1().getY(), 2));
    double length2 = Math.sqrt(Math.pow(this.getP2().getX(), 2) + Math.pow(this.getP2().getY(), 2));
    double length3 = Math.sqrt(Math.pow(this.getP3().getX(), 2) + Math.pow(this.getP3().getY(), 2));

    double circumference = length1 + length2 + length3;

    this.setCircumference(circumference);
    return circumference;
    }

  /**
   * Method to calculate area of a triangle
   * @return Area as double
   */
    public double calculateArea() {
    double part1 = ( this.getP1().getX() * this.getP2().getY() - this.getP3().getY() );
    double part2 = ( this.getP2().getX() * this.getP3().getY() - this.getP1().getY() );
    double part3 = ( this.getP3().getX() * this.getP1().getY() - this.getP2().getY() );

    double area = (part1 + part2 + part3) / 2;

    this.setArea(area);
    return area;
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

  public void setArea(double area) {
    this.area = area;
  }

  public double getArea() {
    return area;
  }
}
