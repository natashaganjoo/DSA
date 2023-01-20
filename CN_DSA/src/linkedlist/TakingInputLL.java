package linkedlist;

import java.util.Scanner;

public class TakingInputLL {

	public static void print(Node<Integer> head) {
//		Node<Integer> temp = head;
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
	}
	}
	
	
	public static Node<Integer> takeInput() {
		
		Node<Integer> head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			// if it is first node
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			// if its not first node, then go to the end of list
			else {
//				Node<Integer> temp = head;
//				while (temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head;

	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	}

}
