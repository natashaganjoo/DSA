package queue;

import stacks.StackEmptyException;
import stacks.StackFullException;

public class QueueUse {

	public static void main(String[] args) {

		QueueUsingArray queue = new QueueUsingArray();
		
		for (int i = 0; i <= 5; i++) {
			try {
				queue.enqueue(i);
			} catch (StackFullException e) {
				
			}
		}
		
		while (!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
				
			} catch (StackEmptyException e) {
	
			}
		}
	}

}
