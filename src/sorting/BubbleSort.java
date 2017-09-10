package sorting;

/**
 * Time: O(n^2) Space: O(n) but can be O(1) if an entirely new array isn't created
 */
public class BubbleSort {

  public static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }
}