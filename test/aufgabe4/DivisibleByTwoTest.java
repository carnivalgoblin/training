package aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByTwoTest {

  @Test
  public void shouldBeDivisibleByTwo() {
    int two = 2;
    int zero = 0;
    assertTrue(DivisibleByTwo.isDivisibleByTwo(two));
    assertTrue(DivisibleByTwo.isDivisibleByTwo(zero));
  }

  @Test
  public void shouldNotBeDivisibleByTwo() {
    int three = 3;
    int five = 5;
    int thirteen = 3;
    assertFalse(DivisibleByTwo.isDivisibleByTwo(three));
    assertFalse(DivisibleByTwo.isDivisibleByTwo(five));
    assertFalse(DivisibleByTwo.isDivisibleByTwo(thirteen));
  }

}