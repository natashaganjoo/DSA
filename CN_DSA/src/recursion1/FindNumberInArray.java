package recursion1;

public class FindNumberInArray {

	public static boolean findNumber(int input[], int x) {
		return checkNumber(input, x, 0);
	}
	

	public static boolean checkNumber(int input[], int x, int start) {
		
		// base case
		if(start == input.length - 1) {
			if(input[start] == x) {
				return true;
			}
			return false;
		}
		
		if(input[start] == x) {
			return true;
		}
		
		boolean smallAns = checkNumber(input, x, start + 1);
		return smallAns;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
//		System.out.println(findNumber(arr, 9));
//		System.out.println(findNumberBetter(arr, 9, 0));
		System.out.println(findNumber(arr, 10));
	}

}
