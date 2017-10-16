/**
 * @author aniketh
 * Implementation of Singly Linked List.
 */
public class SinglyLinkedList {
	Node head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public void Traversal() {
		if (head == null) {
			return;
		}
		else {
			Node temp;
			temp = head;
			while(temp.next != null) {
				System.out.println(temp.data);
				temp = temp.next;				
			}
		}
	}
	
	@SuppressWarnings("null")
	public void insertAtHead(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = head;
		head = newNode;
	}
	
	@SuppressWarnings("null")
	public void insertAtEnd(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		}
		else {
			Node temp;
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	@SuppressWarnings("null")
	public void insertAt(int item, int pos) {
		int i = 0;
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		Node temp;
		temp = head;
		while (i < pos - 1) {
			i++;
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;		
	}
	
	public void Delete(int pos) {
		if (head == null) {
			System.out.println("Linked list is already empty");
		}
		else {
			int i = 0;
			Node temp;
			temp = head;
			
			while(i < pos - 1) {
				i++;
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
}
