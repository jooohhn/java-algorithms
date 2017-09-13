package datastructures;

import java.util.ArrayList;
import java.util.Collection;

public class Heap {

  ArrayList<Integer> arr;

  public Heap() {
    this.arr = new ArrayList<Integer>();
  }

  public Heap(Collection<Integer> arr) {
    this.arr = new ArrayList<Integer>(arr);
    for (int i = this.size() / 2; i >= 0; i--) {
      maxHeapify(i);
    }
  }

  /**
   * O(1)
   */
  public int getMax() throws Exception {
    if (arr.size() == 0) {
      throw new Exception("Heap is empty");
    }
    return arr.get(0);
  }

  /**
   * O(lgn) amortized
   */
  public int extractMax() throws Exception {
    if (arr.size() == 0) {
      throw new Exception("Heap is empty");
    }
    int val = this.getMax();
    swapElements(0, this.size() - 1);
    maxHeapify(0);
    return val;
  }

  /**
   * O(lgn) amortized
   */
  public void insert(int num) {
    this.arr.add(num);
    int elementIndex = this.arr.size() - 1;
    while (this.getElement(this.getParentIndex(elementIndex)) < num) {
      this.swapElements(elementIndex, this.getParentIndex(elementIndex));
      elementIndex = this.getParentIndex(elementIndex);
    }
  }

  /**
   * Sinks an element down to its correct place in the heap O(lgn)
   */
  public void maxHeapify(int index) {
    int leftChildIndex = this.getLeftChildIndex(index);
    int rightChildIndex = this.getRightChildIndex(index);
    int largestElementIndex = index;
    if (leftChildIndex < this.size() && this.getElement(leftChildIndex) > this
        .getElement(largestElementIndex)) {
      largestElementIndex = leftChildIndex;
    }
    if (rightChildIndex < size() && this.getElement(rightChildIndex) > this
        .getElement(largestElementIndex)) {
      largestElementIndex = rightChildIndex;
    }
    if (largestElementIndex != index) {
      this.swapElements(index, largestElementIndex);
      maxHeapify(largestElementIndex);
    }
  }

  public int getLeftChildIndex(int index) {
    return 2 * index + 1;
  }

  public int getRightChildIndex(int index) {
    return 2 * index + 2;
  }

  public int getParentIndex(int index) {
    return (int) Math.floor((index - 1) / 2);
  }

  public int getElement(int index) {
    return this.arr.get(index);
  }

  public int size() {
    return this.arr.size();
  }

  public void swapElements(int index1, int index2) {
    int temp = arr.get(index1);
    arr.set(index1, arr.get(index2));
    arr.set(index2, temp);
  }

  public boolean verifyIntegrity() {
    for (int i = 0; i < this.size(); i++) {
      int leftChildIndex = this.getLeftChildIndex(i);
      int rightChildIndex = this.getRightChildIndex(i);
      if (rightChildIndex == size()) {
        break;
      }
      if (this.getElement(i) < this.getElement(leftChildIndex)) {
        return false;
      }
      if (this.getElement(i) < this.getElement(rightChildIndex)) {
        return false;
      }
    }
    return true;
  }
}
