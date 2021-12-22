package collectionexample;

import java.util.Hashtable;

public class HashTableExp {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "shekhar");
//		ht.put(null, "ravi"); it will throw null pointer Exception
		ht.put(3, "ravi");
		System.out.println(ht);
	}

}
