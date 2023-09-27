package trees;


public class SumOfNodes {

	public static int sumOfNodes(TreeNode<Integer> root) {

		// edge case
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int sum = root.data;

		for (int i = 0; i < root.children.size(); i++) {
			sum += sumOfNodes(root.children.get(i));
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInputTree takeInputTree = new TakeInputTree();

		TreeNode<Integer> root = takeInputTree.takeInputLevelWise();
		System.out.println(sumOfNodes(root));
	}

}
