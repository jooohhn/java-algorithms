package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * #2 Easy
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by
 * splicing together the nodes of the first two lists.
 *
 * Solution @1) If l1 or l2 are null, return the other @2) newList will point to the whole list,
 * current will be the iterator @3) Concat each node depending on what is greater @4) Clean up at
 * the end by appending the remaining non null list @Time: O(n) @Space: O(1)
 */
public class MergeTwoSortedLists {

  public static ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    // Can assume l1 and l2 aren't null
    ListNode newList;
    ListNode current;
    if (l1.val < l2.val) {
      newList = l1;
      current = newList;
      l1 = l1.next;
    } else {
      newList = l2;
      current = newList;
      l2 = l2.next;
    }

    // Can assume l1 and l2 aren't null
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        current.next = l1;
        current = current.next;
        l1 = l1.next;
      } else {
        current.next = l2;
        current = current.next;
        l2 = l2.next;
      }
    }

    if (l1 == null) {
      current.next = l2;
    } else {
      current.next = l1;
    }

    return newList;
  }

  public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    if (l1.val < l2.val) {
      l1.next = mergeTwoListsRecursive(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoListsRecursive(l1, l2.next);
      return l2;
    }
  }

  private class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
