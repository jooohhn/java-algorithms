package com.jooohhn.java_interview_prep.sorting;

/** Time: O(n^2) Space: O(n) but can be O(1) if an entirely new array isn't created */
public class SelectionSort {

  public static int[] selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i; j < arr.length; j++) {
        minIndex = (arr[j] < arr[minIndex]) ? j : minIndex;
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    return arr;
  }
}
