package trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

	public static TreeNode<Integer> takeInputRecursive() {
		int n;
		System.out.println("Enter the root node data: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter the number of children nodes: ");
		int noOfChildren = sc.nextInt();

		for (int i = 0; i < noOfChildren; i++) {
			// assume root has 3 children, then we will iterate 3 times to get input of
			// subtrees
			TreeNode<Integer> child = takeInputRecursive();
			// when the subtree is filled it returns node which is root of that subtree ->
			// the root of subtree will be the child
			// of our main root node

			root.children.add(child);
		}

		return root;
	}

	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();

				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (Exception e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}

	public static void printLevelWise(TreeNode<Integer> root) {

		if (root == null) {
			return;
		}

		Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();

		q.add(root);
		q.add(null);

		while (!(q.isEmpty()) && q.size() != 1) {
			TreeNode<Integer> front = q.poll();
			if (front == null) {
				q.add(null);
				System.out.println();
			} else {
				System.out.print(front.data + " ");
				for (int i = 0; i < front.children.size(); i++) {
					q.add(front.children.get(i));
				}
			}
		}
	}

	// Assume a tree
	// 1: 2, 3, 4
	// 2:
	// 3: 5
	// 5:
	// 4: 6
	// 6

	// 2, 5, 6 are child nodes

	public static void printTreeRecursive(TreeNode<Integer> root) {

		String s = root.data + ": ";

		// for the root we are getting 2, 3, 4's data
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}

		System.out.println(s);

		// use recursion for the remaining subtree
		for (int i = 0; i < root.children.size(); i++) {
			printTreeRecursive(root.children.get(i));
		}

	}

	public static void main(String[] args) {

//		TreeNode<Integer> node1 = new TreeNode<Integer>(1);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(4);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(6);
//
//		node1.children.add(node2);
//		node1.children.add(node3);
//		node1.children.add(node4);
//		
//		node3.children.add(node5);
//		node4.children.add(node6);
//		
//		System.out.println(node1);

//		TreeNode<Integer> root = takeInputRecursive();
//		printTreeRecursive(root);
//		System.out.println(getNoOfNodes(root));

		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);

	}

}
