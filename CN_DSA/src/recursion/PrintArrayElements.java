package recursion;

public class PrintArrayElements {

	static void printElements(int arr[], int si) {
		
		if(si == arr.length) {
			return;
		}
		System.out.println(arr[si]);
		printElements(arr, si + 1);
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		printElements(arr, 0);
	}

}
