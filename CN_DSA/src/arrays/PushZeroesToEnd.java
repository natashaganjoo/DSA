package arrays;

public class PushZeroesToEnd {

	public static int[] pushZeroesToEnd(int arr[]) {
		
		// only 1 array traversal
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}			
		}

		int j = index;
		while(j <arr.length)
		{
			arr[j] = 0;
			j++;
		}	
		
		return arr;
	}
	
	public static void displayElements(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 0, 0, 8, 2, 0 ,8, 0};
		int pushedArr[] = pushZeroesToEnd(arr);
		displayElements(pushedArr);
	}

}
