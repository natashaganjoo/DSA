package arrays;

public class MoveNegativesinArray {

	public static void main(String[] args) {
		
		int arr[] = {-1, -2, -3, 5, 4, 9, -9, 2};
		int left = 0;
		int right = arr.length - 1;
		int temp = 0;
		
		while(left < right) {
			if (arr[left] < 0) { left++; }
			else if (arr[left] > 0 && arr[right] > 0) { right--; }
			else if (arr[left] > 0 && arr[right] < 0) { 
				temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right--;
					
			}
		}
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
 