package binarysearchtrees;

public class IsBST {

	// we will check if left subtree is smaller than root and right subtree is >
	// than root
	// find max of left subtree and that should be < than root data
	// find min of right subtree and that should be > than root data
//	public static int minimum(Node<Integer> root) {
//		if (root == null) {
//			return Integer.MAX_VALUE;
//		}
//
//		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
//	}
//
//	public static int maximum(Node<Integer> root) {
//
//		// if we return max then that will be considered good, which means Integer.max
//		// will be greater than root.data as well
//		if (root == null) {
//			return Integer.MIN_VALUE;
//		}
//
//		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
//
//	}
//
//	public static boolean isBST(Node<Integer> root) {
//
//		if (root == null) {
//			return true;
//		}
//
//		int leftMax = maximum(root.left);
//		int rightMin = minimum(root.right);
//
//		if (root.data <= leftMax) {
//			return false;
//		}
//		if (root.data > rightMin) {
//			return false;
//		}
//
//		boolean isLeftBst = isBST(root.left);
//		boolean isRightBst = isBST(root.right);
//
//		return isLeftBst && isRightBst;
//	}

	// efficient approach - O(n)
	// by range
	public static boolean isBST(Node<Integer> root, int min, int max) {

		if (root == null) {
			return true;
		}

		if (root.data < min || root.data > max) {
			return false;
		}

		// in case of left, max should be less than root
		boolean isLeftOk = isBST(root, min, root.data - 1);
		
		// incase of right, min should be == or > than root.data
		boolean isRightOk = isBST(root, root.data, max);

		return isLeftOk && isRightOk;
	}

	public static void main(String[] args) {

	}

}
