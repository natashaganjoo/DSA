package interview.old;

import java.util.Arrays;

public class BinarySearch {

	public static boolean binSearch(int arr[], int target) {

		Arrays.sort(arr);

		int start = arr[0];
		int end = arr[arr.length - 1];

		while (start < end) {

			int mid = (start + end) / 2;

			if (target == mid) {
				return true;
			}

			else if (target < mid) {
				end = mid - 1;
			} else if (target > mid) {
				start = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 6, 2, 7, 8, 3 };
		System.out.println(binSearch(arr, 2));
	}
}
