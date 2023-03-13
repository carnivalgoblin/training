package aufgabe9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Point {

  // FIELDS
  public static double x;
  public static double y;

  // CONSTRUCTOR
  public Point(double x, double y) {
    Point.x = x;
    Point.y = y;
  }

  // NEW OBJECT OF TYPE POINT
  static Point p1 = new Point (8, 2);

  public static void main(String[] args) {

    System.out.println(p1);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Möchten Sie die Koordinaten verändern? add/sub/mul/div/no");
    String chooseMethod = scanner.nextLine();

    if (chooseMethod.equals("add")) {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den zu addierenden Vektor für die X Koordinate ein:");
      double addX = scanner.nextDouble();
      System.out.println("Bitte geben Sie den zu addierenden Vektor für die Y Koordinate ein:");
      double addY = scanner.nextDouble();

      addVector(addX, addY);

      System.out.println("Neue Koordinaten: " + p1);

    } else if (chooseMethod.equals("sub")) {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den zu subtrahierenden Vektor für die X Koordinate ein:");
      double subX = scanner.nextDouble();
      System.out.println("Bitte geben Sie den zu subtrahierenden Vektor für die Y Koordinate ein:");
      double subY = scanner.nextDouble();

      subtractVector(subX, subY);

      System.out.println("Neue Koordinaten: " + p1);

    } else if (chooseMethod.equals("mul")) {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den multipilzierenden Faktor für die X Koordinate ein:");
      double mulX = scanner.nextDouble();
      System.out.println("Bitte geben Sie den multipilzierenden Faktro für die Y Koordinate ein:");
      double mulY = scanner.nextDouble();

      multiplyVector(mulX, mulY);

      System.out.println("Neue Koordinaten: " + p1);

    } else if (chooseMethod.equals("div")) {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den dividierenden Faktor für die X Koordinate ein:");
      double divX = scanner.nextDouble();
      System.out.println("Bitte geben Sie den dividierenden Faktro für die Y Koordinate ein:");
      double divY = scanner.nextDouble();

      divideVector(divX, divY);

      System.out.println("Neue Koordinaten: " + p1);

    } else {
      System.out.println("Koordinaten nicht verändert.");
    }

  }

  // ARITHMETIC METHODS
  public static void addVector(double addX, double addY) {
    x = x + addX;
    y = y + addY;
  }

  public static void subtractVector(double subtractX, double subtractY) {
    x = x - subtractX;
    y = y - subtractY;
  }

  public static void multiplyVector(double multiplyX, double multiplyY) {
    x = x * multiplyX;
    y = y * multiplyY;
  }

  public static void divideVector(double divideX, double divideY) {
    x = x / divideX;
    y = y / divideY;
  }

  // SETTER & GETTER
  public double getX() {
    return x;
  }

  public void setX(double x) {
    Point.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    Point.y = y;
  }

  // ToString
  @Override
  public String toString() {
    return "Point{" +
            "coordinateX=" + x +
            ", coordinateY=" + y +
            '}';
  }
}
