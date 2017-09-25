/**
 * @author aniketh
 * Implementation of Queue with Array.
 */

public class Queue {
	private int[] A = new int[10];
	private int front;
	private int rear;
	
	public Queue() {
		front = rear = -1;
	}
	
	public boolean IsEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void Enqueue(int item) {
		if (rear == A.length-1) {
			System.out.println("Queue OverFlow");
		}
		else if (IsEmpty()) {
			front = rear = 0;
			A[rear] = item;			
		}
		else {
			rear = rear + 1;
			A[rear] = item;
		}
		
	}
	
	public void dequeue() {
		if(IsEmpty()) {
			System.out.println("Queue UnderFlow");
		}
		else if(front == rear) {
			front = rear = 0;
		}
		else {
			front = front + 1;
			
		}
	}
	
	public void Display() {
		for(int i = 0; i <= rear - 1; i++) {
			System.out.println(A[i]);
		}
	}
}
