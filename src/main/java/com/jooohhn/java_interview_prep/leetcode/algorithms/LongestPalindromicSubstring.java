package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * #5 (Medium)
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum
 * length of s is 1000.
 *
 * Solution: Expand around every given character in the String, checking if the expanded string is a
 * valid palindrome.
 *
 * @1) For every character, find its longest palindrome.
 * @1a) If that palindrome is longer than the current palindrome, make it the new palindrome
 */
public class LongestPalindromicSubstring {

  private int maxStart = 0;
  private int maxLength = 0;

  /**
   *
   * @Time: O(n^2) - For n characters/palindromes, will extend by n - 1 characters
   * @Space: O(1)
   */
  public String longestPalindrome(String s) {
    if (s.length() <= 1) {
      return s;
    }

    for (int i = 0; i < s.length() - 1; i++) {
        extendPalindrome(s, i, i);  //Checks palindromes of odd lengths
        extendPalindrome(s, i, i + 1); // Checks palindromes of even lengths
    }

    return s.substring(this.maxStart, this.maxStart + this.maxLength);
  }

  private void extendPalindrome(String s, int start, int last) {
    while (start >= 0 && last < s.length()&& s.charAt(start) == s.charAt(last)) {
      start--;
      last++;
    }

    // If new palindrome > current, need to dec/inc to undo effect of loop's recent mutation
    if (last - start - 1 > maxLength) {
      this.maxStart = start + 1;
      this.maxLength = last - start - 1;
    }
  }

  public static void main(String[] args) {
    LongestPalindromicSubstring tester = new LongestPalindromicSubstring();
    System.out.println(tester.longestPalindrome("abb"));
  }
}
