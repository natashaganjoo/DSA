package arrays;
import java.util.Arrays;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 13, 4, 1, 3, 6, 28};		
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-2]);
		
		// only in 1 scan
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			
			// what if the current element is greater than 2nd largest but smaller than largest
			else if(arr[i] != largest && secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
		
	}

}
