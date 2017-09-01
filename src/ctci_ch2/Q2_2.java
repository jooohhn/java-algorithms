package ctci_ch2;


import ctci_ch2.LinkedList.Node;

/**
 * Return Kth to Last: Create an algorithm to find the kth to last element of a singly linked list.
 * Solution Use a second pointer that is k elements behind the first. Once the first becomes null,
 */
class Q2_2 {

  /**
   * Algorithm uses custom LinkedList class so that algorithm has access to nodes for fast deletion.
   * Assume k is a valid number
   */
  public static int returnKthToLast(LinkedList<Integer> linkedList, int k) {
    Node front = linkedList.head;

    for (int i = 1; i <= k; i++) {
      front = front.next;

    }
    Node back = linkedList.head;

    while (front != null) {
      front = front.next;
      back = back.next;
    }

    return (int) back.data;
  }
}
