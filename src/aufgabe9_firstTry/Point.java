package aufgabe9_firstTry;

public class Point {

  // FIELDS
  public double x;
  public double y;

  // CONSTRUCTOR
  public Point(double newX, double newY) {

  }

  // NEW OBJECT OF TYPE POINT
  public Point p1 = new Point (x, y);

  // ARITHMETIC METHODS
  public Point addPoint(double addX, double addY) {
    double newX = x + addX;
    double newY = y + addY;
    return new Point(newX, newY);
  }

  public void subtractPoint(double subtractX, double subtractY) {
    x = x - subtractX;
    y = y - subtractY;
  }

  public void multiplyPoint(double multiplyX, double multiplyY) {
    x = x * multiplyX;
    y = y * multiplyY;
  }

  public void dividePoint(double divideX, double divideY) {
    x = x / divideX;
    y = y / divideY;
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

  // ToString
  @Override
  public String toString() {
    return "Point{" +
            "X = " + x +
            ", Y = " + y +
            '}';
  }
}
