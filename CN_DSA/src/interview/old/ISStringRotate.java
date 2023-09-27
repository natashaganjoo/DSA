package interview.old;

public class ISStringRotate {

	public static boolean isRotate(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		String temp = s1 + s1;
		System.out.println(temp);
		char firstChar = s2.charAt(0);

		String finalStr = "";
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == firstChar) {
				finalStr = temp.substring(i, s2.length() + 2);
				break;
			}
		}

		if (finalStr.equals(s2)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";
//		isRotate(s1, s2);
		System.out.println(isRotate(s1, s2));
	}

}
