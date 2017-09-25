/**
 * @author aniketh
 * This is the test class for the entire DSA section.
 */

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		Stack s = new Stack();
		s.push(200);
		s.push(100);
		s.push(10);
		s.pop();
		s.pop();
//		s.Display();
		
		Queue Q = new Queue();
		Q.Enqueue(100);
		Q.Enqueue(200);
		Q.dequeue();
		
		Q.dequeue();
		Q.Display();
		
	}

}
