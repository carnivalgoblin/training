package aufgabe7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberGuess {

  public static void main(String[] args) {

    System.out.println("In diesem Spiel wird eine zufällige Zahl zwischen 0 und 100 generiert.");
    System.out.println("Aufgabe ist es mit einer vorher festgelegten Anzahl an Versuchen die Zahl zu erraten.");

    Scanner sc1 = new Scanner(System.in);
    System.out.println("Wieviele Versuche willst du haben?");
    int tries = Integer.parseInt(sc1.nextLine());

    final int randomNumber = (int) (Math.random() * 100);
    boolean guessCorrect = false;
    boolean tooManyTries = false;
    int usedTries = 1;

    while (guessCorrect == false && tooManyTries == false) {
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Bitte gib eine Zahl ein:");
      int guess = Integer.parseInt(sc2.nextLine());

      // System.out.println(randomNumber);

      if (guess == randomNumber && usedTries <= tries) {
        System.out.println("Gewonnen! Richtig geraten. Die zufällige Zahl war: " + randomNumber);
        guessCorrect = true;
      } else if (guess < randomNumber && usedTries < tries) {
        System.out.println("Die gesuchte Zahl ist größer.");
        usedTries++;
      } else if (guess > randomNumber && usedTries < tries) {
        System.out.println("Die gesuchte Zahl ist kleiner.");
        usedTries++;
      } else if (guess != randomNumber && usedTries >= tries) {
        System.out.println("Du hast leider zu viele Versuche gebraucht. Die gesuchte Zahl war: " + randomNumber);
        tooManyTries = true;
      }

    }

  }

}
