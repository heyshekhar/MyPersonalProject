package dataStructure;

import java.util.Stack;

public class InfixToPostfix {

	
	public static void main(String args[])
	{
	    String s = "(A-B/C)*(A/K-L)+(A*B)";
	    System.out.println( infixToPostfix(s));
	}

	private static  Stack<String> infixToPostfix(String postfix) {
		// TODO Auto-generated method stub
		
		Stack<String> operators = new Stack<>();
		Stack<Character> operands = new Stack<>();
		
		for(int i=0; i<postfix.length(); i++) {
			
			if(postfix.charAt(i) == '(') {
				operands.push(postfix.charAt(i));
			}
			else if(postfix.charAt(i) == ')') {
				while (!operands.isEmpty() && operands.peek() != '(') {
					String str1 = operators.peek();
					operators.pop();
					
					String str2 = operators.peek();
					operators.pop();
					
					Character ch = operands.peek();
					operands.pop();
					
					String temp = str2+str1+ch;
					operators.push(temp);
				}
				operands.pop();
				
			}
			else if(isOperator(postfix.charAt(i))) {
				operators.push(postfix.charAt(i)+"");
			} else {
				while (!operands.isEmpty() && getPriority(operands.peek()) > getPriority(postfix.charAt(i))) {
					
					String str1 = operators.peek();
					operators.pop();
					
					String str2 = operators.peek();
					operators.pop();
					
					Character ch = operands.peek();
					operands.pop();
					
					String temp = str2+str1+ch;
					operators.push(temp);
				} 
				operands.push(postfix.charAt(i));
			}
			
		}
		
		while(!operands.isEmpty()) {
			String str1 = operators.peek();
			operators.pop();
			
			String str2 = operators.peek();
			operators.pop();
			
			Character ch = operands.peek();
			operands.pop();
			
			String temp = str2+str1+ch;
			operators.push(temp);
		}
		
		return operators;
		
		
	}

	private static int getPriority(char c) {
		if(c == '+' || c =='-') {
			return 1;
		} else if (c == '*' || c == '/') {
			return 2;
		} else if (c == '^') {
			return 3;
		} else {
			return 0;
		}
		
	}

	private static Boolean isOperator(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c>= '0' && c<='9');
	}
	
}
	 
	

