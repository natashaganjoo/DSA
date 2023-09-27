package hashmaps;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequency {

	/*
	 * If two or more elements contend for the maximum frequency, return the element
	 * which occurs in the array first.
	 */

	public static int maxFrequencyNumber(int[] arr) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				cnt = hm.get(arr[i]);
				cnt++;
				hm.put(arr[i], cnt);
			} else {
				hm.put(arr[i], 1);
			}

		}

		System.out.println("hm: " + hm);

		int freq = Integer.MIN_VALUE;

		Set<Integer> keys = hm.keySet();
		System.out.println("keys: " + keys);
		int val = 0;
		int element = 0;
		for (Integer i : keys) {

			val = hm.get(i);

			if (val > freq) {
				freq = val;
				element = i;
			}
		}

		return element;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 };
//		int arr[] = {};
		System.out.println(maxFrequencyNumber(arr));
	}

}
