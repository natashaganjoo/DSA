package interview.old;

public class RotateArr {

	public static int[] swap(int i, int j) {
		int arr[] = new int[2];

		int temp = 0;
		temp = i;
		i = j;
		j = temp;

		arr[0] = i;
		arr[1] = j;

		return arr;
	}

	public static int[] reverse(int arr[], int i, int j) {
		while (i < j) {
//			int temp = 0;
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
			int arr1[] = swap(arr[i], arr[j]);
			i++;
			j--;
		}
		return arr;
	}

	public static int[] rotate(int arr[], int d) {

		int arr1[] = reverse(arr, 0, d - 1);
		int arr2[] = reverse(arr, d, arr.length - 1);
		int arr3[] = reverse(arr, 0, arr.length - 1);
		return arr;
	}

//	case 1: using temp arr[]
//	public static int[] rotate(int arr[], int d) {
//		
//		int temp[] = new int[d];
//		for(int i=0; i< d; i++) {
//			temp[i] = arr[i];
//		}
//		
//		int index = 0;
//		for(int j = d; j < arr.length; j++) {
//			arr[index] = arr[j];
//			index++;
//		}
//		
//		for(int k = 0; k < temp.length; k++) {
//			arr[index] = temp[k];
//			index++;
//		}
//		
//		return arr;
//	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		int rotated[] = rotate(arr, d);
		for (int i : rotated) {
			System.out.print(i + " ");
		}
	}
}
