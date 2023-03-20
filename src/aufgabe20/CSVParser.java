package aufgabe20;

import aufgabe13.Person;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CSVParser {

  private final static String SEPARATOR = ";";
  private final static String NEW_LINE = "\n";

  public boolean isParseable(Object o) {
    return o.getClass().getAnnotation(CSVEntity.class) != null;
  }


  /**
   * Parse a collection of java objects to a csv file
   * @param o The objects to write to the csv file
   * @return the csv string
   */
  public List<Field> getFields(Object o) {
    Field[] fields = o.getClass().getDeclaredFields();
    List<Field> csvFields = new ArrayList<>();

    for (Field f : fields) {
      if (f.getAnnotation(CSVField.class) != null) {
        csvFields.add(f);
      }
    }
    return csvFields;
  }

  /**
   * Parse a collection of java objects to a csv file
   *
   * @param persons The persons to write to the csv file
   * @return the csv string
   */
  public String parse(List<Person> persons) {
    if (persons.isEmpty()) return ""; // if empty list is provided

    StringBuilder csv = new StringBuilder();
    csv.append(generateCSVHeader(persons.get(0)));
    csv.append(generateCSVContent(persons));

    return csv.toString();
  }


  /**
   * Generate the csv header for the provided object
   *
   * @param person - The object to extract the header
   * @return - The header in csv format
   */
  public String generateCSVHeader(Person person) {
    StringBuilder header = new StringBuilder();

    List<Field> fields = this.getFields(person);
    for (int i = 0; i < fields.size(); i++) {
      header.append(fields.get(i).getName()); // add attribute name
      if (i != fields.size() - 1) {  // if not last attribute add separator
        header.append(SEPARATOR);
      } else {  // if last attribute add new line
        header.append(NEW_LINE);
      }
    }
    return header.toString();
  }

  /**
   *
   * @param persons
   * @return
   */
  public String generateCSVContent(List<Person> persons) {
    StringBuilder csvContent = new StringBuilder();
    try {
      for(Person person : persons) {
        List<Field> fields = this.getFields(person);
        for (int i = 0; i < fields.size(); i++) {
          csvContent.append(fields.get(i).get(person)); // add attribute name
          if (i != fields.size() - 1) {  // if not last attribute add separator
            csvContent.append(SEPARATOR);
          } else {  // if last attribute add new line
            csvContent.append(NEW_LINE);
          }
        }
      }
    } catch(Exception e) {
      System.out.println("Could not access value");
      System.out.println(e);
    }
    return csvContent.toString();
  }


}



