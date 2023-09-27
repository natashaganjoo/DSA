package binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InputAndOutput {

	public Node<Integer> takeInputRecursive() {

		System.out.println("Enter root data");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();

		// if user wants to give no children to as input, they will give -1
		if (rootData == -1) {
			return null;
		}
		Node<Integer> root = new Node<Integer>(rootData);

		// In generic trees, we used to ask no of children but incase of binary trees,
		// we have only 2 children so no need ot ask

		root.left = takeInputRecursive();
		root.right = takeInputRecursive();

		return root;
	}

	public void printTreeRecursive(Node<Integer> root) {

		// base case
		if (root == null) {
			return;
		}

		String toBePrinted = root.data + "";
//		System.out.println(toBePrinted);

		if (root.left != null) {
			toBePrinted += "L: " + root.left.data + ",";
		}

		if (root.right != null) {
			toBePrinted += "R: " + root.right.data;
		}

		System.out.println(toBePrinted);
		printTreeRecursive(root.left);
		printTreeRecursive(root.right);

	}

	// 1. ask for root data and create node for root
	// 2. enqueue root
	// 3. Ask for left and right child and create corresponding nodes, link them
	// with root and also enqueue them

	public Node<Integer> takeInputLevelWise() {

		System.out.println("Enter root data");
		Scanner sc = new Scanner(System.in);

		int rootData = sc.nextInt();
		if (rootData == -1) {
			return null;
		}

		QueueUsingLL<Node<Integer>> queue = new QueueUsingLL<>();
		Node<Integer> root = new Node<Integer>(rootData);

		queue.enqueue(root);

		while (!queue.isEmpty()) {
			Node<Integer> frontNode = queue.dequeue();

			System.out.println("Enter left child of " + frontNode.data);
			int leftData = sc.nextInt();
			if (leftData != -1) {
				Node<Integer> leftNode = new Node<Integer>(leftData);
				frontNode.left = leftNode;
				queue.enqueue(leftNode);
			}

			System.out.println("Enter right child of " + frontNode.data);
			int rightData = sc.nextInt();

			if (rightData != -1) {

				Node<Integer> rightNode = new Node<Integer>(rightData);
				frontNode.right = rightNode;
				queue.enqueue(rightNode);
			}

		}
		return root;
	}

//	public void printTreeLevelWise(Node<Integer> root) {
//
//		QueueUsingLL<Node<Integer>> queue = new QueueUsingLL<>();
//		queue.enqueue(root);
////		queue.enqueue(null);
//
//		while (!queue.isEmpty()) {
//			Node<Integer> front = queue.dequeue();
//
////			if(front != null) {
//			System.out.print(front.data + " ");
////	
////			}
//			if (front.left != null) {
//				queue.enqueue(front.left);
//				System.out.print(front.left.data + " ");
//			} else {
//				System.out.print(" -1");
//			}
//
//			if (front.right != null) {
//				queue.enqueue(front.right);
//				System.out.print(front.right.data + " ");
//			} else {
//				System.out.print(" -1");
//			}
//
////			if (front.left == null || front.right == null) {
////				System.out.println();
////			}
//
//		}
//	}

	public void printTreeLevelWise(Node<Integer> root) {
		// Your code goes here

		Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
		queue.add(root);

		while (!queue.isEmpty()) {
			root = queue.peek();
			System.out.print(root.data + ":L:");
			if (root.left == null) {
				System.out.print("-1,R:");
			} else {
				System.out.print(root.left.data + ",R:");
				queue.add(root.left);
			}
			if (root.right == null) {
				System.out.print("-1");
			} else {
				System.out.print(root.right.data);
				queue.add(root.right);
			}
			System.out.println();
			queue.remove();
			root = queue.peek();
		}
	}

}
