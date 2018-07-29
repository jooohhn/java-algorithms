package com.jooohhn.java_interview_prep.leetcode.algorithms;

import java.util.HashSet;

/**
 * #3 (Medium) Given a string, find the length of the longest substring without repeating
 * characters.
 *
 * Solution: Use a "sliding window"
 * @1) For each character in the string, create a sliding window
 * of duplicate characters
 * @2) If longest is reassigned, then we can assume all characters between
 * back and front have no duplicates
 * @Time: O(n) - Each character is visited only twice (by front
 * and back)
 * @Space: O(n) - Uses a HashSet whose max size is legnth of string
 */
public class LongestSubstringWithoutRepeatingCharacters {

  public static int longestSubstringWithoutRepeatingCharacters(String s) {
    int longest = 0, front = 0, back = 0;
    HashSet<Character> set = new HashSet<>();
    while (front < s.length() && back < s.length()) {
      if (set.contains(s.charAt(front))) {
        set.remove(s.charAt(back));
        back++;
      } else {

        set.add(s.charAt(front));
        front++;
        longest = Math.max(front - back, longest);
      }
    }
    return longest;
  }
}
