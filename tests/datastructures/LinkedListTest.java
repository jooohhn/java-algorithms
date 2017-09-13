package datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

  private LinkedList<Integer> linkedList = new LinkedList();

  @Before
  public void beforeEach() throws Exception {
    this.linkedList.insertLast(1);
    this.linkedList.insertLast(2);
    this.linkedList.insertLast(3);
    this.linkedList.insertLast(4);
    this.linkedList.insertLast(5);
  }

  @After
  public void afterEach() throws Exception {
    this.linkedList.clear();
  }


  @Test
  public void headMethods() throws Exception {
    assertEquals(new Integer(1), this.linkedList.getFirst());
    assertEquals(new Integer(5), this.linkedList.getLast());
    this.linkedList.insertFirst(0);
    assertEquals(new Integer(0), this.linkedList.getFirst());
    assertEquals(new Integer(0), this.linkedList.removeFirst());
    assertEquals(new Integer(1), this.linkedList.getFirst());
  }

  @Test
  public void tailMethods() throws Exception {
    assertEquals(new Integer(1), this.linkedList.getFirst());
    assertEquals(new Integer(5), this.linkedList.getLast());
    this.linkedList.insertLast(6);
    assertEquals(new Integer(6), this.linkedList.getLast());
    assertEquals(new Integer(6), this.linkedList.removeLast());
    assertEquals(new Integer(5), this.linkedList.getLast());
  }

  @Test
  public void deleteElements() throws Exception {
    assertEquals(false, this.linkedList.has(100));
    assertEquals(new Integer(1), this.linkedList.getFirst());
    assertEquals(new Integer(5), this.linkedList.getLast());
    assertEquals(false, this.linkedList.delete(100));
    assertEquals(true, this.linkedList.delete(1));
    assertEquals(true, this.linkedList.delete(5));
    assertEquals(new Integer(2), this.linkedList.getFirst());
    assertEquals(new Integer(4), this.linkedList.getLast());
    assertEquals(true, this.linkedList.delete(3));
    assertEquals(true, this.linkedList.delete(2));
    assertEquals(true, this.linkedList.delete(4));
    try {
      this.linkedList.getFirst();
    } catch (Exception e) {
      assertEquals("LinkedList is empty", e.getMessage());
    }
    try {
      this.linkedList.getLast();
    } catch (Exception e) {
      assertEquals("LinkedList is empty", e.getMessage());
    }
  }

  @Test
  public void helperMethods() throws Exception {
    assertEquals(true, this.linkedList.has(3));
    this.linkedList.clear();
    try {
      this.linkedList.getFirst();
    } catch (Exception e) {
      assertEquals("LinkedList is empty", e.getMessage());
    }
  }

  @Test
  public void edgeCases() throws Exception {
    this.linkedList.clear();
    assertEquals(false, this.linkedList.has(1));
    this.linkedList.insertFirst(1);
    assertEquals(this.linkedList.getLast(), this.linkedList.getFirst());
    assertEquals(true, this.linkedList.has(1));
  }
}