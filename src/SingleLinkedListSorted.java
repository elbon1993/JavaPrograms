
public class SingleLinkedListSorted {

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

	public void insert(int data) {

		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else if (data < head.data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			Node prev = current;
			while (current != null && data > current.data) {
				prev = current;
				current = current.next;
			}
			prev.next = newNode;
			newNode.next = current;
		}
	}

	public void delete(int data) {

		if (head == null) {
			System.out.println("Linked list is empty");
		} else if (data < head.data) {
			System.out.println(data + " not found");
		} else if (head.data == data) {
			System.out.println("Deleted: " + head.data);
			head = head.next;
		} else {
			Node current = head;
			Node prev = current;
			while (current != null && data > current.data) {
				prev = current;
				current = current.next;
			}

			if (current == null)
				System.out.println(data + " not found");
			else {
				prev.next = current.next;
				System.out.println("Deleted: " + current.data);
				current.next = null;
			}
		}
	}

	public static void main(String[] args) {
		SingleLinkedListSorted list = new SingleLinkedListSorted();
		list.insert(4);
		list.insert(5);
		list.insert(1);
		list.insert(6);
		list.insert(3);
		list.insert(2);
		list.display();
		list.delete(4);
		list.display();
	}
}
