package twoDArrays;

import java.util.Iterator;

public class SumofBoundariesAndDiagonals {

//	public static int sumofBoundaries(int mat[][]) {
//		int sum = 0;
//		int rows = mat.length;
//		int cols = mat[0].length;
//		
//		int n = mat.length;
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				if(i == 0 || j == 0 || i == rows - 1 || j == cols -1 ) {
//					System.out.println("boundaries: "+mat[i][j]);
//					sum += mat[i][j];
//				}
//			}
//		}
//		return sum;
//	}
//	
//	public static int sumofPrimaryDiagonals(int mat[][]) {
//	
//		int sum = 0;
//		for (int i = 0; i < mat.length; i++) {
//			if(i != 0 && i != mat.length -1) {
//			System.out.println("primary diagonals: " + mat[i][i]);
//			sum += mat[i][i];
//			}
//		}
//		return sum;
//	}
//	
	public static void print(int arr[][]) {
		// to find no. of rows
		int rows = arr.length;
		// to find no. of cols
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
//	
//	public static int sumofSecDiagonals(int mat[][]) {
//
//		int sum = 0;
//		int k = mat.length - 1;
//		for (int i = 0; i < mat.length; i++) {
//			if(i != 0 && i != mat.length -1) {
//			System.out.println("sec diagonals: "+mat[i][k--]);
//		    sum += mat[i][i];
//			}
//		}
//		return sum;
//	}
	
	// one approach is to have different methods for boundary sum, diagonal sum
	// best approach
	
	public static int totalSum(int[][] mat) 
    {
       int sum = 0;
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = 0; j < mat.length; j++) 
            {
                if (i == j || (i + j) == mat.length - 1) 
                {
                    sum += mat[i][j];
                }
                else if (i == 0 || j == 0 || i == mat.length - 1|| j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		print(mat);
//		int totalSum = sumofBoundaries(mat) + sumofPrimaryDiagonals(mat) + sumofSecDiagonals(mat);
		
		int totalSum = totalSum(mat); 
		System.out.println(totalSum);

	}

}
