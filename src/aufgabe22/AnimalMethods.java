package aufgabe22;

import java.util.ArrayList;
import java.util.List;

public class AnimalMethods {

  // METHODS
  public List<Animal> getAnimalsLegCount(List<Animal> animals, int legCount) {
    List<Animal> filteredAnimals = new ArrayList<Animal>();
    for ( Animal a : animals) {
      if (a.getNumberOfLegs() == legCount) {
        filteredAnimals.add(a);
      }
    }
    return filteredAnimals;
  }

  public List<Animal> getAnimalsAge(List<Animal> animals, int age) {
    List<Animal> filteredAnimals = new ArrayList<Animal>();
    for (Animal a : animals) {
      if (a.getAge() > age) {
        filteredAnimals.add(a);
      }
    }
    return filteredAnimals;
  }

  public List<Animal> getAnimalsAgeBetween(List<Animal> animals, int ageLow, int ageHigh) {
    List<Animal> filteredAnimals = new ArrayList<Animal>();
    for (Animal a : animals) {
      if (ageLow < a.getAge() && a.getAge() < ageHigh) {
        filteredAnimals.add(a);
      }
    }
    return filteredAnimals;
  }

  public List<Animal> getAnimalsAgeUnderWeightOver(List<Animal> animals, int age, int weight) {
    List<Animal> filteredAnimals = new ArrayList<Animal>();
    for (Animal a : animals) {
      if (age > a.getAge() && a.getWeight() > weight) {
        filteredAnimals.add(a);
      }
    }
    return filteredAnimals;
  }

  public List<Animal> getAnimalsByLegsOddAge(List<Animal> animals, int legCount) {
    List<Animal> filteredAnimals = new ArrayList<Animal>();
    for (Animal a : animals) {
      if (legCount == a.getNumberOfLegs() && a.getAge()%2 != 0) {
        filteredAnimals.add(a);
      }
    }
    return filteredAnimals;
  }
}
