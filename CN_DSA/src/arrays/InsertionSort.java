package arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,2,9,6,1,5,4};
		
		for (int i = 1; i < arr.length; i++) {
			
			int j = i-1;
			while(j > 0 && arr[j] > arr[i]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				j--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}
}