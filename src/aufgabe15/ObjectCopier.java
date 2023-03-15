package aufgabe15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObjectCopier {

  public static List<Person> copyShallow(Person p, int numberOfCopies) {

    List<Person> returnList = new ArrayList<>();
     for (int i = 0; i < numberOfCopies; i++) {
       returnList.add(p);
     }

     return returnList;

  }

  // GENERIC
  public static <T> List<T> genericCopyShallow(T p, int numberOfCopies) {

    List<T> returnList = new ArrayList<>();
    for (int i = 0; i < numberOfCopies; i++) {
      returnList.add(p);
    }

    return returnList;

  }

  // LINKED LIST
  public static List<Person> linkedListShallowCopy(Person p, int numberOfCopies) {

    List<Person> returnList = new LinkedList<>();
    for (int i = 0; i < numberOfCopies; i++) {
      returnList.add(p);
    }

    return returnList;

  }
}
