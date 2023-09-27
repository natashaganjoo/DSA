package interview.old;

public class Sort01 {

	public int[] swap(int i, int j) {
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		int arr[] = new int[2];
		arr[0] = i;
		arr[1] = j;
		return arr;
	}
	
	public static int[] sort_arr(int arr[]) {

//		int cnt = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//
//		for (int i = 0; i < cnt; i++) {
//			arr[i] = 0;
//		}
//
//		for (int j = cnt; j < arr.length; j++) {
//			arr[j] = 1;
//		}

//		return arr;
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j) {
			if(arr[i] == 0) i++;
			
			if(arr[j] == 1) j--;

			if(arr[i] == 1) {
				// swap
				int temp = 0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		return arr;
	}

	public static void main(String args[]) {
		System.out.println();
		int arr[] = { 0, 1, 1, 0, 1, 0 };
		sort_arr(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
