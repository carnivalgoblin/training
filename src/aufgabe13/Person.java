package aufgabe13;

import java.util.Objects;

public class Person {

  // FIELDS
  int age;
  String name;
  String surname;
  int height; // in cm
  int weight; // in kg

  // CONSTRUCTOR
  public Person(int age, String name, String surname, int height, int weight) {
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.height = height;
    this.weight = weight;
  }

  // GETTER & SETTER
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
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
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", height=" + height +
            ", weight=" + weight +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && height == person.height && weight == person.weight && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name, surname, height, weight);
  }
}
