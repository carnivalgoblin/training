package aufgabe11;

public abstract class GeometricCalculation {

  double area;
  double circumference;

  // ABSTRACT METHODS
  public abstract double calculateArea();

  public abstract double calculateCircumference();

  // GETTER & SETTER
  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getCircumference() {
    return circumference;
  }

  public void setCircumference(double circumference) {
    this.circumference = circumference;
  }
}
