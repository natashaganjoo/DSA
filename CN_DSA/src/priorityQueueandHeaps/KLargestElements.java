package priorityQueueandHeaps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

/*
 * You are given with an integer k and an array of integers that contain numbers in random order. Write a program to find k
 *  largest numbers from given array. You need to save them in an array and return it. Time complexity should be O(nlogk) and 
 *  space complexity should be not more than O(k).
 */
public class KLargestElements {

	public static ArrayList<Integer> kLargest(int input[], int k) {

		ArrayList<Integer> li = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}

		for (int i = k; i < input.length; i++) {
			int minElem = pq.element();
		
			if (input[i] > minElem) {
				// swap -- dont swap in array but heap/pq
				
				int temp = pq.remove();
				pq.add(input[i]);
				input[i] = temp;
			}
		}

		for (int i = 0; i < k; i++) {
			int min = pq.remove();
			li.add(min);
		}

		return li;
	}

	
	// Time Complexity
	
	
	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 6, 8, 7, 4, 11, 10, 3 };
		ArrayList<Integer> sorted = kLargest(arr, 4);
		
		for (int i : sorted) {
			System.out.print(i + " ");
		}
	}

}
