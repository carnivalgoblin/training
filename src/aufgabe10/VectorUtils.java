package aufgabe10;

public class VectorUtils {

  /**
   * Method to calculate dot product of two vectors
   * @param v1 - Vector object with x, y and z values
   * @param v2 - Vector object with x, y and z values
   * @return - double with dot product of Vectors v1 and v2
   */
  public static double dotProduct(Vector v1, Vector v2) {

    double tempX = v1.getX() * v2.getX();
    double tempY = v1.getY() * v2.getY();
    double tempZ = v1.getZ() * v2.getZ();

    return (tempX + tempY + tempZ);
  }

  /**
   * Method to calculate dot division of two vectors
   * @param v1 - Vector object with x, y and z values
   * @param v2 - Vector object with x, y and z values
   * @return - double with dot division of Vectors v1 and v2
   */
  public static double dotProductDivision(Vector v1, Vector v2) {
    double tempX = v1.getX() / v2.getX();
    double tempY = v1.getY() / v2.getY();
    double tempZ = v1.getZ() / v2.getZ();

    return (tempX + tempY + tempZ);
  }

  /**
   * Method to calculate cross product of two vectors
   * @param v1 - Vector object with x, y and z values
   * @param v2 - Vector object with x, y and z values
   * @return - Vector object with cross product of v1 and v2
   */
  public static Vector crossProduct(Vector v1, Vector v2) {

    double tempX = v1.getY() * v2.getZ() +  v1.getZ() * v2.getY();
    double tempY = v1.getZ() * v2.getX() +  v1.getX() * v2.getZ();
    double tempZ = v1.getX() * v2.getY() +  v1.getY() * v2.getX();

    return new Vector(tempX, tempY, tempZ);
  }

  /**
   * Method to calculate addition of two vectors
   * @param v1 - Vector object with x, y and z values
   * @param v2 - Vector object with x, y and z values
   * @return - Vector object with values of v1 and v2 added
   */
  public static Vector addVector(Vector v1, Vector v2) {
    double tempX = v1.getX() +  v2.getX();
    double tempY = v1.getY() +  v2.getY();
    double tempZ = v1.getZ() +  v2.getZ();

    return new Vector(tempX, tempY, tempZ);
  }
  /**
   * Method to calculate subtraction of two vectors
   * @param v1 - Vector object with x, y and z values
   * @param v2 - Vector object with x, y and z values
   * @return - Vector object with values of v1 and v2 subtracted
   */
  public static Vector subtractVector(Vector v1, Vector v2) {
    double tempX = v1.getX() -  v2.getX();
    double tempY = v1.getY() -  v2.getY();
    double tempZ = v1.getZ() -  v2.getZ();

    return new Vector(tempX, tempY, tempZ);
  }

  /**
   * Method to calculate length of a vector
   * @param v1 - Vector object with x, y and z values
   * @return - double with the length of the Vector v1
   */
  public static double lengthVector(Vector v1) {

    return Math.sqrt(Math.pow(v1.getX(), 2) + Math.pow(v1.getY(), 2) + Math.pow(v1.getZ(), 2));
  }

}
