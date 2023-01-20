package linkedlist;

import java.util.Scanner;

public class DeleteNode {

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
	
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		
		Node<Integer> temp = head;
		int i = 0;
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			temp = temp.next;
			return temp;
		}
		else if (pos < 0) {
			return head;
		}
		else {
			while (i < pos - 1 && temp != null) {
				temp = temp.next;
				i++;
			}
			// bcz in the q its given that if the position is >= lenght of LL return original list
			if(temp == null || temp.next == null) {
				return head;
			}
			temp.next = temp.next.next;
			return head;
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
	
	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		deleteNode(head, 0);
//		System.out.println(getSize(head));
		print(head);
	}

}
