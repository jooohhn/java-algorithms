package ctci_ch3;

import static org.junit.Assert.assertEquals;

import helpers.HelperFunctions;
import java.util.Stack;
import org.junit.Test;

public class Q3_5Test {

  @Test
  public void sort() throws Exception {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < 1000; i++) {
      stack.push(HelperFunctions.getRandomInteger());
    }
    Q3_5.sort(stack);
    while (stack.size() >= 2) {
      int prior = stack.pop();
      assertEquals(true, stack.peek() > prior);
    }
  }

}