package recursion;

public class CountNumberOfDigits {

	public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}
	
	public static void main(String[] args) {
		System.out.println(count(3235));
	}

}
