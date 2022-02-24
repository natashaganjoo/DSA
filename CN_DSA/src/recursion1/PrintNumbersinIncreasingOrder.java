package recursion1;

public class PrintNumbersinIncreasingOrder {

	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
            return;
		}
		
		print(n - 1);
		System.out.print(n + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(6);
	}

}
