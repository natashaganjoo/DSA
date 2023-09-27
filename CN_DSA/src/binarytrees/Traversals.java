package binarytrees;

import trees.PreOrderTraversal;

public class Traversals {

	public static void preOrder(Node<Integer> root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public static void postOrder(Node<Integer> root) {

		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	public static void inOrder(Node<Integer> root) {

		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	public static void main(String[] args) {
		InputAndOutput io = new InputAndOutput();

		Node<Integer> root = io.takeInputLevelWise();

		preOrder(root);
		postOrder(root);
		inOrder(root);

	}

}
