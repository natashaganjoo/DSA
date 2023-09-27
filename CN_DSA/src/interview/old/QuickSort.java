package interview.old;

public class QuickSort {

	public static void swap(int arr[], int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int arr[], int lo, int hi) {

		int i = lo;
		int j = hi;
		int pivot = arr[lo];

		while (i < j) {
			do {
				i++;
			} while (arr[i] <= pivot);

			do {
				j--;
			} while (arr[j] > pivot);

			if (i < j) {
				swap(arr, arr[i], arr[j]);
			}
		}

		swap(arr, pivot, arr[j]);
		return j;
	}

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 6, 5, 8, 9, 3, 10, 15, 12, 16 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
