package LinkedList;

import LinkedList.MiddleNode.Node;

public class Reverse {
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

		Node rev = reverseWithPairs(head);
		display(rev);
	}

	private static void display(Node head) {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	private static Node reverseWithPairs(Node head) {
		Node current = head;
		Node prev = null;
		Node next = current;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
