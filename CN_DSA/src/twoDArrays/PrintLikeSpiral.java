package twoDArrays;

public class PrintLikeSpiral {

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
	
	public static void printSpiral(int arr[][]) {
		
		int rs = 0;
		int re = arr.length;
		int cs = 0;
		int ce = arr[0].length;
		int no_of_elements = re*ce;
		int cnt = 0;
		// print left wall, rows is changing, col is static
			
		while(cnt <= no_of_elements) {
		for (int i = rs; i < re; i++) {
			System.out.print(arr[i][cs] + " ");
			cnt++;
		}
		// after printing one column increase column start
		cs++;
		
		// print bottom wall, col is changing, rows is static
		for (int j = cs; j < ce; j++) {
			System.out.print(arr[re-1][j]+ " ");
			cnt++;
		}
		re--;
		
		// print right wall, rows is changing, col is static
		for (int i = re - 1; i >= rs; i--) {
			System.out.print(arr[i][ce-1] + " ");
			cnt++;
		}
		ce--;
		// print upper wall, cols is changing, rows is static
		for (int j = ce - 1; j >= cs; j--) {
			System.out.print(arr[rs][j]+ " ");
			cnt++;
		}
		rs++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		print(arr);
		printSpiral(arr);
	}

}
