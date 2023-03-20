package aufgabe13;

import aufgabe20.CSVEntity;
import aufgabe20.CSVField;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVParser_2Test {

  private static final String SEPARATOR = ";";
  private static final String NEW_LINE = "\n";

  @CSVEntity
  private class Parseble {

  }

  private class NotParseble {
  }

  @CSVEntity
  private class HasFields {
    @CSVField
    public String lastName;
  }

  @Test
  void isParseable() {
    assertTrue(new CSVParser_2().isParseable(new Parseble()));
  }

  @Test
  public void isNotParsable() {
    assertFalse(new CSVParser_2().isParseable(new NotParseble()));
  }

  @Test
  void getFields() {
    Field expectedField = HasFields.class.getDeclaredFields()[0];
    Field actualField = new CSVParser_2().getFields(new HasFields()).get(0);
    assertEquals(expectedField, actualField);
  }

  @Test
  void parse() {

    Person p1 = new Person(25,"Detlef", "Müller", 186, 95);
    Person p2 = new Person(32,"Anton", "Müller", 175, 80);
    Person p3 = new Person(15,"Dirk", "Müller", 168, 75);

    List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3));

    String expected = """
            age;firstName;lastName
            25;Detlef;Müller
            32;Anton;Müller
            15;Dirk;Müller
            """;

    String actual = new CSVParser_2().parse(persons);

    assertEquals(expected, actual);
  }

  @Test
  void generateCSVHeader() {
      String actualHeader = new CSVParser_2().generateCSVHeader(new Person(1,"Bill", "Bongo", 125,31));
      String expectedHeader = "age" + SEPARATOR + "firstName" + SEPARATOR + "lastName" + NEW_LINE;

      assertEquals(expectedHeader, actualHeader);
  }

  @Test
  void generateCSVContent() {

    Person p1 = new Person(25,"Detlef", "Müller", 186, 95);
    Person p2 = new Person(32,"Anton", "Müller", 175, 80);
    Person p3 = new Person(15,"Dirk", "Müller", 168, 75);

    List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3));

    String expected = """
            25;Detlef;Müller
            32;Anton;Müller
            15;Dirk;Müller
            """;

    String actual = new CSVParser_2().generateCSVContent(persons);

    assertEquals(expected, actual);
  }
}