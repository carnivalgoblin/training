package aufgabe23;

public class Main {
  public static void main(String[] args) {
    Server s1 = new Server();

    System.out.println(s1.getCpu().getName());
    System.out.println(s1.getGpu().getName());
    System.out.println(s1.getRam().getName());
    System.out.println(s1.getRam().getSize());
  }
}
