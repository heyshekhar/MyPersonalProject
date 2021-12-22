package oopsconcepts;

import java.lang.reflect.*;

public class MethodOverride2 {
	

	public static void main(String[] args) throws Exception {
		
 		SecondClass secondClass = new SecondClass();
		secondClass.display("shekhar");
	}

}


class FirstClass
{
	public static void display(String name)
	{
		System.out.println("fist class static display method");
	}
}

class SecondClass extends FirstClass
{
	public static void display(int a)
	{
		System.out.println("Second class static display method");
	}
}