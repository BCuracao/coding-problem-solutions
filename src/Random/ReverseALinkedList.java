package Random;


/* DAILY CODE DAY #38:
 * Add, Delete, Search and Reverse Nodes of a LinkedList */
public class ReverseALinkedList {

	private static Node head;
	private static int listCount;

	public ReverseALinkedList() {
		head = new Node(null);
		listCount = 0;
	}

	public void addNode(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void deleteNode(int data) {
		if (head == null) {
			return;
		}
		if ((int) head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
			if (data == (int) current.next.data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public void searchNode(int data) {
		if (head == null) {
			return;
		}
		Node current = head;
		while (current.next != null) {
			if (data == (int) current.getData()) {
				System.out.println();
				System.out.println("Found Node with data: " 
				+ current.getData());
				return;
			}
			current = current.next;
		}
		System.out.println("Node not found");
	}

	public void reverseList() {
		if (head == null) {
			return;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current.next != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		ReverseALinkedList re = new ReverseALinkedList();
		re.head = new Node(1);
		re.head.next = new Node(2);

		re.addNode(3);
		re.addNode(4);
		re.addNode(5);
		System.out.println("Print the list:");
		re.printList(head);
		System.out.println();
		System.out.println("Print the list after "
				+ "deleting Node with data 3:");
		re.deleteNode(3);
		re.printList(head);
		System.out.println();
		System.out.println("Do we find Node 3 in the list:");
		re.searchNode(3);
		re.reverseList();
		System.out.println("Print the reversed list:");
		re.printList(head);

	}

}

class Node {
	Object data;
	Node next;

	public Node(Object data) {
		this.data = data;
		next = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}