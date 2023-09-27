package trees;


public class CountNumberOfNodes {
		
	public static int getNoOfNodes(TreeNode<Integer> root) {
		
		// no need of base case because it is getting handled inside for loop - > if there is only single node then this fxn returns 1
		// although we need to handle an edge case where if the node is null it should return 
		
		// edge case not base case
		if(root == null) {
			return 0;
		}
					
		// 1 for root node
		int numNodes = 1;
		for(int i = 0; i< root.children.size(); i++) {
			numNodes += getNoOfNodes(root.children.get(i));
		}
		
		return numNodes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInputTree takeInputTree = new TakeInputTree();
		TreeNode<Integer> root = takeInputTree.takeInputLevelWise();
		System.out.println(getNoOfNodes(root));
	}

}
