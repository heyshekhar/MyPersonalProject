package oopsconcepts;

import java.lang.reflect.*;

public class MethodOverloadingExp {

	
	public static void main(String arg[]) throws Exception
	{
		MethodOverloadingOne mo = new MethodOverloadingOne();
		/*Method m = mo.getClass().getDeclaredMethod("display",new Class[] {int.class,int.class});
		m.setAccessible(true);
		m.invoke(mo,10,12);*/
		
		mo.callMethod();
		mo.main();
		mo.display(10f, 12);
		mo.display(10l, 12);
		new MethodOverloadingOne(36);
		
	}
}

class MethodOverloadingOne
{
	int a;
	private int check;
	public MethodOverloadingOne()
	{
		super();
		this.a=10;
		System.out.println("default constructor");
	}
	
	public MethodOverloadingOne(int a)
	{
		this.a=a;
		System.out.println("parametterise constructor : "+a);
	}
	public static void main()
	{
		System.out.println("main overloading");
	}
	private void display()
	{
		System.out.println("shekhar");
	}
	
	public void display(float a,int b)
	{
		System.out.println(a+" "+b);
	}
	
	public void display(long a,int b)
	{
		System.out.println(a+" "+b);
	}
	public void callMethod()
	{
		display();
		display(25,36);
	}
}