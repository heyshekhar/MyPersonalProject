package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import a_pojoclass.EmployeeComparable;
import a_pojoclass.EmployeeComparator;

public class ComparatorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComparatorOne();
		
		ComparatorTwo();
	}

	private static void ComparatorTwo() {
		EmployeeComparator emp = new EmployeeComparator(101,"shekhar","Chhattisgarh",45000);
		EmployeeComparator emp1 = new EmployeeComparator(105,"deepam","Chhattisgarh",35000);
		EmployeeComparator emp2 = new EmployeeComparator(103,"ravi","Chhattisgarh",30000);
		EmployeeComparator emp3 = new EmployeeComparator(104,"manish","Chhattisgarh",25000);
	
		List<EmployeeComparator> list = new ArrayList<EmployeeComparator>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		Collections.sort(list,new ComparatorCompare());
		
		Iterator<EmployeeComparator> itr = list.iterator();
		while(itr.hasNext())
		{
			EmployeeComparator itrEmp = itr.next();
			System.out.println(itrEmp.getEmpId()+" "+itrEmp.getEmpName()+" "+itrEmp.getEmpAddress()+" "+itrEmp.getEmpSalary());
		}
	}

	private static void ComparatorOne() {
		List<String> list = new ArrayList<String>();
		list.add("shekhar");
		list.add("Shekhar");

		Collections.sort(list,new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}
		});

		System.out.println(list);
		
		//		Collections.sort(list);

	}
	
	
}

class ComparatorCompare implements Comparator<EmployeeComparator>
{
	
	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {

//		return o1.getEmpName().compareTo(o2.getEmpName());
		return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());
	}
}
