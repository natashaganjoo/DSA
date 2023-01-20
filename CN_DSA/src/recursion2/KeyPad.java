package recursion2;

public class KeyPad 
{

	static String[] keypad(int n) {
		

		if(n == 0) {
			String ans[] = {""};
			return ans;
		}
		String smallAns[] = keypad(n/10);
		
		String code = returnCodes(n % 10);
		String ans[] = new String[code.length() * smallAns.length];
		
		int  k = 0;
		
		for (int i = 0; i < smallAns.length; i++) {
			for(int j = 0; j < code.length(); j++) {
				ans[k] = smallAns[i] + code.charAt(j);
				k++;
			}
		}
		
		return ans;
	}
	
	static String returnCodes(int n) {
		String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		return mapping[n];
	}
	
	public static void main(String[] args) {
		
		String[] arr = keypad(123);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
