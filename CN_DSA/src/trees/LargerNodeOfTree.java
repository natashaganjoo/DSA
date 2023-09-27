package trees;

import java.util.Scanner;

public class LargerNodeOfTree {

	public static int largestNode(TreeNode<Integer> root) {

		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int largest = root.data;

		for (int i = 0; i < root.children.size(); i++) {

			int ans = largestNode(root.children.get(i));

			if (ans > largest) {
				largest = ans;
			}
		}

		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInputTree takeInput = new TakeInputTree();

		TreeNode<Integer> root = takeInput.takeInputLevelWise();
		System.out.println(largestNode(root));
	}

}
