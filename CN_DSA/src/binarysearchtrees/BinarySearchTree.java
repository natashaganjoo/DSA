package binarysearchtrees;


public class BinarySearchTree {

	private Node<Integer> root;

	private Node<Integer> insertDataHelper(int data, Node<Integer> root) {

		if (root == null) {
			Node<Integer> newNode = new Node<Integer>(data);
			return newNode;
		}

		if (data > root.data) {
			root.right = insertDataHelper(data, root.right);
		} else {
			root.left = insertDataHelper(data, root.left);
		}
		return root;
	}

	public void insertData(int data) {

		root = insertDataHelper(data, root);
	}

	// we don't want user to access root and manipulate, thats why private. root is
	// also private
	// he will just call hasData and we will call helper because it can access root

	private boolean hasDataHelper(int data, Node<Integer> root) {

		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}

		if (data < root.data) {
			return hasDataHelper(data, root.left);
		} else {
			return hasDataHelper(data, root.right);
		}
	}

	public boolean hasData(int data) {
		return hasDataHelper(data, root);
	}
	
	
	public Node<Integer> deleteData(int data) {
		return deleteDataHelper(data, root);
	}

	
	private Node<Integer> deleteDataHelper(int data, Node<Integer> root) {
		
		if(root == null) {
			return null;
		}
		
		if(data < root.data) {
			root.left = deleteDataHelper(data, root.left);
			return root;
		}
		else if(data > root.data) {
			root.right = deleteDataHelper(data, root.right);
			return root;
		}
		// if root data is equal to data
		
		else {
			// if there is only 1 node root and no right or left
			if(root.left == null && root.right == null) {
				return null;
			}
			// if left is null then delete root, root's right will be new root
			else if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			// if both subtrees are present
			// then we can't delete root directly, we need to find a new root first
			// best replacement for root will be either the largest node on left side or smallest on right side 
			// lets do this by finding min on right subtree
					
			
//								 4
//							      \
//							   	   6
//							   	  /  \
//							     5    7
//			
//			Here 5 is min so now
//								
//								5
//								 \
//								  6
//								 / \
//							    5   7
			
//			Now delete 5 from right subtree							   
//			
//								5
//								 \
//								  6
//								   \
//								    7
			
			else {
				Node<Integer> minNode = root.right;
				
				// because min will be on left of right subtree
				while(root.left != null) {
					minNode = minNode.left;
				}

				// change root's data to min node, all the links will be same
				// now delete min from right subtree
				root.data = minNode.data;
				root.right = deleteDataHelper(minNode.data, root.right);
			}
		}
		return root;
	}
	
	private void printTreeRecursive(Node<Integer> root) {

		// base case
		if (root == null) {
			return;
		}

		String toBePrinted = root.data + "";

		if (root.left != null) {
			toBePrinted += "L: " + root.left.data + ",";
		}

		if (root.right != null) {
			toBePrinted += "R: " + root.right.data;
		}

		System.out.println(toBePrinted);
		printTreeRecursive(root.left);
		printTreeRecursive(root.right);

	}

	public void printTree() {
		printTreeRecursive(root);
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(3);
		bst.insertData(7);
		bst.printTree();

	}
}
