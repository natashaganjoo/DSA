package priorityQueueandHeaps;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueException {
		
		// heap sort 
		PriorityQueue pq = new PriorityQueue();
		
		int arr[] = {5, 1, 9, 2, 0};		
		for(int i=0; i< arr.length; i++) {
			pq.insert(arr[i]);
		}
		System.out.println(pq.getMin());
		
		while(!pq.isEmpty()) {
			try {
				System.out.print(pq.removeMin() + " ");
			} catch (PriorityQueueException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
	}

}
