package aufgabe19;

import aufgabe13.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main  {

  public static void main(String[] args) {
    Person p1 = new Person(25,"Detlef", "Müller", 186, 95);
    Person p2 = new Person(32,"Anton", "Müller", 175, 80);
    Person p3 = new Person(15,"Dirk", "Müller", 168, 75);

    List<Person> persons = new ArrayList<>();

    persons.add(p1);
    persons.add(p2);
    persons.add(p3);

    System.out.println("Before: " + persons);
    persons.sort(new Person.SortByAge());
    System.out.println("After sorting by Age: " + persons);
    System.out.println("----------------------------------------------------------");
    System.out.println("Before: " + persons);
    persons.sort(new Person.SortByHeight());
    System.out.println("After sorting by Height: " + persons);
    System.out.println("----------------------------------------------------------");
    System.out.println("Before: " + persons);
    Collections.sort(persons);
    System.out.println("After: " + persons);

  }
}
