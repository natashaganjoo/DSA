package interview.old;

public class StringSubstring {

	public static boolean isPresent(String s1, String s2) {

		for (int i = 0; i < s2.length(); i++) {
			
			if (s1.charAt(0) == s2.charAt(i)) {
				int startIndex = s2.indexOf(s2.charAt(i));
				int length = s1.length();
				String temp = s2.substring(startIndex, startIndex + length);
			
				if (temp.equals(s1)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]) {
		String s1 = "for";
		String s2 = "geeksforgeeks";

		System.out.println(isPresent(s1, s2));
	}

}
