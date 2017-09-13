package leetcode.algorithms;


/**
 * @TODO: Finish this #5 (Medium) Given a string s, find the longest palindromic substring in s. You
 * may assume that the maximum length of s is 1000.
 *
 * Solution: Using a sliding window
 *
 * 1) For each substring iterated, see if the entire substring is a palindrome (use the HashMap)
 */
public class LongestPalindromicSubstring {

  public String longestPalindrome(String s) {
    int front = 0, back = 0;
    String longest = "";

    return longest;
  }

  public static boolean isPalindrome(String str) {
    int front = 0, back = str.length() - 1;
    while (front < back) {
      if (str.charAt(front) != str.charAt(back)) {
        return false;
      }
      front++;
      back--;
    }
    return true;
  }
}
