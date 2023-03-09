package aufgabe6;

import aufgabe5.BMICalculatorEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KleinstesGemeinsamesVielfachesTest {

  @Test
  public void isSmallestCommonDivisor() {
    int div1 = 3;
    int div2 = 5;

    assertTrue(KleinstesGemeinsamesVielfaches.smallestDivisor(div1, div2) == 15);
  }

  @Test
  public void isNotSmallestCommonDivisor() {
    int div1 = 3;
    int div2 = 5;

    assertFalse(KleinstesGemeinsamesVielfaches.smallestDivisor(div1, div2) == 10);
    assertFalse(KleinstesGemeinsamesVielfaches.smallestDivisor(-div1, div2) == -15);
    assertFalse(KleinstesGemeinsamesVielfaches.smallestDivisor(-div1, div2) == 15);
  }

}