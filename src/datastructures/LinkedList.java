package datastructures;

public class LinkedList<T> {

  public Node<T> head = null;
  public Node<T> tail = null;

  public LinkedList() {
  }

  public LinkedList(T[] arr) {
    for (T t : arr) {
      this.insertLast(t);
    }
  }

  /**
   * Adds an element to the head of the list. Cases are if the list is empty or general case O(1)
   */
  public void insertFirst(T data) {
    // If list is empty
    if (this.head == null) {
      Node<T> node = new Node<>(data);
      this.head = node;
      this.tail = node;
      // General case
    } else {
      Node<T> newHead = new Node<>(data);
      this.head.prev = newHead;
      newHead.next = this.head;
      this.head = newHead;
    }
  }

  /**
   * O(1)
   */
  public T getFirst() throws Exception {
    if (this.head == null) {
      throw new Exception("LinkedList is empty");
    }
    return this.head.data;
  }

  /**
   * O(1)
   */
  public T removeFirst() throws Exception {
    if (this.head == null) {
      throw new Exception("LinkedList is empty");
    }
    T data = this.head.data;
    this.head = this.head.next;
    this.head.prev = null;
    return data;
  }

  /**
   * Adds an element to the tail of the list. Cases are if the list is empty or general case O(1)
   */
  public void insertLast(T data) {
    // If list is empty
    if (this.head == null) {
      Node<T> node = new Node<>(data);
      this.head = node;
      this.tail = node;
      // General case
    } else {
      Node<T> newTail = new Node<>(data);
      this.tail.next = newTail;
      newTail.prev = this.tail;
      this.tail = newTail;
    }
  }

  /**
   * O(1)
   */
  public T getLast() throws Exception {
    if (this.tail == null) {
      throw new Exception("LinkedList is empty");
    }
    return this.tail.data;
  }

  /**
   * O(1)
   */
  public T removeLast() throws Exception {
    if (this.tail == null) {
      throw new Exception("LinkedList is empty");
    }
    T data = this.tail.data;
    this.tail = this.tail.prev;
    this.tail.next = null;
    return data;
  }

  /**
   * O(n)
   */
  public boolean delete(T data) {
    if (this.head == null) {
      return false;
    }
    if (this.head == this.tail && this.head.data.equals(data)) {
      this.clear();
      return true;
    }
    Node<T> currentNode = this.head;
    while (currentNode != null) {
      if (currentNode.data.equals(data)) {
        if (currentNode == this.head) {
          currentNode.next.prev = null;
          this.head = currentNode.next;
        } else if (currentNode == this.tail) {
          currentNode.prev.next = null;
          this.tail = currentNode.prev;
        } else {
          currentNode.prev.next = currentNode.next;
          currentNode.next.prev = currentNode.prev;
        }
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  /**
   * O(n)
   */
  public boolean has(T data) {
    if (this.head == null) {
      return false;
    }
    if (this.head == this.tail && this.head.data.equals(data)) {
      return true;
    }
    Node<T> currentNode = this.head;
    while (currentNode != null) {
      if (currentNode.data.equals(data)) {
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  /**
   * O(1)
   */
  public void clear() {
    this.head = null;
    this.tail = null;
  }


  public class Node<T> {

    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(T data) {
      this.data = data;
    }
  }
}
