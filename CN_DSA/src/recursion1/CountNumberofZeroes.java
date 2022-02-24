package recursion1;

public class CountNumberofZeroes {

	static int countZeroes(int n) {
		
		// here we are handling a special case where if only 0 is passed we'll return 1
		if(n == 0) {
			return 1;
		}
		
		return countZeroes(n, 0);
	}
	
	static int countZeroes(int n, int cnt) {
		
		if(n == 0) {
			return cnt;
		}
		// to find last digit 
		if(n % 10 == 0) {
			cnt++;
		}
		// to send the remaining no to recursion n/10
		return countZeroes(n/10, cnt);
	}
	
	public static void main(String[] args) {
		
		System.out.println(countZeroes(70800));

	}

}
