package strings;

public class CompressString {

	public static String compressString(String str) {
			
		String s = str.charAt(0) + "";

		int cnt = 1;
		
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			if(curr == prev) {
				cnt++;
			}
			else {
				if(cnt > 1) {
					s+= cnt;
					cnt =1;
				}
				s+=curr;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
	
		String s = "aabbccddd";
		
		System.out.println(compressString(s));

	}

}
