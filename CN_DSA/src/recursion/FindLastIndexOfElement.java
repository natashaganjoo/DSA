package recursion;

public class FindLastIndexOfElement {

public static int findNumber(int arr[], int x) {
		
		return checkNumber(arr, x, 0);
	}

	// one approach is to start traversing arr from n to 0, and do si-1
	// but here it is specifically asked that we need to traverse array in increasing order

	public static int checkNumber(int input[], int x, int start) {
		
		// base case
		if(start == input.length) {
			return -1;
		}

		// for finding last index, we will not look at the first index first, firstly do recursion then check!
		int smallAns = checkNumber(input, x, start + 1);
		
		if(smallAns != -1) {
			return smallAns;
		}
		if(input[start] == x) {
			return start;
		}
		else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {	
		
		int arr[] = {1,2,7,4,5,7};
		System.out.println(findNumber(arr, 7));
	}

}
