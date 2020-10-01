package sept2020;

import contracts.AbstractQueue;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
  AbstractQueue queue;
  @Rule
  public ExpectedException exceptionRule = ExpectedException.none();

  @BeforeEach
  public void initBeforeEachTest() {
    queue = new QueueSaif();
  }

  @Test
  public void testPushPop() {
    queue.push(1);
    queue.push(2);
    queue.push(3);

    assertEquals(3, queue.size());

    assertEquals(3, queue.pop());
    assertEquals(2, queue.size());
    assertEquals(2, queue.pop());
    assertEquals(1, queue.size());
    assertEquals(1, queue.pop());
    assertEquals(0, queue.size());
  }

  @Test
  public void testPopEmpty() {
    exceptionRule.expect(IllegalStateException.class);
  }
}
