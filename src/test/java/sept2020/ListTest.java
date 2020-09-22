package sept2020;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class ListTest {
  LinkedListSaif list;

  @BeforeEach
  public void initBeforeEachTest() {
    list = new LinkedListSaif();
  }

  @Test
  @DisplayName("append to end")
  public void testAppend() {
    list.append(1);
    list.append(2);
    list.append(3);
    assertEquals(3, list.size());

    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
    assertEquals(3, list.get(2));
  }

  @Test
  @DisplayName("add to front")
  public void testAddToFront() {
    list.addToFront(3);
    list.addToFront(2);
    list.addToFront(1);
    assertEquals(3, list.size());

    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
    assertEquals(3, list.get(2));
  }

  @Test
  @DisplayName("get by index")
  public void testGet() {
    list.addToFront(3);
    list.addToFront(2);
    list.addToFront(1);
    assertEquals(3, list.size());

    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
    assertEquals(3, list.get(2));
  }

  @Test
  @DisplayName("delete by index")
  public void testDelete() {
    list.append(1);
    list.append(2);
    list.append(3);
    assertEquals(3, list.size());

    list.delete();

    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
    assertEquals(3, list.get(2));
  }
}
