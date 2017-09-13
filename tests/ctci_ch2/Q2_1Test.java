package ctci_ch2;

import static org.junit.Assert.assertEquals;

import datastructures.LinkedList;
import datastructures.LinkedList.Node;
import org.junit.Test;

public class Q2_1Test {

  @Test
  public void removeDupsGeneral() throws Exception {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insertLast(0);
    linkedList.insertLast(1);
    linkedList.insertLast(2);
    linkedList.insertLast(3);
    linkedList.insertLast(2);
    linkedList.insertLast(3);
    linkedList.insertLast(4);
    linkedList.insertLast(3);
    linkedList.insertLast(5);
    linkedList.insertLast(1);
    linkedList.insertLast(3);
    linkedList.insertLast(4);
    linkedList.insertLast(5);
    Q2_1.removeDups(linkedList);
    Node currentNode = linkedList.head;
    for (int i = 0; i < 6; i++) {
      assertEquals(i, currentNode.data);
      currentNode = currentNode.next;
    }
  }

  @Test
  public void removeDupsNoDups() throws Exception {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insertLast(0);
    linkedList.insertLast(1);
    linkedList.insertLast(2);
    linkedList.insertLast(3);
    linkedList.insertLast(4);
    linkedList.insertLast(5);
    linkedList.insertLast(6);

    Q2_1.removeDups(linkedList);
    Node currentNode = linkedList.head;
    for (int i = 0; i < 6; i++) {
      assertEquals(i, currentNode.data);
      currentNode = currentNode.next;
    }
  }

}