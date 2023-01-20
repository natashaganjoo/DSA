package linkedlist;

import java.awt.Point;
import java.util.Scanner;

public class ReturnIndexOfNode {

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
	
	public static int getSize(Node<Integer> head) {
		Node<Integer> temp = head;
		int cnt = 1;
		
		while (temp != null && temp.data != -1) {
			cnt++;
			temp = temp.next;
		}
		
		return cnt;
	}
	
	public static int findNode(Node<Integer> head, int n) {
		
		Node<Integer> temp = head;
		int i = 0;
		while (temp != null && i < getSize(temp)) {
			temp = temp.next;
			i++;
		}
		
		if(temp.data != n) {
			return -1;
		}
		// we have got the index of node for which we want the data
		return temp.data;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		int data = findNode(head, 2);
		System.out.println("data: " + data);
		print(head);
	
	}

}
