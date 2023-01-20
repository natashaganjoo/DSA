package linkedlist;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class MidpointOfLL {

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
		int cnt = 0;
		
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}
	
	public static int findMidPoint(Node<Integer> head) {
		int size = getSize(head);
		int mp = 0;
		if(size % 2 != 0) {
			
			mp = size/2;
		}
		else {
			mp = (size-2)/2;
		}
		Node<Integer> temp = head;
		int i = 0;
		while (i < mp) {
			temp =  temp.next;
			i++;
		}
		return temp.data;
	}
	
	// fast.next.next condition in case of even.....visualize it using example
	public static int findMidPointWithoutSize(Node<Integer> head) {
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
		
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
//		System.out.println(getSize(head));
		print(head);
//		System.out.println("mp" + findMidPoint(head));
		System.out.println(findMidPointWithoutSize(head));
	}

}
