package com.jooohhn.java_interview_prep.ctci_ch2;

import static org.junit.Assert.assertEquals;

import com.jooohhn.java_interview_prep.datastructures.LinkedList;
import org.junit.Test;

public class Q2_2Test {

  @Test
  public void returnKthToLast() throws Exception {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insertLast(0);
    linkedList.insertLast(1);
    linkedList.insertLast(2);
    linkedList.insertLast(3);
    linkedList.insertLast(4);
    linkedList.insertLast(5);
    linkedList.insertLast(6);
    assertEquals(6, Q2_2.returnKthToLast(linkedList, 1));
    assertEquals(5, Q2_2.returnKthToLast(linkedList, 2));
    assertEquals(4, Q2_2.returnKthToLast(linkedList, 3));
    assertEquals(3, Q2_2.returnKthToLast(linkedList, 4));
    assertEquals(2, Q2_2.returnKthToLast(linkedList, 5));
    assertEquals(1, Q2_2.returnKthToLast(linkedList, 6));
    assertEquals(0, Q2_2.returnKthToLast(linkedList, 7));
  }
}
