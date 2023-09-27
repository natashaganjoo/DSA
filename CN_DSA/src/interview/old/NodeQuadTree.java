package interview.old;

class NodeQuadTree {
	double x1, y1, x2, y2;
	NodeQuadTree[] children;
	int level;

	public NodeQuadTree(double x1, double y1, double x2, double y2, int level) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.level = level;
		children = new NodeQuadTree[4];
	}

	public boolean contains(double x, double y) {
		return x >= x1 && x <= x2 && y >= y1 && y <= y2;
	}

	public boolean isLeaf() {
		return children[0] == null;
	}

	public void divide() {
		double xmid = (x1 + x2) / 2;
		double ymid = (y1 + y2) / 2;

		children[0] = new NodeQuadTree(x1, y1, xmid, ymid, level + 1);
		children[1] = new NodeQuadTree(xmid, y1, x2, ymid, level + 1);
		children[2] = new NodeQuadTree(x1, ymid, xmid, y2, level + 1);
		children[3] = new NodeQuadTree(xmid, ymid, x2, y2, level + 1);
	}

	public static void main(String[] args) {
		QuadTree qt = new QuadTree(0, 0, 100, 100);
		System.out.println(qt.contains(50, 50)); // prints "true"
		System.out.println(qt.contains(150, 150)); // prints "false"
	}
}

class QuadTree {
	NodeQuadTree root;

	public QuadTree(double x1, double y1, double x2, double y2) {
		root = new NodeQuadTree(x1, y1, x2, y2, 0);
	}

	public boolean contains(double x, double y) {
		NodeQuadTree node = root;
		while (!node.isLeaf()) {
			for (NodeQuadTree child : node.children) {
				if (child.contains(x, y)) {
					node = child;
					break;
				}
			}
		}
		return node.contains(x, y);
	}

}
