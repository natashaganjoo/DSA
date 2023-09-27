package hashmaps;

import java.util.HashMap;

public class PairSum {
	/*
	 * Given a random integer array A of size N. Find and print the count of pair of
	 * elements in the array which sum up to 0. Note: Array A can contain duplicate
	 * elements as well.
	 */

	public static int pairSum(int[] input, int size, int target) {

		int cnt = 0;
		int pair[] = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<>();
		int cntOfPair = 0;

		for (int i = 0; i < input.length; i++) {
			if (hm.containsKey(input[i])) {
				cnt = hm.get(input[i]);
				hm.put(input[i], cnt + 1);
			} else {
				hm.put(input[i], 1);
			}
		}

		for (int i = 0; i < input.length; i++) {

			int diff = target - input[i];

			if (hm.containsKey(diff)) {
				pair[0] = diff;
				pair[1] = input[i];
				int dupe = hm.get(input[i]);
				
//				hm.put(input[i], );
				System.out.println(pair[0] + ", " + pair[1]);
				cntOfPair += 1;
			}

		}
		return cntOfPair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = { 5, 3, 4, 1, 2 };
		int arr[] = {2, 1, -2, 2, 3};

		int pair = pairSum(arr, 5, 0);
		System.out.println(pair);
//		2 -2   
//		1 -1
//	   -2  1
//		3  1

	}

}
