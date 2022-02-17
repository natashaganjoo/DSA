package recursion;

public class SumOfNaturalNumbers {

	public static int sum(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		int ans = sum(n - 1);
		return n + ans;
	}
	public static void main(String[] args) {
	
		int n = 3;
		int ans = sum(n);
		System.out.println(ans);

	}

}
