package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArray {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 2, 3, 4, 4, 5 };

//		HashSet<Integer> hs = new HashSet<>();
//		
//		for(int i = 0; i< arr1.length; i++) {
//			hs.add(arr1[i]);
//		}
//		
//		for(int j = 0; j< arr2.length; j++) {
//			hs.add(arr2[j]);
//		}
//		
//		for(int ele: hs) {
//			System.out.println(ele);
//		}

		// 2 pointer approach -> can be used if array is sorted

		int ist = 0, second = 0;
		ArrayList<Integer> li = new ArrayList<>();

		while (ist < arr1.length && second < arr2.length) {
			if (arr1[ist] == arr2[second]) {
				if (li.size() == 0 || li.get(li.size() - 1) != arr1[ist]) {
					li.add(arr1[ist]);
				}
				ist++;
				second++;
			} else if (arr1[ist] < arr2[second]) {
				if (li.size() == 0 ||li.get(li.size() - 1) != arr1[ist]) {
					li.add(arr1[ist]);
				}
				ist++;
			} else if (arr1[ist] > arr2[second]) {
				if (li.size() == 0 || li.get(li.size() - 1) != arr2[second]) {
					li.add(arr2[second]);
				}
				second++;
			}
		}
		
		while(ist < arr1.length)
		{
			if (li.size() == 0 ||li.get(li.size() - 1) != arr1[ist]) {
				li.add(arr1[ist]);
			}
			ist++;
		}
		
		while(second < arr2.length)
		{
			if (li.size() == 0 ||li.get(li.size() - 1) != arr2[second]) {
				li.add(arr2[second]);
			}
			second++;
		}
		
		for(int i: li) {
			System.out.println(i);
		}
		
	}
}
