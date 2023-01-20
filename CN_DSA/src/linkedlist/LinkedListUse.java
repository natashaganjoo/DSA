package linkedlist;

public class LinkedListUse {

	public static void main(String[] args) {

		// Node node1 = new Node(10);  // non generic class object
		Node<Integer> node1 = new Node<>(10);
		System.out.println(node1.data);
		System.out.println(node1.next);   // null bcz in the constructor we have initialized it to null
		
		Node<Integer> node2 = new Node<Integer>(20);
		node1.next = node2;
		
		System.out.println(node1.next);
		System.out.println(node2);
	}

}
