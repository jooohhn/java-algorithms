package datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

  private Stack<Integer> stack = new Stack<>();

  @Before
  public void beforeEach() throws Exception {
    this.stack.push(1);
    this.stack.push(2);
    this.stack.push(3);
    this.stack.push(4);
    this.stack.push(5);
  }

  @After
  public void afterEach() throws Exception {
    this.stack.clear();
  }

  @Test
  public void addAndPeak() throws Exception {
    assertEquals(new Integer(5), this.stack.peek());
    this.stack.push(6);
    assertEquals(new Integer(6), this.stack.peek());
  }

  @Test
  public void remove() throws Exception {
    assertEquals(new Integer(5), this.stack.pop());
    assertEquals(new Integer(4), this.stack.pop());
    assertEquals(new Integer(3), this.stack.pop());
    assertEquals(new Integer(2), this.stack.pop());
    assertEquals(new Integer(1), this.stack.pop());
  }

  @Test
  public void edgeCases() throws Exception {
    assertEquals(this.stack.pop(), new Integer(5));
    assertEquals(false, this.stack.isEmpty());
    this.stack.clear();
    assertEquals(true, this.stack.isEmpty());
    try {
      this.stack.peek();
    } catch (Exception e) {
      assertEquals("Can't peek from empty stack", e.getMessage());
    }
    try {
      this.stack.pop();
    } catch (Exception e) {
      assertEquals("Can't pop from empty stack", e.getMessage());
    }
  }

}