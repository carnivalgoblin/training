package aufgabe9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

  private Point testPoint1;
  private Point testPoint2;

  @BeforeEach
  public void initPoints() {
    testPoint1 = new Point(5, 5);
    testPoint2 = new Point(3, 3);
  }

  @Test
  void add() {
    Point testPoint3 = testPoint1.add(testPoint2);

    assertEquals(testPoint3.getX(), 8);
    assertEquals(testPoint3.getY(), 8);
  }

  @Test
  void subtract() {
    Point testPoint3 = testPoint1.subtract(testPoint2);

    assertEquals(testPoint3.getX(), 2);
    assertEquals(testPoint3.getY(), 2);
  }

  @Test
  void multiply() {
    Point testPoint3 = testPoint1.multiply(3);

    assertEquals(testPoint3.getX(), 15);
    assertEquals(testPoint3.getY(), 15);
  }

  @Test
  void divide() {
    Point testPoint3 = testPoint1.divide(5);

    assertEquals(testPoint3.getX(), 1);
    assertEquals(testPoint3.getY(), 1);
  }
}