package queue;

import stacks.StackEmptyException;
import stacks.StackFullException;

public class QueueUsingArray {

	private int data[];
	private int size;
	private int front;
	private int rear;

	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return (size == 0);
	}

	int front() throws QueueEmptyException {
		if (size() == -1) {
			throw new QueueEmptyException();
		}
		return data[front];
	}

	// insertion happen at rear end in queue
	void enqueue(int elem) throws StackFullException {

		if (size() == data.length) {
			throw new StackFullException();
		}
		if (size() == 0) {
			front = 0;
		}
		rear++;
		size++;
		data[rear] = elem;

	}

	// deletion happens at front in queue
	int dequeue() throws StackEmptyException {
		if(size == 0) {
			throw new StackEmptyException();
		}
	
		int temp = data[front];
		front = (front + 1) %  data.length;
//		front++;
//		if(front == data.length) {
//			front = 0;
//		}
		size--;
		
		// if size-- will be 0
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
}
