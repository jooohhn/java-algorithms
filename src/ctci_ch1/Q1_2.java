package ctci_ch1;

import java.util.HashMap;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 *
 * Solution - 1) Create two hash tables 2) Add all characters of str1 to map1 and str2 to map2 3)
 * Iterate through one of the strings to see if character count is equal
 */
public class Q1_2 {

  /**
   * Works on the fact that string permutations have the same characters, just different orders
   * Time: O(n) Space: O(n)
   */
  public static boolean isPermutation(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();

    // Add/increment each character in str1 and str2 to respective maps
    for (int i = 0; i < str1.length(); i++) {
      if (map1.get(str1.charAt(i)) == null) {
        map1.put(str1.charAt(i), 1);
      } else {
        map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
      }

      if (map2.get(str2.charAt(i)) == null) {
        map2.put(str2.charAt(i), 1);
      } else {
        map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
      }
    }

    // If count isn't equal, then strings aren't permutations of each other
    for (int i = 0; i < str1.length(); i++) {
      if (map1.get(str1.charAt(i)) != map2.get(str1.charAt(i))) {
        return false;
      }
    }
    return true;
  }

}
