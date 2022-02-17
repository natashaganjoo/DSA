package recursion;

public class FindAllIndicesofElement {

	/*
	 * Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save 
	 * all the indexes in an array (in increasing order).
		Do this recursively. Indexing in the array starts from 0.
	 */
	public static int[] findIndices(int arr[], int x) {
//		int indices[] =  new int[10]
		return findIndex(arr, x, 0, 0);
		
	}
	
	public static int[] findIndex(int arr[], int x, int si, int count) {
		
		// base case 
		if(si == arr.length) {
			return new int[0];
		}
		
		int indices[] = new int[arr.length - 1];
		
			if(arr[si] == x) {
				indices[count] = si;
			}
		
		return findIndex(arr, x, si + 1, count + 1);
	}
	
	public static void main(String[] args) {
	
		int arr[] = {2,6,5,2,3,2};
		int indices[] = findIndices(arr, 2);
		for (int i = 0; i < indices.length; i++) {
			System.out.println(indices[i]);
		}

	}

}
