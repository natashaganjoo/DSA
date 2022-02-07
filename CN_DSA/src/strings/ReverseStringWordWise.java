package strings;


public class ReverseStringWordWise {

//	public static String reverse(String str) {
//		String rev = "";
//		for(int i = 0; i<str.length(); i++) {
//			rev = str.charAt(i) + rev;
//		}
//		return rev;
//	}
//	
//	public static String splitStr(String str) {
//		
//		String[] arr = str.split(" ");
//		
//		String rev = "";
//		for (int i = 0; i < arr.length; i++) {
//			rev = rev + reverse(arr[i]) + " ";
//		}
//		return rev;
//	}
//	
	
	public static String reverseSubString(String str) {
		String rev = "";
		for(int i = 0; i< str.length(); i++) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	
	public static String reverse(String str) {
		int start = 0;
		String rev = " ";
		String s = " ";
		for (int j = 0; j < str.length(); j++) {
			if(str.charAt(j) == ' ') {
				 s = str.substring(start, j);
				 System.out.println(s);
//				rev =  rev + reverseSubString(s);
				System.out.println(rev);
			}
			start = j + 1;
		}
		return rev;
	}
	
	public static void main(String[] args) {
	
		String s = "my name is natasha";
		String rev = reverse(s);
		System.out.println(rev);
	}

}
