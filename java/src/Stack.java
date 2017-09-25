/**
 * @author aniketh
 * Implementation of Stack with Array.
 */

public class Stack {
	private int[] A = new int[10];
	private int top;
	private int item;
	
	
	public Stack() {
		top = -1;		
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int item) {
		if(top >= (A.length - 1)) {
			System.out.println("Stack OverFlow");
		}
		else {
			top = top + 1;
			A[top] = item;
		}
	}
	
	public void pop() {
		if (top == -1) {
			System.out.println("Stack UnderFlow");
		}
		else {
			item = A[top];
			top = top - 1;
		}
	}
	
	public int top() {
		return A[top];
	}
	
	public void Display() {
		for(int i = 0; i <= top; i++) {
			System.out.println(A[i]);
		}
	}

}
