package binarytrees;

public class ConstructTreeFromPreInOrder {

	public static Node<Integer> buildTreeHelper(int[] in, int[] pre, int inStart, int inEnd, int preStart, int preEnd) {

		// means arr is empty
		if (inStart > inEnd) {
			return null;
		}

		int rootData = pre[preStart];
		Node<Integer> root = new Node<Integer>(rootData);

		// now we have got root data, so search for it in Inorder to get left and right
		// subtree
		// find root index from inorder
		int rootIndex = -1;
		for (int i = inStart; i <= inEnd; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		if (rootIndex == -1) {
			return null;
		}
//		// now we will require foll. 8 variables:

		int leftInStart = inStart;
		int leftInEnd = rootIndex - 1;
		// leftPreStart is not rootIndex + 1 because rootIndex is of inOrder array

		int leftPreStart = preStart + 1;

		// leftPreEnd - leftPreStart = leftInEnd - leftInStart
		// leftPreEnd = leftInEnd - leftInStart + leftPreStart
		int leftPreEnd = leftInEnd - leftInStart + leftPreStart;

		int rightInStart = rootIndex + 1;
		int rightInEnd = inEnd;
		int rightPreStart = leftPreEnd + 1;
		int rightPreEnd = preEnd;

		root.left = buildTreeHelper(in, pre, leftInStart, leftInEnd, leftPreStart, leftPreEnd);

		root.right = buildTreeHelper(in, pre, rightInStart, rightInEnd, rightPreStart, rightPreEnd);

		return root;

	}

	public static Node<Integer> buildTree(int pre[], int in[]) {
		return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length - 1);
	}

	public static void main(String[] args) {

		InputAndOutput io = new InputAndOutput();

		// we are given 2 arrays pre and inOrder traversals
		int pre[] = { 1, 2, 4, 5, 3, 6, 7 };
		int in[] = { 4, 2, 5, 1, 6, 3, 7 };

		Node<Integer> root = buildTree(pre, in);
		io.printTreeLevelWise(root);
	}

}
