package immutable;

public final class Student {

//public class Student {

	private final Integer id;
	private final Address address;
	
	public Student(Integer id, Address address) {
		this.address = address;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	//here student class is immutable but address is mutable class
	//we can get the address by using getAddress and than made changes on address because it has setter methods
//	public Address getAddress() {
//		return address;
//	}

	//can create new object of address and return that new object it will make sure over original value will not change. 
	//here we are sending address parameter directly because in future if we add extra parameter on address than we can directly
	//made changes there and it will reflect to all the other class which is using address as a field otherwise has to each class
	//one by one and need to do changes.
	public Address getAddress() {
		return new Address(address);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
