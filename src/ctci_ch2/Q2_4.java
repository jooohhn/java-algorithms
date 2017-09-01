package ctci_ch2;


import ctci_ch2.LinkedList.Node;

/**
 * Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. lf x is contained within the list, the values of x
 * only need to be after the elements less than x (see below).The partition element x can appear
 * anywhere in the "right partition"; it does not need to appear between the left and right
 * partitions.
 */
class Q2_4 {

  /**
   * Algorithm uses custom LinkedList class so that algorithm has access to nodes for fast deletion.
   * Time: O(n) Space: O(n)
   */
  public static void partition(LinkedList<Integer> linkedList, int pivot) {
    LinkedList<Integer> firstPartition = new LinkedList<>();
    LinkedList<Integer> secondPartition = new LinkedList<>();
    Node currentNode = linkedList.head;
    while (currentNode != null) {
      if ((int) currentNode.data < pivot) {
        firstPartition.insertFirst((int) currentNode.data);
      } else {
        secondPartition.insertFirst((int) currentNode.data);
      }
      currentNode = currentNode.next;
    }

    linkedList.clear();
    currentNode = firstPartition.head;
    while (currentNode != null) {
      linkedList.insertFirst((int) currentNode.data);
      currentNode = currentNode.next;
    }

    currentNode = secondPartition.head;

    while (currentNode != null) {
      linkedList.insertLast((int) currentNode.data);
      currentNode = currentNode.next;
    }
  }

}
