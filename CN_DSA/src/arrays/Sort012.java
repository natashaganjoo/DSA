package arrays;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {0,1,1,2,1,0,0,2,1};
		
		int high = arr.length - 1;
		int low = 0;
		int mid = 0;
		int temp;
		
		while(mid <= high)
		{
		switch(arr[mid]) {
		
		case 0: {temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
				break;
		}
		case 1: mid++;
				break;
			
		case 2: {temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
		}
		}
		
	
	}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
