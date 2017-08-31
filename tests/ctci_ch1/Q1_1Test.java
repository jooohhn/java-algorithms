package ctci_ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q1_1Test {

  @Test
  public void isUnique() throws Exception {
    assertEquals(true, Q1_1.isUnique("john"));
    assertEquals(true, Q1_1.isUniqueSlow("john"));
    assertEquals(true, Q1_1.isUnique("j"));
    assertEquals(true, Q1_1.isUniqueSlow("j"));
    assertEquals(true, Q1_1.isUnique(""));
    assertEquals(true, Q1_1.isUniqueSlow(""));
    assertEquals(false, Q1_1.isUnique("hello"));
    assertEquals(false, Q1_1.isUniqueSlow("AA"));
  }

}