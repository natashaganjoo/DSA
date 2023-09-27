package interview.old;

public class Pall {

	public static String isPallindrome(String s) {

		String longest = s.substring(0, 1);

		for (int i = 0; i < s.length(); i++) {

			String temp1 = expandRange(s, i, i);
			if (temp1.length() > longest.length()) {
				longest = temp1;
			}
			
			String temp2 = expandRange(s, i, i + 1);
			if (temp2.length() > longest.length()) {
				longest = temp2;
			}

		}
		return longest;

	}

	public static String expandRange(String s, int begin, int end) {

		while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}

		return s.substring(begin + 1, end);
	}

	public static void main(String[] args) {

		String s = isPallindrome("cbbd");
		System.out.println(s);
	}

}
