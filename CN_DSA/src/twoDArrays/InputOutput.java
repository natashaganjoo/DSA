package twoDArrays;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of cols");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];
		// input
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("enter element at" + i + " row and " + j + " col");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}

	}

}
