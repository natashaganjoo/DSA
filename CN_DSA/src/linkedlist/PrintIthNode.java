package linkedlist;

import java.util.Scanner;

public class PrintIthNode {

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
	
	
	
	public static void printIthNode(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		int count = 0;
		while (count != i) {
			temp = temp.next;
			count++;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printIthNode(head, 3);
	}

}
