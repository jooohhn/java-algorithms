package com.jooohhn.java_interview_prep.sorting;

public class HeapSort {

  public static int[] heapSort(int[] arr) {
    // Turns arr into a heap structure
    for (int i = arr.length / 2; i >= 0; i--) {
      maxHeapify(i, arr, arr.length);
    }

    // Swap max with last element, then heapify the out of place element.
    // Sorted array will build from the largest elements starting from the right of the array
    for (int i = arr.length - 1; i > 0; i--) {
      swapElements(0, i, arr);
      maxHeapify(0, arr, i);
    }

    return arr;
  }

  /**
   * Sinks an element down to its correct place in the heap. Used to turn the arr into a heap O(lgn)
   */
  private static void maxHeapify(int index, int[] arr, int limit) {
    int leftChildIndex = getLeftChildIndex(index);
    int rightChildIndex = getRightChildIndex(index);
    int largestElementIndex = index;
    if (leftChildIndex < limit && arr[leftChildIndex] > arr[largestElementIndex]) {
      largestElementIndex = leftChildIndex;
    }
    if (rightChildIndex < limit && arr[rightChildIndex] > arr[largestElementIndex]) {
      largestElementIndex = rightChildIndex;
    }
    if (largestElementIndex != index) {
      swapElements(index, largestElementIndex, arr);
      maxHeapify(largestElementIndex, arr, limit);
    }
  }

  private static int getLeftChildIndex(int index) {
    return 2 * index + 1;
  }

  private static int getRightChildIndex(int index) {
    return 2 * index + 2;
  }

  private static void swapElements(int index1, int index2, int[] arr) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
