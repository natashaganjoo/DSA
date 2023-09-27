package binarysearchtrees;

public class SearchNode {

	public static boolean searchInBST(Node<Integer> root, int k) {
		
		if(root == null){
			return false;
		}

		if(root.data == k){
			return true;
		}

		if( k > root.data){
			return searchInBST(root.right, k);
		}
		else{
			return searchInBST(root.left, k);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Node<Integer> root = new Node<>(0);
		    root.left = new Node<>(1);
		    root.left.left = new Node<>(3);
		    root.left.left.left = new Node<>(7);
		    root.left.right = new Node<>(4);
		    root.left.right.left = new Node<>(8);
		    root.left.right.right = new Node<>(9);
		    root.right = new Node<>(2);
		    root.right.left = new Node<>(5);
		    root.right.right = new Node<>(6);
		    
		    System.out.println(searchInBST(root, 3));
	}

}
