package aufgabe11;

import aufgabe9.Point;

public class Circle implements GeometricCalculation {

  private double radius;
  private double p1;
  private double p2;

  private Point center = new Point(p1, p2);

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

  public Circle(double radius, Point center) {
    this.radius = radius;
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
