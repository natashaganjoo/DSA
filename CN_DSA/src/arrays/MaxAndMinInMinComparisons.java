package arrays;

public class MaxAndMinInMinComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1, 2, 9, 4, 6};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i< A.length; i++) {
			if(A[i] < min) {
				min = A[i];
			}
			if(A[i] > max) {
				max = A[i];
			}
		}
		
		System.out.println(min + " " + max);
	}

}
