package ctci_ch3;

import java.util.Stack;

public class Q3_5 {

  public static Stack<Integer> sort(Stack<Integer> unsortedStack) {
    Stack<Integer> sortedStack = new Stack<>();
    while (!unsortedStack.empty()) {
      int temp = unsortedStack.pop();
      while (!sortedStack.empty() && sortedStack.peek() > temp) {
        unsortedStack.push(sortedStack.pop());
        sortedStack.push(temp);
      }
    }

    while (!sortedStack.isEmpty()) {
      unsortedStack.push(sortedStack.pop());
    }

    return unsortedStack;
  }


}
