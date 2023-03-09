package aufgabe6;

import java.util.Scanner;

public class KleinstesGemeinsamesVielfaches {

  public static void main(String[] args) {

    Scanner divisor1 = new Scanner(System.in);
    System.out.println("Divisor 1:");
    int div1 = Integer.parseInt(divisor1.nextLine());

    Scanner divisor2 = new Scanner(System.in);
    System.out.println("Divisor 2:");
    int div2 = Integer.parseInt(divisor2.nextLine());

    if (div1 <= 0 || div2 <= 0) {
      System.out.println("Bitte nur positive, ganze Zahlen eingeben.");
    } else if (smallestDivisor(div1, div2) == 0) {
      System.out.println("Wert liegt außerhalb der Berechnungsmöglichkeit.");
    } else {
      System.out.println("Das kleinste gemeinsame Vielfache von " + div1 + " und " + div2 + " ist " + smallestDivisor(div1, div2));
    }
  }

  public static int smallestDivisor(int div1, int div2) {

    if (div1 == div2) {
      return div1;
    } else if (div1 > div2) {
      int i = 1;
      int rest = div2 % div1;
      while (rest > 0) {
        rest = (div2 * i) % div1;
        i++;
      }
      if (((i - 1) * div2) < 0) {
        return 0;
      } else {
        return (i - 1) * div2;
      }
    } else {
      int i = 1;
      int rest = div1 % div2;
      while (rest > 0) {
        rest = (div1 * i) % div2;
        i++;
      }
      return (i - 1) * div1;
    }

  }

}
