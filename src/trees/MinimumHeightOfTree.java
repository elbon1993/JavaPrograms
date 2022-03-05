package trees;

public class MinimumHeightOfTree {

	public static void main(String[] args) {

		Node root = getTree();
		System.out.println("Min Depth/Height of a tree:" + getMinDepth(root));
	}

	private static int getMinDepth(Node root) {
		if (root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		if(root.left == null)
			return getMinDepth(root.right) + 1;
		if(root.right == null)
			return getMinDepth(root.left) + 1;
		
		return Math.min(getMinDepth(root.left), getMinDepth(root.right)) + 1;
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
