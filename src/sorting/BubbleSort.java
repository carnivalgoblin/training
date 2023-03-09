package sorting;

public class BubbleSort {

  /**
   * This method sorts an array of integers using the bubble sort algorithm.
   * The input is an array of integers to be sorted, and the output is the sorted array.
   * The bubble sort algorithm repeatedly steps through the list to be sorted,
   * compares each pair of adjacent items and swaps them if they are in the wrong order.
   * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
   *
   * @param numbers The array of integers to be sorted
   * @return The sorted array of integers
   */

  public int[] sort(int[] numbers) {

    for (int i = 0; i < numbers.length - 1; i++) {

      for (int j = 0; j < numbers.length - i - 1; j++) {

        if (numbers[j] > numbers[j + 1]) {
          final int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    return numbers;
  }

}
