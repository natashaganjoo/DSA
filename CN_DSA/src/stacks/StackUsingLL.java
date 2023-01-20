package stacks;

public class StackUsingLL<T> {

	Node<T> head;
	int size;

	public StackUsingLL() {
		head = null;
		size = 0;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return (size() == 0);
// 		or
//		return (head == null)

	}

	T top() throws StackEmptyException {
		if (size() == 0) {
//			StackEmptyException e = new StackEmptyException();
//			throw e;
			throw new StackEmptyException();
		}
		return head.data;
	}

	void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}

	T pop() throws StackEmptyException {
		if (size() == 0) {
			throw new StackEmptyException();
		}
		Node<T> temp = head;
		head = temp.next;
		size--;
		return temp.data;
	}
}
