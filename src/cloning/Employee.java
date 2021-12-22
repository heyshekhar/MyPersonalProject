package cloning;

public class Employee implements Cloneable{

	private final int id;
	private String name;
	private Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		return super.clone();
		
		//deepcloning example
		 Employee emp = (Employee)super.clone();
		 emp.setAddress((Address)address.clone());
		 return emp;
	}


	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
