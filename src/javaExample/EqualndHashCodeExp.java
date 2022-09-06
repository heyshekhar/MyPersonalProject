package javaExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import a_pojoclass.EmployeeHashCode;

public class EqualndHashCodeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeHashCode empHashCode1 = new EmployeeHashCode(1001, "shekhar", "marathalli", 50000);
		EmployeeHashCode empHashCode2 = new EmployeeHashCode(1001, "deepam", "marathalli", 50000);
		EmployeeHashCode empHashCode3 = new EmployeeHashCode(1001, "shekhar", "BTM", 50000);
		EmployeeHashCode empHashCode4 = new EmployeeHashCode(1001, "shekhar", "marathalli", 50000);
		
		Set<EmployeeHashCode> st = new HashSet<>();
		
		st.add(empHashCode1);
		st.add(empHashCode2);
		st.add(empHashCode3);
		st.add(empHashCode4);
		
		System.out.println("-----displaying using iterator-----");
		Iterator<EmployeeHashCode> itr = st.iterator();
		
		while(itr.hasNext())
		{
			EmployeeHashCode emp = itr.next();
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpAddress()+" "+emp.getEmpSalary());
		}
		
		System.out.println("\n-----displaying using foreachloop-----");
		for(EmployeeHashCode emp : st)
		{
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpAddress()+" "+emp.getEmpSalary());
		}
	}

}

