//package recursion2;
//
//
//public class SubsetOfArray {
//
//	public static int[][] subset(int input[], int si) {
//		
//		if ( si == input.length ) {
//			int arr[][] = new int[0][0];
//			return arr; // [] returns empty array
//		}
//		
//		int smallAns[][] = subset(input, si + 1);
//		
//		int result[][] = new int[smallAns.length * input.length][0];
//		
//		for (int i = 0; i < smallAns.length; i++) {
//			for(int j = 0; j < smallAns[i].length; j++) {
//				result[i][j] = smallAns[i][j];			
//			}
//		}
//		
//		for (int i = 0; i < result.length; i++) {
//			for(int j = 0; j < smallAns[i].length; j++) 
//			{
//				result[smallAns.length] = input[0] + smallAns[i]; 
//				System.out.println(input[0] + smallAns[i]);
//			}
//		
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		
//		int arr[] = {1, 2, 3};
//		int result[] = subset(arr, 0);
//		
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//	}
//
//}
