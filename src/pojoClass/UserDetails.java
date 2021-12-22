package pojoClass;

public class UserDetails {

	String name;
	String address;
	int phNumber;
	
	public UserDetails(String name, String address, int phNumber)
	{
		this.name = name;
		this.address = address;
		this.phNumber = phNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(int phNumber) {
		this.phNumber = phNumber;
	}
	
	
}
