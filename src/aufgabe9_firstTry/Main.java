package aufgabe9_firstTry;

import java.util.Scanner;

public class Main {

  private static double x;
  private static double y;

  public static void main(String[] args) {

  Scanner inputX = new Scanner(System.in);
  System.out.println("Bitte X Koordinate für neuen Punkt angeben:");
  double newX = inputX.nextDouble();
  //p1.setX(newX);

  Scanner inputY = new Scanner(System.in);
  System.out.println("Bitte X Koordinate für neuen Punkt angeben:");
  double newY = inputX.nextDouble();
  //p1.setY(newY);

  //System.out.println(p1);

  Scanner scanner = new Scanner(System.in);
  System.out.println("Möchten Sie die Koordinaten verändern? add/sub/mul/div/no");
  String chooseMethod = scanner.nextLine();

  // CALL ARITHMETIC METHODS
  switch (chooseMethod) {
    case "add" -> {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den zu addierenden Vektor für die X Koordinate ein:");
      double addX = sc1.nextDouble();
      System.out.println("Bitte geben Sie den zu addierenden Vektor für die Y Koordinate ein:");
      double addY = sc1.nextDouble();

     // p1.addPoint(addX, addY);

     // System.out.println("Neue Koordinaten: " + p1);

    }
    case "sub" -> {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den zu subtrahierenden Vektor für die X Koordinate ein:");
      double subX = sc1.nextDouble();
      System.out.println("Bitte geben Sie den zu subtrahierenden Vektor für die Y Koordinate ein:");
      double subY = sc1.nextDouble();

      // p1.subtractPoint(subX, subY);

     // System.out.println("Neue Koordinaten: " + p1);

    }
    case "mul" -> {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den multipilzierenden Faktor für die X Koordinate ein:");
      double mulX = sc1.nextDouble();
      System.out.println("Bitte geben Sie den multipilzierenden Faktor für die Y Koordinate ein:");
      double mulY = sc1.nextDouble();

     // p1.multiplyPoint(mulX, mulY);

     // System.out.println("Neue Koordinaten: " + p1);

    }
    case "div" -> {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Bitte geben Sie den dividierenden Faktor für die X Koordinate ein:");
      double divX = sc1.nextDouble();
      System.out.println("Bitte geben Sie den dividierenden Faktor für die Y Koordinate ein:");
      double divY = sc1.nextDouble();

     // p1.dividePoint(divX, divY);

     // System.out.println("Neue Koordinaten: " + p1);

    }
    default -> System.out.println("Koordinaten nicht verändert.");
  }
}
}