package interview.old;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 2, 1, 1, 2, 3 , 1, 1, 2};
		int candies = 0;
		
		int leftArr[] = new int[arr.length];
		int rightArr[] = new int[arr.length];
		Arrays.fill(leftArr, 1);
		Arrays.fill(rightArr, 1);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				leftArr[i] = leftArr[i - 1] + 1;
			}
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				rightArr[i] = rightArr[i + 1] + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int max = Math.max(leftArr[i], rightArr[i]);
			candies += max;
		}
		
		System.out.println(candies);
	}

}
