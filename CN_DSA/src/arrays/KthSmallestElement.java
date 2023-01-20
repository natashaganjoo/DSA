package arrays;
import java.util.Arrays;
public class KthSmallestElement {

	public static void main(String[] args) {

		int arr[] = {1,4,5,6,3};
		int k = 3;
		Arrays.sort(arr);
		
		System.out.println(arr[k - 1]);
		
	}

}
