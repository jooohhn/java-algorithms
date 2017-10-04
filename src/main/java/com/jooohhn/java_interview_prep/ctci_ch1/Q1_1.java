package com.jooohhn.java_interview_prep.ctci_ch1;

import java.util.HashSet;

/**
 * Implement an algorithm to determines if a string has all unique characters. What if you cannot
 * use additional data structures?
 *
 * <p>Solution - isUnique: Add characters to a set. If character appears twice, return false
 * isUniqueSlow: Check each element in a nested for loop
 */
public class Q1_1 {

  /** Time: O(n) Space: O(n) */
  public static boolean isUnique(String str) {
    HashSet<Character> set = new HashSet<Character>();
    for (int i = 0; i < str.length(); i++) {
      if (set.contains(str.charAt(i))) {
        return false;
      }
      set.add(str.charAt(i));
    }
    return true;
  }

  /** Time: O(n^2) Space: O(1) */
  public static boolean isUniqueSlow(String str) {
    for (int i = 0; i < str.length() - 1; i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }
}
