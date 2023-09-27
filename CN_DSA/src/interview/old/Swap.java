package interview.old;

public class Swap {

	public static int[] swapElem(int i, int j) {
		
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		
		int newArr[] = new int[2];
		newArr[0] = i;
		newArr[1] = j;
		
		return newArr;
	}
	
	public static int[] swap(int[] arr) {
		
		int i = 0;
		int j = arr.length - 1;
		
		int[] newArr =swapElem(arr[i], arr[j]);
		
		arr[i] = newArr[0];
		arr[j] = newArr[1];
		
//		for(int k: arr) {
//			System.out.print(k + " ");
//		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		
		int[] swappedArr = swap(arr);
		for(int i: swappedArr) {
			System.out.println(i);
		}
		
	}

}
