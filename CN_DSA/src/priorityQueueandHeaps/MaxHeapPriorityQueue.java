package priorityQueueandHeaps;

import java.util.ArrayList;

public class MaxHeapPriorityQueue {

	private ArrayList<Integer> heap;

	public MaxHeapPriorityQueue() {
		heap = new ArrayList<>();
	}

	public int size() {
		return heap.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	int getMax() throws PriorityQueueException {
		if (heap.isEmpty()) {
			throw new PriorityQueueException();
		}

		return heap.get(0);
	}

	void insert(int elem) {

		heap.add(elem);

		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(parentIndex) < heap.get(childIndex)) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int deleteMax() {
		if (heap.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int maxElem = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);

		// heapify

		int parentIndex = 0;
		int maxIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2 * parentIndex + 2;

		// while (leftChildIndex < heap.size() && rightChildIndex < heap.size()) {
		while (leftChildIndex < heap.size()) {

			maxIndex = parentIndex;
			if (heap.get(parentIndex) < heap.get(leftChildIndex)) {
				maxIndex = leftChildIndex;
			}

			if (rightChildIndex < heap.size() && heap.get(maxIndex) < heap.get(rightChildIndex)) {
				maxIndex = rightChildIndex;
			}

			if (maxIndex == parentIndex) {
				break;
			} else {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(maxIndex));
				heap.set(maxIndex, temp);
				parentIndex = maxIndex;
				leftChildIndex = 2 * parentIndex + 1;
				rightChildIndex = 2 * parentIndex + 2;
			}
		}

		return maxElem;
	}
}
