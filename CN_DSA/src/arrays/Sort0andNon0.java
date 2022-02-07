package arrays;

public class Sort0andNon0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {9, 0, 0, 8, 2, 0 ,8, 0};
//		int index = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] != 0) {
//				arr[index] = arr[i];
//				index++;
//			}			
//		}
//		int j = index;
//		while(j<arr.length)
//		{
//			arr[j] = 0;
//			j++;
//		}
		
		
		
		int i = 0;
		int j= arr.length - 1;
		while(i < j) {
			if(arr[i] == 0) {
				i++;
			}
			if(arr[j] != 0) {
				j--;
			}
			if(i<j && arr[i] != 0 && arr[j] == 0) {
				int temp= arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
