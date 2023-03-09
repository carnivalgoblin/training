package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

  @Test
  public void should_correctly_sort_mixed_arrays() {
    final int[] unsorted1 = {};
    final int[] unsorted2 = { 1 };
    final int[] unsorted3 = { 2, 1 };
    final int[] unsorted4 = { 2, 1, 3 };
    final int[] unsorted5 = { 2, 4, 1, 3 };
    final int[] unsorted6 = { 2, 1, 2, 3, 9 };
    final int[] unsorted7 = { 1, 2, 3, 4, 5, 6 };

    final int[] expected1 = {};
    final int[] expected2 = { 1 };
    final int[] expected3 = { 1, 2 };
    final int[] expected4 = { 1, 2, 3 };
    final int[] expected5 = { 1, 2, 3, 4 };
    final int[] expected6 = { 1, 2, 2, 3, 9 };
    final int[] expected7 = { 1, 2, 3, 4, 5, 6 };

    assertArrayEquals(expected1, new BubbleSort().sort(unsorted1));
    assertArrayEquals(expected2, new BubbleSort().sort(unsorted2));
    assertArrayEquals(expected3, new BubbleSort().sort(unsorted3));
    assertArrayEquals(expected4, new BubbleSort().sort(unsorted4));
    assertArrayEquals(expected5, new BubbleSort().sort(unsorted5));
    assertArrayEquals(expected6, new BubbleSort().sort(unsorted6));
    assertArrayEquals(expected7, new BubbleSort().sort(unsorted7));
  }

}