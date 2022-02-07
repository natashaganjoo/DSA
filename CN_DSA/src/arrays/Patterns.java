package arrays;



public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 4;
//		for (int i = 1; i <= n; i++) {
//			int count = n;
//			for (int j = 1; j <= n; j++) {
//				System.out.print(count--);
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 1; i <= n; i++) {
//			int count = i;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(count--);
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i <= n; i++) {
////			int count = i;
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 1; i <= n; i++) {
////			int count = i;
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print("-");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			for (int j = i-1; j >=1; j--) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
		

//		for (int i = 1; i <= n; i++) {
//		for (int j = 1; j <= n; j++) {
//			if(i==1 || i==n || j == 1 || j==n) {
//				System.out.print("*");
//			}
//
//			else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}

		// rhombus
//	for (int i = 1; i <=n; i++) {
//		for (int j = 1; j <= n-i; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 1; j <= n; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}	
		
//		for (int i = 1; i <= (n+1)/2; i++) {
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= (2*i)-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
//		for (int i = 1; i <= (n-1)/2; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= n; i++) {
//			int sum = 0;
//			for (int j = 1; j <= i; j++) {
//				sum = sum + j;
//				
//				System.out.print(j);
//				if(j == i) {
//					System.out.print("=");
//				}
//				else {
//					System.out.print("+");
//				}
//				
//			}
//			System.out.print(sum);
//			System.out.println();
//		}
		
//		for (int i = 0; i < n; i++) {
//			int val = (2*i)+1;
//
//			for (int j = 0; j < n; j++) {
//				System.out.print(val);
//				if (val==(2*n-1)){
//                    val=1;
//                }
//				val = val+2;
//			}
//			
//			System.out.println();
//		}
		
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <= 2*i -1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= n-1; i++) {
//			for (int j = 1; j <= 2*i -1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 0; i <=10; i++) {
//			if(i == 5) {
//				break;
//			}
//			System.out.println(i);
//		}
	
		
//		int n = 7;
//		int row1 = (n+1)/2;
//		int row2 = (n-1)/2;
//		for (int i = 1; i <= row1 ; i++) {
//			for (int j = 1; j <= row1 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 2*i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = row2; i >= 1 ; i--) {
//			for (int j = 1; j <= row2-i+1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 2*i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int n = 5;
//		 for(int i = 1; i<= n ; i++)
//	        {
//			 int val = n;
//			for(int j = 1; j<=n; j++)
//	        	{
//	            System.out.print(val);
//	            val--;
//				}
//			
//			
//			for(int j = i; j<=n; j++)
//        	{
//				if(j == n) {
//					System.out.print("*");
//				}
//			}
//			
//			System.out.println();
//	        }		
		
		
//		 int n=5;
//		 for(int i = 1; i<= n ; i++)
//		        {
//				int val = n;
//					for(int j = 1; j<=n-i; j++)
//			        	{
//			            System.out.print(val);
//			            val--;
//						}
//				System.out.print("*");
//				System.out.println();
//
//				int val1 = i;
//				for(int j = 1; j <= i; j++)
//		        	{
////					int val1 = i;
//		            System.out.print(val1);
//		            val1--;
//					}
//				}
		 
//		 for(int i = 1; i<= n ; i++)
//	        {
//			int val = i;
//			for(int j = 1; j <= i; j++)
//	        	{
//	            System.out.print(val);
//	            val--;
//				}
//			System.out.println();

//			}
		 
				
//		        }		
		
//		int n = 5;
//		for (int i = 1; i <= n+1; i++) {
//			System.out.print("*");
//			
//			// increasing series
//			for (int j = 1; j <= i-1; j++) {
//				System.out.print(j);
//			}
//			
//			// decreasing series
//			
//			System.out.println("*");
//		}
//		
//		for (int i = n; i >= 0; i--) {
//			System.out.print("*");
//			
//			// decreasing series
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			
//			// decreasing series
////			for (int j =  1; j<= n-i-1; j++) {
////				System.out.print(j);
////			}
//			
//			System.out.println("*");
//		}
		
//		int n = 6;
//		int f1 = 1;
//		int f2 = 1;
//		int i=3;
//		while (i<= n-2) {
//			int f3 = f1 + f2;
//			System.out.println(f3);
//			f1 = f2;
//			f2 = f3;
//			i++;		
//			}
	
		
	int a = 1;
	int b = 1;
	int n = 6;	
	int c =0;
		for (int i = 1; i <= n-2; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println(c);

	}

}
