package stacks;

// stack using array
public class StackUsingArrays {

	int[] data;
	int top; // index of topmost element

	public StackUsingArrays() {
		data = new int[10];
		top = -1;
	}

	public StackUsingArrays(int capacity) {
		data = new int[capacity];
		top = -1;
	}

	// if top is -1 it means stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	public int size() {
		return top + 1;
	}

	public int getTop() throws StackEmptyException {
		if (size() == 0) {
			// Stack Empty Exception
			StackEmptyException e = new StackEmptyException();
			throw e;
		}

		return data[top];
	}

	public void push(int elem) throws StackFullException {
//		if (size() == data.length) {
//			// if stack is full
//			StackFullException e = new StackFullException();
//			throw e;
//		}
		
		doubleCapacity();
		top++;
		data[top] = elem;
	}

	// return the popped element
	public int pop() throws StackEmptyException {
		if (size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		
		for (int i = 0; i <= top; i++) {
			data[i] = temp[i];
		}
	}

}
