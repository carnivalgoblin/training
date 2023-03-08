package aufgabe4;

public class DivisibleByTwo {

  private static final int DIVISOR = 2;

  /**
   * A number divided by two, which doesn't result in a rest of zero
   * is divisible by two.2
   * @param number dividend
   * @return boolean is number divisible by two
   */

  public static boolean isDivisibleByTwo(int number) {

    return number % DIVISOR == 0;

  }

}
