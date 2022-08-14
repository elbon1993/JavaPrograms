package LinkedList;

public class MiddleNode {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(11);
		Node node2 = new Node(22);
		head.next = node2;
		head.next.next = new Node(33);
		Node node4 = new Node(44);
		Node node5 = new Node(55);
		head.next.next.next = node4;
		head.next.next.next.next = node5;
		head.next.next.next.next.next = new Node(66);		

		Node middle = findMiddleNode(head);
		System.out.println("Middle:" + middle.data);
	}

	private static Node findMiddleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
