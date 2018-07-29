package com.jooohhn.java_interview_prep.ctci_ch1;

/**
 * There are three types of edits that can be performed on strings: insert a character, remove a
 * character, or replace a character. Given two strings, write a function to check if they are one
 * edit (or zero edits) away.
 *
 * Solution - 1) If characters are equal length, iterate through both strings making sure only
 * one character is changed 2) If characters are different lengths, iterate through both strings
 * making sure only one character is added
 */
public class Q1_5 {

  /** Time: O(n) Space: O(1) */
  public static boolean oneAway(String str1, String str2) {
    if (str1.length() == str2.length()) {
      return stringsEqualLength(str1, str2);
    }
    return stringsNotEqualLength(str1, str2);
  }

  private static boolean stringsEqualLength(String str1, String str2) {
    boolean hasChanged = false;
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        if (hasChanged) {
          return false;
        } else {
          hasChanged = true;
        }
      }
    }
    return true;
  }

  private static boolean stringsNotEqualLength(String str1, String str2) {
    if (Math.abs(str1.length() - str2.length()) != 1) {
      return false;
    }
    int longerStrIndex = 0;
    int shorterStrIndex = 0;
    String longerStr = str1.length() > str2.length() ? str1 : str2;
    String shorterStr = str1.length() < str2.length() ? str1 : str2;
    boolean hasChanged = false;
    while (shorterStrIndex != shorterStr.length()) {
      if (shorterStr.charAt(shorterStrIndex) != longerStr.charAt(longerStrIndex)) {
        if (hasChanged) {
          return false;
        } else {
          hasChanged = true;
          longerStrIndex++;
        }
      }
      longerStrIndex++;
      shorterStrIndex++;
    }
    return true;
  }
}
