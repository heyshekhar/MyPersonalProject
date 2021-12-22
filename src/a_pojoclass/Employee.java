package a_pojoclass;

public class Employee {

	private int empId;
	private String empName;
	private String empAddress;
	private int empSalary;
	
	public Employee(int empId, String empName, String empAddress, int empSalary) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAddress == null) ? 0 : empAddress.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empSalary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAddress == null) {
			if (other.empAddress != null)
				return false;
		} else if (!empAddress.equals(other.empAddress))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSalary != other.empSalary)
			return false;
		return true;
	}

	
}
