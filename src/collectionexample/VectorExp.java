package collectionexample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class VectorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec.add(5);
		
		Enumeration<Integer> en = vec.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		Iterator<Integer> itr = vec.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
			itr.remove();
		}
		
		System.out.println(vec.size());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(6);
		pq.poll();
		pq.peek();
	}

}
