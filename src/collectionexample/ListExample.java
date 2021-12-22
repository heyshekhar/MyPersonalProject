package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		arrayListExample();

	}

	private static void arrayListExample() {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(null);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(null);
		
		System.out.println(list);
		
	}

}
