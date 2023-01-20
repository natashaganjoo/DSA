package linkedlist;

import java.util.Scanner;

public class LengthOfLL {

	public static int length(Node<Integer> head) {
		int count = 0;
		Node<Integer> temp = head;
		
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static Node<Integer> takeInput() {

		Node<Integer> head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		while (data != -1) {
			Node<Integer> newNode = new Node<>(data);
			// if it is first node
			if (head == null) {
				head = newNode;
				tail = newNode;
			}
			// if its not first node, then go to the end of list
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head;

	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		print(head);
		int len = length(head);
		System.out.println("len is: " + len);
	}

}
