package hashmaps;

import java.util.HashMap;

public class UniqueCharString {

	public static String uniqueCharString(String s) {

		HashMap<Character, Integer> hm = new HashMap<>();
		char charArr[] = s.toCharArray();
		String unique = "";
		for (int i = 0; i < charArr.length; i++) {

			if (!hm.containsKey(charArr[i])) {
				hm.put(charArr[i], 1);
				unique = unique + charArr[i] + "";
			}
		}

		return unique;
	}

	public static void main(String[] args) {
//		bad
		String s = "babad";
		String unique = uniqueCharString(s);
		System.out.println(unique);
	}

}
