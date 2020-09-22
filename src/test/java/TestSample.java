import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class TestSample {

  private final Sample sample = new Sample();

  @BeforeAll
  static void initAll() {
  }

  @BeforeEach
  void init() {
  }

  @DisplayName("A negative value for year is not supported by the leap year computation.")
  @Test
  public void testMethod() {
    int input = 77;
    assertEquals(input, sample.sample(input));
    assertTrue(input == 77);
  }

  @AfterEach
  void tearDown() {
  }

  @AfterAll
  static void tearDownAll() {
  }

}
