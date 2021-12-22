package collectionexample;

import java.util.TreeMap;

public class TreeMapExp {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> mp = new TreeMap<>();
		
		mp.put("shekhar", 10);
		mp.put("deepam", 6);
		mp.put("ravi", 4);
		mp.put("manish", 5);
		
		System.out.println(mp.subMap("deepam","ravi"));
		
		System.out.println(mp.firstKey());
		System.out.println(mp.lastKey());
	}

}
