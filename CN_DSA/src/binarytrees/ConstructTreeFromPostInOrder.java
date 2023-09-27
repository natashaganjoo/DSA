package binarytrees;

public class ConstructTreeFromPostInOrder {

	public static Node<Integer> buildTreeHelper(int[] in, int[] post, int inStart, int inEnd, int postStart,
			int postEnd) {

		if (inStart > inEnd) {
			return null;
		}

		int rootData = post[postEnd];
		Node<Integer> root = new Node<Integer>(rootData);

		int rootIndex = -1;
		for (int i = inStart; i <= inEnd; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		// means root index is not set which means same data is not present in inorder
		// tree
//		if (rootIndex == -1) {
//			return null;
//		}

		int leftInStart = inStart;
		int leftInEnd = rootIndex - 1;
		int leftPostStart = postStart;
		int leftPostEnd = leftInEnd - leftInStart + leftPostStart;

		int rightInStart = rootIndex + 1;
		int rightInEnd = inEnd;
		int rightPostStart = leftPostEnd + 1;
		int rightPostEnd = postEnd - 1;

		root.left = buildTreeHelper(in, post, leftInStart, leftInEnd, leftPostStart, leftPostEnd);
		root.right = buildTreeHelper(in, post, rightInStart, rightInEnd, rightPostStart, rightPostEnd);
		return root;

	}

	public static Node<Integer> buildTree(int post[], int in[]) {
		return buildTreeHelper(in, post, 0, in.length - 1, 0, post.length - 1);
	}

	public static void main(String[] args) {
		InputAndOutput io = new InputAndOutput();

		// we are given 2 arrays post and inOrder traversals
		int post[] = { 4, 5, 2, 6, 7, 3, 1 };
		int in[] = {4, 2, 5, 1, 6, 3, 7 };

		Node<Integer> root = buildTree(post, in);
		io.printTreeLevelWise(root);
	}

}
