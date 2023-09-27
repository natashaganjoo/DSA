package interview.old;

public class DistinctElem {

	public static void distinct(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 5, 1, 3 };
	}

}
