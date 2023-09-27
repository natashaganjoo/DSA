package priorityQueueandHeaps;

import java.util.PriorityQueue;

public class KSortedArray {

	// normally sorting takes 0(log n)
	// but here since we are inserting only k elements in heap so heap size is k 
	// for insetion and deletion it is 0(log k)
	
	public static void sortArr(int arr[], int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// insert into queue upto k
		for (int i = 0; i <= k; i++) {
			pq.add(arr[i]);
		}

		// release -- print
		// acquire -- add in queue
		// remove will give min since pq is heap
		for (int i = k + 1; i < arr.length; i++) {
			System.out.print(pq.remove()+ " ");
			pq.add(arr[i]);
		}
		
		while(pq.size() > 0) {
			System.out.print(pq.remove()+ " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = { 1, 3, 4, 5, 7, 8 };
		sortArr(arr, 2);

	}

}
