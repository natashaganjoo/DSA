package interview.old;

public class StackUsingArray {

	int data[];
	int top;

	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}

	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int top() {
		return data[top];
	}

	public void push(int elem) {
		top++;
		data[top] = elem;
	}

	public void pop() {
		top--;
	}

	public void print() {
		for (int i = 0; i < size(); i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}
}
