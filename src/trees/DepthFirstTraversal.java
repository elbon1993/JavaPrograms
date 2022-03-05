package trees;

public class DepthFirstTraversal {
	public static void main(String[] args) {

		Node root = getTree();
		System.out.println("pre-order");
		preOrderTraversal(root);
		System.out.println("\nin-order");
		inOrderTraversal(root);
		System.out.println("\npost-order");
		postOrderTraversal(root);
	}

	private static void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(" " + root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	private static void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(" " + root.data);
			inOrderTraversal(root.right);
		}
	}

	private static void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(" " + root.data);
		}
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
