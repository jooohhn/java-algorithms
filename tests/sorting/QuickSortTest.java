package sorting;

import static org.junit.Assert.assertArrayEquals;

import helpers.HelperFunctions;
import java.util.Arrays;
import org.junit.Test;

public class QuickSortTest {

  @Test
  public void generalCases() throws Exception {
    int[] arr1 = HelperFunctions.getRandomIntegerArray(0, 1000, 1000);
    int[] arr1Sorted = Arrays.copyOf(arr1, 1000);
    Arrays.sort(arr1Sorted);
    assertArrayEquals(arr1Sorted, QuickSort.quickSort(arr1));

    int[] arr2 = HelperFunctions.getRandomIntegerArray(0, 100000, 10000);
    int[] arr2Sorted = Arrays.copyOf(arr2, 10000);
    Arrays.sort(arr2Sorted);
    assertArrayEquals(arr2Sorted, QuickSort.quickSort(arr2));
  }


  @Test
  public void edgeCases() throws Exception {
    int[] intArr = {4, 9, 1, 34, 12, 6, 5, 18, 51, 21, -5, -3, 89, -2};
    int[] sortedIntArr = {-5, -3, -2, 1, 4, 5, 6, 9, 12, 18, 21, 34, 51, 89};
    assertArrayEquals(sortedIntArr, QuickSort.quickSort(intArr));
    intArr = new int[]{0, 1, 2, 3, 4, 5};
    sortedIntArr = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(sortedIntArr, QuickSort.quickSort(intArr));
    intArr = new int[]{5, 4, 3, 2, 1, 0};
    sortedIntArr = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(sortedIntArr, QuickSort.quickSort(intArr));
    intArr = new int[]{0};
    sortedIntArr = new int[]{0};
    assertArrayEquals(sortedIntArr, QuickSort.quickSort(intArr));
  }

}