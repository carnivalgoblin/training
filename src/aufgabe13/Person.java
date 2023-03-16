package aufgabe13;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {

  // FIELDS
  int age;
  String firstName;
  String lastName;
  int height; // in cm
  int weight; // in kg

  // CONSTRUCTOR
  public Person(int age, String firstName, String lastName, int height, int weight) {
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;
  }

  // GETTER & SETTER
  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  // OVERRIDE METHODS
  @Override
  public String toString() {
    return "Person{" +
            "age=" + age +
            ", name='" + firstName + '\'' +
            ", surname='" + lastName + '\'' +
            ", height=" + height +
            ", weight=" + weight +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && height == person.height && weight == person.weight && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, firstName, lastName, height, weight);
  }

  @Override
  public int compareTo(Person o) {
    return Integer.compare(getAge(), o.getAge());
  }

  public static class SortByAge implements Comparator<Person> {

     public int compare(Person o1, Person o2) {
      return o1.getAge() - o2.getAge();
    }
  }

  public static class SortByHeight implements Comparator<Person> {

     public int compare(Person o1, Person o2) {
      return o1.getHeight() - o2.getHeight();
    }
  }



}
