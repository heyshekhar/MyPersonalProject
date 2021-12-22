package pojoClass;

public class StudentDetails {

	int sNumber;
	String sName;
	
	public StudentDetails(int number, String name)
	{
		this.sNumber = number;
		this.sName = name;
	}

	public int getsNumber() {
		return sNumber;
	}

	public String getsName() {
		return sName;
	}
	
	
}
