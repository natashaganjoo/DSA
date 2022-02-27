package recursion2;

public class RemoveX {

	// first calculte the 1st char and then recursion
	static String removeX(String str)
	{
		if(str.length() == 0) {
			return " "; 
		}
		
		String ans = "";
		if(str.charAt(0) != 'x')
		{
			ans = str.charAt(0) + ans;
		}
		
		String smallAns = removeX(str.substring(1));
		return ans + smallAns;
	}
	
	
	
	// first recursion then calculate
//	static String removeX(String str)
//	{
//		if(str.length() == 0) {
//			return " "; 
//		}
//		
//		String smallAns = removeX(str.substring(1));
//		if(str.charAt(0) != 'x') {
//			smallAns = str.charAt(0) + smallAns;
//		}
//		return smallAns;
//	}
	
	
	
	public static void main(String[] args) {
		String ans = removeX("xava");
		System.out.println(ans);

	}

}
