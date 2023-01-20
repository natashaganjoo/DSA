package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1, 2, 3, 5};
		int i = 0;
		int j = A.length - 1;
		int temp = 0;
		
		while(i < j){
		    temp = A[i];
		    A[i] = A[j];
		    A[j] = temp;
		    i++;
		    j--;
		}
		
		for(int k=0; k< A.length; k++){
		    
		    System.out.print(A[k] + " ");
		}
	}

}
