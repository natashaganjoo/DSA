package interview.old;

public class PallindromeSubs {

	public static String isPallindrome(String s) {

		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {

			int len1 = expandRange(s, i, i);
			int len2 = expandRange(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (end - start < len) {
				start = i - len / 2;
				end = i + len / 2;
			}
		}

		return s.substring(start, end + 1);
	}

	public static int expandRange(String s, int begin, int end) {

		while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}

		return end - begin - 1;
	}

	public static void main(String[] args) {
		String s = isPallindrome("babad");
		System.out.println(s);
	}

}
