package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import a_pojoclass.EmployeeComparable;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeComparable emp = new EmployeeComparable(101,"shekhar","Chhattisgarh",45000);
		EmployeeComparable emp1 = new EmployeeComparable(105,"deepam","Chhattisgarh",35000);
		EmployeeComparable emp2 = new EmployeeComparable(103,"ravi","Chhattisgarh",30000);
		EmployeeComparable emp3 = new EmployeeComparable(104,"manish","Chhattisgarh",25000);
		
		List<EmployeeComparable> list = new ArrayList<EmployeeComparable>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		Collections.sort(list);
		
		Iterator<EmployeeComparable> itr = list.iterator();
		while(itr.hasNext())
		{
			EmployeeComparable itrEmp = itr.next();
			System.out.println(itrEmp.getEmpId()+" "+itrEmp.getEmpName()+" "+itrEmp.getEmpAddress()+" "+itrEmp.getEmpSalary());
		}
		
	}

}
