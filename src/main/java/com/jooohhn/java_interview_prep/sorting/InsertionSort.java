package com.jooohhn.java_interview_prep.sorting;

/** Time: O(n^2) Space: O(n) but can be O(1) if an entirely new array isn't created */
public class InsertionSort {

  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        } else {
          break;
        }
      }
    }
    return arr;
  }
}
