package aufgabe5;

public class BodyMassIndexCalculator {



  public static void main(String[] args) {
    int heightInCentimeters = 184;
    int weightInKilograms = 100;

    final double bmi = calculateBmi(heightInCentimeters, weightInKilograms);
    final int bmiClass = classifyBmi(bmi);

    switch (bmiClass) {
      case 0 -> {
        System.out.println(bmi + " Untergewichtig");
      }
      case 1 -> {
        System.out.println(bmi + " Normalgewichtig");
      }
      case 2 -> {
        System.out.println(bmi + " Übergewichtig");
      }
      case 3 -> {
        System.out.println(bmi + " Schweres Übergewicht");
      }
    }
  }

  /**
   * Method to calculate the Body Mass Index.0
   * Formula: weight (kg) / (height (meters) * height (meters))
   * @param heightInCentimeters - height in centimeters
   * @param weightInKilograms - weight in kilograms
   * @return Body Mass Index
   */
    public static double calculateBmi(int heightInCentimeters, int weightInKilograms) {

    return weightInKilograms / ((heightInCentimeters / 100f) * (heightInCentimeters / 100f));
  }

  /**
   * Method to classify BMI
   * @param bmi - Body Mass Index as double
   * @return classification ranging from 0 to 3
   */
  public static int classifyBmi(double bmi) {

    int bmiClass;

    if (bmi < 18.5) { // unter
        bmiClass = 0;
    } else if (bmi <= 25) { // normal
        bmiClass = 1;
    } else if (bmi <= 30) { // ueber
        bmiClass = 2;
    } else { // schwer ueber
        bmiClass = 3;
    }

    return bmiClass;
  }

}


