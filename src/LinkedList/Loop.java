package LinkedList;

public class Loop {
	public static void main(String[] args) {

		Node head = new Node(11);
		Node node2 = new Node(22);
		head.next = node2;
		head.next.next = new Node(33);
		Node node4 = new Node(44);
		Node node5 = new Node(55);
		head.next.next.next = node4;
		head.next.next.next.next = node5;
		node5.next = node2;

		boolean loop = checkIfLoopExist(head);
		System.out.println("Loop exist:" + loop);
		System.out.println("Fist Node loop:"+findLoopFirstNode(head).data);
	}

	private static boolean checkIfLoopExist(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	private static Node findLoopFirstNode(Node head) {
		boolean loop = false;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				loop = true;
				break;
			}
		}
		
		if(loop) {
			slow = head;
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow;
		}
		return null;
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}