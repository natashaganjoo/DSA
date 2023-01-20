package stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException {
		StackUsingArrays stack = new StackUsingArrays();

		for (int i = 0; i <= 5; i++) {
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				// we will never reach here
			}
		}
	}
}
