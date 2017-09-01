package sorting;

import helpers.HelperFunctions;


/**
 * Time:
 */
public class QuickSort {

  public static int[] quickSort(int[] arr) {
    return qSort(arr, 0, arr.length - 1);
  }

  private static int[] qSort(int[] arr, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
      int pivotIndex = partition(arr, leftIndex, rightIndex);
      qSort(arr, leftIndex, pivotIndex - 1);
      qSort(arr, pivotIndex + 1, rightIndex);
    }
    return arr;
  }

  private static int partition(int[] arr, int leftIndex, int rightIndex) {
    int pivotElement = arr[rightIndex];
    int wall = leftIndex - 1;
    for (int i = leftIndex; i < rightIndex; i++) {
      if (arr[i] < pivotElement) {
        wall++;
        swap(arr, i, wall);
      }
    }
    // Separates arr into 3 partitions: elements <= pivot, pivot, elements >= pivot
    swap(arr, wall + 1, rightIndex);
    return wall + 1;
  }

  /**
   * Helper method that randomizes the pivot chosen to mitigate chance of worst case O(n^2)
   */
  private static int randomizedPartition(int[] arr, int leftIndex, int rightIndex) {
    int randomIndex = HelperFunctions.getRandomIntegerRange(leftIndex, rightIndex);
    swap(arr, randomIndex, rightIndex);
    return partition(arr, leftIndex, rightIndex);
  }

  private static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
