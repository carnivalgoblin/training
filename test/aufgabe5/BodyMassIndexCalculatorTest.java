package aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexCalculatorTest {

  @Test
  public void underWeight() {
    int weight = 20;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertTrue(BodyMassIndexCalculator.calculateBmi(height, weight) < 18.5);
    assertEquals(0, BodyMassIndexCalculator.classifyBmi(bmi));

  }

  @Test
  public void normalWeight() {
    int weight = 80;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertTrue(BodyMassIndexCalculator.calculateBmi(height, weight) <= 25);
    assertTrue(BodyMassIndexCalculator.calculateBmi(height, weight) >= 18.5);
    assertEquals(1, BodyMassIndexCalculator.classifyBmi(bmi));

  }

  @Test
  public void overWeight() {
    int weight = 100;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertTrue(BodyMassIndexCalculator.calculateBmi(height, weight) <= 30);
    assertTrue(BodyMassIndexCalculator.calculateBmi(height, weight) >= 25);
    assertEquals(2, BodyMassIndexCalculator.classifyBmi(bmi));

  }

  @Test
  public void severeOverWeight() {
    int weight = 130;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertTrue(BodyMassIndexCalculator.calculateBmi(height, weight) > 30);
    assertEquals(3, BodyMassIndexCalculator.classifyBmi(bmi));

  }

}