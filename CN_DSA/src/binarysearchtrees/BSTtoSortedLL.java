package binarysearchtrees;

class LLNode<T> {
	T data;
	LLNode<T> next;

	public LLNode(T data) {
		this.data = data;
		next = null;
	}
}

public class BSTtoSortedLL {

	public static LLNode<Integer> constructLinkedList(Node<Integer> root) {

		if (root == null) {
			return null;
		}

		LLNode<Integer> rootNode = new LLNode<>(root.data);

		LLNode<Integer> leftHead = constructLinkedList(root.left);
		LLNode<Integer> rightHead = constructLinkedList(root.right);

		rootNode.next = rightHead;

		LLNode<Integer> temp;
		temp = leftHead;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = rootNode;

		return null;
	}

	public static void main(String[] args) {

	}

}
