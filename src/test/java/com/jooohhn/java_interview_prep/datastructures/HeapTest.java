package com.jooohhn.java_interview_prep.datastructures;

import static org.junit.Assert.assertEquals;

import com.jooohhn.java_interview_prep.helpers.HelperFunctions;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class HeapTest {

  private Heap heap;

  @Before
  public void beforeEach() {
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 10000; i++) {
      arr.add(HelperFunctions.getRandomIntegerRange(0, 1000));
    }
    this.heap = new Heap(arr);
  }

  @Test
  public void generalCase() throws Exception {
    assertEquals(true, heap.verifyIntegrity());
  }

  @Test
  public void insert() throws Exception {
    heap.insert(10000);
    heap.insert(20000);
    assertEquals(20000, heap.extractMax());
    assertEquals(10000, heap.getMax());
  }
}
