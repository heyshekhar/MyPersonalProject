package oopsconcepts;

public class SuperKeywordExp extends SuperKeyword{

	int i=10;
	public SuperKeywordExp()
	{
		/*if we are not define super keyword in sub class constructor 
		  it will automatically create an supper key word an call the supper class consturctor*/
		
		super();
//		super(10); // we can not difine two time super compile time error
		System.out.println("sub class sonctructor");
		
//		super(); we can only define supper keyword at first line in subclass constructor
	}
	
	public void display()
	{
		super.display();
		System.out.println(super.i);
		System.out.println("sub class method : "+i);
	}
	public static void main(String[] args) {

		SuperKeywordExp superKeywordExp = new SuperKeywordExp();
		superKeywordExp.display();
	}
}

class SuperKeyword extends SuperKeywordOne
{
	int i=20;
	public SuperKeyword()
	{
		System.out.println("super class constructor");
	}
	
	public SuperKeyword(int a)
	{
		System.out.println("super class constructor with value");
	}
	
	public void display()
	{
		System.out.println("supper class method");
	}
}

class SuperKeywordOne
{
	int i =10;
}