package ctci_ch2;


import datastructures.LinkedList;
import datastructures.LinkedList.Node;
import java.util.HashSet;

/**
 * Write code to remove duplicates from an unsorted linked list.
 *
 * Solution: Use a hash set to filter out repeated elements
 */
public class Q2_1 {

  /**
   * Algorithm uses custom LinkedList class so that algorithm has access to nodes for fast deletion.
   * Time: O(n) Space: O(n)
   */
  public static void removeDups(LinkedList<Integer> linkedList) {
    if (linkedList.head == null) {
      return;
    }

    HashSet<Integer> set = new HashSet<>();
    Node currentNode = linkedList.head;

    while (currentNode != null) {
      if (set.contains(currentNode.data)) {
        // Edge case exists where the tail has a duplicated value
        if (linkedList.tail == currentNode) {
          currentNode.prev.next = null;
          linkedList.tail = currentNode.prev;
        } else {
          currentNode.prev.next = currentNode.next;
          currentNode.next.prev = currentNode.prev;
        }
      }
      set.add((Integer) currentNode.data);
      currentNode = currentNode.next;
    }
  }
}
