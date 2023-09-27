package interview.old;

public class AreaofRect {

	public static double findArea(int x1, int y1, int x2, int y2, int x3, int y3) {

		double area = Math.abs((x3 * (y1 - y2) + x1 * (y2 - y3) + x2 * (y3 - y1)) / 2.0);
//		System.out.println(area);
		return area;

	}

	public static boolean isInside(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, int x, int y) {

		double A = findArea(x4, y4, x1, y1, x3, y3) + findArea(x1, y1, x2, y2, x3, y3);
		double A1 = findArea(x, y, x1, y1, x2, y2);
		double A2 = findArea(x, y, x2, y2, x3, y3);
		double A3 = findArea(x, y, x1, y1, x3, y3);
		double A4 = findArea(x, y, x4, y4, x1, y1);

		System.out.println("A: " + A);
		System.out.println("A1: " + A1);
		System.out.println("A2: " + A2);
		System.out.println("A3: " + A3);
		System.out.println("A4: " + A4);

		return (A == A1 + A2 + A3 + A4);

	}

	public static void main(String[] args) {
		System.out.println(isInside(0, 10, 10, 0, 0, -10, -10, 0, 10, 10));

	}

}
