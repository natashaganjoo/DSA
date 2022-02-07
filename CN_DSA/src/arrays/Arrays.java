package arrays;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;


public class Arrays {

	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("size: ");
		int size = scanner.nextInt();
		int arr[]= new int[size];
		System.out.println("enter array of size: "+ size);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	public static void displayElements(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int findLargest(int []arr) {
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void findUnique(int arr[]) {

		for (int i = 0; i < arr.length; i++)
        {
		  int cnt = 0;
          for (int j = 0; j < arr.length; j++) {
        	  if(arr[i] == arr[j]) {
        		  cnt++;
        	  }       	  
          }
          if(cnt == 1) {
    		  System.out.println(arr[i]);
    	  }
         }			
	}
	
	public static void findDuplicates(int arr[]) {

		for (int i = 0; i < arr.length; i++)
        {
		  int cnt = 0;
          for (int j = 0; j < arr.length; j++) {
        	  if(arr[i] == arr[j]) {
        		  cnt++;
        	  }
        	  
          }
          if(cnt > 1) {
    		  System.out.println(arr[i]);
    	  }
         }		
		
	}
	
	public static void findDistinct(int arr[]) {

		for (int i = 0; i < arr.length; i++)
        {
          for (int j = 0; j < i; j++) {
        	  if(arr[i] == arr[j]) {
        		 break;
        	  }
          }
          
         }		
		
	}
	
	public static int[] findDistinct(int arr[], int d) {

		int temp[] = new int[5];
		for (int i = 0; i < arr.length; i++)
        {
          temp[i] = arr[d];
          d++;
        }
		
		
		return temp;
	}
	
	public static void reverse(int arr[]) {

		int j = 0;
		int k = arr.length - 1;
		int temp = 0;
			while(j < k) {
			temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			j++;
			k--;
		}	
	}
	
	
	public static void reverseForRotate(int arr[], int j, int k) {
			int temp = 0;
			while(j < k) {
			temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			j++;
			k--;
		}	
	}
	public static void leftRotate(int arr[], int k) {
		k = k% arr.length;
		reverseForRotate(arr, 0, arr.length - k-1);
		reverseForRotate(arr, arr.length - k, arr.length-1);
		reverseForRotate(arr, 0 ,arr.length-1);
	}
	
	public static void rightRotate(int arr[], int k) {
		k = k% arr.length;
		reverseForRotate(arr, 0, k-1);
		reverseForRotate(arr, k, arr.length-1);
		reverseForRotate(arr, 0 ,arr.length-1);
	}
	
	public static boolean pairSum(int arr[], int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (sum == arr[i] + arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void arrangeZeroes(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
			
		}
		while(count < arr.length) {
			arr[count] = 0;
			count++;
		}
	}
	
//	public int swap(int a, int b) {
//		int temp = 0;
//		temp = a;
//		a = b;
//		b = temp;
//		return b;
//	}
	public static void arrangeNumbers(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
			
		}
		while(count < arr.length) {
			arr[count] = 0;
			count++;
		}
	}
	
	public static int findPair(int arr[], int n) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
//				if (i != j) {
					if (arr[i] + arr[j] == n) {
						cnt++;
					}
//				}
			}
		}
		if(cnt == 0) {
			return 0;
		}
		return cnt;
	}
	
	public static int findPairTriplet(int arr[], int n) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = i+2; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == n)
					{
						cnt++;
					}
				}
			}
		}
		if(cnt == 0) {
			return 0;
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = takeInput();
//		int arr[] = {1, 4, 1, 5, 6, 4, 9};
//		findDuplicates(arr);
		
//		int arr[] = {1,2,0,5,0,2,0,8,0,0,5};
//		arrangeZeroes(arr);
//		System.out.println(pairSum(arr, 45));
//		arrange(arr);
//		int temp[] = findDistinct(arr, 2);
//		reverseForRotate(arr, 0, 4);
//		rightRotate(arr, 2);
//		rotate(arr, 3);
//		findDistinct(arr);
//		findUnique(arr);
//		swapAlternate(arr);
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
//		}
		int arr[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.println(findPair(arr, 7));
		displayElements(arr);
//		System.out.println(findLargest(arr));
		}

}
