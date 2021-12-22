package a_pojoclass;

public class EmployeeComparable implements Comparable<EmployeeComparable>{

	private int empId;
	private String empName;
	private String empAddress;
	private int empSalary;
	
	
	public EmployeeComparable(int empId, String empName, String empAddress, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	public int compareTo(EmployeeComparable emp)
	{
		/*String LocalEmp = this.empId+" " +this.empName+" "+this.empAddress+" "+this.empSalary;
		String RemoteEmp = emp.empId+" "+emp.empName+" "+emp.empAddress+" "+emp.empSalary;*/
		
		return empName.compareToIgnoreCase(emp.empName);
//		return emp.empName.compareToIgnoreCase(emp.empName);  // reverse the order
	}
	
}
