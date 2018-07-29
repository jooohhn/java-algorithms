package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * #19 (Medium) Given a linked list, remove the nth node from the end of list and return its head.
 *
 * Solution: @1) Send a runner out that is n distances away from the front @2) Since this is a
 * singly linked list, need to assign the front a dummy node @3) Have an edge case if the node to
 * delete is the head @Time: O(n) @Space: O(n)
 */
public class RemoveNthFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode front = head;
    ListNode back = new ListNode(0);
    back.next = front;

    for (int i = 1; i < n; i++) {
      front = front.next;
    }

    front = front.next;
    while (front != null) {
      front = front.next;
      back = back.next;
    }
    if (back.next == head) {
      return head.next;
    }
    back.next = back.next.next;
    return head;
  }

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
