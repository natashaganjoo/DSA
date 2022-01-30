package strings;

public class ReverseEachWord {

	public static String reverseWord(String str) {

		int i = str.length() - 1;
		int end = str.length();
		String result = " ";

		while (i >= 0) {

			if (str.charAt(i) == ' ') {
				result = result + str.substring(i + 1, end) + " ";
				end = i;
			}
			i--;
		}

		return result + str.substring(i + 1, end);
	}

	public static void main(String[] args) {

//		Approach 1 : reverse each word and then reverse the final string

//		Approach 2: iterate from last word 

		String a = "ab cd efg";
		System.out.println(reverseWord(a));

	}
}