package com.jooohhn.java_interview_prep.leetcode.algorithms;

import java.util.HashMap;

/**
 * #1 Easy
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a
 * specific target. You may assume that each input would have exactly one solution, and you may not
 * use the same element twice.
 */
public class TwoSum {

  /** @Time: O(n^2) @Space: O(1) */
  public int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return null;
  }

  /**
   * @Time: O(n) @Space: O(n)
   *
   * Save remainders so that we can reference them later for O(n) performance
   */
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int remainder = target - nums[i];

      if (map.containsKey(remainder)) {
        return new int[] {map.get(remainder), i};
      } else {
        map.put(nums[i], i);
      }
    }

    throw new IllegalArgumentException("Exists no two sum solution");
  }
}
