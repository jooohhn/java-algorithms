package datastructures;

public class Queue<T> {
	private Node<T> first = null;
	private Node<T> last = null;

	/**
	 * Adds an element to the back of the queue. Cases are if the list is empty or general case
	 * O(1)
	 */
	public void add(T data) {
		if (this.first == null) {
			this.first = new Node<>(data);
			this.last = this.first;
		} else {
			Node<T> newLast = new Node<>(data);
			this.last.prev = newLast;
			this.last = newLast;
		}
	}

	/**
	 * Removes the element at the front of the queue. Cases:  the list is empty, one element queue, or general case
	 * O(1)
	 */
	public T remove() throws Exception {
		if (this.first == null)
			throw new Exception("Cannot remove from an empty queue");
		T data = this.first.data;
		if (this.first == this.last) {
			this.first = null;
			this.last = null;
		} else {
			this.first = this.first.prev;
		}
		return data;
	}

	/**
	 * Removes the element at the front of the queue
	 * O(1)
	 */
	public T peek() throws Exception {
		if (this.first == null)
			throw new Exception("Cannot peek from an empty queue");
		return this.first.data;
	}

	/**
	 * Returns true if the queue is empty
	 * O(1)
	 */
	public boolean isEmpty() {
		return this.first == null;
	}

	/**
	 * Clears all contents in the queue
	 * O(1)
	 */
	public void clear() {
		this.first = null;
		this.last = null;
	}

	private class Node<T> {
		private T data;
		private Node<T> prev;

		private Node(T data) {
			this.data = data;
		}
	}
}
