package twoDArrays;

public class LargestRowOrCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 3, }, { 4, 5, 6 } };

		

		int rows = arr.length;
		int cols = arr[0].length;
		int indexofRow = 0;
		int largestRow = Integer.MIN_VALUE;

		for (int i = 0; i < rows; i++) {
			int sumofRow = 0;
			for (int j = 0; j < cols; j++) {
				sumofRow += arr[i][j];
				
			}
//			System.out.println(sumofRow);
			if (sumofRow > largestRow) {
				largestRow = sumofRow;
				indexofRow = i;
			}
		}
		
		// for largest col
		int indexofCol = 0;
		int largestCol = Integer.MIN_VALUE;
		int sumOfCol = 0;
		for (int j = 0; j < cols; j++) {
			sumOfCol = 0;
			for (int i = 0; i < rows; i++) {
				sumOfCol += arr[i][j];
			}
			if (sumOfCol > largestCol) {
				largestCol = sumOfCol;
				indexofCol = j;
			}
//			System.out.println("sum of " + j + " col: " + sum);
		}
		
		
		if(largestRow>largestCol) {
			System.out.println("row " + indexofRow +" "+ largestRow);
			
		}
		else {
			System.out.println("col " + indexofCol + " " + largestCol);
		}
		
		
	}

}
