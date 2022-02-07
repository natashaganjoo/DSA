package arrays;

public class ArrayRotateCheck {

	 public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
	        
	        for(int i = 0; i< arr.length-1; i++){
				if(arr[i+1] < arr[i]){
	                return i+1;
	            }
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,1};
		System.out.println(arrayRotateCheck(arr));
		
	}

}
