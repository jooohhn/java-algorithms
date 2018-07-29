package com.jooohhn.java_interview_prep.datastructures;

import java.util.EmptyStackException;

public class Stack<T> {

  Node<T> top = null;

  /** Pushes an element onto the stack O(1) */
  public void push(T data) {
    if (this.top == null) {
      this.top = new Node<>(data);
    } else {
      Node<T> newTop = new Node<>(data);
      newTop.below = this.top;
      this.top = newTop;
    }
  }

  /** Pop the top element from the stack O(1) */
  public T pop()  {
    if (this.top == null) {
      throw new EmptyStackException();
    }
    T data = this.top.data;
    this.top = this.top.below;
    return data;
  }

  /** Pop the top element from the stack O(1) */
  public T peek(){
    if (this.top == null) {
      throw new EmptyStackException();
    }
    return this.top.data;
  }

  /** Returns true if the stack is empty O(1) */
  public boolean isEmpty() {
    return this.top == null;
  }

  /** Clears all contents in the stack O(1) */
  public void clear() {
    this.top = null;
  }

  public class Node<T> {

    public T data;
    public Node<T> below;

    public Node(T data) {
      this.data = data;
    }
  }
}
