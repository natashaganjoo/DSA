package math;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 int sum = 0, res = 0; 
	        int prod = 1;
//	        int temp = 234;
//	        while (temp > 0) {
//	            sum = sum + (temp % 10);
//	            prod *= temp % 10;
//	            temp = temp/10;
//	        }
//	        
//	         System.out.println("prod: "+ prod + " sum: " + sum);
		int arr[] = {1, 1, 7, -5};
		for(int i = 0;i<arr.length; i++) {
			prod *= arr[i];
		}
		
		System.out.println(prod);
	}

}
