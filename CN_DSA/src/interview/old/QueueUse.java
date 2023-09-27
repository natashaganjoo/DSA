package interview.old;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArr queue = new QueueUsingArr();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.size);
		
		queue.print();
		
		queue.dequeue();
		
		queue.print();
		
	}

}
