package aufgabe11;

public interface GeometricCalculation {

  public static double calculateCircumferenceTriangle(Triangle t1) {

    double length1 = Math.sqrt(Math.pow(t1.getP1().getX(), 2) + Math.pow(t1.getP1().getY(), 2));
    double length2 = Math.sqrt(Math.pow(t1.getP2().getX(), 2) + Math.pow(t1.getP2().getY(), 2));
    double length3 = Math.sqrt(Math.pow(t1.getP3().getX(), 2) + Math.pow(t1.getP3().getY(), 2));

    return length1 + length2 + length3;
  }

  public static double calculateAreaTriangle(Triangle t1) {

    double part1 = ( t1.getP1().getX() * (t1.getP2().getY() - t1.getP3().getY()) );
    double part2 = ( t1.getP2().getX() * (t1.getP3().getY() - t1.getP1().getY()) );
    double part3 = ( t1.getP3().getX() * (t1.getP1().getY() - t1.getP2().getY()) );

    return (part1 + part2 + part3) / 2;
  }

  public static double calculateCircumferenceCircle(Circle c1) {
    double radius = c1.getRadius();

    return 2 * radius * Math.PI;
  }

  public static double calculateAreaCircle(Circle c1) {
    double radius = c1.getRadius();

    return Math.pow(radius,2) * Math.PI;
  }

  public static double calculateCircumferenceRectangle(Rectangle r1) {

    double length1 = Math.sqrt(Math.pow(r1.getP1().getX(), 2) + Math.pow(r1.getP1().getY(), 2));
    double length2 = Math.sqrt(Math.pow(r1.getP2().getX(), 2) + Math.pow(r1.getP2().getY(), 2));
    double length3 = Math.sqrt(Math.pow(r1.getP3().getX(), 2) + Math.pow(r1.getP3().getY(), 2));
    double length4 = Math.sqrt(Math.pow(r1.getP4().getX(), 2) + Math.pow(r1.getP4().getY(), 2));

    return length1 + length2 + length3 + length4;

  }

  public static double calculateAreaRectangle(Rectangle r1) {

    double height = r1.getP3().getX();
    double width = r1.getP3().getY();

    return height * width;

  }

}
