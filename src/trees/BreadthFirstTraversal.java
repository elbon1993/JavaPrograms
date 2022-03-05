package trees;

public class BreadthFirstTraversal {

	public static void main(String[] args) {

		Node root = getTree();
		breadthFirstTraversal(root);
	}

	private static void breadthFirstTraversal(Node root) {
		int height = getMaxDepth(root);
		for (int level = 1; level <= height; level++) {
			printNode(root, level);
		}
	}

	private static void printNode(Node root, int level) {
		if(root == null)
			return;
		if(level == 1){
			System.out.print(" "+root.data);
		} else {
			printNode(root.left, level-1);
			printNode(root.right, level-1);
		}
	}

	private static int getMaxDepth(Node root) {
		if (root == null)
			return 0;
		return Math.max(getMaxDepth(root.left), getMaxDepth(root.right)) + 1;
	}

	private static Node getTree() {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.right = new Node(8);
		return root;
	}
}
