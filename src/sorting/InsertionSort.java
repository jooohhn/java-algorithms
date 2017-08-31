package sorting;

import java.util.Arrays;

/**
 * Time: O(n^2) Space: O(n) but can be O(1) if an entirely new array isn't created
 */
public class InsertionSort {

  public static int[] insertionSort(int[] arr) {
    int[] sortedArr = Arrays.copyOf(arr, arr.length);
    for (int i = 1; i < sortedArr.length; i++) {
      for (int j = i; j > 0; j--) {
        if (sortedArr[j] < sortedArr[j - 1]) {
          int temp = sortedArr[j - 1];
          sortedArr[j - 1] = sortedArr[j];
          sortedArr[j] = temp;
        } else {
          break;
        }
      }
    }
    return sortedArr;
  }
}
