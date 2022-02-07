package twoDArrays;

import java.util.Scanner;

public class PrintLikeWave {

	// Approach:  if we look at the wave carefully, if the cols are even the wave is going down and if its odd its going up.
	// So, we will have our loop printed on the condition of col
	
	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of cols");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("enter element at" + i + " row and " + j + " col");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

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
	
	public static void printWave(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		// cols are constant in both the conditions
		for(int j = 0; j < cols; j++) {
			
			if(j%2 == 0) 
			{
				// for up
				for(int i=0; i < rows; i++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				// for down
				for(int i= rows-1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}	
				}
			}
		}
	
	public static void main(String[] args) {

//		int arr[][] = takeInput();
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		print(arr);
		printWave(arr);
	}

}
