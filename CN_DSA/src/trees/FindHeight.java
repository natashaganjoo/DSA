package trees;

public class FindHeight {

	public static int findHeight(TreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		int ans = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int childHeight = findHeight(root.children.get(i));
			
			// find height of every child and if its largest assign it to the ans
			if(childHeight > ans) {
				ans = childHeight;
			}
				
		}

		return ans + 1;
	}

	public static void main(String[] args) {
		TakeInputTree takeInput = new TakeInputTree();
		TreeNode<Integer> root = takeInput.takeInputLevelWise();
		System.out.println(findHeight(root));
	}

}
