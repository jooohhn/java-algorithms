package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * #461 (Easy) The Hamming distance between two integers is the number of positions at which the
 * corresponding bits are different. Given two integers x and y, calculate the Hamming distance.
 *
 * <p>Solution: Algorithm uses the short division by two method to divided x and y. If the remainder
 * is is different for any iteration, then that bit position have different corresponding bit
 * values @Time: O(lgk) where k is the largest integer. This is because k can only be divided lgk
 * times @Space: O(1) no additional data structures used
 */
public class HammingDistance {

  public static int hammingDistance(int x, int y) {
    int counter = 0;

    while (x != 0 || y != 0) {
      if (x % 2 != y % 2) {
        counter++;
      }
      x /= 2;
      y /= 2;
    }

    while (x != 0) {
      counter++;
      x /= 2;
    }

    while (y != 0) {
      counter++;
      y /= 2;
    }

    return counter;
  }
}
