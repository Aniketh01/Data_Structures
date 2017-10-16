/**
 * @author aniketh
 * Implementation of Singly Linked List.
 */
public class SinglyLinkedList {
	Node head;
	Node temp;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public void Traversal() {
		if (head == null) {
			return;
		}
		else {
			temp = head;
			while(temp.next != null) {
				System.out.println(temp.data);
				temp = temp.next;				
			}
		}
	}
}
