package collectionexample;

import java.util.concurrent.ConcurrentHashMap;

public class MapExample {

	public static void main(String[] args) {
		
		consurrentHashMapExample();

	}

	private static void consurrentHashMapExample() {
		
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
		
		chm.put("shekhar", 1);
		chm.put("rathore", 1);
		chm.put(null, 1);
		
		System.out.println("contain example : "+chm.contains(null));
		System.out.println("displaying null : "+chm.get(null));
	}

}
