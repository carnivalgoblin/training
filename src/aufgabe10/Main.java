package aufgabe10;

public class Main {

  public static void main(String[] args) {

    Vector v1 = new Vector(5,7,6);
    Vector v2 = new Vector(10,8,6);


    System.out.println(VectorUtils.dotProduct(v1, v2));

    System.out.println(VectorUtils.crossProduct(v1, v2));

    System.out.println(VectorUtils.addVector(v1, v2));

    System.out.println(VectorUtils.subtractVector(v1, v2));
  }

}
