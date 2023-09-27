package trees;

public class PreOrderTraversal {

	public static void preOrder(TreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		for(int i = 0; i< root.children.size(); i++) {
			System.out.print(root.data + " ");
			preOrder(root.children.get(i));
		}
	}
	public static void main(String[] args) {
		TakeInputTree takeInputTree = new TakeInputTree();
		TreeNode<Integer> root = takeInputTree.takeInputLevelWise();
		preOrder(root);
		System.out.println();
	}

}
