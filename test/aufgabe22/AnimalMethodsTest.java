package aufgabe22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMethodsTest {

  Animal a1 = new Animal("Monkey", 12, 50.0, 2);
  Animal a2 = new Animal("Dog", 5, 25.0, 4);

  List<Animal> animals = new ArrayList<>(Arrays.asList(a1, a2));
  Stream<Animal> animalStream = animals.stream();

  @Test
  void getAnimalsLegCount() {
    List<Animal> filteredAnimals = animalStream.filter(a -> a.getNumberOfLegs() == 2).collect(Collectors.toList());
    System.out.println(filteredAnimals);
    assertEquals(animals.get(0), filteredAnimals.get(0));
  }

  @Test
  void getAnimalsAge() {
    List<Animal> filteredAnimals = animalStream.filter(a -> a.getAge() > 10).collect(Collectors.toList());
    System.out.println(filteredAnimals);
    assertEquals(animals.get(0), filteredAnimals.get(0));
  }

  @Test
  void getAnimalsAgeBetween() {
    List<Animal> filteredAnimals = animalStream.filter(a -> a.getAge() > 1 && a.getAge() < 6).collect(Collectors.toList());
    System.out.println(filteredAnimals);
    assertEquals(animals.get(1), filteredAnimals.get(0));
  }

  @Test
  void getAnimalsAgeUnderWeightOver() {
    List<Animal> filteredAnimals = animalStream.filter(a -> a.getAge() < 20 && a.getWeight() > 30).collect(Collectors.toList());
    System.out.println(filteredAnimals);
    assertEquals(animals.get(0), filteredAnimals.get(0));
  }

  @Test
  void getAnimalsByLegsOddAge() {
    List<Animal> filteredAnimals = animalStream.filter(a -> a.getNumberOfLegs() == 4 && a.getAge()%2 != 0).collect(Collectors.toList());
    System.out.println(filteredAnimals);
    assertEquals(animals.get(1), filteredAnimals.get(0));
  }
}