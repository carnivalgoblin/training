package aufgabe9;

public class PointUtils {

  /**
   * Method to add the coordinates of two points
   * @param p1 - Point with x and y coordinate
   * @param p2 - Point with x and y coordinate
   * @return - new Point with x and y coordinates from p1 and p2 added together
   */
  public static Point addPoints(Point p1, Point p2) {

    double newX = p1.getX() + p2.getX();
    double newY = p1.getY() + p2.getY();

    return new Point (newX, newY);
  }
}
