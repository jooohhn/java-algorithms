package com.jooohhn.java_interview_prep.ctci_ch1;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is
 * a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of
 * letters. The palindrome does not need to be limited to just dictionary words. Solution - 1)
 * Create a <Character, Integer> HashMap 2) Get the count of each character in str 3) Check that
 * there's only 1 odd numbered character
 */
public class Q1_4 {

  /**
   * Works on the fact that palindromes have at most 1 odd character count Time: O(n) Space: O(n)
   */
  public static boolean isPermutationPalindrome(String str) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      if (map.get(str.charAt(i)) == null) {
        map.put(str.charAt(i), 1);
      } else {
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
      }
    }

    boolean oddFlag = false;
    for (Character character : map.keySet()) {
      if (map.get(character) % 2 != 0) {
        if (oddFlag) {
          return false;
        }
        oddFlag = true;
      }
    }
    return true;
  }
}
