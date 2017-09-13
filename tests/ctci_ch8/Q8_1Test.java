package ctci_ch8;

import static ctci_ch8.Q8_1.tripleStep;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q8_1Test {

  @Test
  public void tripleStepTest() throws Exception {
    assertEquals(1, tripleStep(1));
    assertEquals(2, tripleStep(2));
    assertEquals(4, tripleStep(3));
    assertEquals(7, tripleStep(4));
    assertEquals(13, tripleStep(5));
  }

}