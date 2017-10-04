package com.jooohhn.java_interview_prep.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

  private Queue<Integer> queue = new Queue<>();

  @Before
  public void beforeEach() throws Exception {
    this.queue.add(1);
    this.queue.add(2);
    this.queue.add(3);
    this.queue.add(4);
    this.queue.add(5);
  }

  @After
  public void afterEach() throws Exception {
    this.queue.clear();
  }

  @Test
  public void addAndPeak() throws Exception {
    assertEquals(new Integer(1), this.queue.peek());
    this.queue.add(6);
    assertEquals(new Integer(1), this.queue.peek());
  }

  @Test
  public void remove() throws Exception {
    assertEquals(new Integer(1), this.queue.remove());
    assertEquals(new Integer(2), this.queue.remove());
    assertEquals(new Integer(3), this.queue.remove());
    assertEquals(new Integer(4), this.queue.remove());
    assertEquals(new Integer(5), this.queue.remove());
  }

  @Test
  public void edgeCases() throws Exception {
    assertEquals(this.queue.remove(), new Integer(1));
    assertEquals(false, this.queue.isEmpty());
    this.queue.clear();
    assertEquals(true, this.queue.isEmpty());
    try {
      this.queue.peek();
    } catch (Exception e) {
      assertEquals("Can't peek from empty queue", e.getMessage());
    }
    try {
      this.queue.remove();
    } catch (Exception e) {
      assertEquals("Can't remove from empty queue", e.getMessage());
    }
  }
}
