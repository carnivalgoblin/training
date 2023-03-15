package aufgabe15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ObjectCopierTest {

  @Test
  void copyShallow() {
    Person personOne = new Person("Bert", "Müller", 38);

    assertEquals(ObjectCopier.copyShallow(personOne, 10).size(), 10);

  }

  @Test
  void genericCopyShallow() {
    Person personOne = new Person("Bert", "Müller", 38);

    assertEquals(ObjectCopier.genericCopyShallow(personOne, 10).size(), 10);

  }

  @Test
  void linkedListCopyShallow() {
    Person personOne = new Person("Bert", "Müller", 38);

    assertEquals(ObjectCopier.linkedListShallowCopy(personOne, 10).size(), 10);

  }

  @Test
  void shouldDoShallowCopies() {
    Person personOne = new Person("Bert", "Müller", 38);

    List<Person> persons = new ArrayList<>();
    List<Person> copies = ObjectCopier.copyShallow(personOne, 5);

    Integer expectedAge = 38;
    Integer ageOfFirstCopy = copies.get(0).getAge();
    assertEquals(expectedAge, ageOfFirstCopy);

    int expectedCopySize = 5;
    int copiesSize = copies.size();
    assertEquals(expectedCopySize, copiesSize);

    for (Person copy : copies) {
      assertSame(copy, personOne);
    }
  }
}