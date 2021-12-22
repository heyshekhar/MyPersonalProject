package collectionexample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Pattern;

import a_pojoclass.Employee;
import a_pojoclass.EmployeeComparable;

public class ArrayListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayListOne();
		
//		ArrayListTwo();
		
		
		//ArrayListSecondLargest();
		
		arrayListFive();
	}

private static void arrayListFive() {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(2);list.add(3);list.add(9);list.add(4);list.add(6);list.add(1);
		list.add(2);list.add(3);list.add(9);list.add(4);list.add(8);list.add(1);
		
		int larg = list.get(0);
//		System.out.println("largest : "+larg);
		int secLarg=0;
		for(int i=1; i<list.size(); i++)
		{
			if(larg<list.get(i))
			{
				secLarg = larg;
				larg = list.get(i);
			}
			else if(secLarg<list.get(i) && list.get(i) != larg)
			{
				secLarg = list.get(i);
			}
		}
		
		System.out.println("Second Largest value : "+secLarg);
		System.out.println("Largest value : "+larg);
	}

	private static void ArrayListSecondLargest() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(5);
		int secondLargest = (int) list.get(0);
		int largest = list.get(0);
		for (int i = 1; i < list.size(); i++) {
		  if(list.get(i) > largest) {
		    secondLargest = largest;
		    largest = list.get(i);
		  }
		 
		}
		System.out.print("\nSecond biggest number ");
		System.out.println(secondLargest);
		
	}

	
	
	

	private static void ArrayListTwo() {
		
		Employee emp = new Employee(101,"shekhar","Chhattisgarh",45000);
		Employee emp1 = new Employee(105,"deepam","Chhattisgarh",35000);
		Employee emp2 = new Employee(103,"ravi","Chhattisgarh",30000);
		Employee emp3 = new Employee(104,"manish","Chhattisgarh",25000);
		
		List<Integer> sallist = new ArrayList<>();
		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
		{
			Employee employee = itr.next();
			sallist.add(employee.getEmpSalary());
			if(employee.getEmpName().equalsIgnoreCase("deepam"))
			{
				System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpAddress()+" "+employee.getEmpSalary());
			}
		}
		
		System.out.println("Second Highest salary");
		Collections.sort(sallist);
		System.out.println(sallist.get(sallist.size()-2));
	}

	private static void ArrayListOne() {
		int i = 6;
		Integer a =8;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(i);
		System.out.println("return type : "+al.add(a));
		al.add(19);
		System.out.println(al);
		/*al.add(null);
		al.set(0, 4);
		al.add(0,3);
		System.out.println(al);
		Date date = new Date();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(5);
		al1.add(6);
		al1.addAll(al);
		System.out.println(al1.contains(6));
		System.out.println("last index of : "+al1.lastIndexOf(al1));
		System.out.println(al1);
		
		al1.retainAll(al);
		System.out.println(al1);
		
		al1.removeAll(al);
		System.out.println(al1);
		
		LinkedList<Integer> lt = new LinkedList<>();
		lt.add(2);
		lt.add(5);
		lt.addFirst(1);
		lt.addLast(7);
		lt.pollFirst();
		lt.pollLast();
		
		LinkedList<Integer> ltc = new LinkedList<>();
		ltc = (LinkedList<Integer>)lt.clone();
		System.out.println("clone : "+ltc);
		System.out.println("linked list : "+lt);
		Iterator<Integer> itr = lt.descendingIterator();
		
		System.out.println(lt.getFirst());
		
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(1, 34);
		tm.put(3, 34);
		tm.put(2, 34);
		tm.put(4, 34);
		tm.put(6, 34);
		
		System.out.println(tm.subMap(2, 8));
		System.out.println(tm.firstKey());
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.headMap(6));
		System.out.println(tm.comparator());
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		HashMap<String, Integer> id = new HashMap<>();
		id.put(new String("shekhar"), 1);
		id.put(new String("shekhar"), 2);
		
		System.out.println(id);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1);
		pq.add(3);
		pq.add(12);
		pq.add(31);
		pq.add(15);
		
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);
		
		String words = "this is4 refence words52 try2 solve";
		String[] splitWords = words.split(" ");
		String regex = "(.)*(\\d)(.)*";  
		Pattern pattern = Pattern.compile(regex);
		for(String str : splitWords)
		{
		    if(str.matches(regex))
		    {
		      System.out.print(str+" ");
		    }
		}
		
		lt.clear();
		lt.add(1);
		lt.add(2);
		lt.add(3);
		
		System.out.println(lt.pop());
		System.out.println(lt.poll());
*/		
	}

}
