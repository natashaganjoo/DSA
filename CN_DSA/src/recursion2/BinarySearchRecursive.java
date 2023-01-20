package recursion2;

public class BinarySearchRecursive {

	static int binarySearch(int input[], int ele, int si) {
		
		if(input[si] == ele) {
			return si;
		}
		
		int smallAns = binarySearch(input, ele, si + 1);
		return smallAns;
		
	}
	public static void main(String[] args) {
	
		int input[] = {1,2,3,4,5};
		System.out.println(binarySearch(input, 5, 0));
	}

}
