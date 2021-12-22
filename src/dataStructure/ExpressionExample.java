package dataStructure;

import java.util.Stack;

public class ExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "(A-B/C)*(A/K-L)+(A*B)";
		    
		InfixToPrefix infixToPrefix = new InfixToPrefix();
//		infixToPrefix.infixToPrefix(s);
		
		Stack<String> infixStr = infixToPrefixExample(s);
		
		System.out.println(infixStr);
		
	}

	private static Stack<String> infixToPrefixExample(String infix) {
		

		Stack<Character> operators = new Stack<>();
		Stack<String> operands = new Stack<>();
		
		for(int i=0; i<infix.length(); i++) {
			
			if(infix.charAt(i) == '(') {
				operators.push(infix.charAt(i));
			} else if(infix.charAt(i) == ')') {
				while (!operators.isEmpty() && !(operators.peek() == '(')) {

					String str1 = operands.peek();
					operands.pop();

					String str2 = operands.peek();
					operands.pop();

					Character opr = operators.peek();
					operators.pop();

					String temp = opr + str2 +str1;
					operands.push(temp);
				}
				operators.pop();
			} else if(isOperator(infix.charAt(i))) {
				operands.push(infix.charAt(i)+"");
			} else {
				while (!operators.isEmpty() && (getOperandPriority(operators.peek()) >= getOperandPriority(infix.charAt(i)))) {
					String str1 = operands.peek();
					operands.pop();

					String str2 = operands.peek();
					operands.pop();

					Character opr = operators.peek();
					operators.pop();

					String temp = opr + str2 + str1;
					operands.push(temp);

					
				}
				operators.push(infix.charAt(i));
			}
		}
		
		while (!operators.isEmpty()) {
			String str1 = operands.peek();
			operands.pop();

			String str2 = operands.peek();
			operands.pop();

			Character opr = operators.peek();
			operators.pop();

			String temp = opr + str2 + str1;
			operands.push(temp);
		}
		
		return operands;
		
	}

	private static int getOperandPriority(Character oper) {
		if (oper == '+' || oper == '-') {
			return 1;
		} else if (oper == '*' || oper == '/') {
			return 2;
		} else if (oper == '^') {
			return 3;
		} else {
			return 0;
		}
	}

	private static boolean isOperator(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}
	

}
