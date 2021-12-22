package a_pojoclass;

public class EmployeeHashCode {

	private int empId;
	private String empName;
	private String empAddress;
	private int empSalary;
	
	public EmployeeHashCode(int empId, String empName, String empAddress, int empSalary) {
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

	public boolean equals(Object o)
	{
		if(o !=null && o instanceof EmployeeHashCode)
		{
			EmployeeHashCode emp = (EmployeeHashCode)o;
			if(emp.getEmpId()==this.getEmpId() && emp.getEmpName().equals(this.getEmpName())
			   && emp.getEmpAddress().equals(this.getEmpAddress()) && emp.getEmpSalary()==this.getEmpSalary())
			{
				return true;
			}
			return false;
		}
		return false;
	}
	
	public int hashCode()
	{
		int result = 1;
		int max = 31;
		max = max*result+empId!=0?empId:0;
		return max;
	}
	
	
}
