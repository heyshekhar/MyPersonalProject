package immutable;

public class Test {

	public static void main(String[] args) {
		
		Address address = new Address("korba", "chhattisgarh");
		Student s1 = new Student(1,address);
		
		
		System.out.println("student : "+s1);
		System.out.println("hashcode of student : "+s1.hashCode());
		System.out.println("hashcode of address : "+s1.getAddress().hashCode());
		
		s1.getAddress().setCity("bhilai");
		s1.getAddress().setState("bhilai");
		
		System.out.println("student : "+s1);
		System.out.println("hashcode of student : "+s1.hashCode());
		System.out.println("hashcode of address : "+s1.getAddress().hashCode());
	
	}

}
