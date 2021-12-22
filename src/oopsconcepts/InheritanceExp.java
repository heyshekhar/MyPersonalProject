package oopsconcepts;

public class InheritanceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClasss subClass = new SubClasss();
		System.out.println(subClass.id);
		subClass.display();
		subClass.show();
		
		SuperClass superClass = new SubClasss();
		System.out.println(superClass.id);
		superClass.display();
		superClass.show();
	}

}

class SuperClass
{
	int id =10;
	public SuperClass()
	{
		System.out.println("super class constructor...");
	}
	public void display()
	{
		System.out.println("shekhar");
	}
	
	public static void show()
	{
		System.out.println("super class static method....");
	}
}

class SubClasss extends SuperClass
{
	int id = 20;
	
	public void display()
	{
		super.display();
		System.out.println("sub class");
	}
	
	public static void show()
	{
		System.out.println("sub class static method....");
	}
}