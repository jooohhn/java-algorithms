package com.jooohhn.java_interview_prep.ctci_ch2;

import static org.junit.Assert.assertEquals;

import com.jooohhn.java_interview_prep.datastructures.LinkedList;
import org.junit.Test;

public class Q2_6Test {

  @Test
  public void isPalindromeGeneral() throws Exception {
    Character[] arr1 = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
    LinkedList<Character> list1 = new LinkedList<>(arr1);
    assertEquals(true, Q2_6.isPalindrome(list1));

    Character[] arr2 = {'f', 'o', 'o'};
    LinkedList<Character> list2 = new LinkedList<>(arr2);
    assertEquals(false, Q2_6.isPalindrome(list2));
  }

  @Test
  public void isPalindromeEdge() throws Exception {
    Character[] arr1 = {'a'};
    LinkedList<Character> list1 = new LinkedList<>(arr1);
    assertEquals(true, Q2_6.isPalindrome(list1));

    Character[] arr2 = {};
    LinkedList<Character> list2 = new LinkedList<>(arr2);
    assertEquals(true, Q2_6.isPalindrome(list2));
  }
}
