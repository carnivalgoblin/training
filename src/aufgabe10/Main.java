package aufgabe10;

public class Main {

  public static void main(String[] args) {

    Vector v1 = new Vector(5,7,6);
    Vector v2 = new Vector(10,8,6);


    System.out.println("--------------------------------------------------------");
    System.out.println("Vektor 1: " + v1);
    System.out.println("Vektor 2: " + v2);
    System.out.println("--------------------------------------------------------");
    System.out.println("Skalarprodukt: " + VectorUtils.dotProduct(v1, v2));
    System.out.println("Skalardivision: " + VectorUtils.dotProductDivision(v1, v2));
    System.out.println("Kreuzprodukt: " + VectorUtils.crossProduct(v1, v2));
    System.out.println("Vektoraddition: " + VectorUtils.addVector(v1, v2));
    System.out.println("Vektorsubtraktion: " + VectorUtils.subtractVector(v1, v2));
    System.out.println("Länge des Vektors: " + VectorUtils.lengthVector(v1));
    System.out.println("--------------------------------------------------------");

  }

}
