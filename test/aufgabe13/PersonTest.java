package aufgabe13;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  Person p1 = new Person(25,"Detlef", "Müller", 186, 95);
  Person p2 = new Person(32,"Anton", "Müller", 195, 80);
  Person p3 = new Person(25,"Detlef", "Müller", 186, 95);
  Person p4 = new Person(15,"Dirk", "Müller", 168, 75);

  @Test
  void personEquals() {

    assertEquals(p1, p3);

  }

  @Test
  void personNotEquals() {

    assertNotEquals(p1, p2);

  }

  @Test
  void shouldHashMap() {
    HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();

    personMap.put(1, p1);
    personMap.put(2, p2);
    personMap.put(3, p3);

    assertEquals(personMap.get(1).hashCode(), personMap.get(3).hashCode());
    assertNotEquals(personMap.get(1).hashCode(), personMap.get(2).hashCode());
  }

  @Test
  void shouldSortByAgeComparator() {

    List<Person> persons = new ArrayList<>();

    persons.add(p1);
    persons.add(p2);
    persons.add(p3);
    persons.add(p4);

    persons.sort(new Person.SortByAge());
    assertSame(persons.get(0), p4);
  }

  @Test
  void shouldSortByHeightComparator() {

    List<Person> persons = new ArrayList<>();

    persons.add(p1);
    persons.add(p2);
    persons.add(p3);
    persons.add(p4);

    persons.sort(new Person.SortByHeight());
    assertSame(persons.get(3), p2);
  }

  @Test
  void shouldSortByAgeComparable() {

    List<Person> persons = new ArrayList<>();

    persons.add(p1);
    persons.add(p2);
    persons.add(p3);
    persons.add(p4);

    Collections.sort(persons);
    assertSame(persons.get(0), p4);
  }
}