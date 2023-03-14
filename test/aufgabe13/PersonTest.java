package aufgabe13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  Person p1 = new Person(25,"Detlef", "Müller", 186, 95);
  Person p2 = new Person(32, "Anton", "Müller", 175, 80);
  Person p3 = new Person(25,"Detlef", "Müller", 186, 95);

  @Test
  void personEquals() {

    assertEquals(p1, p3);

  }

  @Test
  void personNotEquals() {

    assertNotEquals(p1, p2);

  }

}