package com.jooohhn.java_interview_prep.ctci_ch2;

import static org.junit.Assert.assertEquals;

import com.jooohhn.java_interview_prep.datastructures.LinkedList;
import com.jooohhn.java_interview_prep.datastructures.LinkedList.Node;
import com.jooohhn.java_interview_prep.helpers.HelperFunctions;
import org.junit.Test;

public class Q2_4Test {

  @Test
  public void partition() throws Exception {
    int pivot = 500;
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < 1000; i++) {
      linkedList.insertLast(HelperFunctions.getRandomIntegerRange(0, 1000));
    }
    Q2_4.partition(linkedList, pivot);
    Node currentNode = linkedList.head;

    // Makes sure that partition structure holds
    while ((int) currentNode.data < pivot) {
      assertEquals(true, (int) currentNode.data < pivot);
      currentNode = currentNode.next;
    }
    while (currentNode != null) {
      assertEquals(true, (int) currentNode.data >= pivot);
      currentNode = currentNode.next;
    }
  }
}
