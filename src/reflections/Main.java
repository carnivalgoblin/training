package reflections;

import aufgabe13.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) {

    Field[] personFields = Person.class.getDeclaredFields();

    for (Field field : personFields) {
      System.out.println(field.getName());
    }

    System.out.println("-------------------------------------");

    Method[] personMethods = Person.class.getDeclaredMethods();

    for (Method method: personMethods) {
      if (method.getReturnType() == String.class) {
        System.out.println(method.getName());
      }
    }
  }
}
