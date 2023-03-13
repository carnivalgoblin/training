package aufgabe10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorUtilsTest {

  private Vector v1;
  private Vector v2;

  private final double DELTA = 0.01;

  @BeforeEach
  public void initVectors() {
    v1 = new Vector(5,7,6);
    v2 = new Vector(10,8,6);
  }

  @Test
  void dotProduct() {
    double dProduct = VectorUtils.dotProduct(v1, v2);

    assertEquals(dProduct, 142, DELTA);
  }

  @Test
  void crossProduct() {
    Vector cProduct = VectorUtils.crossProduct(v1, v2);

    assertEquals(cProduct.getX(), 90, DELTA);
    assertEquals(cProduct.getY(), 90, DELTA);
    assertEquals(cProduct.getZ(), 110, DELTA);

  }

  @Test
  void addVector() {
    Vector aVector = VectorUtils.addVector(v1, v2);

    assertEquals(aVector.getX(), 15, DELTA);
    assertEquals(aVector.getY(), 15, DELTA);
    assertEquals(aVector.getZ(), 12, DELTA);

  }

  @Test
  void subtractVector() {
    Vector sVector = VectorUtils.subtractVector(v1, v2);

    assertEquals(sVector.getX(), -5, DELTA);
    assertEquals(sVector.getY(), -1, DELTA);
    assertEquals(sVector.getZ(), 0, DELTA);
  }

  @Test
  void dotProductDivision() {
    double dProductDivision = VectorUtils.dotProductDivision(v1, v2);

    assertEquals(dProductDivision, 2.375, DELTA);
  }

  @Test
  void lengthVector() {
    double lVector = VectorUtils.lengthVector(v1);

    assertEquals(lVector, 10.488088481701515, DELTA);
  }
}