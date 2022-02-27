package recursion2;

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String s) {
	
		if(s.length() == 1) {
			return s.charAt(0) + "";
		}
		
		String ans = "";
		if(s.charAt(0) != s.charAt(1)) {
			ans = s.charAt(0) + "";
		}
		
		String smallAns = removeConsecutiveDuplicates(s.substring(1));
		return ans + smallAns;

    }
	
	
	public static void main(String[] args) {
		
		System.out.println(removeConsecutiveDuplicates("aabccba"));
	}

}
