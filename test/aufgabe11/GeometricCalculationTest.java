package aufgabe11;

import aufgabe9.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricCalculationTest {

  private final double DELTA = 0.01;

  @Test
  void calculateCircumferenceTriangle() {
    Triangle t1 = new Triangle(new Point(5,9), new Point(6,11), new Point(4,20));

    assertEquals(t1.calculateCircumference(), 43.221672281499806, DELTA);

  }

  @Test
  void calculateAreaTriangle() {
    Triangle t1 = new Triangle(new Point(5,9), new Point(6,11), new Point(4,20));

    assertEquals(t1.calculateArea(), 85.5, DELTA);
  }

  @Test
  void calculateCircumferenceCircle() {
    Circle c1 = new Circle(5, new Point(4, 8));

    assertEquals(c1.calculateCircumference(), 31.41592653589793, DELTA);
  }

  @Test
  void calculateAreaCircle() {
    Circle c1 = new Circle(5, new Point(4, 8));

    assertEquals(c1.calculateArea(), 78.53981633974483, DELTA);
  }

  @Test
  void calculateCircumferenceRectangle() {
    Rectangle r1 = new Rectangle(new Point(0,0), new Point(10,0), new Point(10,5), new Point(0,5));

    assertEquals(r1.calculateCircumference(), 26.18033988749895, DELTA);
  }

  @Test
  void calculateAreaRectangle() {
    Rectangle r1 = new Rectangle(new Point(0,0), new Point(10,0), new Point(10,5), new Point(0,5));

    assertEquals(r1.calculateArea(), 50.0, DELTA);
  }
}