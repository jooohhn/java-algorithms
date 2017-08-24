package datastructures;

public class DoublyLinkedList<T> {
	private Node<T> head = null;
	private Node<T> tail = null;

	/**
	 * Adds an element to the head of the list. Cases are if the list
	 * is empty or general case
	 * O(1)
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
		if (this.head == null) throw new Exception("LinkedList is empty");
		return this.head.data;
	}

	/**
	 * O(1)
	 */
	public T removeFirst() throws Exception {
		if (this.head == null) throw new Exception("LinkedList is empty");
		T data = this.head.data;
		this.head = this.head.next;
		this.head.prev = null;
		return data;
	}

	/**
	 * Adds an element to the tail of the list. Cases are if the list
	 * is empty or general case
	 * O(1)
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
		if (this.tail == null) throw new Exception("LinkedList is empty");
		return this.tail.data;
	}

	/**
	 * O(1)
	 */
	public T removeLast() throws Exception {
		if (this.tail == null) throw new Exception("LinkedList is empty");
		T data = this.tail.data;
		this.tail = this.tail.prev;
		this.tail.next = null;
		return data;
	}

	/**
	 * O(n)
	 */
	public boolean delete(T data) {
		if (this.head == null) return false;
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
		if (this.head == null) return false;
		if (this.head == this.tail && this.head.data.equals(data)) {
			return true;
		}
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			if (currentNode.data.equals(data))
				return true;
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


	private class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> prev;

		private Node(T data) {
			this.data = data;
		}
	}
}
