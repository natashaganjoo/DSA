package interview.old;

public class QueueUsingArr {

	int data[];
	int front;
	int rear;
	int size;

	public QueueUsingArr() {
		// TODO Auto-generated constructor stub
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}

	public QueueUsingArr(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int elem) {
		if(size == data.length) {
			System.out.println("full queue");
		}
		rear++;
		size++;
		data[rear] = elem;
	}

	public void dequeue() {
		if(size == 0) {
			System.out.println("empty cant dequeu");
		}
		front++;
		size--;
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[i]+ " ");
		}
		System.out.println();
	}
}
