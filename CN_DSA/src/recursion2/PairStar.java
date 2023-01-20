package recursion2;

public class PairStar {

	public static String addStars(String s) {
		if(s.length() == 1) {
			return s.charAt(0) + "";
		}
		String smallAns = addStars(s.substring(1));
		String ans = "";
		
		if(s.charAt(0) == smallAns.charAt(0)) {
			ans = s.charAt(0) + "*" + smallAns; 
		}
		else {
			ans = s.charAt(0) + smallAns; 
		}
		return ans;
	}

	public static void main(String[] args) {
		
		System.out.println(addStars("aaaa"));
	}

}
