package hashmaps;

import java.util.*;
import java.util.HashMap;

public class RemoveDupes {

//	public static ArrayList<Integer> removeDupes(int arr[]) {
//
//		ArrayList<Integer> li = new ArrayList<>();
//
//		HashMap<Integer, Integer> hm = new HashMap<>();
//
//		int cnt = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (hm.containsKey(arr[i])) {
//				cnt = hm.get(arr[i]);
//				cnt++;
//				hm.put(arr[i], cnt);
//			} else {
//				hm.put(arr[i], 1);
//			}
//
//		}
//
//		Set<Integer> keys = hm.keySet();
//		for(Integer i : keys) {
//			int val = hm.get(i);
//			if(val == 1) {
//				li.add(i);
//			}
//		}
//		
//		return li;
//
//	}

	public static ArrayList<Integer> removeDupes(int arr[]) {

		ArrayList<Integer> li = new ArrayList<>();

		HashMap<Integer, Boolean> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], false);
			} else {
				hm.put(arr[i], true);
			}
		}

		Set<Integer> keys = hm.keySet();
		for (Integer i : keys) {
			boolean val = hm.get(i);
			if (val == true) {
				li.add(i);
			}
		}
		return li;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 3, 6, 7, 6 };
		ArrayList<Integer> li = removeDupes(arr);
		for (int i : li) {
			System.out.println(i);
		}

	}

}
