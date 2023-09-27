package binarytrees;

public class BinaryTreeUse {

	public static void main(String[] args) {

//		Node<Integer> root = new Node<Integer>(1);
//		Node<Integer> node1 = new Node<Integer>(1);
//		Node<Integer> node2 = new Node<Integer>(1);
//
//		root.left = node1;
//		root.right = node2;

		InputAndOutput io = new InputAndOutput();

//		   1
//		/    \
//	   2      3
//	  / \     / \
//	 4   5  -1  -1
//	/\  / \
//   /  \ -1,-1
//  -1  -1
		// input for recursive will be 1, 2, 3, -1, -1, 5, -1, -1, 3, -1, -1

//		Node<Integer> root = io.takeInputRecursive();
//		io.printTreeRecursive(root);

		Node<Integer> root = io.takeInputLevelWise();
		io.printTreeLevelWise(root);
	}

}
