package interview.old;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int arr[], int target) {
//		int pair[] = new int[2];

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int diff = target - arr[i];

			if (hm.containsKey(diff)) {
//				pair[0] = i;
//				pair[1] = hm.get(diff);
				return new int[] {i, hm.get(diff)};
//				System.out.println(pair[0] + ", " + pair[1]);
//				return pair;
			} else {
				hm.put(arr[i], i);
			}

		}
		return null;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 6, 5, 8, 11 };
		int target = 14;
		int pair[] = twoSum(arr, target);
		for (int i = 0; i < pair.length; i++) {
			System.out.println(pair[i]);
		}
	}

}
