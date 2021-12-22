package collectionexample;

import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlist();
	}

	private static void Linkedlist() {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("shekhar");
		
//		System.out.println(list);
		
		
		list.add("ravi");
		list.pollLast();
//		list.pop();
		System.out.println(list);
		
	}

}
