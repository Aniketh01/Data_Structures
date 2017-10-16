/**
 * @author aniketh
 * Implementation of Post Fix Evaluator.
 */

import java.util.Stack;

public class PostFixEvaluator {
	
	Stack<Double> s = new Stack<Double>();
	
	private boolean isOperator(char ch) {
		if(ch == '+') {
			return true;
		}
		else if (ch == '-') {
			return true;
		}
		else if (ch == '*') {
			return true;
		}
		else if (ch == '/') {
			return true;
		}
		else {
			return false;
		}
	}

	
	public PostFixEvaluator(String Postfix) {
		char[] chars = Postfix.toCharArray();
		int N = chars.length;
		
		for(int i=0; i < N; i++) {
			char ch = chars[i];
			
			if(isOperator(ch)) {
				switch(ch) {
				case '+': s.push(s.pop() + s.pop()); 
					break;
				case '-': s.push(-s.pop() + s.pop());
					break;
				case '*': s.push(s.pop() * s.pop());
					break;
				case '/': s.push(1 / s.pop() * s.pop());
					break;
				}
			}
			else if(Character.isDigit(ch)) {
					s.push(0.0);
					while(Character.isDigit(chars[i])) {
						s.push(10 * s.pop() + (chars[i++] - '0'));
				}
			}
	}
		if(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}