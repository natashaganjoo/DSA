package binarytrees;

public class IsNodePresent {

	public static boolean isPresent(Node<Integer> root, int number) {

		if (root == null) {
			return false;
		}

		if (root.data == number) {
			return true;
		}

		boolean left = isPresent(root.left, number);
		boolean right = isPresent(root.right, number);

		if (left == true || right == true) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		InputAndOutput io = new InputAndOutput();

		Node<Integer> root = io.takeInputLevelWise();

		System.out.println(isPresent(root, 3));

	}

}
