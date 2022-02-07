package arrays;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
	
		int start = 0;
		int end = arr.length - 1;
	
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6};
		int no = binarySearch(arr, 5);
		System.out.println(no);
	}

}
