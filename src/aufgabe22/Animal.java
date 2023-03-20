package aufgabe22;

import java.util.ArrayList;
import java.util.List;

public class Animal {

  private String name;
  private int age;
  private double weight;
  private int numberOfLegs;

  // CONSTRUCTOR
  public Animal(String name, int age, double weight, int numberOfLegs) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.numberOfLegs = numberOfLegs;
  }
  // SETTER & GETTER
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  public void setNumberOfLegs(int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }

}
