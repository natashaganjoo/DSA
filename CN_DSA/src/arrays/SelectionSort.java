package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,2,9,6,1,5,4};
		// for n-1 rounds 
		// 0 to length-2
		for (int i = 0; i < arr.length- 1; i++) {
			int min = arr[i];
			int minIndex = i;
			// we have to find min elem
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			// at the end of this loop we have our min ele and its index
			
			arr[minIndex] = arr[i];
			arr[i] = min;
//			arr[minIndex] = arr[i];
//			int temp = arr[i];
//			arr[i] = min;
//			arr[minIndex] = temp;
			
		}
		
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
