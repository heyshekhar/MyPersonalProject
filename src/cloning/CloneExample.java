package cloning;

public class CloneExample {

	public static void main(String arg[]) throws CloneNotSupportedException {
		
		Address add = new Address("CG", "korba");
		Employee emp = new Employee(1, "shekhar",add);
		Employee emp1 = (Employee)emp.clone();
		
		emp1.getAddress().setCity("raipur");;
//		emp1.setId(10);
		System.out.println("emp : " +emp);
		System.out.println("emp1 : "+emp1);
	}
}
