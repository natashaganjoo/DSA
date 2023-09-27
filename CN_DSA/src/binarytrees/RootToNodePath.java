package binarytrees;

import java.util.ArrayList;

public class RootToNodePath {

	public static ArrayList<Integer> getRootToNodePath(Node<Integer> root, int data) {

		if (root == null) {
			return null;
		}

		if (root.data == data) {
			ArrayList<Integer> li = new ArrayList<>();
			li.add(data);
			return li;
		}

		ArrayList<Integer> leftPath = getRootToNodePath(root.left, data);

		// if node is found on the left side, add root also in the path
		if (leftPath != null) {
			leftPath.add(root.data);
			return leftPath;
		}

		// if not found in left call it for right subtree
		ArrayList<Integer> rightPath = getRootToNodePath(root.right, data);

		if (rightPath != null) {
			rightPath.add(root.data);
			return rightPath;
		} else {
			return null;
		}

	}

	public static void main(String[] args) {
		

	}

}
