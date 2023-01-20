package linkedlist;

import java.util.Scanner;

public class InsertNode {

	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {

		Node<Integer> newNode = new Node<Integer>(data);
		Node<Integer> temp = head;
		int i = 0;

		if(pos == 0) {
			// if we do this and this function's return type is void, due to pass by value newNode will be updated in the function
			// but not in the main
			
//			newNode.next = head;
//			head = newNode;
			newNode.next = head;
			return newNode;
		}
		while (i < pos - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
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

	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		head = insert(head, 0, 20);
		print(head);
	}

}
