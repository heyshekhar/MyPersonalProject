package oopsconcepts;

public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassExp subClassExp = new SubClassExp();
		subClassExp.callMethod();
	}

}

class SuperClassExp
{
	public void show()
	{
		System.out.println("Super class show method....");
	}
	
	public void display()
	{
		System.out.println("Super class display method....");
	}
	
	public void callMethod()
	{
		show();
		display();
	}
}

class SubClassExp extends SuperClassExp
{
	public void show()
	{
		System.out.println("Sub class show method....");
	}
}