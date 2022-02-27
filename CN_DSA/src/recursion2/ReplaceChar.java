package recursion2;

public class ReplaceChar {

	static String replaceChar(String input, char c1, char c2) {
		
		if(input.length() == 0) {
			return "";
		}
		
		String ans = "";
		if(input.charAt(0) == c1) {
			ans = c2 + "";
		}
		else {
			ans = input.charAt(0) + "";
		}
		
		String smallAns = replaceChar(input.substring(1), c1, c2);
		return ans + smallAns;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(replaceChar("abaad", 'a', 'x'));
	}

}
