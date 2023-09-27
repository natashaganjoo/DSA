package binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorOfTree {

	// correct but the question demands changing original links, here I am just
	// printing the mirror of tree

//	public static void mirrorOfTree(Node<Integer> root) {
//
//		Queue<Node<Integer>> queue = new LinkedList<>();
//		queue.add(root);
//		queue.add(null);
//
//		while (!queue.isEmpty()) {
//
//			Node<Integer> front = queue.poll();
//
//			if (front == null) {
//				// you might think it wont go inside while if its empty but in case of last null
//				// node when it will pop it,
//				// queue will become empty, and in case of first root node it is actually adding
//				// null also, so total nodes is 2
//				if (queue.isEmpty()) {
//					return;
//				}
//				queue.add(null);
//				System.out.println();
//				continue;
//			}
//
//			System.out.print(front.data + " ");
//			if (front.right != null) {
//				queue.add(front.right);
//			}
//			if (front.left != null) {
//				queue.add(front.left);
//			}
//		}
//	}

	// mirror by changing links
	public static void mirrorOfTree(Node<Integer> root) {
		if (root == null)
			return;
		root = mirror(root);

	}

	static Node<Integer> mirror(Node<Integer> root) {
		if (root == null)
			return root;
		if (root.left != null && root.right != null) {
			Node<Integer> temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		mirror(root.left);
		mirror(root.right);
		return root;
	}

	public static void main(String[] args) {
		InputAndOutput io = new InputAndOutput();

		Node<Integer> root = io.takeInputLevelWise();

		mirrorOfTree(root);
		io.printTreeLevelWise(root);

	}

}
