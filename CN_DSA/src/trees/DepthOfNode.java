package trees;

public class DepthOfNode {

	public static void printdepthOfkNode(TreeNode<Integer> root, int k) {

		if (root == null) {
			return;
		}

		if (k == 0) {
			System.out.println(root.data);
			return;
		}

		for (int i = 0; i < root.children.size(); i++) {
			printdepthOfkNode(root.children.get(i), k - 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInputTree takeInputTree = new TakeInputTree();
		TreeNode<Integer> root = takeInputTree.takeInputLevelWise();

		printdepthOfkNode(root, 2);
	}

}
