package interview.old;

public class AreaOfRectangle {

	public static int[] xRange(int x1, int x2, int x3, int x4) {
		int a = Math.min(x1, x2);
		int b = Math.min(x3, x4);
		int xStart = Math.min(a, b);
//		System.out.println("here: " + xStart);
		int c = Math.max(x1, x2);
		int d = Math.max(x3, x4);
		int xEnd = Math.max(c, d);
		System.out.println("here: " + xEnd);
		return new int[] { xStart, xEnd };
	}

	public static int[] yRange(int y1, int y2, int y3, int y4) {
		int a = Math.min(y1, y2);
		int b = Math.min(y3, y4);
		int yStart = Math.min(a, b);
		System.out.println("here: " + yStart);
		int c = Math.max(y1, y2);
		int d = Math.max(y3, y4);
		int yEnd = Math.max(c, d);
		System.out.println("here: " + yEnd);
		return new int[] { yStart, yEnd };
	}

	public static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x, int y) {
		int xRange[] = xRange(x1, x2, x3, x4);
		int yRange[] = yRange(x1, x2, x3, x4);
		int xStart = xRange[0];
		int xEnd = xRange[1];
		int yStart = yRange[0];
		int yEnd = yRange[1];

		if (x >= xStart && x <= xEnd && y >= yStart && y <= yEnd) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isInside(0, 10, 10, 0, 0, -10, -10, 0, 10, 15));
	}

}
