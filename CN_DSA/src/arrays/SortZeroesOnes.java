package arrays;

public class SortZeroesOnes {

	public static void sortArr(int arr[]) {
//		int cnt0 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				cnt0++;
//			}
//		}
//			int s = 0;
//			while(s < cnt0) {
//				arr[s] = 0;
//				s++;
//			}	
//			int l = cnt0;
//			while(l < arr.length) {
//				arr[l] = 1;
//				l++;
//			}
		
		// only 1 scan
		
		
		int i = 0;
		int j= arr.length - 1;
		while(i < j) {
			if(arr[i] == 0) {
				i++;
			}
			if(arr[j] == 1) {
				j--;
			}
			if(i<j && arr[i] == 1 && arr[j] == 0) {
				int temp= arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			
		}
	
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,1,0,1,0,0};
		sortArr(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
