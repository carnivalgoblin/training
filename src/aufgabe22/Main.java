package aufgabe22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Animal a1 = new Animal("Monkey", 12, 50.0, 2);
    Animal a2 = new Animal("Dog", 5, 25.0, 4);
    Animal a3 = new Animal("Elephant", 53, 1500.0, 4);
    Animal a4 = new Animal("Chicken", 2, 5.0, 2);

    List<Animal> animals = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));

    List<Animal> filteredAnimalsByLegs = new AnimalMethods().getAnimalsLegCount(animals, 2);

    for (int i = 0; i < filteredAnimalsByLegs.size(); i++) {
      System.out.println(filteredAnimalsByLegs.get(i).getName() + "; Number of legs: " + filteredAnimalsByLegs.get(i).getNumberOfLegs());
    }

    System.out.println("---------------------------------------------------------------------------");

    List<Animal> filteredAnimalsByAge = new AnimalMethods().getAnimalsAge(animals, 10);

    for (int i = 0; i < filteredAnimalsByAge.size(); i++) {
      System.out.println(filteredAnimalsByAge.get(i).getName() + "; Age: " + filteredAnimalsByAge.get(i).getAge());
    }

    System.out.println("---------------------------------------------------------------------------");

    List<Animal> getAnimalsAgeBetween = new AnimalMethods().getAnimalsAgeBetween(animals, 1,6);

    for (int i = 0; i < getAnimalsAgeBetween.size(); i++) {
      System.out.println(getAnimalsAgeBetween.get(i).getName() + "; Age: " + getAnimalsAgeBetween.get(i).getAge());
    }

    System.out.println("---------------------------------------------------------------------------");

    List<Animal> getAnimalsAgeUnderWeightOver = new AnimalMethods().getAnimalsAgeUnderWeightOver(animals, 20,30);

      for (int i = 0; i < getAnimalsAgeUnderWeightOver.size(); i++) {
      System.out.println(getAnimalsAgeUnderWeightOver.get(i).getName() + "; Age: " + getAnimalsAgeUnderWeightOver.get(i).getAge() + "; Weight: " + getAnimalsAgeUnderWeightOver.get(i).getWeight());
    }

    System.out.println("---------------------------------------------------------------------------");

    List<Animal> getAnimalsByLegsOddAge = new AnimalMethods().getAnimalsByLegsOddAge(animals, 4);

    for (int i = 0; i < getAnimalsByLegsOddAge.size(); i++) {
      System.out.println(getAnimalsByLegsOddAge.get(i).getName() + "; Age: " + getAnimalsByLegsOddAge.get(i).getAge());
    }

    System.out.println("---------------------------------------------------------------------------");

    // WITH STREAM API
    Stream<Animal> animalStream = animals.stream();

    List<Animal> animalsWithTwoLegs = animalStream.filter(a -> a.getNumberOfLegs() == 2).collect(Collectors.toList());
    for (int i = 0; i < animalsWithTwoLegs.size(); i++) {
      System.out.println(animalsWithTwoLegs.get(i).getName() + "; Legs: " + animalsWithTwoLegs.get(i).getNumberOfLegs());
    }
    System.out.println("---------------------------------------------------------------------------");

    Stream<Animal> animalStream2 = animals.stream();

    List<Animal> animalsOlderThanTen = animalStream2.filter(a -> a.getAge() > 10).collect(Collectors.toList());
    for (int i = 0; i < animalsOlderThanTen.size(); i++) {
      System.out.println(animalsOlderThanTen.get(i).getName() + "; Age: " + animalsOlderThanTen.get(i).getAge());
    }
    System.out.println("---------------------------------------------------------------------------");

    Stream<Animal> animalStream3 = animals.stream();

    List<Animal> animalsBetweenFiveAndEight = animalStream3.filter(a -> a.getAge() > 1 && a.getAge() < 6).collect(Collectors.toList());
    for (int i = 0; i < animalsBetweenFiveAndEight.size(); i++) {
      System.out.println(animalsBetweenFiveAndEight.get(i).getName() + "; Age: " + animalsBetweenFiveAndEight.get(i).getAge());
    }
    System.out.println("---------------------------------------------------------------------------");

    Stream<Animal> animalStream4 = animals.stream();

    List<Animal> animalsWeightOverAgeUnder = animalStream4.filter(a -> a.getWeight() > 30 && a.getAge() < 20).collect(Collectors.toList());
    for (int i = 0; i < animalsWeightOverAgeUnder.size(); i++) {
      System.out.println(animalsWeightOverAgeUnder.get(i).getName() + "; Age: " + animalsWeightOverAgeUnder.get(i).getAge() + "; Weight: " + animalsWeightOverAgeUnder.get(i).getWeight());
    }
    System.out.println("---------------------------------------------------------------------------");

    Stream<Animal> animalStream5 = animals.stream();

    List<Animal> animalsFourLegsOddAge = animalStream5.filter(a -> a.getNumberOfLegs() == 4 && a.getAge()%2 != 0).collect(Collectors.toList());
    for (int i = 0; i < animalsFourLegsOddAge.size(); i++) {
      System.out.println(animalsFourLegsOddAge.get(i).getName() + "; Age: " + animalsFourLegsOddAge.get(i).getAge() + "; Legs: " + animalsFourLegsOddAge.get(i).getNumberOfLegs());
    }
    System.out.println("---------------------------------------------------------------------------");
  }
}