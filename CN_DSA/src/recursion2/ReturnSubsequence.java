package recursion2;


public class ReturnSubsequence {

	public static String[] subsequence(String str) {
		
		if(str.length() == 0) {
			String s[] = {""};
			return s;
		}
		
		String smallAns[] = subsequence(str.substring(1));
		
		String ans[] = new String[2 * smallAns.length];
		
		// firstly copy smallAns content in ans arr
		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = smallAns[i];
		}
		
		for (int i = 0; i < smallAns.length; i++) {
			ans[smallAns.length + i] = str.charAt(0) + smallAns[i];
		}
		
		return ans;
	}
	public static void main(String[] args) {
		
		String ans[] = subsequence("abc");
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
