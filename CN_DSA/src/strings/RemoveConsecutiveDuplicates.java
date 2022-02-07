package strings;

public class RemoveConsecutiveDuplicates {

	// traverse the whole string, if current char is diff than previous char, only then add it to new string
	public static String removeConsecutiveDupes(String str) {
		
		String newString = "";
		char prevChar = ' ';
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != prevChar) {
				newString = newString + str.charAt(i);
			}
			prevChar = str.charAt(i);
		}
		return newString;
	}
		
	public static void main(String[] args) {
		
		String s = "aabbccd";
		System.out.println(removeConsecutiveDupes(s));

	}

}
