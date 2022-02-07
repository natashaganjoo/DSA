package arrays;

public class PrintPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] =  {1,3,4,5,2};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				System.out.println(arr[i]+","+ arr[j]);
			}
		}
	}

}
