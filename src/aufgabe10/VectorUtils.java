package aufgabe10;

import static java.lang.Math.sqrt;

public class VectorUtils {

  public static double dotProduct(Vector v1, Vector v2) {

    double tempX = v1.getX() * v2.getX();
    double tempY = v1.getY() * v2.getY();
    double tempZ = v1.getZ() * v2.getZ();

    return (tempX + tempY + tempZ);
  }

  public static double dotProductDivision(Vector v1, Vector v2) {
    double tempX = v1.getX() / v2.getX();
    double tempY = v1.getY() / v2.getY();
    double tempZ = v1.getZ() / v2.getZ();

    return (tempX + tempY + tempZ);
  }

  public static Vector crossProduct(Vector v1, Vector v2) {

    double tempX = v1.getY() * v2.getZ() +  v1.getZ() * v2.getY();
    double tempY = v1.getZ() * v2.getX() +  v1.getX() * v2.getZ();
    double tempZ = v1.getX() * v2.getY() +  v1.getY() * v2.getX();

    return new Vector(tempX, tempY, tempZ);
  }

  public static Vector addVector(Vector v1, Vector v2) {
    double tempX = v1.getX() +  v2.getX();
    double tempY = v1.getY() +  v2.getY();
    double tempZ = v1.getZ() +  v2.getZ();

    return new Vector(tempX, tempY, tempZ);
  }

  public static Vector subtractVector(Vector v1, Vector v2) {
    double tempX = v1.getX() -  v2.getX();
    double tempY = v1.getY() -  v2.getY();
    double tempZ = v1.getZ() -  v2.getZ();

    return new Vector(tempX, tempY, tempZ);
  }

  public static double lengthVector(Vector v1) {
    return Math.sqrt(v1.getX()* v1.getX() + v1.getY()* v1.getY() + v1.getZ()* v1.getZ());
  }

}
