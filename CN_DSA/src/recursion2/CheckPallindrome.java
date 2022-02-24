package recursion2;

public class CheckPallindrome {

	static boolean checkPallindrome(String s) {
		return checkPallindrome(s, 0, s.length() - 1);
	}

	static boolean checkPallindrome(String str, int start, int end) {
			
		if(start >= end) {
			return true;
		}
		
		if(str.charAt(start) == str.charAt(end)) {
			return checkPallindrome(str, start + 1, end - 1);
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(checkPallindrome("madam"));

	}

}
