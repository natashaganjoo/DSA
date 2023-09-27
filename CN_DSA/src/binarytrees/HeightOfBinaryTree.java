package binarytrees;

public class HeightOfBinaryTree {

	public static int heightOfTree(Node<Integer> root) {

		if (root == null) {
			return 0;
		}

		int lh = heightOfTree(root.left);
		int rh = heightOfTree(root.right);

		return 1 + Math.max(lh, rh);

	}

	public static void main(String[] args) {

		InputAndOutput io = new InputAndOutput();

		Node<Integer> root = io.takeInputLevelWise();

		System.out.println(heightOfTree(root));
	}

}
