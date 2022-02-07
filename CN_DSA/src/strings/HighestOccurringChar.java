package strings;


public class HighestOccurringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbbcdd";
		
		// create a frequency array
		int arr[] = new int[256];
		
		// all elems of int arr are initialized to 0
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1; 
		}
		
		char ch = ' ';
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		System.out.println("highest occuring char: " + ch + " occuring " + max + ":times");
	}

}
