
public class SingleLinkedList {

	Node head = null;
	public static int size = 0;

	public void display() {

		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + "\t");
				current = current.next;
			}
			System.out.println();
		}
	}

	public void insert(int data, int index) {

		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			for (int i = 1; i < index && current.next != null; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public void delete(int index) {

		if (head == null) {
			System.out.println("Linked list is empty");
		} else if (index == 0) {
			System.out.println("Deleted: " + head.data);
			head = head.next;
		} else {
			Node current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;
			}
			System.out.println("Deleted: " + current.next.data);
			current.next = null;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.insert(1, 0);
		list.insert(2, 1);
		list.insert(3, 1);
		list.insert(4, 1);
		list.insert(5, 5);
		list.display();
		list.delete(0);
		list.display();
		
		SingleLinkedList list2 = new SingleLinkedList();
		list2.insert(11, 1);
		list2.insert(22, 2);
		list2.insert(33, 3);
		list2.insert(44, 4);
		list2.insert(55, 5);
		findFromLast(list2.head, 3);
	}

	private static void findFromLast(Node head2, int pos) {
		int len = findLength(head2);
		int index = len - pos + 1;
		Node current = head2;
		if(index <= 0) {
			System.out.println("not found");
			return;
		}
		for(int i=1; i<index; i++) {
			current = current.next;
		}
		System.out.println("found::"+current.data);
	}

	private static int findLength(Node head2) {
		int len = 0;
		while(head2 != null) {
			head2 = head2.next;
			len++;
		}
		return len;
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
