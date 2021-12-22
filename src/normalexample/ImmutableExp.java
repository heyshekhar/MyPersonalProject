package src.normalexample;

public class ImmutableExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee e = new Employee("Huaweis");
		e.setCompany("LG");*/
		
		/*Person person = new  Employee();
		
		person.getName();
		person.display();
		String n = new String();*/
		
		int a = 4^2;
		System.out.println(a);
	}
	

}

class Person {
    private String name;

  /*  public Person(String name) {
        this.name = name;
    }*/
    
    public Person()
    {
    	display();
    }

    public String getName() {
        return name;
    }
  
    
    final void display()
    {
    	System.out.println("inside person class");
    }
    
    private void show()
    {}
    class personSub extends Person
    {
//    	final void display()
        {
        	System.out.println("inside person class");
        }
    }
}

class Employee extends Person {
	
	private String name;
    /*public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}*/
	
	public Employee()
	{
		display();
	}

	private String company	;

//    public Employee(String name, String company) {
//        super(name);
//        this.company = company;
//    }

    public void setCompany(String company) {
       this.name = company;
    }

    public String getCompany() {
        return company; 
    }
    
//    final void display()
    {
    	System.out.println("shekhar rathore");
    }
}


 
