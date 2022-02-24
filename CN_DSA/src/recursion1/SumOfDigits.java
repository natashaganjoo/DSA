package recursion1;

public class SumOfDigits {

	// in case of an integer finding last digit is easier, so we give 1 to n-1 to recursion and do the last digit part ourselves
	public static int sumOfDigits(int input){
		
        if(input == 0){
			return 0;
        }
        
        return sumOfDigits(input/10) + input % 10;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));

	}

}
