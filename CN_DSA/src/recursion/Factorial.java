package recursion;

public class Factorial {

	// factorial for n is n * (n-1) * (n-2) * (n-3)!
	// recursion steps:
	/*
	 1. Find base case
	 2. call the same fxn
	 3. some processing 
	*/
	
	public static int  fact(int n) {
		
		// base condition
		
		if(n == 0) {
			return 1;
		}
		int ans = fact(n-1);
		return n * ans;
	}
	
	public static void main(String[] args) {
	int n = 3;
	int ans = fact(n);
	System.out.println(ans);

	}

}
