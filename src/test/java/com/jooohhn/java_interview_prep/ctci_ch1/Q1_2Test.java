package com.jooohhn.java_interview_prep.ctci_ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q1_2Test {

  @Test
  public void isPermutation() throws Exception {
    assertEquals(true, Q1_2.isPermutation("ABCDE", "DBECA"));
    assertEquals(true, Q1_2.isPermutation("DBECA", "ABCDE"));
    assertEquals(true, Q1_2.isPermutation("foo", "ofo"));
    assertEquals(true, Q1_2.isPermutation("", ""));
    assertEquals(false, Q1_2.isPermutation("foo", "bar"));
    assertEquals(false, Q1_2.isPermutation("nautilus", "king kong"));
  }
}
