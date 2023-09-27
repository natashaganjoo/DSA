package binarysearchtrees;

import java.util.ArrayList;

public class RootToNodePathinBST {

	public static ArrayList<Integer> getPath(Node<Integer> root, int data) {

		// If the root is null, the path does not exist
		if (root == null) {
			return null;
		}

		ArrayList<Integer> output;
		// If the root node contains the given data
		if (root.data == data) {
			output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}

		// If the data is less than the root node's data, then it lies in the left
		// subtree
		if (data < root.data) {
			output = getPath(root.left, data);
			// If a path is found in the left subtree, add the current node to the path
			if (output != null) {
				output.add(root.data);
			}
			return output;
		}

		// If the data is greater than the root node's data, then it lies in the right
		// subtree
		if (data > root.data) {
			output = getPath(root.right, data);
			// If a path is found in the right subtree, add the current node to the path
			if (output != null) {
				output.add(root.data);
			}
			return output;
		}

		// If the node is not found, return null
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
