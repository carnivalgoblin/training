package aufgabe5;

import java.util.Scanner;

import static aufgabe5.BMICalculatorEnum.BmiClassisfication.*;

public class BMICalculatorEnum {

  enum BmiClassisfication {
    UNTER,
    NORMAL,
    UEBER,
    SCHWER_UEBER
  }

  public static void main(String[] args) {

    Scanner inputHeight = new Scanner(System.in);
    System.out.println("Größe in cm:");
    int heightInCentimeters = Integer.parseInt(inputHeight.nextLine());

    Scanner inputWeight = new Scanner(System.in);
    System.out.println("Gewicht in kg:");
    int weightInKilograms = Integer.parseInt(inputHeight.nextLine());


    System.out.println(classifyBmi(calculateBmi(heightInCentimeters, weightInKilograms)));

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
   * @return classification as enum
   */
  public static BmiClassisfication classifyBmi(double bmi) {

    if (bmi < 18.5) { // unter
      return UNTER;
    } else if (bmi <= 25) { // normal
      return NORMAL;
    } else if (bmi <= 30) { // ueber
      return UEBER;
    } else { // schwer ueber
      return SCHWER_UEBER;
    }

  }

}