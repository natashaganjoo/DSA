package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 2, 3, 6, 8, 9};
		
		
		int i = 0;
		// need a sorted array for this 
		// eg 1 != 2 so its unique because the array is sorted and we won't find its occurence in later traversals
		for(int j = 1; j< arr.length; j++) {
			if(arr[i]  != arr[j]) {
				i++;
				arr[i] = arr[j];
		}
	}
		
		for(int k=0; k< arr.length; k++) {
			System.out.println(arr[k]);
		}

}
}
