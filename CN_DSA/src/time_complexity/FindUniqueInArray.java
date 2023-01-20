package time_complexity;
/*
	You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
	Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
	You need to find and return that number which is unique in the array/list.
 */
public class FindUniqueInArray {

	/*
	 Approaches:
	 1. Use nested loop and count which element has appeared twice. Break TL - o(n2) 
	 2. First sort the array and then compare arr[i] with arr[i + 1] element TL = o(nlogn + n)
	 	For sorting - nlogn and for comparing n
	 3. Xor operator, 1 traversal TL - O(n)
	 */
	

	
//	public static void findUnique(int arr[]){
//		for (int i = 0; i < arr.length; i++) {
//			int cnt = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if(i != j) {
//					if(arr[i] == arr[j]) {
//						cnt++;
//					}
//				}			
//			}
//			if(cnt == 0) {
//				System.out.println(arr[i]);
//			}
//		}
//	}
	
	
	public static void findUnique(int arr[]){
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			 result = result ^ arr[i];
		}
		System.out.println(result);	
		}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 8, 4, 2, 2, 4, 1};
		findUnique(arr);
		
	}

}
