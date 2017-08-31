package sorting;

import java.util.Arrays;

/**
 * Time: O(n^2) Space: O(n) but can be O(1) if an entirely new array isn't created
 */
public class BubbleSort {

  public static int[] bubbleSort(int[] arr) {
    int[] sortedArr = Arrays.copyOf(arr, arr.length);
    for (int i = 0; i < sortedArr.length - 1; i++) {
      for (int j = 0; j < sortedArr.length - i - 1; j++) {
        if (sortedArr[j] > sortedArr[j + 1]) {
          int temp = sortedArr[j + 1];
          sortedArr[j + 1] = sortedArr[j];
          sortedArr[j] = temp;
        }
      }
    }
    return sortedArr;
  }
}