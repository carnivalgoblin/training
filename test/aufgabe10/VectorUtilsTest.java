package aufgabe10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorUtilsTest {

  private Vector v1;
  private Vector v2;

  @BeforeEach
  public void initVectors() {
    v1 = new Vector(5,7,6);
    v2 = new Vector(10,8,6);
  }

  @Test
  void dotProduct() {
    double dProduct = VectorUtils.dotProduct(v1, v2);

    assertEquals(dProduct, 142);
  }

  @Test
  void crossProduct() {
    Vector cProduct = VectorUtils.crossProduct(v1, v2);

    assertEquals(cProduct.getX(), 90);
    assertEquals(cProduct.getY(), 90);
    assertEquals(cProduct.getZ(), 110);

  }

  @Test
  void addVector() {
    Vector aVector = VectorUtils.addVector(v1, v2);

    assertEquals(aVector.getX(), 15);
    assertEquals(aVector.getY(), 15);
    assertEquals(aVector.getZ(), 12);

  }

  @Test
  void subtractVector() {
    Vector sVector = VectorUtils.subtractVector(v1, v2);

    assertEquals(sVector.getX(), -5);
    assertEquals(sVector.getY(), -1);
    assertEquals(sVector.getZ(), 0);
  }
}