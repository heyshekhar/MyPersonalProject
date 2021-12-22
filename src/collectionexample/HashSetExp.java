package collectionexample;

import java.util.HashSet;

public class HashSetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(2);
		hs.add(5);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.add(5));
		
		HashSet<Integer> hs1 = new HashSet<Integer>(10000);
		
		System.out.println(hs1.size());
	}

}
