package recursion1;

public class Fibonacci {

	
	public static int fib(int n) {
		
		// fibonacci of 0 is 0 and 1 is 1
		if(n<2) {
			return n;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fib(5));
	}

}

