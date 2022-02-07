package arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		// two arrays can be of diff length as well

		int a[] = {2,6,9,15};
		int b[] = {1,4,6,7};
		int sizeofC = a.length + b.length;
		int c[] = new int[sizeofC];
		
		int i = 0;
		int j = 0;
		int min = 0;
		int k = 0;

			while(i<a.length && j<b.length) {
			if(a[i] <= b[j]) {
				min = a[i];
				i++;
			}
			else {
				min = b[j];
				j++;
			}
			
			c[k] = min;
			k++;
		}

			while(i<a.length) {
				c[k] = a[i];
				i++;
				k++;
			}
			
			while(i<b.length) {
				c[k] = b[j];
				j++;
				k++;
			}
			
		for (int l = 0; l < c.length; l++) {
			System.out.println(c[l]);
		}
		
		
		
	}

}
