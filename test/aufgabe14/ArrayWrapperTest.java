package aufgabe14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

  ArrayWrapper arr = new ArrayWrapper(6);

  @Test
  void addedElementCorrectPosition() {
    arr.addElement(3,5);

    assertTrue(arr.getElement(3) != 0);
  }

  @Test
  void getElementCorrect() {
    arr.addElement(3,5);

    assertEquals(5, arr.getElement(3));
  }

  @Test
  void arraySizeCorrect() {
    assertEquals(6, arr.getArraySize());
  }

  @Test
  void elementCountCorrect() {
    arr.addElement(3,5);
    arr.addElement(4,5);

    assertEquals(arr.getElementCount(), 2);
  }
}