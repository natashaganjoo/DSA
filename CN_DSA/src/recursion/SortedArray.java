package recursion;


public class SortedArray {

	// base case: if the arr is of 0 or 1 length it is already sorted
	
	// 1st approach
	public static boolean checkSorted(int[] arr) {
		
		if(arr.length <= 1) {
			return true;
		}
		
		int smallArr[] = new int[arr.length - 1];
		
		// we have to copy all elements
		for (int i = 1; i < arr.length; i++) {
			smallArr[i-1] = arr[i];
		}
		
		boolean ans = checkSorted(smallArr);
		if(!ans) {
			return false;
		}
		if(arr[0] <= arr[1]) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// 2nd approach
	// there is no point in checking whether ist element is greater than 2nd later, we should check it earlier and return false
	public static boolean checkSorted_2(int[] arr) {
		
		if(arr.length <= 1) {
			return true;
		}
		
		if(arr[0] > arr[1]) {
			return false;
		}
		
		int smallArr[] = new int[arr.length - 1];
		
		// we have to copy all elements
		for (int i = 1; i < arr.length; i++) {
			smallArr[i-1] = arr[i];
		}
		
		boolean ans = checkSorted(smallArr);
		return ans;
		
	}
	
	// better approach: in the other two approaches we were creating a new array for every sub problem, so in terms of space 
	// it wasn't good. Now we'll only play with the array indices
	public static boolean checkSorted_better(int[] arr, int startIndex) {
			
			// base case: if SI is at the end of array, stop
			if(startIndex == arr.length - 1) {
				return false;
			}
			
			// if ist is greater than 2nd, it means array is unsorted no need to check it for (n-1) problems
			if(arr[startIndex] > arr[startIndex + 1]) {
				return false;
			}
			
			boolean smallAns = checkSorted_better(arr, startIndex + 1);
			return smallAns;
		}
	
	public static void main(String[] args) {
		
		int arr[] = {2,1,4,5,6};
		System.out.println(checkSorted(arr));
		System.out.println(checkSorted_2(arr));
		System.out.println(checkSorted_better(arr, 0));
	}

}
