package binarysearchtrees;

public class ConstructBSTFromSortedArr {

	// BST follows the idea of binary search
	// consider a sorted arr - 1, 2, 3, 4, 5, 6, 7
	// one way of creating BST would be

		//	1
		//	 \
		//	  2
		//	   \
		//	    3
		//	     \
		//	      4
		//	       \
		//	        5

	// disadvantage of creating tree like this is searching becomes expensive - O(n)
	// so better approach is to create a balanced tree
	// find a mid that will be the root, to its left in the arr would be left
	// subtree to its right it would be right subtree
	// then left arr is 1, 2, 3 -- again mid 2 is root 1 left and 3 right

	public static Node<Integer> buildBST(int[] arr, int start, int end) {

		if (arr.length == 0) {
			return null;
		}

		int mid = (start + end) / 2;

		Node<Integer> root = new Node<Integer>(mid);

		Node<Integer> leftSub = buildBST(arr, start, mid - 1);
		Node<Integer> rightSub = buildBST(arr, mid + 1, end);
		root.left = leftSub;
		root.right = rightSub;

		return root;
	}

	public static void main(String[] args) {

	}

}
