package infixPostfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixtoPostfix {
	
	public static String infixpostfix(String infixExpression) {
		StringBuilder postfix=new StringBuilder();
		Deque <Character>stack=new ArrayDeque<>();
		char [] input = infixExpression.toCharArray();
		
		//S
		for(char c: input) {
			//C
			if(Character.isLetterOrDigit(c)) {
				postfix.append(c);
			
			}
			//P
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')') 
			{
				while(!stack.isEmpty()&& stack.peek()!= '(') 
				{
					postfix.append(stack.pop());					 //append to output
				}
				stack.pop();
			}
			else 
			{
				//O
				while(!stack.isEmpty()&& stack.peek()!='(' && getPrecedence(stack.peek())>=getPrecedence(c)) {
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		//E
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		return postfix.toString();
		
		
	}

	private static int getPrecedence(char ch) {
		return switch(ch) {
		case '^'->3;
		case '/','*' ->2;
		case '+','-'->1;
		default-> throw new IllegalArgumentException("Invalid operator....");
		
		};
	}

	public static void main(String[] args) {
		String infixExpression="A+B*C";
		
		System.out.println("Infix Expression: "+infixExpression);
		
		System.out.println("Postfix Expression: "+infixpostfix(infixExpression));

	}

}
