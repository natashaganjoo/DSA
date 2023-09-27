package binarytrees;

public class CountNodes {

	public static int countNodes(Node<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		return ans;
	}
	
	
	public static void main(String[] args) {

		InputAndOutput io = new InputAndOutput();

		Node<Integer> root = io.takeInputLevelWise();
		
		System.out.println(countNodes(root));
	}

}
