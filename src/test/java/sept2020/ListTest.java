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
  public void addToFront() {
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
  public void getByIndex() {
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
  public void deleteByIndex() {
    list.append(1);
    list.append(2);
    list.append(3);

    list.deleteAt(1);
    assertEquals(2, list.size());
    assertEquals(1, list.get(0));
    assertEquals(3, list.get(1));
  }

  @Test
  @DisplayName("delete by value")
  public void deleteByValueNonExistingItem() {
    list.append(1);
    list.append(2);
    list.append(3);

    list.delete(7);
    assertEquals(3, list.size());
    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
    assertEquals(3, list.get(2));
  }

  @Test
  @DisplayName("delete by value")
  public void deleteByValueExistingItem() {
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(2);

    list.delete(2);
    assertEquals(3, list.size());
    assertEquals(1, list.get(0));
    assertEquals(3, list.get(1));
    assertEquals(2, list.get(2));
  }

  @Test
  @DisplayName("check if contains an existing item")
  public void containsExistingItem() {
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(2);

    assertEquals(true, list.contains(2));
  }

  @Test
  @DisplayName("search an non-existing item")
  public void containsNonExistingItem() {
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(2);

    assertEquals(false, list.contains(7));
  }

  @Test
  @DisplayName("search by an existing item")
  public void searchExistingItem() {
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(2);

    assertEquals(1, list.search(2));
  }

  @Test
  @DisplayName("search an non-existing item")
  public void searchNonExistingItem() {
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(2);

    assertEquals(-1, list.contains(7));
  }
}
