package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[] = {7,2,9,6,1,5,4};
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	}


