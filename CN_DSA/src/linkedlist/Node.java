package linkedlist;

// generic so that we can pass any type of data
public class Node<T> {

	T data;
	Node<T> next;
	
	Node(T data) {
		this.data = data;
		next = null;
	}
	
}
