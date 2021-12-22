package exceptionsexample;

public class ExceptionExp {

	public static void main(String[] args) throws Exception {

		ExceptionMainClass mainClass = new ExceptionMainClass();
		mainClass.display();
	}

}

class ExceptionMainClass
{
	ExceptionSubClass subClass = new ExceptionSubClass();
	public void display() throws Exception
	{
			subClass.show();
	}
}

class ExceptionSubClass extends ExceptionMainClass
{
	int a;
	public void show() 
	{
		try
		{
			System.out.println("shekhar");
		}
		catch (Exception e)
		{
			System.out.println("shekhar");
			System.out.println(e.getMessage());
		}
	}
}