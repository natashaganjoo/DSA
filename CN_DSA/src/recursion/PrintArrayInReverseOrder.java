package recursion;

public class PrintArrayInReverseOrder {

	// this is from n to 1
	static void printElements(int arr[], int si) {
		
		if(si < 0) {
			return;
		}
		System.out.println(arr[si]);
		printElements(arr, si - 1);
	}
	
	
	static void printElements_2(int arr[], int si) {
		
		if(si == arr.length) {
			return;
		}
		
		printElements_2(arr, si + 1);
		System.out.println(arr[si]);
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
//		printElements(arr, arr.length - 1);
		printElements_2(arr, 0);
	}

}
