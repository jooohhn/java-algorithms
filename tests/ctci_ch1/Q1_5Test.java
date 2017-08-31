package ctci_ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q1_5Test {

  @Test
  public void oneAway() throws Exception {
    assertEquals(true, Q1_5.oneAway("pale", "ple"));
    assertEquals(true, Q1_5.oneAway("pales", "pale"));
    assertEquals(true, Q1_5.oneAway("pale", "bale"));
    assertEquals(true, Q1_5.oneAway("pale", "pale"));
    assertEquals(true, Q1_5.oneAway("a", "b"));
    assertEquals(true, Q1_5.oneAway("", ""));
    assertEquals(false, Q1_5.oneAway("pales", "bale"));
    assertEquals(false, Q1_5.oneAway("pale", "bake"));
    assertEquals(false, Q1_5.oneAway("pale", "paless"));
  }

}