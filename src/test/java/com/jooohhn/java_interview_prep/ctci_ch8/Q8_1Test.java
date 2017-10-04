package com.jooohhn.java_interview_prep.ctci_ch8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q8_1Test {

  @Test
  public void tripleStepTest() throws Exception {
    assertEquals(1, Q8_1.tripleStep(1));
    assertEquals(2, Q8_1.tripleStep(2));
    assertEquals(4, Q8_1.tripleStep(3));
    assertEquals(7, Q8_1.tripleStep(4));
    assertEquals(13, Q8_1.tripleStep(5));
  }
}
