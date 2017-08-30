package sorting;

/**
 * O(nlgn) time
 * O(n) space
 */

public class MergeSort {
	public static int[] mergeSortRecursive(int[] arr) {
		if (arr.length == 1) return arr;
		int[] firstHalf = new int[arr.length / 2];
		int[] secondHalfHalf = new int[arr.length - firstHalf.length];
		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = arr[i];
		}
		for (int i = 0; i < secondHalfHalf.length; i++) {
			secondHalfHalf[i] = arr[firstHalf.length + i];
		}
		int[] sortedFirstHalf = mergeSortRecursive(firstHalf);
		int[] sortedSecondHalf = mergeSortRecursive(secondHalfHalf);
		return merge(sortedFirstHalf, sortedSecondHalf);
	}

	public static int[] merge(int[] firstHalf, int[] secondHalf) {
		int iFirst = 0;
		int iSecond = 0;
		int j = 0; // used to keep the index of the sortedArr
		int[] sortedArr = new int[firstHalf.length + secondHalf.length];
		while (iFirst < firstHalf.length && iSecond < secondHalf.length) {
			if (firstHalf[iFirst] < secondHalf[iSecond]) {
				sortedArr[j] = firstHalf[iFirst];
				iFirst++;
			} else {
				sortedArr[j] = secondHalf[iSecond];
				iSecond++;
			}
			j++;
		}

		while (iFirst < firstHalf.length) {
			sortedArr[j] = firstHalf[iFirst];
			iFirst++;
			j++;
		}
		while (iSecond < secondHalf.length) {
			sortedArr[j] = secondHalf[iSecond];
			iSecond++;
			j++;
		}
		return sortedArr;
	}
}
