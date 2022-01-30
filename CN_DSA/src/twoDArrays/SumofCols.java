package twoDArrays;

import java.util.Scanner;

public class SumofCols {

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
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
	}

	public static void sumOfRows(int arr[][]) {
		// to find no. of rows
		int rows = arr.length;
		// to find no. of cols
		int sum = 0;
		int cols = arr[0].length;

		for (int i = 0; i < rows; i++) {
			sum = 0;
			for (int j = 0; j < cols; j++) {
				sum += arr[i][j];
			}
			System.out.println("sum of " + i + " row is: " + sum);
		}
	}

	// why void --- because sum of each coln and return can be used only for one
	public static void sumOfCols(int arr[][]) {
		// to find no. of rows
		int rows = arr.length;
		// to find no. of cols
		int sum = 0;
		int cols = arr[0].length;
		// if taking i first then sum will be arr[j][i] (0,1) and (1,0) will change the whole meaning
		for (int j = 0; j < cols; j++) {
			sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
			System.out.println("sum of " + j + " col: " + sum);
		}
	}

	public static int largestSumOfCols(int arr[][]) {
		// to find no. of rows
		int rows = arr.length;
		// to find no. of cols
		int sum = 0;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;
		// if taking i first then sum will be arr[j][i] (0,1) and (1,0) will change the whole meaning
		for (int j = 0; j < cols; j++) {
			sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
			if(sum > largest) {
				largest = sum;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		print(arr);
//		sumOfRows(arr);
//		sumOfCols(arr);
		System.out.println("largest" + largestSumOfCols(arr));
	}

}
