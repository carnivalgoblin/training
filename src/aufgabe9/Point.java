package aufgabe9;

public class Point {

  private double x;
  private double y;

  // CONSTRUCTOR
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // SETTER & GETTER
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  // TO-STRING
  @Override
  public String toString() {
    return "Point{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }

  // ARITHMETIC METHODS

  /**
   * Method to add two Point objects
   * @param p - Point with x and y coordinates
   * @return - Point with added values from p
   */
  public Point add(Point p) {
    double newX = x + p.getX();
    double newY = y + p.getY();

    return new Point(newX, newY);
  }

  /**
   * Method to subtract two Point objects
   * @param p - Point with x and y coordinates
   * @return - Point with subtracted values from p
   */
  public Point subtract(Point p) {
    double newX = x - p.getX();
    double newY = y - p.getY();

    return new Point(newX, newY);
  }

  /**
   * Method to multiply a Point object with p
   * @param p - double to multiply the values of Point object
   * @return - Point with multiplied values from p
   */
  public Point multiply(double p) {
    double newX = x * p;
    double newY = y * p;

    return new Point(newX, newY);
  }

  /**
   * Method to divide a Point object by p
   * @param p - double to divide the values of Point object
   * @return - Point with divided values from p
   */
  public Point divide(double p) {
    double newX = x / p;
    double newY = y / p;

    return new Point(newX, newY);
  }

}

