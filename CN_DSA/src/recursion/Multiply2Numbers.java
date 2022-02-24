package recursion;

public class Multiply2Numbers {

	/* Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and 
	 * addition for your calculation. No other operators are allowed.
	 */

	static int multiply(int m, int n) {
		if(m == 0 || n == 0) {
			return 0;
		}
		return m + multiply(m, n-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(multiply(3, 9));
	}

}
