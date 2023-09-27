package binarytrees;

class Pair<T, V> {
	public T first;
	public V second;
}

public class DiameterOfBinaryTree {

	// distance between two farthest nodes
	// normally max of left height and right height would return diameter, but
	// imagine a case where left or right subtree is
	// divided into more subtrees and farthest node is present there

	public static int height(Node<Integer> root) {

		if (root == null) {
			return 0;
		}

		int lh = height(root.left);
		int rh = height(root.right);

		return 1 + Math.max(lh, rh);

	}

	// Here we are calculating height then diameter in different recursion calls,
	// basically ist we are asking for height then dia

//	public static int diameter(Node<Integer> root) {
//
//		if (root == null) {
//			return 0;
//		}
//
//		int option1 = height(root.left) + height(root.right);
//
//		int option2 = diameter(root.left);
//
//		int option3 = diameter(root.right);
//
//		return Math.max(option1, Math.max(option2, option3));
//	}

	// better approach -- O(n)
	// in this we will call recursion to calculate height and diameter in a single step
	public static Pair<Integer, Integer> heightDiameter(Node<Integer> root) {

		if (root == null) {
			// for root null height and dia would be zero
			Pair<Integer, Integer> pair = new Pair<>();
			pair.first = 0;
			pair.second = 0;
			return pair;
		}

		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);

		int height = 1 + Math.max(lo.first, lo.second);

		int option1 = lo.first + ro.first;
		int option2 = lo.second;
		int option3 = ro.second;

		int diameter = Math.max(option1, Math.max(option2, option3));

		Pair<Integer, Integer> pair = new Pair<>();
		pair.first = height;
		pair.second = diameter;
		return pair;
		
	}

	public static void main(String args[]) {

		InputAndOutput io = new InputAndOutput();

		Node<Integer> root = io.takeInputLevelWise();

		System.out.println("height: " + heightDiameter(root).first);
		
		System.out.println("diameter: " + heightDiameter(root).second);

	}

}
