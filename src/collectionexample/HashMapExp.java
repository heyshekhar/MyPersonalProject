package collectionexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExp {

	public static void main(String arg[]) throws Exception
	{
		
//		hashMapComparator();
		
//		hashMapNormal();
		
		concurrentHashMapExample();
		
	}

	private static void concurrentHashMapExample() {
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
		
		chm.put(null, 6);
		chm.put("shekhar", 2);
		chm.put("rathore", 3);
		
		System.out.println(chm.contains("shekhar"));
		System.out.println(chm.get("shekhar"));
		
	}

	private static void hashMapNormal() {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("shekhar", 10);
		hm.put("lekh", 5);
		hm.put("deepam", 7);
		hm.put("Ravi", 2);
		
		for(Map.Entry<String, Integer> mp : hm.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		
	}
	private static void hashMapComparator() {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("shekhar", 10);
		hm.put("lekh", 5);
		hm.put("deepam", 7);
		hm.put("Ravi", 2);
		
		hm = sortHashMap(hm);
		
		System.out.println(hm);
	}

	@SuppressWarnings("unchecked")
	private static HashMap sortHashMap(HashMap hm) {
		List list = new LinkedList(hm.entrySet());
		Collections.sort(list, new HashMapOneComparator());

		HashMap sortedHashMap = new LinkedHashMap();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}

class HashMapOneComparator implements Comparator<Object>
//class HashMapOneComparator implements Comparator<HashMap<String, Integer>>
{
	@Override
	public int compare(Object o1, Object o2){
		// TODO Auto-generated method stub
		return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Comparable)((Map.Entry)(o2)).getValue()));
	}
}
