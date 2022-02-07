package arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int x = 12;
		 int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					for (int k = j+1; k < arr.length; k++) {
						if(arr[i] + arr[j] + arr[k] == x)
						{
							cnt++;
						}
					}
				}
			}
			if(cnt == 0) {
				System.out.println("no");
			}
			else {
				System.out.println(cnt);
	    }
		
		
	}

}
