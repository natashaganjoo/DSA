package interview.old;


public class StackUse {

	public static void main(String[] args) {

		StackUsingArray stack = new StackUsingArray();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

//		for (int i = 0; i < 9; i++) {
//			stack.push(i);
//		}

		stack.print();
		stack.pop();
		stack.print();
		System.out.println(stack.top());
//		while (!stack.isEmpty()) {
////			System.out.println(stack);
//		}
	}

}
