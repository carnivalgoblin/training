package aufgabe11;

import aufgabe9.Point;

public class Circle extends GeometricCalculation {

  private double radius;
  private double p1;
  private double p2;

  private Point center = new Point(p1, p2);

  // CONSTRUCTOR
  public Circle(double radius, Point center) {
    this.radius = radius;
    this.center = center;
  }

  // METHODS
  /**
   * Method to calculate area of a circle
   * @param c1 Circle object with radius and Point object to mark center
   * @return Area as double
   */
    @Override
    public double calculateArea() {
    double radius = this.getRadius();

    double area = Math.pow(radius,2) * Math.PI;
    this.setArea(area);
    return area;
  }

   /**
    * Method to calculate circumference of a circle
    *
    * @param c1 Circle object with radius and Point object to mark center
    * @return Circumference as double
    */
    public double calculateCircumference() {
    double radius = this.getRadius();

    double circumference = 2 * radius * Math.PI;
    this.setCircumference(circumference);
      return circumference;
    }

  // SETTER & GETTER
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            ", center=" + center +
            '}';
  }

}
