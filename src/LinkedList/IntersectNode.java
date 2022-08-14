package LinkedList;

public class IntersectNode {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head1 = new Node(11);
		Node node2 = new Node(22);
		Node node3 = new Node(33);
		Node node4 = new Node(44);
		Node node5 = new Node(55);
		Node node6 = new Node(66);
		head1.next = node2;
		head1.next.next = node3;
		head1.next.next.next = node4;
		head1.next.next.next.next = node5;
		head1.next.next.next.next.next = node6;
		
		Node head2 = new Node(77);
		Node node8 = new Node(88);
		head2.next = node8;
		node8.next = head1;
		
		System.out.println(getIntersectNode(head1, head2).data);
	}

	private static Node getIntersectNode(Node head1, Node head2) {
		int len1 = findLength(head1);
		int len2 = findLength(head2);
		
		Node current1 = head1;
		Node current2 = head2;
		if(len1 > len2) {
			int diff = len1-len2;
			for(int i=1; i<=diff; i++) {
				current1 = current1.next;
			}
		} else {
			int diff = len2-len1;
			for(int i=1; i<=diff; i++) {
				current2 = current2.next;
			}
		}
		while(current1 != null && current2 != null) {
			if(current1.data == current2.data) {
				return current1;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		return null;
	}
	
	private static int findLength(Node head) {
		int len = 0;
		while(head != null) {
			head = head.next;
			len++;
		}
		return len;
	}
}
