package recursion1;

/*
 Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. 
  Return -1 if it is not present in the array.
	First index means, the index of first occurrence of x in the input array.
	Do this recursively. Indexing in the array starts from 0.
 */


public class FindFirstIndexOfElement {

	public static int findNumber(int arr[], int x) {
		
		return checkNumber(arr, x, 0);
	}
	
	public static int checkNumber(int input[], int x, int start) {

		// base case
		if(start == input.length) {
			return -1;
		}
		
		// check Ist index
		if(input[start] == x) {
			return start;
		}
		
		int smallAns = checkNumber(input, x, start + 1);
		return smallAns;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,7,4,5,7};
		System.out.println(findNumber(arr, 7));

	}
	
	// 1,2,9,4,5,7  
//	2,9,4,5,7
//	9,4,5,7
//	4,5,7
//	5,7
//	7
}
