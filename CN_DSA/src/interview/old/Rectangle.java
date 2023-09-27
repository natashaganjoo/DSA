package interview.old;

public class Rectangle {

	public static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
	}

	public static boolean isInside(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

		double A = area(x1, y1, x2, y2, x3, y3) + area(x2, y2, x3, y3, x4, y4);

		double A1 = area(x, y, x3, y3, x4, y4);

		double A2 = area(x, y, x2, y2, x1, y1);

		double A3 = area(x, y, x1, y1, x2, y2);

		double A4 = area(x, y, x2, y2, x4, y4);
		
		System.out.println("A: "+A);
		System.out.println("A1: " + A1);
		System.out.println("A2: " + A2);
		System.out.println("A3: " + A3);
		System.out.println("A4: " + A4);
		
		return (A == (A1 + A2 + A3 + A4));

	}
	
	public static void main(String[] args) {
		if (isInside(10, 15, 0, 10, 10, 0, 0, -10, -10, 0))
			System.out.println("Inside");
		else
			System.out.println("Not Inside");

	}	

	}
