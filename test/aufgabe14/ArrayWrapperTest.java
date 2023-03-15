package aufgabe14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

  ArrayWrapper arr = new ArrayWrapper(6);

  @Test
  void shouldAddInteger() {
    arr.addElement(3,5);

    assertEquals(arr.getArr(3), 5);
    assertEquals(Integer.class, arr.getArr(3).getClass());
  }

  @Test
  void shouldAddString() {
    arr.addElement(3,"Hello");

    assertEquals(arr.getArr(3), "Hello");
    assertEquals(String.class, arr.getArr(3).getClass());
  }

  @Test
  void arraySizeCorrect() {
    assertEquals(6, arr.getArraySize());
  }

  @Test
  void shouldCountElements() {
    arr.addElement(3,5);
    arr.addElement(4,5);

    assertEquals(2, arr.getElementCount());
  }
}