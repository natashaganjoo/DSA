package priorityQueueandHeaps;

import java.util.PriorityQueue;

public class InbuiltPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> pr = new PriorityQueue<>();
		int arr[] = { 1, 3, 4, 5, 7, 8 };

		for (int i : arr) {
			pr.add(i);
		}

		System.out.println(pr.element());

		while (!pr.isEmpty()) {
			System.out.print(pr.remove() + " ");
		}

	}
}
