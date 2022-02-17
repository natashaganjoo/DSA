package recursion;

public class PrintNumbersInDecreasingOrder {

	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
            return;
		}
		System.out.print(n + " ");
		print(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(6);
	}

}
