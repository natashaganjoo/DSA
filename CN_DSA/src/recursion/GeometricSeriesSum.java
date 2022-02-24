package recursion;

public class GeometricSeriesSum {

	static double findSum(int k) {
		
		if(k < 0) {
			return 0.0;
		}
		
		return findSum(k - 1) + (1/(Math.pow(2,k)));
//		return (1/(Math.pow(2,k))) + findSum(k - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(findSum(3));
	}

}
