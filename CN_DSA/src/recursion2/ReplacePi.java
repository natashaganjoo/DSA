package recursion2;

public class ReplacePi {

	public static String replace(String input){
		
		if(input.length() == 1) {
			return input.charAt(0) + "";
		}
		
		String smallAns = replace(input.substring(1));
		String ans = "";
		
		// in case of pixpi we have to remove also i in smallAns
		if(input.charAt(0) == 'p' && smallAns.charAt(0) == 'i') {
			smallAns = smallAns.substring(1);
			ans = 3.14 + smallAns;
		}
		else {
			ans = input.charAt(0) + smallAns;
		}
		return ans;
	}
	
	public static void main(String[] args) {
	
		System.out.println(replace("pixxpix"));
	}

}
