package interview.old;

import java.util.Iterator;

public class Pallindrome {

	public static String reverse(String s) {
		
		char arr[] = s.toCharArray();
		String rev = "";
		
		for(int i = arr.length-1; i>= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		return rev;
	}
	
	public static boolean isPallindrome(String s) {
		
		String rev = reverse(s);
		System.out.println(rev);
		if(rev.equals(s)) {
			return true;
		}
		else {
			return false;
		}
		
//		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nats";
		System.out.println(isPallindrome(s));
	}

}
