package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * #2 (Medium) You are given two non-empty linked lists representing two non-negative integers. The
 * digits are stored in reverse order and each of their nodes contain a single digit. Add the two
 * numbers and return it as a linked list. You may assume the two numbers do not contain any leading
 * zero, except the number 0 itself.
 *
 * <p>Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Definition for singly-linked list.
 * public class ListNode { int val; ListNode next; ListNode(int x) { val = x; } }
 *
 * <p>Solution: 1) Have a helper method that takes a carry 2) Calculate the value for the current
 * digit 3) Modify node.val and pass a carry if possible @Time: O(k) where k is the length of the
 * longest list @Space: O(k) Space where k is the length of the longest list
 */
class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return helper(l1, l2, 0);
  }

  private ListNode helper(ListNode l1, ListNode l2, int carry) {
    if (l1 == null && l2 == null && carry == 0) {
      return null;
    }
    int val = carry;
    val += l1 != null ? l1.val : 0;
    val += l2 != null ? l2.val : 0;

    ListNode node = val >= 10 ? new ListNode(val - 10) : new ListNode(val);

    node.next = helper(l1 == null ? null : l1.next, l2 == null ? null : l2.next, val >= 10 ? 1 : 0);
    return node;
  }

  private class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
