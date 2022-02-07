package twoDArrays;

public class PrintSpiralClockWise {

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
	
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		  if(matrix.length==0 || matrix[0].length==0)
	        {
	            return;
	        }
	        int rs = 0;
			int re = matrix.length;
			int cs = 0;
			int ce = matrix[0].length;
			int no_of_elements = re*ce;
			int cnt = 1;
			// print top wall
				
			while(cnt <= no_of_elements) {
			for (int j = cs; j < ce; j++) {
				System.out.print(matrix[rs][j] + " ");
	                             cnt++;
			}
			
			rs++;
			
			// print right wall
			for (int i = rs; i < re; i++) {
	            cnt++;
				System.out.print(matrix[i][ce-1]+ " ");
			}
			ce--;
			
			
			for (int j = ce-1; j >= cs; j--) {
				cnt++;
	            System.out.print(matrix[re-1][j]+ " ");
			}
			re--;
			
			for (int i = re - 1; i >= rs; i--) {
				cnt++;
	            System.out.print(matrix[i][cs]+ " ");
			}
			cs++;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		print(arr);
		spiralPrint(arr);
	}

}
