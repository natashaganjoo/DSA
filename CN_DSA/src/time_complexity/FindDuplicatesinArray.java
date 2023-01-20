package time_complexity;

/*
	You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at 
	least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single 
	integer value that is present twice. You need to find and return that duplicate number present in the array.
	Note :
	Duplicate number is always present in the given array/list.
 */

public class FindDuplicatesinArray {

	/*
	 Approaches:
	 1. nested loop - O(n2)
	 2. sorting - o(nlogn) + n
	 3. Find sum of (n-2) elements then sum of all elements and subtract. Remaining would be the duplicate val. TL - O(n)
	 sum of (n-2) elems is (n-2)(n-1)/2
	 4. using xor of first n-2 elems with whole array
	 */
//	public static void findDuplicates(int arr[]){
//		for (int i = 0; i < arr.length; i++) {
//			int cnt = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if(i != j) {
//					if(arr[i] == arr[j]) {
//						cnt++;
//					}
//				}			
//			}
//			if(cnt > 0) {
//				System.out.println(arr[i]);
//				break;
//			}
//		}
//	}
	
	public static void findDuplicates(int arr[]){
		
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = result ^ arr[i];  
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			result = result ^ arr[i];
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {

		int arr[] = {0, 5, 1, 8, 9, 3, 5};
		findDuplicates(arr);
	}

}
