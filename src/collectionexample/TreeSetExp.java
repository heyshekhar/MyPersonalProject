package collectionexample;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args) {

//		treeSetComparator();
		
		treeSetNormal();
	}

	private static void treeSetNormal() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(4);
		ts.add(2);
		ts.add(6);
		ts.add(9);
		
		System.out.println(ts.subSet(2,6));
		
		System.out.println(ts.pollFirst());
		
		System.out.println(ts.pollLast());
		
		System.out.println(ts.pollLast());
		
	}

	private static void treeSetComparator() {
		
		TreeSet<Integer> ts = new TreeSet<>(new TreeSetCompartor());
		ts.add(3);
		ts.add(4);
		ts.add(2);
		ts.add(6);
		ts.add(9);
		
		Iterator<Integer> itr = ts.descendingIterator();
		System.out.println(ts);
	}

}

class TreeSetCompartor implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)
	{
//		return o2.compareTo(o1);
		
		if(o2>o1)
			return 1;
		else if(o2==o1)
			return 0;
		else
			return -1;
	}

	
}