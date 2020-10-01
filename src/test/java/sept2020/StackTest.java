package sept2020;

import contracts.AbstractStack;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
  AbstractStack stack;
  @Rule
  public ExpectedException exceptionRule = ExpectedException.none();

  @BeforeEach
  public void initBeforeEachTest() {
    stack = new StackSaif();
  }

  @Test
  public void testPushPop() {
    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertEquals(3, stack.size());

    assertEquals(3, stack.pop());
    assertEquals(2, stack.size());
    assertEquals(2, stack.pop());
    assertEquals(1, stack.size());
    assertEquals(1, stack.pop());
    assertEquals(0, stack.size());
  }

  @Test
  public void testPopEmpty() {
    exceptionRule.expect(IllegalStateException.class);
  }
}
