package sorting;

import java.util.Arrays;

/**
 * Time: O(n^2)
 * Space: O(n) but can be O(1) if an entirely new array isn't created
 */
public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		for (int i = 0; i < sortedArr.length; i++) {
			int minIndex = i;
			for (int j = i; j < sortedArr.length; j++) {
				minIndex = (sortedArr[j] < sortedArr[minIndex]) ? j : minIndex;
			}
			int temp = sortedArr[i];
			sortedArr[i] = sortedArr[minIndex];
			sortedArr[minIndex] = temp;

		}
		return sortedArr;
	}
}
