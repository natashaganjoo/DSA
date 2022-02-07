package arrays;

public class ArrangeNumbersInArray {

	// Approach: Odd elements on left side and even on right side
	
	public static int[] arrangeNumbers(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		int val = 1;
		while(left <= right) {
			// populate left side
			if(val % 2 == 1) {
				arr[left] = val;
				val++;
				left++;
			}
			else {
				arr[right] = val;
				right--;
				val++;
			}
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

		int arr[] = {1, 2, 3, 4, 5};
		int arranged[] = arrangeNumbers(arr);
		displayElements(arranged);
	}

}
