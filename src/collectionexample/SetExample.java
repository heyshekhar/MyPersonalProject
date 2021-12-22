package collectionexample;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		
		hashSetLoadFactor();

	}

	private static void hashSetLoadFactor() {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(30);
		hs.add(12);
		hs.add(20);
		hs.add(40);
		hs.add(3);
		hs.add(304);
		hs.add(125);
		hs.add(204);
		
		hs.add(null);
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		
	}

}
