package recursion1;

public class FindMaxElementInArray {

	public static int findMax(int arr[], int si)
	{
		// go until last index of array
		if(si == arr.length - 1)
		{
			return arr[si];
		}
	
		int max = findMax(arr, si + 1);
		if(arr[si] > max) {

			return arr[si];
		}
		else {
			return max;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,45,4,5,7};
		System.out.println(findMax(arr, 0));
	}

}
