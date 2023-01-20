package stacks;

public class StackusingLLUse {

	public static void main(String[] args) {
		
	
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		
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
