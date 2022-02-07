package arrays;

import java.util.Scanner;



public class GFG {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter ist no.");
//		int a = scanner.nextInt();
//		System.out.println("Enter 2nd no.");
//		int b = scanner.nextInt();
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = a; i <= b; i++) {
//			if(i%2 == 0) {
////				System.out.println(i);
//				list.add(i);
//			}
//		}
//		
//		System.out.println(list);
		
		
		// largest of n numbrrs
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter n");
//		int n = scanner.nextInt();
//		for (int i = 0; i <=n; i++) {
//			int num = scanner.nextInt();
//		}
		
//		int a[] = {20, 22, 23, 11, 45};
//		int largest = 20;
//		for (int i = 1; i < a.length; i++) {
//			if (a[i] > largest) {
//				largest = a[i];
//			}
//		}
//		System.out.println("largest is: "+ largest);

		
		// prime
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int flag =0;
//		for (int i = 2 ; i <= n-1; i++) {
//			if (n%i == 0) {
//				flag =1;
//				break;
//			}		
//		}
//		
//		if(flag == 1) {
//		System.out.println("No. is not prime");
//		}
//		else {
//			System.out.println("yes");
//		}
		
		// triangle
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a");
//		int a = scanner.nextInt();
//		
//		System.out.println("Enter b");
//		int b = scanner.nextInt();
//		
//		System.out.println("Enter c");
//		int c = scanner.nextInt();
//		
//		if( a == b && b==c && a==c) {
//			System.out.println("equi");	
//		}
//		
//		else if (a == b || a==c || b==c) {
//			System.out.println("isos");
//		}
//		else {
//			System.out.println("scalnen");
//
//		}
		
		// prime between 1 to n
//		int a = 3;
//		int n = 16;
//		for (int i = a; i <= n; i++) {
//			int flag = 0;
//			for (int j = 2; j <= i-1; j++) {
//				if (i % j == 0) {
//					flag = 1;
//					break;
//				}
//			}
//			if (flag == 0) {
//				System.out.println("no is:"+ i);
//			}
//		}
		
		

		// fibonacci 
				
//	int a = 0;
//	int b = 1;
//	int n = 10;
//	for (int i = 0; i < n; i++) {
//		System.out.println(a);
//		int c =a+b;
//		a=b;
//		b=c;
//	}
		
//		System.out.println("Enter the no,");
//		int num = scanner.nextInt();
//		int a = 0;
//		int b = 1;
//		int n = 10;
//		for (int i = 0; i < n; i++) {
//			System.out.println(a);
//			int c =a+b;
//			a=b;
//			b=c;
//			if(num == a ||num == a||num == a) {
//				System.out.println("Yes");
//			}
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		int basic = scanner.nextInt();
//		char grade = scanner.next().charAt(0);
//		
//		double hra = 0.2 * basic;
//		double da = 0.5 * basic;
// 	    int allowance = 0;
//        double pf = 0.11 * basic;
//
//		if(grade == 'A'){
//		 allowance = 1700;
//        }
//		else if(grade == 'B'){
//          allowance = 1500;
//        }
//		else{
//            allowance = 1300;
//        }
//
//		double totalSalary = basic + hra + da + allowance-pf ;
//		System.out.println(totalSalary);
//       	double sal = Math.round(totalSalary * 100.0) / 100.0;
//       	System.out.println(sal);
//       	System.out.println((int)sal);

//		int n =15;
//		 for(int i = 2; i<= n-1; i++) {
//				if(n % i == 0) {
//					System.out.print(i + " ");
//				}
//			}
		
//		int n = 312;
//		int digit;
//		int sum_of_even = 0;
//		int sum_of_odd = 0;
//		while(n>0) {
//			digit = n % 10;
//			n = n / 10;
//			System.out.println(digit);
//			if (digit % 2 == 0) {
//				sum_of_even += digit;
//			}
//			else {
//				sum_of_odd += digit;
//			}
//		}
//		System.out.println(sum_of_even +" "+sum_of_odd);
//		
		
        
        
//		 	int S = 20;
//	        int E = 119;
//	        int W = 13;
//			int cels;
//	        
//	        for(int i = S; i<= E; i=i+W)
//	        {
//	       	    cels = (5 *(i - 32)) / 9;
//	            System.out.println(i +"\t" + cels);
//	        }
		
			
//		int n = 4;
//		
//		int count = 1;
//	for(int row = 1 ;row <= n; row++) {
//		for(int col=1; col <= row; col++) {
//			System.out.print(count);
//			count++;
//		}
//		System.out.println();
//	}
		
//	for(int row = n ;row >= 1; row--) {
//		for(int col=1; col <= row; col++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
		
//			int n = 5;
//	        for( int row =1; row <= n; row++ ){
//			for( int col = row; col>= 1; col--){
//			System.out.print(col);
//			}
//			System.out.println();
//			}

//		int n = 4;
//        for( int row =1; row <= n; row++ ){
//        	for(int col=1; col <= n; col++){
////        		int s = n;
////		System.out.print(s--);
//        		System.out.print(n-col+1);
//        	
//        	}
//		System.out.println();
//		}

		
//		int n = 4;
//        for( int row =1; row <= n; row++ )
//        {
//        	char ch = (char) ('A' + row -1);
//		  	for(int col=1; col <= n; col++)
//		  	{
////		  		char ch2 = (char) (ch + col - 1);
//		  		
//		  		char ch2 = (char) (ch + col );
//
//		  		System.out.print(ch2);
//		  	
//		  	}
//		System.out.println();
//		}
		
		
//		 int n = 7;
//		 for( int row = 1; row <= n; row++ )
//	        { 
//			 char ch = (char) ('A' + n - 1);
//          	char ch2 = (char) (ch - row + 1);
//	            for(int col = 1; col <= row; col++)
//			  	{
//
//	            	System.out.print(ch2);
//	            	ch2++;
//			  	}
//			System.out.println();
//			}
// imp
//		int n = 5;
//		for( int row = 1; row <= n; row++ )
//	        { 
//	           for(int col = 1; col <= n-row; col++)
//			  	{	            
//		            	System.out.print("*");	            	
//
//	        	 }
//	           for(int col = 1; col <= row; col++)
//			  	{	            
//		            	System.out.print(col);	            	
//
//	        	 }
//				System.out.println();
//	        }
    
		
		
//		int n = 5;
//        for( int row = 1; row <= n; row++ )
//        {
//			for( int col = 1; col <= n - row + 1; col++)
//			{
//				System.out.print("*");
//			}
//		System.out.println();
//		}
		
//		int s = n;
//		for( int row = 1; row <= n; row++ )
//        { 
//           for(int col = 1; col <= n-row+1; col++)
//		  	{	            
//	            	System.out.print(s);
//
//        	 }
//            s--;
//			System.out.println();
//        }
		
		//imp
//		int n = 4;
//		for(int i = 1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			
//			for(int j=i-1; j>=1; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//imp start pattern
		
//		int n = 4;
//		for(int i = 1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			
////			for(int j=i-1; j>=1; j--) {
////				System.out.print("*");
////			}
//			
//			for(int j=1; j<=i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//imp
//		int n = 4;
//		for(int row = 1; row<=n; row++) {
//			for(int col=1; col<=n-row; col++) {
//				System.out.print(" ");
//			}
//			int count = row;
//			for(int col=1; col<=row; col++) {
//				System.out.print(count++);
//			}
//			
//			for(int col=2*(row-1); col>=row; col--) {
//				System.out.print(col);
//			}
//			System.out.println();
//		}		
		
		int n = 3;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <=(i-1); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
}}