package hashmaps;

import java.util.*;
import java.util.HashMap;

public class IntersectionOfArrays {

	public static void printIntersection(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		int cnt = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (hm.containsKey(arr1[i])) {
				cnt = hm.get(arr1[i]);
				hm.put(arr1[i], cnt + 1);
			} else {
				hm.put(arr1[i], 1);
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (hm.containsKey(arr2[i])) {
				cnt = hm.get(arr2[i]);
				if (cnt > 0) {
					System.out.println(arr2[i]);
					cnt--;
				}
				
				hm.put(arr2[i], cnt);
			}
		}

	}

	public static void main(String[] args) {

//		int arr1[] = {2, 6, 8, 5, 4, 3};
//		int arr2[] = {2, 3, 4, 7};

		int arr1[] = { 2, 6, 1, 2 };
		int arr2[] = { 1, 2, 3, 4, 2 };
		printIntersection(arr1, arr2);
	}

}
