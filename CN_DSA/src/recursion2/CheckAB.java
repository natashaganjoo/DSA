package recursion2;

public class CheckAB {

	/*
	 * Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
		a. The string begins with an 'a'
		b. Each 'a' is followed by nothing or an 'a' or "bb"
		c. Each "bb" is followed by nothing or an 'a'
		If all the rules are followed by the given string, return true otherwise return false.
	 */
	
	public static boolean checkAB(String input) { 
		
		// base case
		if(input.length() == 0)
		{
		    return true;
		}
		
		if(input.charAt(0) == 'a')
		{
		    if(input.length() > 1 && input.charAt(1) == 'b' && input.charAt(2) == 'b')
		    {
		        return checkAB(input.substring(3));
		    }
		    else {
		    	return checkAB(input.substring(1));
		    }
		} 
		   return false;
		}
	
	public static void main(String[] args) {
			String s = "abababa";
			System.out.println(checkAB(s));
	}

}
