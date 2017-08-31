package datastructures;

public class Stack<T> {

  Node<T> top = null;

  /**
   * Pushes an element onto the stack O(1)
   */
  public void push(T data) {
    if (this.top == null) {
      this.top = new Node<>(data);
    } else {
      Node<T> newTop = new Node<>(data);
      newTop.below = this.top;
      this.top = newTop;
    }
  }

  /**
   * Pop the top element from the stack O(1)
   */
  public T pop() throws Exception {
    if (this.top == null) {
      throw new Exception("Can't pop from empty stack");
    }
    T data = this.top.data;
    this.top = this.top.below;
    return data;
  }

  /**
   * Pop the top element from the stack O(1)
   */
  public T peek() throws Exception {
    if (this.top == null) {
      throw new Exception("Can't peek from empty stack");
    }
    return this.top.data;
  }

  /**
   * Returns true if the stack is empty O(1)
   */
  public boolean isEmpty() {
    return this.top == null;
  }

  /**
   * Clears all contents in the stack O(1)
   */
  public void clear() {
    this.top = null;
  }

  private class Node<T> {

    private T data;
    private Node<T> below;

    private Node(T data) {
      this.data = data;
    }
  }
}
