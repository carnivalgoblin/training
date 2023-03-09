package kassenbon;

import java.util.ArrayList;
import java.util.Scanner;

public class Kassenbon {

  public static void main(String[] args) {

    enum Produkte {
      WURST,
      KÄSE,
      MILCH,
      BROT,
      BIER
    }

    boolean doneShopping = false;



    while (doneShopping == false) {
      Scanner inputProduct = new Scanner(System.in);
      System.out.println("Bitte Produkt angeben:");
      String product = inputProduct.nextLine();
      addToCart(product);

      Scanner inputDone = new Scanner(System.in);
      System.out.println("Sind Sie fertig mit einkaufen? [y/n]");
      String doneCheck = inputDone.nextLine();

      if (doneCheck == "y") {
        doneShopping = true;
      }

    }
      System.out.println("Kassenbon");


  }

  public static ArrayList<String> addToCart(String product) {
    ArrayList<String> warenkorb = new ArrayList<String>();
    warenkorb.add(product);
    System.out.println(warenkorb);
    return warenkorb;
  }




}
