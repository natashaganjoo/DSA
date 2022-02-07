package arrays;

public class SwapAlternative {

	public static int[] swapAlternative(int arr[]) {
		int i = 0;
		
		while(i < arr.length - 2) {
			// swap
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i+1] = temp;
			i+=2;	
		}
		return arr;
	}
	
	public static void displayElements(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int swapped[] = swapAlternative(arr);
		displayElements(swapped);
	}

}
