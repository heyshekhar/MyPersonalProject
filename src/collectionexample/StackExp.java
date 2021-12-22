package collectionexample;

import java.util.Enumeration;
import java.util.Stack;

public class StackExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st = new Stack<String>();
		
		st.push("shekhar");
		st.push("rathore");
		st.push("ravi");
		
		System.out.println(st);
		 
		st.pop();
		
		System.out.println(st);
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st);
		System.out.println(st.get(st.size()-1));
		System.out.println(st.search("don"));
		
		System.out.println(st.search("shekhar"));
		
		System.out.println(st.size());
		
		
		Enumeration<String> enu = st.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
	}

}
