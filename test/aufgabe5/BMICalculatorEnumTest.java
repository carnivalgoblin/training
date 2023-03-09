package aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorEnumTest {

  @Test
  public void underWeight() {
    int weight = 20;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertEquals("UNTER", BMICalculatorEnum.classifyBmi(bmi).toString());

  }

  @Test
  public void normalWeight() {
    int weight = 80;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertEquals("NORMAL", BMICalculatorEnum.classifyBmi(bmi).toString());

  }

  @Test
  public void overWeight() {
    int weight = 100;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertEquals("UEBER", BMICalculatorEnum.classifyBmi(bmi).toString());

  }

  @Test
  public void severeOverWeight() {
    int weight = 130;
    int height = 184;
    double bmi = weight / ((height/100f) * (height/100f));

    assertEquals("SCHWER_UEBER", BMICalculatorEnum.classifyBmi(bmi).toString());

  }

}