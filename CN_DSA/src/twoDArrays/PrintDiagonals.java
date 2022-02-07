package twoDArrays;

public class PrintDiagonals {
	
	// in only 1 traversal
	
	public static void printPrimaryDiagonals(int mat[][]) {

		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
	}

	public static void printsecondaryDiagonals(int mat[][]) {

		int k = mat.length - 1;
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][k--]);
		}
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
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		print(mat);
		printPrimaryDiagonals(mat);
		printsecondaryDiagonals(mat);
	}

}
