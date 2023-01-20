package linkedlist;

public class PrintLL {
	
	// we should always store head in temp so that we can use it for other operations
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
		// 2nd time it won't go inside the loop bcz head is null, but if we again assign temp to head it will
		
		head = temp;

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);

		node1.next = node2;
		node2.next = node3;

		Node<Integer> head = node1;
		print(head);
		print(head);
		}

}
