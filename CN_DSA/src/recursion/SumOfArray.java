package recursion;

public class SumOfArray {

	
	public static int sumOfArray(int[] arr, int n) {
		
		if(n <= 0) {
			return 0;
		}
		
		return arr[n-1] + sumOfArray(arr, n-1);
	}
	public static void main(String[] args) {
	
		 int arr[] = {1,2,3,4,2};
		 System.out.println(sumOfArray(arr, arr.length));
	}

}
