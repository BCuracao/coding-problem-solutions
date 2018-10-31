
package Random;

import java.util.Arrays;

import Graphs.Node;



/* DAILY CODE DAY #14 
 *@Cracking the coding interview: Implementation of a basic singly linked list 
 **/
class Node {
	Node next;
	int data;
	public Node(int data) {
		this.data = data;
	}
}

public class SimpleLinkedList {
	Node head;
	// Add new element at the end of the list
	public void addElement(int data) {
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
	// Add new head element
	public void prependElement(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public static void main(String[] args) {
		SimpleLinkedList s = new SimpleLinkedList();
		s.head = new Node(1);
		s.head.next = new Node(2);
		s.head.next.next = new Node(3);
		s.head.next.next.next = new Node(4);
	}
}



