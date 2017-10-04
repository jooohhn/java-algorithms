package com.jooohhn.java_interview_prep.ctci_ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q1_4Test {

  @Test
  public void isPermutationPalindrome() throws Exception {
    assertEquals(true, Q1_4.isPermutationPalindrome("racecar"));
    assertEquals(true, Q1_4.isPermutationPalindrome("aecrerac"));
    assertEquals(true, Q1_4.isPermutationPalindrome(""));
    assertEquals(true, Q1_4.isPermutationPalindrome("a"));
    assertEquals(false, Q1_4.isPermutationPalindrome("hello"));
    assertEquals(false, Q1_4.isPermutationPalindrome("john"));
  }
}
