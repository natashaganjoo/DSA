package strings;

public class RemoveChar {

	public static String removeChar(String str, char ch) {
		String newString = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ch) {
				newString = newString + str.charAt(i);
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {
	
		String s = "naata";
		System.out.println(removeChar(s, 'a'));
	}

}
