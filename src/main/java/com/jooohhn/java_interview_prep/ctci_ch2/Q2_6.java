package com.jooohhn.java_interview_prep.ctci_ch2;

import com.jooohhn.java_interview_prep.datastructures.LinkedList;
import com.jooohhn.java_interview_prep.datastructures.LinkedList.Node;

/**
 * Implement a function to check if a linked list is a palindrome.
 *
 * Solution: Palindromes can only have 1 character with an odd count
 */
public class Q2_6 {

  /** Time: O(n) Space: O(n) */
  public static boolean isPalindrome(LinkedList<Character> linkedList) {
    Node currentNode = linkedList.head;
    LinkedList<Character> reversed = new LinkedList<>();

    while (currentNode != null) {
      char character = (Character) currentNode.data;
      reversed.insertFirst(character);
      currentNode = currentNode.next;
    }

    Node originalNode = linkedList.head;
    Node reverseNode = reversed.head;

    while (originalNode != null) {
      if (originalNode.data != reverseNode.data) {
        return false;
      }
      originalNode = originalNode.next;
      reverseNode = reverseNode.next;
    }

    return true;
  }
}
