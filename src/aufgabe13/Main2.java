package aufgabe13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

  public static void main(String[] args) {

    Person p1 = new Person(25,"Detlef", "Müller", 186, 95);
    Person p2 = new Person(32,"Anton", "Müller", 175, 80);
    Person p3 = new Person(15,"Dirk", "Müller", 168, 75);

    List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3));

    String csv = new CSVParser_2().parse(persons);
    System.out.println(csv);

  }
}
