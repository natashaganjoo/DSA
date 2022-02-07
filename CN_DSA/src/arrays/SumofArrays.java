package arrays;

public class SumofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {6,9,8};
		int arr2[] =   {5,9,2};
		
		int output[] = new int[arr1.length + 1];
		
		int carry = 0;
		int sum = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = output.length - 1;
		
		while(i >= 0 && j >= 0 ) {
			sum = arr1[i] + arr2[j] + carry;
			output[k] = sum % 10;
			carry  = sum/10;
			i--;
			j--;
			k--;
		}
		while(i >= 0) {
			sum = arr1[i] + carry;
			output[k] = sum % 10;
			carry  = sum/10;
			i--;
			k--;
		}
		
		while(j >= 0 ) {
			sum = arr2[j] + carry;
			output[k] = sum % 10;
			carry  = sum/10;
			j--;
			k--;
		}

		output[k] = carry;

		for (int l = 0; l < output.length; l++) {
			System.out.println(output[l]);
		}
	}

}
