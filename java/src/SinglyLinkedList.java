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
		Node newNode = null;
		newNode.data = item;
		newNode.next = head;
		head = newNode;
		
	}
}
