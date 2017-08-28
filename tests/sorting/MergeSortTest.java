package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
	@Test
	public void mergeSortRecursiveTest() throws Exception {
		int[] intArr = {-5, -3, -2, 1, 4, 5, 6, 9, 12, 18, 21, 34, 51, 89};
		int[] sortedIntArr = {-5, -3, -2, 1, 4, 5, 6, 9, 12, 18, 21, 34, 51, 89};
		intArr = MergeSort.mergeSortRecursive(intArr);
		assertArrayEquals(MergeSort.mergeSortRecursive(intArr), sortedIntArr);
		intArr = new int[] {0, 1, 2, 3, 4, 5};
		sortedIntArr = new int[] {0, 1, 2, 3, 4, 5};
		intArr = MergeSort.mergeSortRecursive(intArr);
		assertArrayEquals(MergeSort.mergeSortRecursive(intArr), sortedIntArr);
		intArr = new int[] {5, 4, 3, 2, 1, 0};
		sortedIntArr = new int[] {0, 1, 2, 3, 4, 5};
		intArr = MergeSort.mergeSortRecursive(intArr);
		assertArrayEquals(MergeSort.mergeSortRecursive(intArr), sortedIntArr);
		intArr = new int[] {0};
		sortedIntArr = new int[] {0};
		intArr = MergeSort.mergeSortRecursive(intArr);
		assertArrayEquals(MergeSort.mergeSortRecursive(intArr), sortedIntArr);

	}

}